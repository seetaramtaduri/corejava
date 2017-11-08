package java2017;

import javax.swing.JOptionPane;

public class HelloSwing {

	public void sayHello()
    {
        JOptionPane.showMessageDialog(null,  
            "Hello, World!", "Greeter", 
            JOptionPane.INFORMATION_MESSAGE);
    }
	public static void main(String args[]){
		HelloSwing obj  = new HelloSwing();
		obj.sayHello();
	}
		
}
