package WaitLearning;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WaitLearn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		 driver.get("https://www.saucedemo.com/");
	        driver.manage().window().maximize();
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	        WebElement us = driver.findElement(By.id("username"));
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	        WebElement pw = driver.findElement(By.name("password"));
	        WebElement log = driver.findElement(By.id("login-button"));
	        us.sendKeys("standard_user");
	        pw.sendKeys("secret_sauce");
	        log.click();

	}

}
