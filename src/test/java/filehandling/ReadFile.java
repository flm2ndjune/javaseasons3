package filehandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {

	public static void main(String[] args) throws IOException {
		
		FileReader reader=new FileReader("D:\\FLM2ndJune\\screenshots\\sample.txt");
		 /* 
		 * while(reader.read()!=-1) { System.out.println(reader.read()); }
		 */
		
		BufferedReader br=new BufferedReader(reader);
		String line;
		while((line=br.readLine())!=null)
		{
			System.out.println(line);
		}
		
		System.out.println("End of program..");
	}

}
