package Demo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class Dataproviderforlogin {
	 @DataProvider(name="supplier")
	  public Object[][] datasupplier()  {
		  String excelpath=System.getProperty("user.dir")+"/files/Login_apache.xlsx";
		  File f =new File(excelpath);
		  FileInputStream fis = null;
		try {
			fis = new FileInputStream(f);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		XSSFWorkbook book=null;
		  try {
			 book=new XSSFWorkbook(fis);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		  XSSFSheet sheet=book.getSheet("Login");//Login id the name of the sheet in the excel document
		  int rownum=sheet.getPhysicalNumberOfRows();//defines the exact number of rows which is not dependent on the index
		  int colnum=sheet.getRow(0).getLastCellNum();
		  
		  
		  
		  
		  
		  //Logic for passing the credentials
		  //row starts with the 0 index hence taken the rownum-1
		  Object[][] data=new Object[rownum-1][colnum];
		  for(int r=0;r<rownum-1;r++) {
			 XSSFRow row=sheet.getRow(r+1);
			  for(int c=0;c<colnum;c++) {
				  XSSFCell cell=row.getCell(c);
				CellType celltype=cell.getCellType();
				  switch(celltype) {
				  case STRING:
					  data[r][c]=cell.getStringCellValue();
					  System.out.println(data[r][c]);
					  break;
				  case NUMERIC:
					  data[r][c]=(int)cell.getNumericCellValue();
					  System.out.println(data[r][c]);
					  break;
				 
				  case BOOLEAN:
					  data[r][c]=cell.getBooleanCellValue();
					  System.out.println(data[r][c]);

					  break;
				 
				  }
			  }
		  }
		  
		  return data;
	  }

}
