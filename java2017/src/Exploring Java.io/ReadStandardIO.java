import java.io.*;
public class ReadStandardIO{
public static void main(String[] args) throws IOException{
InputStreamReader inp = new InputStreamReader(System.in)
BufferedReader br = new BufferedReader(inp);
System.out.println("Enter text : ");
String str = in.readLine();
System.out.println("You entered String : ");
System.out.println(str);
}
}