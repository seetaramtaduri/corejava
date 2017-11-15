//To demo for Multi level inheritance
import java.io.*;
class Data1
{
  int rno;
  String name;
};
class Data2 extends Data1
{
  String dt;

  void store()
  throws IOException
  {
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    System.out.print(" Enter Roll No : "); 
    rno=Integer.parseInt(br.readLine());
    System.out.print(" Enter Name : "); 
    name=br.readLine();
    System.out.print(" Enter Date of Birth : "); 
    dt=br.readLine();
  }
 };
class  Student  extends Data2
{
 void show()
  {
    System.out.println("Sudent details\n\n");
    System.out.println(" Roll No : "+rno);
    System.out.println(" Name : "+name);
    System.out.println(" Date of Birth :  "+dt);
  }
};
class Inherit2
{
 public static void main(String args[])
 throws IOException
 {
    Student d=new Student();
    d.store();
    d.show();
 }
}

