// Average an array of values.
class Average 
 {
  public static void main(String args[]) {
    int a[] = {10, 11, 12, 13, 14};
    int res = 0;
    int i;
    
    for(i=0; i<5; i++) 
      res = res + a[i];

    System.out.println("Average is " + res / 5);
  }
}
