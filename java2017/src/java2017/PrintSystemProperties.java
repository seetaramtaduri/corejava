package java2017;
import java.util.Properties;
public class PrintSystemProperties
{
   public static void main(String[] a)
   {
      // List all System properties
      Properties pros = System.getProperties();
      pros.list(System.out);
      System.out.println(System.getProperty("java.home"));
      System.out.println(System.getProperty("java.library.path"));
      System.out.println(System.getProperty("java.ext.dirs"));
      System.out.println(System.getProperty("java.class.path"));
   }
}