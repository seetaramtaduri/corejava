class MyEx1 extends Exception
{
        int eno;
        
        MyEx1(int no)
        {
                eno=no;
        }
        public String toString()
        {
                return "There is an invalid input by the user " +eno;
        }
}

class MyEx2 extends Exception
{
        String ename;
        MyEx2(String name)
        {
                ename=name;
         }

         public String toString()
         {
                return "The is an invalid input from the user "+ename;
         }
}
        

class UseExcept
{
        public static void main(String args[])
        {
                try
                {
                        assign(0,"Prashanth");
                        //assign(0);
                }
                catch(MyEx1 me)
                {
                        System.out.println(me);
                }
                catch(MyEx2 me2)
                {
                        System.out.println(me2);
                }
        }

        static void assign(int no, String nam) throws MyEx1,MyEx2
        {
                System.out.println("Assigning values");
                if(no==0)
                        throw new MyEx1(no);
                 if(nam=="Prashanth")
                        throw new MyEx2(nam);
                 System.out.println("Normal Exit");
        }
}
                        
                        
                
