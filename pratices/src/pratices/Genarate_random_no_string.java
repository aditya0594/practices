package pratices;

import java.util.Random;

public class Genarate_random_no_string {

	public static void main(String[] args) {
		
		
//appraoch - Random
	Random rand = new Random();
	int rand_int = rand.nextInt(100);
	System.out.println(rand_int);
	
	
	double rand_dbl = rand.nextDouble();
	System.out.println(rand_dbl);
//appraoch 2 math call
	
	
	System.out.println(Math.random());
	
//approach 3 apache commans-lang API 
	
	

	
	}

	
}
