package basicprograms;
class Simple{  
    public static void main(String args[]){  
     System.out.println("Hello Java");  
     
     int a=10;  
     int b=10;  
     int c=a+b;  
     System.out.println(c);  
     
     //widening
     
  
     float f=a;  
     System.out.println(a);  
     System.out.println(f);  
     
     //Narrowing
     //int a=f;//Compile time error  
      a=(int)f;  
      System.out.println(f);  
      System.out.println(a); 
      
     //variable overflow
    //Overflow  
      int a1=130;  
      byte b1=(byte)a;  
      System.out.println(a1);  
      System.out.println(b1);  
      
      byte a2=10;  
      byte b2=10;  
      //byte c=a+b;//Compile Time Error: because a+b=20 will be int  
      byte c1=(byte)(a2+b2);  
      System.out.println(c1);  
     
    }  
}  