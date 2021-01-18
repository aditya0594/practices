package pratices;
//5!=1*2*3*4*5 =120 
//5! =5*4*3*2*1 = 120
public class factorial_of_number {
	public static void main(String[] args) {
		
		int num=10;
		long factorial=1;
		/*for(int i=1; i<=num; i++)
		{
			factorial=factorial* i;
		}
		System.out.println("Factoria of number is :" + factorial);
		*/
		for(int i=num; i>=1; i--){
			
			factorial = factorial * i;
		}
		System.out.println("Factorial of number is :"+ factorial);
	}
	
}
