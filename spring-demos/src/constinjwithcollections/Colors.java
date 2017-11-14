package constinjwithcollections;

public class Colors {
	private String color1;  
	private String color2; 
	private String color3;
	public Colors(String color1, String color2, String color3) {
		super();
		this.color1 = color1;
		this.color2 = color2;
		this.color3 = color3;
	}
	@Override
	public String toString() {
		return "Colors [color1=" + color1 + ", color2=" + color2 + ", color3=" + color3 + "]";
	}  
}
