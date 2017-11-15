import java.util.Scanner;
public interface Student
{
       void read();
       void dispay();
}
public interface Mid1 extends Student
{
        void marks1();
        void display1();
}
public interface Mid2 extends Student
{
        void marks2();
        void display2();
}
class DemoImp1 implements Mid1,Mid2
{
        int rno,m1,m2;
        String  name;
        Scanner sc=new Scanner(System.in);
        void read()
        {
                rno=sc.nextInt();
                name=sc.next();
        }
        void marks1()
        {
                m1=sc.nextInt();
        }
        void marks2()
        {
                m2=sc.nextInt();
        }
        void display1()
        {
                System.out.println("m1 : "+m1);
        }
        void display2()
        {
                System.out.println("m2 :"+m2);
        }
        void display()
        {
                System.out.println("rno :"+rno+" name:"+name);
        }
        public static void main(String args[])
        {
                DemoImp1 di=new DemoImp1();
                Student s=di;
                s.read();
                Mid1 m1=di;
                m1.marks1();
                Mid2 m2=new DemoImp1();
                m2.marks2();
                s.display();
                m1.display1();
                m2.display2();
         }
}
