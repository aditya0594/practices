package pratices;

public class counting_no_of_digits {
		public static void main(String[] args) {
			
			int num=1234;
			int count=0;
			while(num>0)
			{
				num = num/10;
				count++;
			}
			System.out.println("No of digits :" + count);
			
			
		}
}
