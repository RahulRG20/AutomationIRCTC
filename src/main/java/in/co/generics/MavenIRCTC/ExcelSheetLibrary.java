package in.co.generics.MavenIRCTC;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelSheetLibrary implements AutoConstant
{

	 public static String getcellvalue(String path, String Sheet, int row , int cell) throws IOException 
	 {
		 FileInputStream fis=new FileInputStream(ExcelSheet);
		 XSSFWorkbook wb= new XSSFWorkbook(fis);
		 String CellValue=wb.getSheet(Sheet).getRow(row).getCell(cell).getStringCellValue();
		 return CellValue;
	 }
}
