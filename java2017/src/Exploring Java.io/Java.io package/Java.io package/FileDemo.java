//program to demo basic File operations
import java.io.*;

class FileDemo
{
 public static void main(String args[])
 {
  File f=new File("FileDemo.java");
  System.out.println("File name :" +f.getName());
  System.out.println("path name :" +f.getPath());
  System.out.println("Parent : " +f.getParent());
  System.out.println(f.exists() ? "the file exists" : "the file not exists");
  System.out.println(f.getName() +" is file :" + f.isFile());
  System.out.println("Length of the file in bytes :"+f.length());
 }
}
