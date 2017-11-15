import java.lang.System;
import java.util.Properties;

public class PropApp {
 public static void main(String args[]){
  Properties sysProp = System.getProperties();
  sysProp.list(System.out);
 }
}
