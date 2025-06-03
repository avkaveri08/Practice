package baseArea;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TestBase {

	public static WebDriver driver;
	public static void BrowerSetup() {
		driver=new ChromeDriver();

	}
	public static void max() {
		driver.manage().window().maximize();
	}
	public static void getUrl(String url) {
		driver.get(url);
	}
	public static void passvalidcred() {
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();
        WebElement us = driver.findElement(By.id("user-name"));
        WebElement pw = driver.findElement(By.name("password"));
        WebElement log = driver.findElement(By.id("login-button"));
        us.sendKeys("standard_user");
        pw.sendKeys("secret_sauce");
        log.click();
	}
	
	public static void handledropdown(String elem) {
		WebElement dd = driver.findElement(By.xpath("//select[contains(@data-test,'product-sort-container')]"));
	       //create the object for select class for dropdown
	        Select s = new Select(dd);
	        List<WebElement> li = s.getOptions();
	        for(WebElement e : li) {
	        	//System.out.println(e.getText());
	        	//Without using select also we can get the handle the drop down with this condition
	        	//return type of web elements in string 
	        	String ss = e.getText();
	        	System.out.println(ss);
	        	if(ss.equalsIgnoreCase(elem)) {
	        		e.click();
	        		break;
	        	}
	}

}
	public static void ts(String name){
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		// Now you can do whatever you need to do with it, for example copy somewhere
		try {
			FileUtils.copyFile(scrFile, new File("C:\\Users\\kavav\\eclipse-workspace\\com.kaveri.selenium\\target\\"+name+".png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
	}
}
