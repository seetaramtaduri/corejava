//program to implement multiple multiple inheritence
interface  Employee 
{
	public void setEname(String  s);
	public void setSal(double d );
	
	public String getEname();
	public double getSal();
}
interface  Dept 
{
	public void    setDept(String s);
	public String  getDept();
}

class Professor implements Dept,Employee //multiple inheritence
{
    
	String name,dept;
	double sal;

	public void setEname(String name)
	{
	    	 
	 this.name=name;
	}
    public void setSal(double sal)
	{
	  this.sal=sal;
	}
    public void setDept(String dept)
	{
		this.dept=dept;
	}
    public String  getEname()
	{
		 return name;
	}

	public double getSal()
    {
		 return sal;
	}
	public String getDept()
	{
		 return dept;
	}
}
class MultipleInh
{
    public static void main(String a [])
	{
		 Professor p=new Professor();
		 p.setEname("Seetaram");
		 p.setDept("CSE");
		 p.setSal(15000.00);

		 System.out.println(" Employee Details are");
		 System.out.println("Name---->"+p.getEname());
         System.out.println("Dept ---->"+p.getDept());
         System.out.println("Sal---->"+p.getSal());
	}
}
