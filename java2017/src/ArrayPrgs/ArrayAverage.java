public class ArrayAverage{
	public static void main(String[] args) {
		double nums[]={1.0,2.3,3.4,4.5,40.5};
		double result=0.0;
		int i=0;
		for(i=0; i < nums.length; i++){
			result=result + nums[i];
		}
		System.out.println("Average is =" + result/nums.length);
	}
}