import java.util.Scanner;
interface Student
{
     public  void read();
     public  void display();
}
interface Mid1 extends Student
{
       public void marks1();
       public void display1();
}
interface Mid2 extends Student
{
       public void marks2();
       public void display2();
}
class DemoImp implements Mid1,Mid2
{
        int rno,m1,m2;
        String  name;
        Scanner sc=new Scanner(System.in);
        public void read()
        {
                rno=sc.nextInt();
                name=sc.next();
        }
       public void marks1()
        {
                m1=sc.nextInt();
        }
       public void marks2()
        {
                m2=sc.nextInt();
        }
       public void display1()
        {
                System.out.println("m1 : "+m1);
        }
       public void display2()
        {
                System.out.println("m2 :"+m2);
        }
       public void display()
        {
                System.out.println("rno :"+rno+" name:"+name);
        }
        public static void main(String args[])
        {
                DemoImp di=new DemoImp();
                di.read();
                di.marks1();
                di.marks2();
                di.display();
                di.display1();
                di.display2();
         }
}
