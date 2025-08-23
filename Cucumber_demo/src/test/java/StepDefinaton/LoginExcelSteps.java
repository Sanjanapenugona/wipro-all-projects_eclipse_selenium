package StepDefinaton;

	import org.apache.poi.ss.usermodel.*;

import io.cucumber.java.en.Given;

import java.io.FileInputStream;
	import java.io.IOException;
	 
	public class LoginExcelSteps {
	 
		@Given("user logs in using row {int}")
	    public void user_logs_in_using_row(Integer rowNumber) {
	        String filePath = "\"C:\\Users\\Sanjana\\Downloads\\excelData.xlsx\"";
	        String username = ExcelReader.getCellValue(filePath, "Sheet1", rowNumber, 0);
	        String password = ExcelReader.getCellValue(filePath, "Sheet1", rowNumber, 1);
	 
	        System.out.println("Username: " + username + " | Password: " + password);
	        // You can now use this data for login
	    }
	}