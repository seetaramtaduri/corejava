package fundamentals.arrays;
public class LargestInArray {

public static void main(String[] args) {
int max=0;
int arr[]={900,2,54,15,40,100,20,011,299,30,499,699,66,77};
max=arr[0];
for(int i=0;i<arr.length-1;i++)
{
if(max<arr[i+1])
{
max=arr[i+1]; 
} 
}
System.out.println(max);
}
}

