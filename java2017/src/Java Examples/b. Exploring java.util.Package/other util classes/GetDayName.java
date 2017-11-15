import java.util.*;
import java.util.Calendar;
import java.text.SimpleDateFormat;
import java.text.DateFormat;
import java.text.DateFormatSymbols;
class GetDayName
{
public static void main(String[] args)
{
     
	 
	 
	 
	 Date date1 =(new GregorianCalendar(2011, Calendar.JUNE, 16)).getTime();

     
	 Date date2 = new Date();
     DateFormat df1 = DateFormat.getDateInstance();
	 System.out.println( df1.format(date1)+"was" + sayDayName(date1));
     System.out.println("Todays Date is"+df1.format(date2));
	 System.out.println("Today is a " + sayDayName(date2));
}

public static String sayDayName(Date d)
{
  DateFormat f = new SimpleDateFormat("EEEE");
  return f.format(d);
 }
}