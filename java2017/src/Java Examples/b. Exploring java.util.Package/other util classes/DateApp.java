import java.util.*;
import java.text.*;
class  DateApp
{
	public static void main(String[] args) 
	{
		Date dt1 = new Date();  
        Date dt2 = new Date(100,01,29); 
        Date dt3 = new Date("02/30/2011");    
        DateFormat df1 = DateFormat.getDateInstance();
DateFormat df2 =DateFormat.getDateTimeInstance(DateFormat.MEDIUM,DateFormat.SHORT,Locale.UK);
		
			System.out.println("Date1=" + dt1);
			System.out.println("Date2=" + df1.format(dt2));
			System.out.println("Date3=" + df2.format(dt3));
		}
}
