package selenium_Test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;


public class checkTest {
	    public static void main(String[] args) {
	    	
	    	ThreadLocal<WebDriver> driver1 = new ThreadLocal<WebDriver>();
	        // Setup ChromeDriver using WebDriverManager
	    	//
	        WebDriverManager.chromedriver().setup();
	        driver1.set(new ChromeDriver());	        
	        WebDriver driver = driver1.get();
	        
	        // Open a URL
	        driver.get("https://www.saucedemo.com/");
	        driver.manage().window().maximize();
	        WebElement us = driver.findElement(By.id("user-name"));
	        WebElement pw = driver.findElement(By.name("password"));
	        WebElement log = driver.findElement(By.id("login-button"));
	        us.sendKeys("standard_user");
	        pw.sendKeys("secret_sauce");
	        log.click();
	        //Link Text
	       // WebElement tw = driver.findElement(By.linkText("Twitter"));
	       
	        //Partail link Text
	        WebElement fb = driver.findElement(By.partialLinkText("Face"));
	        //tw.click();
	        System.out.println("tw");
	        fb.click();
	        System.out.println("fb");
	        
	        //2 clicks are not working together-->Issue
	        //WebElements to fetceh no of web elements
	        //List<WebElement> obj = driver.findElements(By.id("username"));
	        
	        // Close the browser
	        //driver.quit();
	    }
}
