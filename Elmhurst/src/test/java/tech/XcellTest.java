package tech;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class XcellTest {

	public static void main(String[] args) throws IOException {
		
		FileInputStream fis=new FileInputStream(new File("./excel/xcel.xls"));
		HSSFWorkbook wb=new HSSFWorkbook(fis);
		HSSFSheet sheet=wb.getSheetAt(0);
		
		String value= sheet.getRow(3).getCell(0).getStringCellValue();
		
		System.out.println(value);
		
		sheet.getRow(2).getCell(0).setCellValue("jah");
		FileOutputStream fso= new FileOutputStream("./excel/xcel.xls");
		wb.write(fso);
		
String value2= sheet.getRow(2).getCell(0).getStringCellValue();
		
		System.out.println(value2);
	}

}
