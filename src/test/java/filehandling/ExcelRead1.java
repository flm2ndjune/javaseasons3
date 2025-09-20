package filehandling;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead1 {

	public static void main(String[] args) throws IOException {
		
		FileInputStream fis=new FileInputStream("D:\\FLM2ndJuneWS\\JavaSeasons3\\Book1.xlsx");
		
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet  ws=wb.getSheet("Sheet1");
		
		System.out.println("no of rows "+ws.getLastRowNum());
		System.out.println("no of rows "+ws.getPhysicalNumberOfRows());
		
		System.out.println("no of cells"+ws.getRow(0).getLastCellNum());
		System.out.println("no of cells"+ws.getRow(0).getPhysicalNumberOfCells());
		
		
		System.out.println(ws.getRow(0).getCell(0));
		
		

	}

}
