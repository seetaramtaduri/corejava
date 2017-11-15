//program to demo on Methods with argument and with return type.

import java.io.*;
 class Method2
 {
        public static void main(String args[])
        throws Exception
        {
        Method2  x=new Method2();
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n;
        System.out.println("Enter any number");
        n=Integer.parseInt(br.readLine());
        int r=x.fact(n);
        System.out.println("Factorial of "+n+"Is "+r);
        }
        int fact(int n)
        {
        int f=1;
        for(int i=1;i<=n;i++)
        f=f*i;
        return f;
        }
};

