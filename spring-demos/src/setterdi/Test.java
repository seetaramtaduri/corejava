package setterdi;
import org.springframework.beans.factory.BeanFactory;  
import org.springframework.beans.factory.xml.XmlBeanFactory;  
import org.springframework.core.io.*;  
  
public class Test {  
    public static void main(String[] args) {  
          
        Resource r=new ClassPathResource("setterdi/spring.xml");  
        BeanFactory factory=new XmlBeanFactory(r);  
          
        Employee emp=(Employee)factory.getBean("obj");  
        emp.display();  
          
    }  
}  