package pratices;

public class ReverseEachWordInString {

	public static void main(String[] args) {
//approach 1 
		/*String s = "welcome to java";//original string 
		String[] words=s.split(" "); //  Splitting a original string into multiple part  //array created
		
		String ReverseString ="";
		
		for(String w:words)
		{
			String reverseWord ="";
			for(int i=w.length()-1;i>=0;i--)
			{
				reverseWord=reverseWord+w.charAt(i);
			}
			ReverseString=ReverseString+reverseWord+" ";
		}
		System.out.println(ReverseString);*/
		
		
		String str = "Welcome to java";
		String[] words= str.split("\\s");
		
		String reverseWord="";
		for(String w:words)
		{
			StringBuilder sb = new StringBuilder(w);
			sb.reverse();
			reverseWord=reverseWord+sb.toString()+" ";
		}
		System.out.println(reverseWord);
	}

}
