package utilities;

import java.io.File;

import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.WebDriver;

public class ScreenShots {
	
	public static void captureScrenShot(WebDriver driver,String name) throws IOException{
		

	TakesScreenshot tss=(TakesScreenshot)driver;
	
	File source=tss.getScreenshotAs(OutputType.FILE);
	
	File destination =new File(System.getProperty("user.dir")+"\\Screenshot\\screen.png");
			
	FileHandler.copy(source, destination);
	
	System.out.println("Screenshot capture");
	

}}
