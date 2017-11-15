//to create a text file using FileWriter
import java.io.*;
class CreateFile1
{
public static void main(String a[])throws IOException
{
String str="this is a java program"+"\n Iam a learner of java";
FileWriter fw=new FileWriter("three");
BufferedWriter bw=new BufferedWriter(fw);
for(int i=0;i<str.length();i++)
bw.write(str.charAt(i));
bw.close();
}
}

