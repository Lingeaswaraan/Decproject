package com.Dec_Mini_project;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Data_Driven {
	public static  File f;
	public static void particular_data() throws IOException {
		System.out.println("=============");
		System.out.println("particlular data");
		System.out.println("=====================");
		 f = new File ("C:\\Users\\Admin\\eclipse-workspace\\Dec_Mini_project\\Data.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fis);
		Sheet sheet = wb.getSheetAt(0);
		Row row = sheet.getRow(3);
		Cell cell = row.getCell(1);
		CellType celltype = cell.getCellType();
		if (celltype.equals(CellType.STRING)) {
			String value = cell.getStringCellValue();
		System.out.println(value);
		}
		}
	public static void all_Data() throws IOException {
		System.out.println("=======================");
		System.out.println("all data");
		System.out.println("====================");
 FileInputStream fis1 = new FileInputStream(f);
 Workbook wb1 = new XSSFWorkbook(fis1);
 Sheet sheet1 = wb1.getSheetAt(0);
		int numberofrows = sheet1.getPhysicalNumberOfRows();
		for (int i = 0; i < numberofrows; i++) {
			Row row1 = sheet1.getRow(i);
		int numberofcells = row1.getPhysicalNumberOfCells();
		for (int j = 0; j < numberofcells; j++) {
			Cell cell1 = row1.getCell(j);
		CellType cellType1 = cell1.getCellType();
		if (cellType1.equals(CellType.STRING)) {
		String value1 = cell1.getStringCellValue();
			System.out.println(value1);
			}
		else if (cellType1.equals(CellType.NUMERIC)) {
			double value11 = cell1.getNumericCellValue();
		System.out.println(value11);
		}
		}
		}
		}
	public static void row_data() throws IOException {
		System.out.println("======================");
		System.out.println("row data");
		System.out.println("============================");
f= new File("C:\\Users\\Admin\\eclipse-workspace\\Dec_Mini_project\\Data.xlsx");
		FileInputStream fis2 = new FileInputStream(f);
		Workbook wb2 = new XSSFWorkbook(fis2);
		Sheet sheet2 = wb2.getSheetAt(0);
		Row row2 = sheet2.getRow(7);
		int numberofcells2 = row2.getPhysicalNumberOfCells();
	for (int i = 0; i <numberofcells2; i++) {
		Cell cell2 = row2.getCell(i);
		CellType celltype2 = cell2.getCellType();
		if (celltype2.equals(CellType.STRING)) {
			String value2 = cell2.getStringCellValue();
		System.out.println(value2);
		}
		else if(celltype2.equals(CellType.NUMERIC)) {
			double value22 = cell2.getNumericCellValue();
		System.out.println(value22);
			}
	}
	}
	public static void cell_Data() throws IOException {
		System.out.println("=================");
		System.out.println("cell data");
		System.out.println("===================");
f = new File("C:\\Users\\Admin\\eclipse-workspace\\Dec_Mini_project\\Data.xlsx");
FileInputStream fis3 = new FileInputStream(f);
Workbook wb3 = new XSSFWorkbook(fis3);
Sheet sheet3 = wb3.getSheetAt(0);
int numberofrows3 = sheet3.getPhysicalNumberOfRows();
for (int i = 0; i <numberofrows3; i++) {
	Row row3 = sheet3.getRow(i);
Cell cell3 = row3.getCell(1);
CellType celltype3 = cell3.getCellType();
if (celltype3.equals(CellType.STRING)) {
	String value3 = cell3.getStringCellValue();
System.out.println(value3);
}
else if (celltype3.equals(CellType.NUMERIC)) {
	double value33 = cell3.getNumericCellValue();
System.out.println(value33);

}
}
	}
	public static void main(String[] args) throws Throwable {
	particular_data();
	all_Data();
	row_data();
	cell_Data();
}
}
