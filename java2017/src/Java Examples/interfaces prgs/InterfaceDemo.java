interface DataBase
{
	 public void connect();
	 public void disconnect();
}
class Oracle implements DataBase
{
	
	 public void connect()
	 {
	 	  System.out.println("<--------Oracle Connected");
	 }
	 public void disconnect()
	 {
		  System.out.println("Oracle disconnect------->");
	
	 } 
	
}
class Access implements DataBase
{

	 public void connect()
	 {
	 	  System.out.println("<-------Access Connected");
	 }
	 public void disconnect()
	 {
		  System.out.println("Access disconnected---->");
	
	 }
}
 public class InterfaceDemo
 {
    public static void main(String[] args) 
	{
		DataBase ref;
        Oracle o=new Oracle();
        ref=o;
		ref.connect();
		ref.disconnect();
		Access a=new Access();
		ref=a;
		ref.connect();
		ref.disconnect();
	}
}
