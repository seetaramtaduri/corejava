//to create a text file using FileWriter
import java.io.*;
class CreateFile
{
public static void main(String a[])throws IOException
{
String str="this is a java program"+"\n Iam a learner of java";
FileWriter fw=new FileWriter("th.txt");
for(int i=0;i<str.length();i++)
fw.write(str.charAt(i));
fw.close();
}
}

