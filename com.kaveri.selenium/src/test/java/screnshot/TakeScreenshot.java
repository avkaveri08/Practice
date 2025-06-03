package screnshot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;

import baseArea.TestBase;

public class TakeScreenshot extends TestBase{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestBase.BrowerSetup();
		TestBase.max();
		TestBase.getUrl("https://www.saucedemo.com/");
		TestBase.passvalidcred();
		TestBase.handledropdown("Price (low to high)");
		//TestBase.getUrl("https://www.amazon.in/");
		
//		TakeScreenshot ts = (TakeScreenshot) driver;
//		File src = ts.getScreenshotAs(OutputType.FILE);
//		File dest = new File("C:\\Users\kavav\eclipse-workspace\com.kaveri.selenium\target\tc01.png");
//		try {
//			
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		// Now you can do whatever you need to do with it, for example copy somewhere
		try {
			FileUtils.copyFile(scrFile, new File("C:\\Users\\kavav\\eclipse-workspace\\com.kaveri.selenium\\target\\screenshot.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

	private File getScreenshotAs(OutputType<File> file) {
		// TODO Auto-generated method stub
		return null;
	}

	

}
