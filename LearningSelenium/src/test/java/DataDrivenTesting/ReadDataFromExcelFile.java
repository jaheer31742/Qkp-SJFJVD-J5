package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.hssf.usermodel.HSSFWorkbookFactory;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

public class ReadDataFromExcelFile {

	@Test(enabled = false)
	public void readSingleData() throws EncryptedDocumentException, IOException {
		// Step to fetch the Data from external resources--excel file

		// step 1.convert the physical file into java understandable file
		FileInputStream fis = new FileInputStream("./Data/EmployeeDetails.xlsx");

		// step 2.create an work book using workbookfactory
		Workbook wb = WorkbookFactory.create(fis);

		// step 3.using workbook get the sheet control
		Sheet sheet = wb.getSheet("BasicData");

		// step 4.using sheet,get the row control
		Row row = sheet.getRow(2);

		// step 5.using sheet,get the column control

		Cell column = row.getCell(1);

		// step 6.using column,get the cell data value and store it.
		String data = column.getStringCellValue();

		// steep 7.print the data
		System.out.println(data);

	}

	@Test(enabled = false)
	public void readTheRecord() throws EncryptedDocumentException, IOException {

		// Step to fetch the records from the excel file

		// step 1. convert the physical file into java underStandable file
		FileInputStream fis = new FileInputStream("./Data/EmployeeDetails.xlsx");

		// step 2.create a workbook factory
		Workbook wb = WorkbookFactory.create(fis);

		// step 3.identify the sheet name
		Sheet sheet = wb.getSheet("BasicData");

		// step 4.identify the row
		Row row = sheet.getRow(0);

		// step 5.identify the column
		Cell column = row.getCell(0);

//		//optimize code
//		String text = wb.getSheet("BasicData").getRow(0).getCell(0).getStringCellValue();
//		
//		System.out.println(text);

		// step 6.get the last row in the excel file
		int lastRow = wb.getSheet("BasicData").getLastRowNum();

//		System.out.println(lastRow);

//		for (int i = 0; i <= lastRow; i++) {
//			String text = wb.getSheet("BasicData").getRow(i).getCell(0).toString();
//			System.out.println(text);
//		}
//
//		System.out.println("================");

		// step 7.get the last column in the excel file
		int lastColumn = wb.getSheet("BasicData").getRow(0).getLastCellNum();
		System.out.println(lastColumn);

		for (int i = 1; i <= lastRow; i++) {
			int lastColumn1 = wb.getSheet("BasicData").getRow(i).getLastCellNum();
			for (int j = 1; j < lastColumn1; j++) {

				String text = wb.getSheet("BasicData").getRow(i).getCell(j).getStringCellValue();
				System.out.print(text);
				System.out.println();
			}
			System.out.println("===============");
		}

	}

	

	@Test
	public void writeSingleData_NewRow() throws EncryptedDocumentException, IOException {
		// create New Row and Create data

		// Step to fetch the records from the excel file

		// step 1. convert the physical file into java underStandable file
		FileInputStream fis = new FileInputStream("./Data/EmployeeDetails.xlsx");

		// step 2.create a workbook factory
		Workbook wb = WorkbookFactory.create(fis);

		// step 3.identify the sheet name
		String sheet = "BasicData";
		Sheet sheet1 = wb.getSheet(sheet);

		// step 4.identify the last row num
		int row1 = sheet1.getLastRowNum();
		
		//step 5.create a new row
		Row row = sheet1.createRow(row1+1);
		
		//create a new column
		Cell cell = row.createCell(0);
		
		// create a new row and enter the data
		cell.setCellValue("jaheer");

		
		// write the data
		
		FileOutputStream fos=new FileOutputStream("./Data/EmployeeDetails.xlsx");
		try {

			wb.write(fos);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
