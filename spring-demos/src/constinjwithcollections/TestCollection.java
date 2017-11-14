package constinjwithcollections;
import org.springframework.beans.factory.BeanFactory;  
import org.springframework.beans.factory.xml.XmlBeanFactory;  
import org.springframework.core.io.ClassPathResource;  
import org.springframework.core.io.Resource;  
  
public class TestCollection {  
public static void main(String[] args) {  
    Resource resource=new ClassPathResource("constinjwithcollections/applicationContext.xml");  
    BeanFactory factory=new XmlBeanFactory(resource);  
      
    Hobbies hobbies=(Hobbies)factory.getBean("hobby");  
    hobbies.displayInfo();  
      
}  
}  