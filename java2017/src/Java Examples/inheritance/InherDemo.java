class  person 
{
	  String name;
	  int age;
      int id;
       public void show()
	    {
	      System.out.println("this is persons show method");
       }
      


}
class student extends person
{
       String course;
	   double avg;
	   student(double avg,String  course)
	   {
             this.avg=avg;
			 this.course=course;
	   }
	   public void setData(String name,int age,int id)
	   {
		   this.name=name;
		   this.age=age;
		   this.id=id;
	    }
       public void show()
		{
		    System.out.println(" Name="+name);
			System.out.println("Age="+age);
		    System.out.println("Roll no="+id);
            System.out.println("Age="+age);
            System.out.println("Course="+course);
			System.out.println("Avg="+avg);
		}

}
    class Employee extends person
    {
       String  job;
	   double sal;
	   Employee(String job,double sal)
	   {
             this.job=job;
			 this.sal=sal;
	   }
	   public void setData(String name,int age,int id)
	   {
		   this.name=name;
		   this.age=age;
		   this.id=id;
	    }
       public void show()
		{
		    System.out.println("Name="+name);
			System.out.println("Age="+age);
		    System.out.println("Eid="+id);
            System.out.println("Age="+age);
            System.out.println("Job="+job);
			System.out.println("Sal="+sal);
		}
 }
 public class InherDemo
 {
    public static void main(String[] args) 
	{
		student        s1 = new student(96.5,"Btech");
		Employee     e1 = new Employee("MGR",50000.00);
		s1.setData("Krishna",26,1);
		e1.setData("Radha",25,1010);
	    System.out.println("**********Student Details are***********");
		   s1.show();
	    
		System.out.println("***********Emp details are**********");
		   e1.show();
	
	}
}
