//to create employee class whose objects are to be stored into a file.
import java.io.*;
import java.util.Date;
class Employee implements Serializable
{
//instance var
private int id;
private String name;
private float sal;
private Date doj;

Employee(int i,String n,float s,Date d)
{
id=i;
name=n;
sal=s;
doj=d;
}

void display()
{
System.out.println(id+"\t"+name+"\t"+sal+"\t"+doj);
}

static Employee getData()throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

System.out.println("enter emp id:");
int id=Integer.parseInt(br.readLine());

System.out.println("enter name:");
String name=br.readLine();

System.out.println("enter salary:");
float sal=Float.parseFloat(br.readLine());

Date d=new Date();

Employee e=new Employee(id,name,sal,d);

return e;
}
}
