package Day4;
	import java.util.List;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.interactions.Actions;

	import baseArea.TestBase;

	public class DdwithMethodoverloading extends TestBase{
		//Robust method
		
		public static void dd1(String ca, String ba)
		{
			List<WebElement> cap = driver.findElements(By.xpath("//div[contains[contains(@id,'dropContent')]/div"));
			List<WebElement> cou = driver.findElements(By.xpath("//div[contains[contains(@id,'countries')]/div"));
			Actions a1 = new Actions(driver);
			for (WebElement ca1 : cap) {
				if (ca1.getText().equalsIgnoreCase("ca")) {
					for (WebElement ba1 : cou) {
						if (ba1.getText().equalsIgnoreCase("ba")) {
							a1.dragAndDrop(ca1, ba1).build().perform();
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
			DdwithMethodoverloading.dd1("Washington","United States");
		}

	}


}
