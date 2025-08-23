package StepDefinaton;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelReader {
	public static String getCellValue(String filePath, String sheetName, int row, int col) {
        String cellValue = "";
        try (FileInputStream fis = new FileInputStream(filePath);
             Workbook workbook = WorkbookFactory.create(fis)) {
 
            Sheet sheet = workbook.getSheet(sheetName);
            Row sheetRow = sheet.getRow(row);
            Cell cell = sheetRow.getCell(col);
 
            cellValue = cell.toString();
 
        } catch (IOException e) {
            e.printStackTrace();
        }
        return cellValue;
    }
}

