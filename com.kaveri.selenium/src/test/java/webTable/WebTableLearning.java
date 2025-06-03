package webTable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import baseArea.TestBase;

public class WebTableLearning extends TestBase {
	public static void webtab() {
		List<WebElement> tr= driver.findElements(By.xpath("//table[contains(@id,'countries')//tr"));
		int row =tr.size();
		System.out.println(row);
		List<WebElement> td= driver.findElements(By.xpath("//table[contains(@id,'countries')/tr[1]/td"));
		int colo =td.size();
		System.out.println(colo);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	}

}
