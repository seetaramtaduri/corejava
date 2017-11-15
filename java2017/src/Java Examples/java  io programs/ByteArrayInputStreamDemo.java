import java.io.*;
class ByteArrayInputStreamDemo
{
  public static void main(String[] a) throws IOException
  {
    String s=" hello world ";
   
   byte[] b1=s.getBytes(); //writing contents to a byte array
   
   //pass byte array ref as arg to BAIS.
   ByteArrayInputStream bi=new ByteArrayInputStream(b1);
  
   int i;
   
   while((i=bi.read())!=-1) //read until end of Array
  
   System.out.print( (char)i  ); //typecasting
  
   }
}