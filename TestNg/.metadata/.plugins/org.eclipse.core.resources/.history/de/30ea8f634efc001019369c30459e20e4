package Demo;

import java.io.*;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class ApachePOI {
	public static void main(String[] args) throws Exception {
		//user.dir will change the path into the current project
		String excelpath=System.getProperty("user.dir")+"/files/ApchePOI.xlsx";//Represents the path of the current ApchePOI.xlsx
		File excelfile=new File(excelpath);
		FileInputStream fis=new FileInputStream(excelfile);
		XSSFWorkbook workbook=new XSSFWorkbook(fis);
		XSSFSheet sheet=workbook.getSheet("Sheet1");
		int rownum=sheet.getLastRowNum();
		System.out.println("The total number of rows as per the index in the sheet are  "+rownum);//3===>0,1,2, not correct for this use other method that follows
	
		int actual_numberofrows=sheet.getPhysicalNumberOfRows();
		System.out.println("The actual number of cells with out index "+actual_numberofrows);
		int colnum=sheet.getRow(0).getLastCellNum();
		System.out.println("THe actual number of the column are "+ colnum);
		for(int r=0;r<actual_numberofrows;r++) {
			XSSFRow row=sheet.getRow(r);
			for(int c=0;c<colnum;c++) {
				
				XSSFCell cell=row.getCell(c);
				CellType celltype=cell.getCellType();
				switch(celltype) {
				case STRING:
				System.out.print(cell.getStringCellValue()+"|");break;
				case NUMERIC:
					System.out.print(cell.getNumericCellValue()+"|");break;
				case BOOLEAN:
					System.out.print(cell.getBooleanCellValue()+"|");break;
					
				}	
			}
			System.out.println();
		}
		
	}
	
		
}
