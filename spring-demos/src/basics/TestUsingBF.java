package basics;
import org.springframework.beans.factory.BeanFactory;  
import org.springframework.beans.factory.xml.XmlBeanFactory;  
import org.springframework.core.io.ClassPathResource;  
import org.springframework.core.io.Resource;  
  
public class TestUsingBF {  
public static void main(String[] args) {  
  
	
	// The XmlBeanFactory is the implementation class for the BeanFactory interface
	// The constructor of XmlBeanFactory class receives the Resource object 
	// so we need to pass the resource object to create the object of BeanFactory
	
    Resource resource=new ClassPathResource("basics/applicationContext.xml");  
    
    System.out.println("Test using BeanFactory");
    BeanFactory factory=new XmlBeanFactory(resource);    
    
    Student student=(Student)factory.getBean("studentbean");  
    student.displayInfo();  
}  
}  