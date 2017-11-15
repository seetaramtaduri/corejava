//wap to perform stack operations in java .
import java.io.*;
import java.util.*;
class stack
{
     static void stpush(Stack st,int a)
      {
         st.push(new Integer(a));
      }

      static void stpop(Stack st)
       {
        Integer a=(Integer) st.pop();
        System.out.println(a);
       }

     static int stsearch(Stack st,int a)
      {
          int i=st.search(new Integer(a));
          return i;
      }

     public static void main(String args[]) throws IOException
     {
     BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
     Stack st=new Stack();
     int element,pos,choice=0;
       while(choice<4)
         {
            System.out.println("STACK OPERATIONS");
            System.out.println("1->PUSH ELEMENT");
            System.out.println("2->POP ELEMENT");
            System.out.println("3->SEARCH FOR AN ELEMENT");
            System.out.println("4->EXIT");
            System.out.println("PLEASE ENTER YOUR CHOICE-------------");
            choice=Integer.parseInt(br.readLine());
       switch(choice)
          {
            case 1: System.out.println("ENTER AN ELEMENT");
                    element=Integer.parseInt(br.readLine());
                    stpush(st,element);
                    break;
            case 2: stpop(st);
                    break;
            case 3: element=Integer.parseInt(br.readLine());
                    pos=stsearch(st,element);
                    System.out.println("THE POSITION:" +pos);
                    if(pos==-1)
                    System.out.println("THE ELEMENT IS NOT FOUND");
                    break;
            default: return;
          }
   System.out.println("STACK=" +st);
  }
  }
}


