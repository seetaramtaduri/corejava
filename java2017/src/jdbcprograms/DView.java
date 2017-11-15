import java.sql.*;
import java.awt.*;
import java.util.Vector;
import java.util.StringTokenizer;
import java.awt.event.*;
public class DView extends Frame implements ActionListener
{
	public DView()
	{
		v=new Vector();
		p1=new Panel();
		p1.setLayout(new GridLayout(5,2));
		addLabels(p1);

		bp=new Panel();
		bp.setLayout(new GridLayout(2,8));
		addButtons(bp);

		add(p1,BorderLayout.NORTH);
		add(ta=new TextArea());
		add(bp,BorderLayout.SOUTH);
		setSize(600,450);
		setVisible(true);
	}
	public void addLabels(Panel p)
	{
		ldno=new Label("Deptno");
		p.add(ldno);
        tfdno=new TextField();
		p.add(tfdno);
        tfdno.setEditable(false);

		ldname=new Label("Dept Name");
		p.add(ldname);
		tfdname=new TextField();
		p.add(tfdname);

		lloc=new Label("Location");
		p.add(lloc);
		tfloc=new TextField();
		p.add(tfloc);

		lStat=new Label("Status of Connection");
		p.add(lStat);
		lCurrentState=new Label("Not connected");
		p.add(lCurrentState);
		lCurrentState.setForeground(Color.red);


	}
	public void addButtons(Panel p)
	{
		bFirst=new Button("First");
		p.add(bFirst);
		bFirst.addActionListener(this);

		bNext=new Button("Next");
		p.add(bNext);
		bNext.addActionListener(this);

		bPrev=new Button("Previous");
		p.add(bPrev);
		bPrev.addActionListener(this);

		bLast=new Button("Last");
		p.add(bLast);
		bLast.addActionListener(this);

		bView=new Button("View");
		p.add(bView);
		bView.addActionListener(this);

		bCon=new Button("Connect");
		p.add(bCon);
		bCon.addActionListener(this);

		bDisCon=new Button("Dis-Connect");
		p.add(bDisCon);
		bDisCon.addActionListener(this);

		bExit=new Button("Exit");
		p.add(bExit);
		bExit.addActionListener(this);
	}

	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource().equals(bCon))
		{
			if(getConnection())
			{
				lCurrentState.setText("Connected");
				lCurrentState.setForeground(Color.green);
				bCon.setEnabled(false);
				bDisCon.setEnabled(true);
				addElementsToVector();
			}
			else
				lCurrentState.setText("Problem in Connection");
		}
		if(ae.getSource().equals(bDisCon))
			closeConnection();
		if(ae.getSource().equals(bExit))
		{
			closeConnection();
			System.exit(0);
		}
		if(ae.getSource().equals(bView)) 
			populateTextArea();
		if(ae.getSource().equals(bFirst))
		{
			currentRecord=0;
			populateTextFields(currentRecord);
			bPrev.setEnabled(false);
			bNext.setEnabled(true);
			bLast.setEnabled(true);
		}
		if(ae.getSource().equals(bNext))
		{
			if(currentRecord==(v.size()-2))
			{
               bNext.setEnabled(false);
			   bLast.setEnabled(false);
			   bPrev.setEnabled(true);
			}
			else
				bLast.setEnabled(true);
			currentRecord++;
			populateTextFields(currentRecord);
		}
		if(ae.getSource().equals(bPrev))
		{
           if(currentRecord==1)
			{
			   bPrev.setEnabled(false);
			   bFirst.setEnabled(false);
			   bNext.setEnabled(true);
			}
			else
				bLast.setEnabled(true);
			currentRecord--;
			populateTextFields(currentRecord);
		}
		if(ae.getSource().equals(bLast))
		{
            currentRecord=v.size()-1;
			populateTextFields(currentRecord);
			bNext.setEnabled(false);
			bPrev.setEnabled(true);
			bFirst.setEnabled(true);
		}
	}

    public void populateTextFields(int rno)
	{
		String str=(String)v.elementAt(rno);
		StringTokenizer stk=new StringTokenizer(str,"#");
		tfdno.setText(stk.nextToken());
		tfdname.setText(stk.nextToken());
		tfloc.setText(stk.nextToken());
	}
	public void addElementsToVector()
	{
		String str;
		try
		{
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery("select * from dept order by 1");
			while(rs.next())
			{
				str="";
				str+=rs.getString(1)+"#";
				str+=rs.getString(2)+"#";
				str+=rs.getString(3);
				v.addElement(str);
		
			}
			rs.close();
			st.close();
		}
		catch(Exception e)
		{
			System.out.println("Exception at selection"+e.getMessage());
		}
	}
    public void populateTextArea()
	{
		for(int i=0;i<v.size();i++)
		{
			String str=(String)v.elementAt(i);
			StringTokenizer stk=new StringTokenizer(str,"#");
			while(stk.hasMoreTokens())
				ta.append(stk.nextToken()+"\t");
			ta.append("\n");

		}
	}
	public void closeConnection()
	{
		try
		{
			con.close();
			bCon.setEnabled(true);
			bDisCon.setEnabled(false);
			lCurrentState.setText("Disconnected");
			lCurrentState.setForeground(Color.red);

			
		}
		catch(Exception e)
		{
			ta.setText("Exception in closing the connected");
			bDisCon.setEnabled(true);
		}
	}
	public boolean getConnection()
	{
		boolean result=false;
		try
		{
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
                        con=DriverManager.getConnection("jdbc:odbc:Driver={Microsoft ODBC for Oracle}","scott","tiger");
			result=true;
		}
		catch(Exception e)
		{
			ta.setText("Exception in connected"+e.getMessage());
			result=false;
		}
		return result;
	}
	Connection con;
	Vector v;
	Label ldno,ldname,lloc,lStat,lCurrentState;
	TextField tfdno,tfdname,tfloc;
	Button bView,bFirst,bNext,bPrev,bLast,bCon,bDisCon,bExit;
	Panel p1,bp;
	TextArea ta;
	int currentRecord=0;
	public static void main(String[] args) 
	{
       DView v1=new DView();
	   v1.show();
	}
}
