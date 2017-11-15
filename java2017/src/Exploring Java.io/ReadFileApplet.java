import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class ReadFileApplet extends Applet {
 TextArea text = new TextArea();
 Button goButton = new Button("Read Local File");
 Panel panel = new Panel();
 String fileName = "";
 public void init() {
  fileName = getParameter("fileName");
  setLayout(new BorderLayout());
  goButton.addActionListener(new ButtonHandler());
  panel.add(goButton);
  add("North",panel);
  add("Center",text);
 }
 class ButtonHandler implements ActionListener {
  public void actionPerformed(ActionEvent e){
   String s = e.getActionCommand();
   if("Read Local File".equals(s)){
    try {
     FileInputStream inStream = new FileInputStream(fileName);
     int inBytes = inStream.available();
     byte inBuf[] = new byte[inBytes];
     int bytesRead = inStream.read(inBuf,0,inBytes);
	 text.setText(new String(inBuf));
	}catch(Exception ex){
	 text.setText(ex.toString());
	}
   }
  }
 }
}
