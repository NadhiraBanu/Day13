package Files;



import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {
	
public String[][] readExcel (String ExcelFilename,String Sheetname ) throws IOException
	
	
	
	{
		
		XSSFWorkbook book = new XSSFWorkbook("./Data/"+ExcelFilename+".xlsx");
		XSSFSheet sheet = book.getSheet(Sheetname);
		
		
		int lastRowNum = sheet.getLastRowNum();
		System.out.println("Row count :" + lastRowNum);
		
		
		short lastCellNum = sheet.getRow(0).getLastCellNum();
		System.out.println("Col count :"+ lastCellNum);
		
		String[][] data = new String [lastRowNum][lastCellNum];
		
		
		
		for (int i = 1; i <= lastRowNum; i++) {
			XSSFRow row = sheet.getRow(i);
			for (int j = 0; j < lastCellNum; j++) {
				XSSFCell cell = row.getCell(j);
				String stringCellValue = cell.getStringCellValue();
				
				data[i-1][j]=stringCellValue;
			}
		
		}
		return data;

	}

	

}
