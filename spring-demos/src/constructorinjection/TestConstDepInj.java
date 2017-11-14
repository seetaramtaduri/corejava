package constructorinjection;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class TestConstDepInj {  
    public static void main(String[] args) {  
          
        Resource r=new ClassPathResource("constructorinjection/applicationContext.xml");  
        
        BeanFactory factory=new XmlBeanFactory(r);  
        Employee s=(Employee)factory.getBean("emp");  
        s.show();  
          
    }  
}  