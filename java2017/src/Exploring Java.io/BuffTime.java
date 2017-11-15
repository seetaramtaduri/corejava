
import java.io.*;

import java.util.*;


class BuffTime
{

public static void main(String args[]) throws IOException
{

FileOutputStream fout1=new FileOutputStream("raj");

FileOutputStream fout2=new FileOutputStream("ram");

BufferedOutputStream bout=new BufferedOutputStream(fout2);


System.out.println("time taken for unbuffered is  "+time(fout1));

System.out.println("time taken for buffered is  "+time(bout));

bout.close();

fout1.close();

}


static int time(OutputStream os) throws IOException
{

Date start=new Date();

for(int i=1;i<=500000;i++)
os.write(65);

return( (int)( new Date().getTime()-start.getTime() ) );
}

}







