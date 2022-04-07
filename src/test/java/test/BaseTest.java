package test;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeSuite;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;

public class BaseTest {
	public static WebDriver driver;
  
  @BeforeSuite
  public void beforeSuite() {
	  
	  WebDriverManager.chromedriver().setup();
		 
		 driver= new ChromeDriver();
		
		 driver.manage().window().maximize();
			driver.get("https://opensource-demo.orangehrmlive.com/");
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));		
  }

  @AfterSuite
  public void afterSuite() {
	  
	  driver.close();
  }

}
