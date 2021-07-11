package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

public class TestWebDriverListener {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 System.setProperty("webdriver.chrome.driver", "chromedriver");
		 
		 WebDriver driver = new ChromeDriver();
			
			driver = new ChromeDriver();
			
			driver.get("https://www.simplilearn.com/");
			
			driver.manage().window().maximize();
			
			driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
			
			EventFiringWebDriver  event = new EventFiringWebDriver(driver);
	        
	        WebDriverListenerEx listenerObj =  new WebDriverListenerEx();
		        
		    event.register(listenerObj);
		        
			

	}

}
