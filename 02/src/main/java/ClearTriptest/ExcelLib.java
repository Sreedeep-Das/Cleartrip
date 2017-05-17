package ClearTriptest;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.Reporter;

public class ExcelLib
{
           public static String getdata(String path,String sheetNum,int rowNum,int cellNum )
           {
        	   try
        	   {
        		   FileInputStream fis=new FileInputStream(path);
        		   Workbook wb= WorkbookFactory.create(fis);
        		   String data=wb.getSheet(sheetNum).getRow(rowNum).getCell(cellNum).getStringCellValue();
        		   return data;
        	   }
        	   catch (Exception e)
        	   {
        		   return"";
        	   }
           }
           public static void setdata(String path,String sheetNum,int rowNum,int cellNum )
           {
        	   try
        	   {
        		   FileInputStream fis=new FileInputStream(path);
        		   Workbook wb1= WorkbookFactory.create(fis);
        		   String data=wb1.getSheet(sheetNum).getRow(rowNum).getCell(cellNum).getStringCellValue();
        		   FileOutputStream fos=new FileOutputStream(path);
        			wb1.write(fos);
        	   }
        	   catch (Exception e)
        	   {
        		   Reporter.log("data not set properly");
        	   }
           }
           
}
