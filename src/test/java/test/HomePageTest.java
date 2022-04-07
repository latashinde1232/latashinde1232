package test;

import org.testng.annotations.Test;

import pages.HomePageClass;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;

public class HomePageTest extends BaseTest {
	
	HomePageClass hp;
	
	@BeforeClass
	public void initObject() {
		
		hp=new HomePageClass (driver);
		
	}
	
  @Test
  public void logout() {
	  
	  hp.getProfileLinkElement().click();
	  hp.getLogoutLink().click();
	  
  }
  
 
}
