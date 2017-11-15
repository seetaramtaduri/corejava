import java.util.*;
class  calendarDemo
{
	public static void main(String[] args) 
	{
		Calendar c1=Calendar.getInstance(); //to create an object of Calendar class
        
		//display the date separately

    int dd=c1.get(Calendar.DATE);
	int mm=c1.get(Calendar.MONTH);
	++mm;
	int yy=c1.get(Calendar.YEAR);
	System.out.println("DATE IS "+dd+"-"+mm+"-"+yy);
   //display the time alone

    int h=c1.get(Calendar.HOUR);
	int m=c1.get(Calendar.MINUTE);
	
	int s=c1.get(Calendar.SECOND);
	System.out.println("TIME IS "+h+":"+m+":"+s);

	int x=c1.get(Calendar.AM_PM);

		if(x==0)
			System.out.println("Good Morning");
		else
			System.out.println("Good Evening");
		
	}
}
