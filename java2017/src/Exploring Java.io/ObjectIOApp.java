import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.File;
import java.io.IOException;
import java.util.Date;

public class ObjectIOApp {
 public static void main(String args[]) throws IOException,
   ClassNotFoundException {
  File file = new File("test.txt");
  FileOutputStream outFile = new FileOutputStream(file);
  ObjectOutputStream outStream = new ObjectOutputStream(outFile);
  TestClass1 t1 = new TestClass1(true,9,'A',0.0001,"java");
  TestClass2 t2 = new TestClass2();
  String t3 = "This is a test.";
  Date t4 = new Date();
  outStream.writeObject(t1);
  outStream.writeObject(t2);
  outStream.writeObject(t3);
  outStream.writeObject(t4);
  outStream.close();
  outFile.close();
  FileInputStream inFile = new FileInputStream(file);
  ObjectInputStream inStream = new ObjectInputStream(inFile);
  System.out.println(inStream.readObject());
  System.out.println(inStream.readObject());
  System.out.println(inStream.readObject());
  System.out.println(inStream.readObject());
  inStream.close();
  inFile.close();
  file.delete();
 }
}

class TestClass1 implements Serializable {
 boolean b;
 int i;
 char c;
 double d;
 String s;
 TestClass1(boolean b,int i,char c,double d,String s){
  this.b = b;
  this.i = i;
  this.c = c;
  this.d = d;
  this.s = s;
 }
 public String toString(){
  String r = String.valueOf(b)+" ";
  r += String.valueOf(i)+" ";
  r += String.valueOf(c)+" ";
  r += String.valueOf(d)+" ";
  r += String.valueOf(s);
  return r;
 }
}

class TestClass2 implements Serializable {
 int i;
 TestClass1 tc1;
 TestClass1 tc2;
 TestClass2(){
  i=0;
  tc1 = new TestClass1(true,2,'j',1.234,"Java");
  tc2 = new TestClass1(false,7,'J',2.468,"JAVA");
 }
 public String toString(){
  String r = String.valueOf(i)+" ";
  r += tc1.toString()+" ";
  r += tc2.toString();
  return r;
 }
}
