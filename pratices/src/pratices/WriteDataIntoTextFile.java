package pratices;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteDataIntoTextFile {

	public static void main(String[] args) throws IOException {
		 
		FileWriter fw = new FileWriter("C:\\FileWriter.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		
		bw.write("Selenuium java");
		bw.write("Selenuium java2");
		bw.write("Selenuium java3");
		bw.write("Selenuium java4");
		System.out.println("write close");

		bw.close();
 
	}

}
