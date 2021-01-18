package pratices;

public class countCharaterOccurence {

	public static void main(String[] args) {
		String s ="java Programmin java oops";
		
	int totalcount=	s.length(); //total length of String 
		
	int totalcount_AfterRemove=	s.replace("o", "").length(); //total length after removing a 
		
		int count =totalcount-totalcount_AfterRemove;
		
		System.err.println("Number of occurences of a is : "+ count);
		
		
		
	}

}
