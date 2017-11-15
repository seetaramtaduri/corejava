import java.io.*;

public class DeleteTempFile{
	public static void main(String[] args) {
		try{
			System.out.println("Delete temp file example!");
			BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Please enter file name that has '.temp' extension:");
			String str = bf.readLine();
			File file = new File(str+".temp");
			if (file.exists()){
				file.deleteOnExit();
				System.out.println("file is deleted!");
			}
			else{
				System.out.println("File does not exists!");
			}
		}
		catch(IOException e){
			e.printStackTrace();
		}
	}
}