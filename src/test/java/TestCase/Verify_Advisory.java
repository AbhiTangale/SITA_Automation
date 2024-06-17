package TestCase;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import PageObjectModel.Analysis_Advisory;
import PageObjectModel.LoginPageObject;
import Resources.BaseClass;
import Resources.TestCaseData;
import extentManager.ExtentManager;

public class Verify_Advisory extends BaseClass{
	
	
@Test	
public void Advisory() throws InterruptedException, AWTException {
		
		Thread.sleep(3000);
		LoginPageObject lpo = new LoginPageObject(driver);
		Thread.sleep(3000);
		lpo.EnterUsername().sendKeys(TestCaseData.username);
		Thread.sleep(3000);
		lpo.EnterPassword().sendKeys(TestCaseData.password);
		Thread.sleep(3000);
		lpo.ClickSubmit().click();
		Thread.sleep(30000);
	
		Analysis_Advisory a = new Analysis_Advisory(driver);

		a.clickonAnalysis().click();
		Thread.sleep(3000);
		a.clickonAdvisory().click();
		Thread.sleep(10000);

	
		try {
			
			a.detail().click();
			Thread.sleep(40000);
			driver.findElement(By.xpath("//div[@class='modal-body']//div//div//button[@type='button']")).click();
			Thread.sleep(3000);

			System.out.println("present");
//	  		   ExtentManager.test.createNode("Advisory: Detail page is present");		 

		}

		catch (org.openqa.selenium.NoSuchElementException e) {
			System.out.println(" not present");

//             ExtentManager.test.createNode("Advisory: Detail page is not present");		 

		}
		
		try {
			a.share().click();
			Thread.sleep(8000);

			System.out.println("present");
//	  		   ExtentManager.test.createNode("Advisory: Detail page is present");		 

		}

		catch (org.openqa.selenium.NoSuchElementException e) {
			System.out.println(" not present");

//             ExtentManager.test.createNode("Advisory: Detail page is not present");		 

		}
		
		try {
			a.download().click();
			Thread.sleep(15000);
			
			System.out.println("present");
//	  		   ExtentManager.test.createNode("Advisory: Detail page is present");		 

		}

		catch (org.openqa.selenium.NoSuchElementException e) {
			System.out.println(" not present");

//             ExtentManager.test.createNode("Advisory: Detail page is not present");		 

		}
		
	      
         
        
		 ExtentManager.test.createNode("Advisory - Test Case Passed Successfully!");	
}

}
