//program on single inheritence
class Employee
{
 String name=null;
 double basic=0f;
 String id=null;

 Employee(String n,float sal,String no)
 {
  name=n;
  basic=sal;
  id=no;
 }

 double findTotalSalary()
 {
  double total=basic+0.4*basic+0.25*basic;
  System.out.println("Name of the Employee : " +name);
  System.out.println("Basic Salary : "+basic);
  System.out.println("Gross Salary : " +total);
  return total;
 }
}

class PaySlip extends Employee
{
 double cuts=0f;
 
 PaySlip(String n,float sal,String no,float ded)
 {
   name=n;
   basic=sal;
   id=no;
   cuts=ded;
 }

 double deduct()
 {
  System.out.println("Employees deductions : " +cuts);
  return cuts;
 }

 public static void main(String args[])
 {
  PaySlip emp1=new PaySlip("ram",10000,"a123",2341);
  double total=emp1.findTotalSalary();
  double credits=emp1.deduct();

  System.out.println("Net Salary : "+(total-credits));
 }
}
