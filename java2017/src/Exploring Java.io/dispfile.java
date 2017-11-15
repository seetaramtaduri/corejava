import java.io.*;
class dispfile
{
public static void main(String a[])throws Exception
{
FileInputStream f=new FileInputStream("k.txt");
int cnt=0;
int wnt=0;
int lnt=0;
int c;
while((c=f.read())!=-1)
{
switch((char)c)
{
case '\n':lnt++;
          wnt++;
          
          break;

case ' ':wnt++;
        
         break;

default: cnt++;
         break;

}
}
System.out.println("no of characters:"+cnt);
System.out.println("no of words:"+wnt);
System.out.println("no of lines:"+lnt);
}
}
