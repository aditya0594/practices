package pratices;

import java.util.Scanner;

public class find_largest_of_three {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number");
		int a = sc.nextInt();
		
		System.out.println("Enter second number");
		int b = sc.nextInt();
		
		System.out.println("Enter third number");
		int c = sc.nextInt();
		
		/*if(a>b && a>c)
		{
			System.out.println("First is largest");
		}
		else if(b>a && b>c)
		{
			System.out.println("second is largest");
		}
		else
		{
			System.out.println("third is largest ");
		}*/
		int largest1 =a>b? a:b;
		int largest2 = c>largest1?c:largest1;
		
	}

}
