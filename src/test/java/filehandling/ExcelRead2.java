package filehandling;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead2 {

	public static void main(String[] args) throws IOException {
		
		FileInputStream fis=new FileInputStream("D:\\FLM2ndJuneWS\\JavaSeasons3\\Book1.xlsx");
		
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet  ws=wb.getSheet("Sheet1");
		
		XSSFRow row=null;
		XSSFCell cell=null;
		
		for(int i=0;i<=ws.getLastRowNum();i++)
		{
			row=ws.getRow(i);
			
			if(row!=null)
			{
				for(int j=0;j<row.getLastCellNum();j++)
				{
					cell=row.getCell(j);
					if(cell!=null)
					{
						System.out.print(cell+"\t");
					}
				}
				System.out.println();
			}
			
			
		}
		
		

	}

}
