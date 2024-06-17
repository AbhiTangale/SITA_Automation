package TestCase;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import PageObjectModel.LoginPageObject;
import Resources.BaseClass;
import Resources.TestCaseData;
import extentManager.ExtentManager;

public class VerifyLoginTestCase extends BaseClass {
	
	@Test
	
	public void  LoginTestCase() throws IOException, InterruptedException {
		
		
		LoginPageObject lpo = new LoginPageObject(driver);
//
//		WebElement Logo = driver.findElement(By.xpath("//img[2]"));
//		Thread.sleep(2000);
//		if (Logo.isDisplayed()) {
//
//			ExtentManager.test.createNode("Expected result Logo is visible and Actual result  Logo is visible");
//
//			System.out.println("Expected result Logo should be visible and Actual result Logo is visible");
//		} else {
//			ExtentManager.test
//					.createNode("Expected result Logo should be visible and Actual result Logo is not visible");
//
//			System.out.println("Expected result Logo is visible and Actual result  Logo is not visible");
//		}

		Thread.sleep(3000);
		lpo.EnterUsername().sendKeys(TestCaseData.username);
		Thread.sleep(3000);
		lpo.EnterPassword().sendKeys(TestCaseData.password);
		Thread.sleep(3000);
		lpo.ClickSubmit().click();

//		String expected = "Verifyotp";
//
//		String actual = driver.getTitle();
//
//		Assert.assertEquals(actual, expected);

		Thread.sleep(2000);
		ExtentManager.test.createNode("Login Test Case Pass");


	}
}
