package Day4;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import baseArea.TestBase;

public class ActionClass2 extends TestBase{
	
	public static void dd()
	{
		List<WebElement> cap = driver.findElements(By.xpath("//div[contains[contains(@id,'dropContent')]/div"));
		List<WebElement> cou = driver.findElements(By.xpath("//div[contains[contains(@id,'countries')]/div"));
		Actions a1 = new Actions(driver);
		for (WebElement a : cap) {
			if (a.getText().equalsIgnoreCase("Washington")) {
				for (WebElement b : cou) {
					if (a.getText().equalsIgnoreCase("United States")) {
						a1.dragAndDrop(a, b).build().perform();
						break;
					}
			}
			}
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestBase.BrowerSetup();
		TestBase.max();
		TestBase.getUrl("");
		//TestBase.passvalidcred();
		ActionClass2.dd();
	}

}
