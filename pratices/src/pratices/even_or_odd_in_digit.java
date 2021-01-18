package pratices;

public class even_or_odd_in_digit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int num = 123756;
		int even_count = 0;
		int odd_count = 0;
		
		while(num>0)
		{
			int rem = num/10;
			if(rem%2==0)
			{
				even_count++;
			}
			else{
				odd_count++;
			}
			num = num/10;
		}
		System.out.println("No of even number :"+even_count);
		System.out.println("No of even number :"+odd_count);
		
	}

}
