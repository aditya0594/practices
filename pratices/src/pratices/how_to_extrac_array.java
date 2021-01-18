package pratices;

public class how_to_extrac_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]={5,2,7,9,6};
		
		int sum =0;
		
		//increment method normal for loop
		
		/*for(int i=0; i<=a.length-1; i++) //0,1,2,3,4 //a.length-1  = 4
		{
			
			sum =sum+a[i];  //
		}*/
		
		//enhanced for Loop 
		
		for(int value:a)
		{
			sum = sum+value;
		}
				
		System.out.println("Sumof the array is :" + sum);
		
	}

}
