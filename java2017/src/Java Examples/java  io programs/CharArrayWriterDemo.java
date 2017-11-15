import java.io.*;
class CharArrayWriterDemo 
{
public static void main(String args[]) throws IOException 
{
   CharArrayWriter carrw = new CharArrayWriter();
   String s = "We are at Abhyaas Iconnex Finishing School";
	char mystr[] = new char[s.length()];
	s.getChars(0, s.length(), mystr, 0);
	carrw.write(mystr);
System.out.println("mystr as a string");
System.out.println(f.toString());


System.out.println("Into array");
char c[] = f.toCharArray();
for (int i=0; i<c.length; i++) {
System.out.print(c[i]);
}
System.out.println("\nTo a FileWriter()");
FileWriter f2 = new FileWriter("test.txt");
carrw.writeTo(f2);
f2.close();
System.out.println("Doing a reset");
f.reset();
for (int i=0; i<3; i++)
f.write('X');
System.out.println(f.toString());
}
}