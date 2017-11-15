class Loan
{
     private float loanamount;
     Loan()//constructor
     {
        loanamount=1234;
     }
     float getLoanAmount()
     {
       return loanamount;
     }
}//loan
class Account
{
    int accno;
    String name;
    private float balance;
    Account(int ano,String nm,float bal)
    {
       accno=ano;
       name=nm;
       balance=bal;
    }
    float getBalance()
    {
        return balance;
    }//balance enquiry service
    void deposit(float amt)
    {
          balance=balance+amt;
    }
    void withDraw(float amt)
    {
        float bal=getBalance();
        if(bal>amt)
        {
          balance=balance-amt;
          System.out.println("do remember to collect cash");
        }
        else
        {
          System.out.println("insufficient funds");
        }
    }
    void payLoan()
    {
        Loan l=new Loan();
        float amt=l.getLoanAmount();
        balance=balance-amt;
    }
 }
 class messagepassing
 {
 public static void main(String s[])
 {
   Account a=new Account(1001,"rama",500);
   a.deposit(9000);
   a.payLoan();
   a.withDraw(7000);
   float b=a.getBalance();
   System.out.println("account balance is "+b); 
 }
}