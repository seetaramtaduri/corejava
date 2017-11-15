import java.io.File;
class dirlist{
public static void main(String a[]){
String dirname="/advjava";
File f=new File(dirname);
if(f.isDirectory()){
System.out.println("directory of"+dirname);
String s[]=f.list();
for(int i=0;i<s.length;i++){
File f1=new File(dirname+"/"+s[i]);
if(f1.isDirectory()){
System.out.println(s[i]+"is a directory");
}
else
{
System.out.println(s[i]+"is a file");
}
}
}
else
{
System.out.println(dirname+"is not a directory");
}
}
}
