package Generic;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.Reporter;

public class Excel implements E_Const
{
	public static String getCellValue(String ExcelPath,String ValidLoginLogout,int row,int cell)
	{
		String V=" ";
		try{
			FileInputStream fis=new FileInputStream(ExcelPath);
			Workbook wb=WorkbookFactory.create(fis);
			Cell c=wb.getSheet(ValidLoginLogout).getRow(row).getCell(cell);
			V=c.toString();
			}
		catch(Exception e)
		{
			Reporter.log("Excel path is invalid",true);
		}
		return V;
	}
}
