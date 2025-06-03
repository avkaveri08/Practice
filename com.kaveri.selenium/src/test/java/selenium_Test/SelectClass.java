package selenium_Test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();
        WebElement us = driver.findElement(By.id("user-name"));
        WebElement pw = driver.findElement(By.name("password"));
        WebElement log = driver.findElement(By.id("login-button"));
        us.sendKeys("standard_user");
        pw.sendKeys("secret_sauce");
        log.click();
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
        	if(ss.equalsIgnoreCase("Name (Z to A)")) {
        		e.click();
        		break;
        	}
        }
        
        	//3 options available in select class
        	//1. Visible text
        	//s.selectByVisibleText("Price (low to high)");
        	
        	//2.by Index 
        	//s.selectByIndex(2);
           
            //3.by Value
           //s.selectByValue("za");
        	
       
	}

}
