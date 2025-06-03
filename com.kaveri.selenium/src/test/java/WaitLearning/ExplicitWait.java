package WaitLearning;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.github.dockerjava.api.model.Driver;

public class ExplicitWait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		//Also called as Fluent wait or explicit wait 
		//create an obj and it is condition based
		
		WebDriverWait ww = new WebDriverWait(driver, Duration.ofSeconds(10));
		 driver.get("https://www.saucedemo.com/");
	        driver.manage().window().maximize();
	        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	        WebElement us = driver.findElement(By.id("user-name"));
	        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	        WebElement pw = driver.findElement(By.name("password"));
	        WebElement log = driver.findElement(By.id("login-button"));
	        us.sendKeys("standard_user");
	        pw.sendKeys("secret_sauce");
	        log.click();
	        WebElement dd = driver.findElement(By.xpath("//select[contains(@data-test,'product-sort-container')]"));
	        ww.until(ExpectedConditions.visibilityOf(dd));
	        System.out.println("I have loggedin");
	        


	}

}
