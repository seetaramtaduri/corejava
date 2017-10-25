package core.jaxbdemo;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

public class FirstJaxbApplication {

	public static void main(String[] args) throws JAXBException, FileNotFoundException {
		
		JAXBContext context = JAXBContext.newInstance(Book.class);
        
		Marshaller  marshaller = context.createMarshaller();
		
		marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		
		Book b1 = new Book(1,"java primer" , 450.00 , 800);
		
		marshaller.marshal(b1, new FileOutputStream("book.xml"));

	}

}
