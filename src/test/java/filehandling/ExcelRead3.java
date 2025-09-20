package filehandling;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead3 {

	public static void main(String[] args) throws IOException {
		
		FileInputStream fis=new FileInputStream("D:\\FLM2ndJuneWS\\JavaSeasons3\\Book1.xlsx");
		
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet  ws=wb.getSheet("Sheet1");
		
		XSSFRow row=null;
		XSSFCell cell=null;
		
		//rows 
		for(int i=0;i<=ws.getLastRowNum();i++)
		{
			row=ws.getRow(i);
			
			if(row!=null)
			{
				//cells 
				for(int j=0;j<row.getLastCellNum();j++)
				{
					cell=row.getCell(j);
					if(cell!=null)
					{
						if(cell.getCellType()==CellType.STRING)
						{
							System.out.println(cell+" is a String ");
						}
						else if(cell.getCellType()==CellType.NUMERIC)
						{
							System.out.println(cell+" is a Number ");
						}
						else if(cell.getCellType()==CellType.BOOLEAN)
						{
							System.out.println(cell+" is a boolean ");
						}
					}
				}
				
			}
			
			
		}
		
		

	}

}
