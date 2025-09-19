package filehandling;

import java.io.FileWriter;
import java.io.IOException;

public class WriteFile2 {

	public static void main(String[] args) {
		
		try {
			FileWriter writer=new FileWriter("D:\\FLM2ndJune\\screenshots\\sample.txt",true);
			writer.write("\nthis is the second line in txt file");
			writer.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
		System.out.println("End of program...");
		

	}

}
