

import java.util.*;

class arrlisttoarr
{

public static void main(String args[])
{
ArrayList al=new ArrayList();
System.out.println("initial size of array is  "+al.size());
al.add(new Integer(1));
al.add(new Integer(2));
al.add(new Integer(3));
al.add(new Integer(4));
System.out.println(" size of array after insertions is  "+al.size());
System.out.println("contents of al are "+al);

Object ia[]=al.toArray();
int sum=0;
for(int i=0;i<ia.length;i++)
sum=sum+((Integer)ia[i]).intValue();
System.out.println("sum is....."+sum);

}

}



