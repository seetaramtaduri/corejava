package core.jaxbdemo;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Book {

	int bookid;
	String title;
	double price;
	int pages;
	
	Book(){
		
	}
	
	public Book(int bookid, String title, double price, int pages) {
		
		this.bookid = bookid;
		this.title = title;
		this.price = price;
		this.pages = pages;
	}
	@XmlAttribute
	public int getBookid() {
		return bookid;
	}
	public void setBookid(int bookid) {
		this.bookid = bookid;
	}
	
	
	@XmlElement
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	@XmlElement
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getPages() {
		return pages;
	}
	public void setPages(int pages) {
		this.pages = pages;
	}
	
	
	
	
}
