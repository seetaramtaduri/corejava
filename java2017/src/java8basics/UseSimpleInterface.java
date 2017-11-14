package java8basics;

public class UseSimpleInterface {
 public static void main(String[] args) {
	//without arguments
	SimpleInterface obj = () -> System.out.println("Say Something");
	obj.dosomeThing();
}
}
