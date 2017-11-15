import java.util.*;
class GregorianCalendarDemo
{
  public static void main(String args[])
  {
     String months[] = {
             "Jan", "Feb", "Mar", "Apr", 
             "May", "Jun", "Jul", "Aug",
             "Sep", "Oct", "Nov", "Dec" };
    int year,m,d;
	GregorianCalendar gc = new GregorianCalendar();
    System.out.print("Date: ");
	m= gc.get(Calendar.MONTH);
	System.out.print(months[m]);
	d= gc.get(Calendar.DATE);
	System.out.print(" " +d + " ");
	year= gc.get(Calendar.YEAR);
	System.out.println(year);
    System.out.print("Time: ");
    System.out.print(gc.get(Calendar.HOUR) + ":");
    System.out.print(gc.get(Calendar.MINUTE) + ":");
    System.out.println(gc.get(Calendar.SECOND));
    if(gc.isLeapYear(year)) {
      System.out.println("The current year is a leap year");
    }
    else {
      System.out.println("The current year is not a leap year");
    }
  }
}