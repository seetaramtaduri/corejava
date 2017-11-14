package java8basics;

public class UseInterfaceWithArgs {
 public static void main(String[] args) {
	
	SimpleInterfaceWithArgs obj = (v1)->{
		
		System.out.println("welcome : " + v1);
	};
	obj.dosomeThingWithArgs("seetaram");
}
}
