package pratices;

public class RemoveJunkFromString {

	public static void main(String[] args) {
			
		String s = "&*^%&%^&$#^%#^% aditya pawar 8668852556";
		s=s.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(s);
		
		
	}

}
