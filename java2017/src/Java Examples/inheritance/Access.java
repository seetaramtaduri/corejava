/* In a class hierarchy, private members remain
   private to their class.

   This program contains an error and will not
   compile.
*/


// A simple example of inheritance.

// Create a superclass.
 class student
{
  
   String name;
   int age;
    int marks=600;
   void disp() 
   {
    System.out.println("Name="+name);
	System.out.println("Age="+age);
	System.out.println("marks="+marks);
   }

 }


// Create a subclass by extending class A.
class bscstud extends student 
{
  String course="bsc";
  
  void disp() 
  {
    System.out.println("Name="+name);
	System.out.println("Age="+age);
	System.out.println("course=" + course);
    System.out.println("marks="+marks);
  }
}
  
class SimpleInheritance 
{
  public static void main(String args[])
  {
    student sup = new student();
    bscstud sub = new bscstud();

    // The superclass may be used by itself.
    sup.name ="raghu";
    sup.age = 25;
    //sup.marks=650;
	System.out.println("Contents of superOb: ");
    sup.disp();
    System.out.println();

    /* The subclass has access to all public members of
       its superclass. */
    sub.name = "seetaram";
    sub.age = 26;
   // sub.marks=450; private varaibles cannot be inherited
    System.out.println("Contents of subOb: ");
    sub.disp();
    System.out.println();

    }
}

