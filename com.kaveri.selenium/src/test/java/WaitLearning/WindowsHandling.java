package WaitLearning;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WindowsHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		ChromeOptions options = new ChromeOptions();
//        options.addArguments("--disable-popup-blocking");

		WebDriver driver = new ChromeDriver();
		         driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();
        WebElement us = driver.findElement(By.id("user-name"));
        WebElement pw = driver.findElement(By.name("password"));
        WebElement log = driver.findElement(By.id("login-button"));
        us.sendKeys("standard_user");
        pw.sendKeys("secret_sauce");
        log.click();
       
        
        //driver.switchTo().alert().dismiss();
        
       // String pare = driver.getWindowHandle();
        WebElement tw = driver.findElement(By.xpath("//a[text()='Twitter']"));
        tw.click();
        //Partail link Text and link tEST
        WebElement fb = driver.findElement(By.xpath("//a[text()='Facebook']"));
        fb.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        //driver.switchTo().window(pare); 
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        WebElement li = driver.findElement(By.xpath("//a[text()='LinkedIn']"));
       //li.click();
        
        
        //clrt hash is to comment all code
        //String pare = driver.getWindowHandle();
       // System.out.println(pare); //o/p : 399F656C6B167862723AFBB2CEFBEC45
        
       //Set<String> all = driver.getWindowHandles();
       //for(String n : all)
       //{
    	   //System.out.println(n);// print all the pages array concept
        
//    	   driver.switchTo().window(n);
    	   //String aa= driver.getTitle();
    	   //System.out.println(aa);
    	   //if(aa.equalsIgnoreCase("Swag Labs | LinkedIn")) {
    		   //driver.close();
    		   //break;
    	  // }
    	  // fb.click(); 
       //}
       
//       driver.switchTo().window(pare);   //this should be outside for loop
       
	}

}
