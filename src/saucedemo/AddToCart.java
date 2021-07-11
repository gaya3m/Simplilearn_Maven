package saucedemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class AddToCart {

	private static final ExtentTest ShoppingTest = null;

	WebDriver driver;

	ExtentReports report;
	ExtentTest test;
	
	SoftAssert soft = new SoftAssert();

	@BeforeTest
	public void setup() {
		
		System.setProperty("webdriver.chrome.driver", "chromedriver");
		
		driver = new ChromeDriver();
		
		driver.get("https://www.saucedemo.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		report = new ExtentReports("ExtentReport.html");
	}
	
	@Test
	@Parameters({"username","password"})
	
	public void Login(String uname, String pass) {
		
		test = report.startTest("Login Test Case");
		
		WebElement UserName= driver.findElement(By.name("user-name"));
		UserName.sendKeys("uname");
		
		test.log(LogStatus.PASS, "Successfully Username entered");
		
		WebElement Password= driver.findElement(By.id("password"));
		Password.sendKeys("pass");
		
		test.log(LogStatus.PASS, "Successfully Password entered");
	      
		WebElement Login = driver.findElement(By.name("login-button"));
	    Login.click();
	    
	    test.log(LogStatus.PASS, "Successfully cliked on login button");

	}
	
     @Test(dependsOnMethods = "Login")
	
	public void addtocart() {
     
    	 WebElement addToCart = driver.findElement(By.name("add-to-cart-sauce-labs-onesie"));
         addToCart.click();
         
         WebElement CartContainer = driver.findElement(By.name("shopping_cart_container"));
         CartContainer.click();
		
		 //String Cartbadge = driver.findElement(By.className("shopping_cart_badge")).getText();
		 
		 WebElement AddToCartCheck = driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-onesie\"]"));


		}
     
     @AfterTest
 	public void teardown() {
    		
 		report.endTest(ShoppingTest);
 		report.flush();
 		
 		driver.quit();
 		
 		soft.assertAll();
 		
 		
     }	
 		
	
}
