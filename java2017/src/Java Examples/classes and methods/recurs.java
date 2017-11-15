import java.io.*; 
class recurs 
{ 
  public static void main(String arg[]) 
   { 
     int num=0; 
     DataInputStream ins=new DataInputStream(System.in); 
      
     try 
      { 
       System.out.print("Enter the no."); 
       num=Integer.parseInt(ins.readLine()); 
      } 
     catch(IOException e) 
      {} 
     
    System.out.print("Factorial is "+fact(num)); 
  } 
 
 static int fact(int n) 
  { 
   if(n==1) 
    return 1;  
   else 
    return (n*fact(n-1)); 
  }
}