package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import base.TestBase;
import utilities.ReadXlsData;

public class FirstTestcase extends TestBase {

	@Test(priority=1,dataProviderClass=ReadXlsData.class,dataProvider="TestExecution")

	public static void TestExecution(String locator) {
		// TODO Auto-generated method stub

		WebElement element = driver.findElement(By.xpath(locator));
		System.out.println(element);

	}

}
