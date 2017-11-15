import java.io.*;

class StringLength{
	public static void main(String[] args){
		try{
			BufferedReader object=new BufferedReader (new InputStreamReader(System.in));
			System.out.println("Eneter string value:");
			String s=object.readLine();
			int len=s.length();
			System.out.println(len);
		}
		catch(Exception e){}
	}
}
