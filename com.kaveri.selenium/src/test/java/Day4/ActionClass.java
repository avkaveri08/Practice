package Day4;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import baseArea.TestBase;

public class ActionClass extends TestBase {
	
	public static void rightclick(String cli) {
		Actions a = new Actions(driver);
		WebElement rig = driver.findElement(By.xpath("//span[text()='right click me']"));
		
		//mouse hover 
		a.moveToElement(rig).build().perform();
		a.contextClick(rig).build().perform();
		
		//After right click multiple options are present for that we need to 
		//select them then write an xpath for container which
		//contains the complete options//ul[contains(@class,'context-menu-list context-menu-root')]
		List<WebElement> li = driver.findElements(By.xpath("//ul[contains(@class,'context-menu-list context-menu-root')]/li"));
		//findElements are used for multiple options in right click dialogue box
		for(WebElement rg : li)
		{
			//to print the elements in dialogue box 
			//System.out.println(rg.getText());
			String ss = rg.getText();
        	System.out.println(ss);
        	if(ss.equalsIgnoreCase(cli)) {
        		rg.click();
        		break;
			//if(rg.getText().equals("Cut"))
			//{
				//rg.click();
				//break;
        	}
		}
		//handle Alert popup 
		String s = driver.switchTo().alert().getText();
		System.out.println(s);
		driver.switchTo().alert().accept();
		//accept is for ok and dismiss is for cancel
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestBase.BrowerSetup();
		TestBase.max();
		TestBase.getUrl("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		//TestBase.passvalidcred();
		ActionClass.rightclick("Cut");
		

	}

}
