  
package test;

import java.util.concurrent.TimeUnit;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import pages.LoginPage;


@Listeners(TestNGListnerEx.class)

public class LoginTest extends Baseclass  {
	
	
	
	@Test(enabled=false)
	@Parameters({"username","password"})
	public void LoginTestcase(String uname, String pass) {
		
		LoginPage Loginobj = new LoginPage();
		Loginobj.login(uname, pass);
				
	}
	
	@Test
	public void LoginTestcase2() {
		
		LoginPage Loginobj = new LoginPage();
		
		String uname = sheet.getRow(1).getCell(0).getStringCellValue();
		String pass = sheet.getRow(1).getCell(1).getStringCellValue();
		
		Loginobj.login(uname, pass);
				
	}



}