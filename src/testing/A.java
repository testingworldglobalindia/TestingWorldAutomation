package testing;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class A {

	public static void main(String[] args) throws IOException {
		File f = new File("D:\\JS99.xlsx");
		FileOutputStream fs = new FileOutputStream(f);
		
		XSSFWorkbook wk = new XSSFWorkbook();
		XSSFSheet s1 = wk.createSheet("JSLearning");
		XSSFRow r1 = s1.createRow(0);
		XSSFCell c1 = r1.createCell(0);
		c1.setCellValue("Hello");
		wk.write(fs);
		wk.close();

		
        
	}
	
}
