package org.vijaytest;

import java.io.File;
import java.io.FileInputStream;

import java.io.IOException;
import java.math.BigDecimal;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.util.SystemOutLogger;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Vijay1 {
public static void main(String[] args) throws IOException {
	File file = new File("C:\\Users\\Vijay criss\\eclipse-workspace\\Vijay\\xl\\Maven01.xlsx");
	FileInputStream stream =new FileInputStream(file);
	Workbook work = new XSSFWorkbook(stream);
	Sheet sheet =work.getSheet("Table");
	for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {
		Row r =sheet.getRow(i);
		for (int j = 0; j < r.getPhysicalNumberOfCells(); j++) {
			Cell c=r.getCell(j);
			System.out.println(c);
			
			CellType celltype = c.getCellType();
			System.out.println("java");
			switch (celltype) {
			
			case STRING:
				String data = c.getStringCellValue();
				System.out.println(data);
				break;
			
			case NUMERIC:
				double d = c.getNumericCellValue();
				BigDecimal b = BigDecimal.valueOf(d);
				String name = b.toString();
				System.out.println(name);
				break;
				
				default:
					break;
				}
			
			
			
			}
			
	}
		
		
		
	}
}

