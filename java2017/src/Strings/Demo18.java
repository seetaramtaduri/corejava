// Program to Demo concat(),length(),replace(),toUppercase(),toLowerCase,substring()
import java.lang.*;
import java.io.*;
class Demo18
{
public static void main(String args[])
throws IOException
{
String s1="Seeta ram";
String s2=s1.concat("Rao");
int l=s2.length();
String s3="Vaagdevi";
String s4=s3.replace('v','s');
String s5=s2.toUpperCase();
String s6=s2.toLowerCase();
String s7=s2.substring(5);
System.out.println(s1);
System.out.println(s2);
System.out.println("Length of s2 = "+l);
System.out.println(s3);
System.out.println(s4);
System.out.println(s5);
System.out.println(s6);
System.out.println(s7);
}
}
