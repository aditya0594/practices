package pratices;

public class Remove_whiteSpaces {

	public static void main(String[] args) {
	
		String s = "adiya   pawar    nonsence";
		System.out.println(s);
		s=s.replaceAll("\\s","");
		System.out.println(s);
	}

}
