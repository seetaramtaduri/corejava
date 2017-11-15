//one interface can extends other interface

interface DataBase
{
	 public void connect();
	 public void disconnect();
}
interface Records extends DataBase
{

	 public void recdetails();
}
class Oracle implements Records
{
	
	 public void connect()
	 {
	 	  System.out.println("<--------Oracle Connected");
	 }
	 public void disconnect()
	 {
		  System.out.println("Oracle disconnect------->");
	
	 }
	 public void recdetails()
	 {
		  System.out.println("Oracle Rec Details");
	 }
}
class Access implements Records
{

	 public void connect()
	 {
	 	  System.out.println("<-------Access Connected");
	 }
	 public void disconnect()
	 {
		  System.out.println("Access disconnected---->");
	
	 }
	 public void recdetails()
	 {
		  System.out.println("Access Rec Details");
	 }

}
 public class InterfaceDemo2
 {
    public static void main(String[] args) 
	{
		Records ref;
        Oracle o=new Oracle();
        ref=o;
		ref.connect();
		ref.disconnect();
		ref.recdetails();
		
		Access a=new Access();
		ref=a;
		ref.connect();
		ref.disconnect();
	    ref.recdetails();
	}
}
