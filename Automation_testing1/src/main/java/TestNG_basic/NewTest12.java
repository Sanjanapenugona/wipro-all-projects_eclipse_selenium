package TestNG_basic;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
 
import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class NewTest12 {
	public static Map<String, String> readColumnWiseData(String filePath, String sheetName) throws IOException {
        FileInputStream fis = new FileInputStream(filePath);
        Workbook workbook = new XSSFWorkbook(fis);
        Sheet sheet = workbook.getSheet(sheetName);
 
        Map<String, String> dataMap = new HashMap<>();
 
        int rowCount = sheet.getPhysicalNumberOfRows();
        for (int i = 0; i < rowCount; i++) {
            Row row = sheet.getRow(i);
            String key = row.getCell(0).toString();   
            String value = row.getCell(1).toString();
            dataMap.put(key, value);
        }
        workbook.close();
        return dataMap;
    }
 
    @DataProvider(name = "excelData")
    public Object[][] getData() throws Exception {
        String path = "C:\\Users\\Sanjana\\Downloads\\excelData.xlsx"; 
        Map<String, String> mapData = readColumnWiseData(path, "Sheet2");
 
        return new Object[][] { { mapData } }; 
    }
 
    @Test(dataProvider = "excelData")
    public void testLogin(Map<String, String> data) {
        System.out.println("url: " + data.get("url"));
        System.out.println("username: " + data.get("username"));
        System.out.println("password: " + data.get("password"));
 
        
        // driver.get(data.get("url"));
        // driver.findElement(By.id("username")).sendKeys(data.get("username"));
        // driver.findElement(By.id("password")).sendKeys(data.get("password"));
}
}
