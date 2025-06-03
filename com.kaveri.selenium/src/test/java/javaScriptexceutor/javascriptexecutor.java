package javaScriptexceutor;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import baseArea.TestBase;

public class javascriptexecutor extends TestBase {
	public static void scroll() {
		javascriptexecutor js = (javascriptexecutor) driver;
		 WebElement li = driver.findElement(By.xpath("//a[text()='LinkedIn']"));
		 js.executeScript("arguments[0].scrollIntoView(true)",li);
		 
	}

	private void executeScript(String string, WebElement li) {//why did i create ??
		
		// TODO Auto-generated method stub
		
	}

	public static void main(String[] args) {
		TestBase.BrowerSetup();
		TestBase.max();
		TestBase.getUrl("https://www.saucedemo.com/");
		TestBase.passvalidcred();
		javascriptexecutor.scroll();
		TestBase.ts("linkedincheck");

		

	}

}
