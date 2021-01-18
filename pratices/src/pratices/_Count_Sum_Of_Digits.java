package pratices;

public class _Count_Sum_Of_Digits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 1236;
		int sum =0;
		while(num>0)
		{
			sum = sum+num%10;
			num=num/10;
			
		}
		System.out.println(sum);
		
	}

}
