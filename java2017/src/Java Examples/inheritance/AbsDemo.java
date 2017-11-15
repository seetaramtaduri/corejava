abstract class Engine
{

  public void display()
  {
    System.out.println("in Engine class");

  }
   abstract void start();
   abstract void goFast();
   abstract void stop();
}
abstract class Santro extends Engine
{
    void start()
	{
		System.out.println("santro has started");
    }
	void goFast()
	{
		System.out.println("santro is moving fast");
	}
   abstract void stop();
}
class BMW extends Santro 
{
    void stop()
	{
		 System.out.println("BMW stopped");
    }
}
public class AbsDemo
{
    public static void main(String[] args) 
	{
		Engine e;
		BMW s=new BMW();
        e=s;
		e.display();
		e.start();
		e.stop();
		e.goFast();
		
	}
}
