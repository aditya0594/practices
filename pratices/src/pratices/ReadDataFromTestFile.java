package pratices;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReadDataFromTestFile {

	public static void main(String[] args) throws IOException {
		
//approach 1 : Using FileReader and BufferReader	
	
		/*FileReader fr = new FileReader("C:\\file.txt");
		BufferedReader br = new BufferedReader(fr);
		
		String str;
		while((str=br.readLine())!=null)
		{
			System.out.println(str);
		}
		br.close();
	}*/
// approach 2 : using Scanner and file 
	
		File  file = new File("C:\\file.txt");
		Scanner sc = new Scanner(file); 
		//loop statment 
		/*while(sc.hasNextLine())
		{
		 System.out.println(sc.nextLine());
		}*/
 
//approach 3 
		sc.useDelimiter("\\Z");
		System.out.println(sc.next());
		
		
		
		
	}
		
		
}
