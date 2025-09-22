package filehandling;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelWriteDemo1 {

	public static void main(String[] args) throws IOException {
		
		FileInputStream fis=new FileInputStream("D:\\FLM2ndJuneWS\\JavaSeasons3\\Book1.xlsx");

		XSSFWorkbook wb=new XSSFWorkbook(fis);
		
		XSSFSheet  ws=wb.getSheet("Sheet1");
		
		//case 1 : modifying exiting cell 
		
		//ws.getRow(1).getCell(1).setCellValue("reyaz");
		
		//case 2: creating a cell in existing row  
		//ws.getRow(1).createCell(3).setCellValue("FLM");
		
		//case 3: creating a row and cell in it 
		
		ws.createRow(4).createCell(0).setCellValue("Passed");
		
		
		FileOutputStream fos=new FileOutputStream("D:\\FLM2ndJuneWS\\JavaSeasons3\\Book1.xlsx");
		
		wb.write(fos);
		
		wb.close();
		
	}

}
