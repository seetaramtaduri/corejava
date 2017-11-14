package basics;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;  
public class TestUsingAC {
	public static void main(String[] args) { 
		System.out.println("using application context");
		
		//The ClassPathXmlApplicationContext class is the implementation class of ApplicationContext interface.
		//The constructor of ClassPathXmlApplicationContext class receives string, 
		//so we can pass the name of the xml file to create the instance of ApplicationContext.
		
		ApplicationContext context =  new ClassPathXmlApplicationContext("basics/applicationContext.xml"); 
		Student student=(Student)context.getBean("studentbean");  
	    student.displayInfo();  
		
	}
}
