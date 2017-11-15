//User-defined exception - Program

import java.io.*;

class BankWith extends Exception
{
    BankWith()
    {
	System.out.println("\nIn the withdrawal process");
    }

    public void message()
    {
	System.out.println("\nCannot withdraw as insufficient funds...");
    }
}

public class BankEx
{
    public static void main(String s[])
    {
      try
      {
	int currbal=600;
	while(true)
	{
	    System.out.println("\n\n1.Deposit");
	    System.out.println("2.Withdraw");
	    System.out.println("3.Balance");
	    System.out.println("4.Exit");
	    DataInputStream dis1=new DataInputStream(System.in);
	    System.out.print("Enter your Choice 1/2/3/4 : ");
	    int ch=Integer.parseInt(dis1.readLine());
	    if (ch==1)
	    {
		DataInputStream dis2=new DataInputStream(System.in);
		System.out.print("\nEnter the amount for Deposit : ");
		int amt=Integer.parseInt(dis2.readLine());
		currbal=currbal+amt;
		System.out.println("\nBalance amount : Rs."+currbal);
	    }
	    else
	    if (ch==2)
	    {
		DataInputStream dis3=new DataInputStream(System.in);
		System.out.print("\nEnter the amount for Withdrawal : ");
		int wd=Integer.parseInt(dis3.readLine());
		int temp=currbal;
		temp=temp-wd;
		if(temp<500)
		    throw new BankWith();
		else
		    currbal=currbal-wd;
		System.out.println("\nBalance amount : Rs."+currbal);
	    }
	    else
	    if (ch==3)
		System.out.println("\nBalance is : Rs."+currbal);
	    else
	    if (ch==4)
		System.exit(0);
    	    else
		System.out.println("\nInvalid Choice. Try again....");
	}
      }
      catch(IOException ie)
      {
	ie.printStackTrace();
      }
      catch(BankWith bw)
      {
	bw.message();
      }
    }
}

