import java.io.*;
import java.io.File;
class firstfile{
static void p(String s){
System.out.println(s);
}
public static void main(String a[]){
File f1=new File("c:/program files/java");
p("file name:"+f1.getName());
p("path:"+f1.getPath());
p("abs path:"+f1.getAbsolutePath());
p("parent:"+f1.getParent());
p(f1.exists() ? "exists" : "does not exists");
p(f1.canWrite() ? "is writeable" : "is not writeable");
p(f1.canRead() ? "is readable:" : " is not readable");
p("is"+(f1.isDirectory()?"": "not" +"a directory"));
p(f1.isFile() ? "is normal file"  : "might be named pipe");
p(f1.isAbsolute() ? "is absolute" : "is not absolute");
p("file last modified:" +f1.lastModified());
p("file size:"+f1.length()+"bytes");
}
}
