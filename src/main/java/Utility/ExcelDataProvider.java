package Utility;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataProvider {

	public static String getstingdata(String sheetname, int row, int cell) throws Exception{
		String path="C:\\Users\\91899\\eclipse-workspace\\DEMO_Batch11\\TestData\\Data.xlsx";
		FileInputStream fis=new FileInputStream(path);
		XSSFWorkbook wb= new XSSFWorkbook(fis);
		return wb.getSheet(sheetname).getRow(0).getCell(0).getStringCellValue();
	}
}
