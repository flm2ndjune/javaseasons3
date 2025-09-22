package filehandling;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesRead {

	public static void main(String[] args) throws IOException {
		
		FileInputStream fis=new FileInputStream("Properties\\config.properties");
		Properties pr=new Properties();
		pr.load(fis);
		
		System.out.println(pr.getProperty("browser"));
		pr.setProperty("101", "Ravi");
		
		FileOutputStream fos=new FileOutputStream("Properties\\config.properties");
		pr.store(fos, null);
		

	}

}
