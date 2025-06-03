package selenium_Test;
import baseArea.TestBase;

public class SelectclassUsingMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestBase.BrowerSetup();
		TestBase.max();
		TestBase.getUrl("https://www.saucedemo.com/");
		TestBase.passvalidcred();
		TestBase.handledropdown("Price (low to high)");
		TestBase.handledropdown("Name (Z to A)");
		
	}

}
