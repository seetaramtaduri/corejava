package basicprograms;
public class SystemAndRuntime {
public static void main(String[] args) {
	
	//Internally calls runtime.exit and halts the current jvm processing
	System.exit(0);
	
	//System.gc() is a class method which internally calls runtime.gc
	//in simple words gc() in system class is a static method
	System.gc();
	
	//runtime.gc is an instance method
	//Instance methods are defined in a class and are accessible only through the object of the class
	//in simple words gc() in system class is a non-static method
	Runtime.getRuntime().gc();
	
}
}