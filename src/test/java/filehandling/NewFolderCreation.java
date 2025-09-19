package filehandling;

import java.io.File;

public class NewFolderCreation {

	public static void main(String[] args) {
	
		File folder=new File("D:\\FLM2ndJune\\screenshots\\abc");
		System.out.println(folder.mkdir());
		System.out.println("End of program");

	}

}
