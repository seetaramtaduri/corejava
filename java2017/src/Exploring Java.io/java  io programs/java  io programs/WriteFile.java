import java.io.*;

public class WriteFile{
		public static void main(String[] args) throws IOException{
			File f=new File("textfile1.txt");
			FileOutputStream fop=new FileOutputStream(f);
			if(f.exists()){
			String str="This data is written through the program";
					fop.write(str.getBytes());
					fop.flush();
					fop.close();
					System.out.println("The data has been written");
					}
					else
						System.out.println("This file is not exist");
		}
	}

