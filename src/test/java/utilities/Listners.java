package utilities;

import java.io.IOException;

import org.openqa.selenium.devtools.v96.headlessexperimental.model.ScreenshotParams;
import org.testng.ITestListener;
import org.testng.ITestResult;

import test.BaseTest;

public class Listners extends BaseTest implements ITestListener {

	public void onTestFailure(ITestResult result) {
		
		String name=result.getName();
		
		try {
			ScreenShots.captureScrenShot(driver,name);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
	
	
	

}
