package projectprograms;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.Dec_Mini_project.Base;

public class Datadrivenread2 extends Base {
	public static void particulardata() throws IOException {
File f = new File("C:\\Users\\acer\\Downloads\\Decproject-master (1)\\Decproject-master\\datasheet.xlsx");
FileInputStream fis = new FileInputStream(f);
Workbook wb = new XSSFWorkbook(fis);
Sheet sheetAt = wb.getSheetAt(0);
Row row = sheetAt.getRow(3);
		Cell cell = row.getCell(1);
		CellType cellType = cell.getCellType();
		if (cellType.equals(CellType.STRING)) {
			String text = cell.getStringCellValue();
			System.out.println(text);
		} 
		else if (cellType.equals(cellType.NUMERIC)) {
			double numericCellValue = cell.getNumericCellValue();
			System.out.println(numericCellValue);
		}
	}
	public static void main(String[] args) throws IOException {
		particulardata();
	}
		
		
	

}
