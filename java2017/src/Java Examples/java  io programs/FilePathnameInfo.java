//Obtaining abstract pathname information 
import java.io.File; 
import java.io.IOException; 
class FilePathnameInfo 
{ 
   public static void main(String[] args) throws IOException 
   { 
     
      File file = new File("FilePathnameInfo.java"); 
      System.out.println("Absolute path = "+file.getAbsolutePath()); 
      System.out.println("Canonical path = "+file.getCanonicalPath()); 
      System.out.println("Name = "+file.getName()); 
      System.out.println("Parent = "+file.getParent()); 
      System.out.println("Path = "+file.getPath()); 
      System.out.println("Is absolute = "+file.isAbsolute()); 
   } 
} 