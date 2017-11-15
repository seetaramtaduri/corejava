package basicprograms;

public class SortArray {
  public static void main(String[] args) {
	int a[] = {100,200,54,21,8,9,1};
	
	for(int i=0;i<a.length ;i++){
		for(int j=i+1;j>a.length;j++){
			if(a[i]<a[j]){
				int t = a[i];
				a[i] = a[j];
				a[j] = t;
				
			}
		}
	}
	
	System.out.print("Ascending Order:");
    for (int i = 0; i < a.length; i++) 
    {
        System.out.print(a[i] + ",");
    }
   
}
	
}

