package filehandling;

import java.io.File;
import java.io.IOException;

public class NewFileCreation2 {
	
	public static void main(String[] args) {
		
		File file=new File("D:\\FLM2ndJune\\screenshots\\sample.txt");
		try {
			System.out.println(file.createNewFile());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("End of Program");
		
	}

}
