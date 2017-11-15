import java.io.*;

public class  GetParentDir{
	private static void dirlist(String fname){
		File dir = new File(fname);
		String parentpath = dir.getParent();
		System.out.println("Current Directory : "+ dir);
		System.out.println("parent Directory : "+ parentpath);
	}

	public static void main(String[] args){
		String currentdir = System.getProperty("user.dir");
		dirlist(currentdir);
	}
}