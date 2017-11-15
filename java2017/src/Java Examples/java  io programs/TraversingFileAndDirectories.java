import java.io.*;

public class TraversingFileAndDirectories{
	public static void main(String args[]){
		String dirname = args[0];
		File file = new File(dirname); 
        if(file.isDirectory()){
			System.out.println("Directory is  " + dirname);
			String str[] = file.list();
			for( int i = 0; i<str.length; i++){
				File f=new File(dirname + " / " + str[i]);
				if(f.isDirectory()){
					System.out.println(str[i] + " is a directory");
				}
				else{
					System.out.println(str[i] + " is a file");
				}
			}
		}
		else{
			System.out.println(dirname  + " is not a directory");
		}
	}
}
