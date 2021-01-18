package pratices;

public class Find_missing_no_in_array {

	public static void main(String[] args) {
	
		// array should not have duplicate
		//array no need to be sorted 
		//value should be in range 
		
		int a[] ={1,2,3,4,5,7,8,9,10};
		
		//1+2+4+5 =12 sum1
		//1+2+3+4+5 =15 sum2
		//sum2 -sum1 = 15-12= 3 
		int sum1 =0;
		for(int i=0 ; i<a.length;i++)
		{
			sum1 =sum1+a[i];
		}
		System.out.println("sumoof elemt of array"+ sum1);
		
		int sum2 =0;
		for(int i=1; i<=10; i++)
		{
			sum2 =sum2 +i;
		}
		System.out.println("sumoof elemt of array"+ sum2);
		
		System.out.println("Missing no is "+ (sum2 - sum1));
		
		
		
		
		
		
		
	}

}
