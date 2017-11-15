import java.io.*;
class pushback
{
public static void main(String a[])throws Exception
{
FileInputStream fis=new FileInputStream("push.txt");
PushbackInputStream p=new PushbackInputStream(fis);
int c;
while((c=p.read())!=-1)
{
switch((char)c)
{
case '=':if((c=p.read())=='=')
          System.out.print("eq");
          else
          {System.out.println("<=");
          }break;
default:System.out.println((char)c);
break;
}
}
}
}
