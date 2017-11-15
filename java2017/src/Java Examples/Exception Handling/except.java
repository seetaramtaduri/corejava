class LowBal extends Exception
{
        int data;
        LowBal(int n)
        {
                data=n;
        }

        public String toString()
        {
                return "Exception Raised ...Low Bal" +data;
        }
}

class NegativeEx extends Exception
{
        int data;
        NegativeEx(int data)
        {
                this.data=data;
        }
        public String toString()
        {
                return "Negative value recieved for data :"+data;
        }
}
                

class except extends Thread
{
        void check(int no) throws LowBal, NegativeEx
        {
                System.out.println("Checking balance < 500 (" + no + ")");
                if(no<500)
                        throw new LowBal(no);
                System.out.println("Normal Exit");
                System.out.println("Checking balance < 0(" + no + ")");
                if(no<0)
                        throw new NegativeEx(no);
                System.out.println("Normal Exit");
        }

        public static void main(String args[])
        {
                Except e=new Except();
                try
                {
                        e.check(1000);
                        e.check(300);
                        e.check(-10);
                }

                catch(LowBal me)
                {
                        System.out.println(me);
                }
                catch(NegativeEx nex)
                {
                        System.out.println(nex);
                }
        
        finally
        {
                System.out.println("Now in the finally Block and exiting");
        }
        }
}

