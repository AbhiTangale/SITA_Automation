package TestCase;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import PageObjectModel.Analysis_SecurityPulse;
import PageObjectModel.LoginPageObject;
import Resources.BaseClass;
import Resources.TestCaseData;
import extentManager.ExtentManager;


	public class VerifyAnalysis_SecurityPulse extends BaseClass{
		
		@Test
		
		public void SecurityPulse() throws InterruptedException, AWTException {

			LoginPageObject lpo = new LoginPageObject(driver);
			Thread.sleep(3000);
			lpo.EnterUsername().sendKeys(TestCaseData.username);
			Thread.sleep(3000);
			lpo.EnterPassword().sendKeys(TestCaseData.password);
			Thread.sleep(3000);
			lpo.ClickSubmit().click();

			Thread.sleep(30000);

			Analysis_SecurityPulse APS = new Analysis_SecurityPulse(driver);

			APS.Analysis().click();
			Thread.sleep(5000);
			APS.Security_Pulse().click();
			Thread.sleep(5000);

			try {
				APS.detail().click();
				Thread.sleep(8000);
				APS.back().click();
//			  	ExtentManager.test.createNode("Security Pulse: Detail page is present");		 

			}

			catch (org.openqa.selenium.NoSuchElementException e) {
//			 ExtentManager.test.createNode("Security Pulse: Detail page is not present");		 
			
			Thread.sleep(15000);

			}
			try {
				APS.share().click();
				Thread.sleep(8000);
				APS.back().click();
//			  	ExtentManager.test.createNode("Security Pulse: Detail page is present");		 

			}

			catch (org.openqa.selenium.NoSuchElementException e) {
//			 ExtentManager.test.createNode("Security Pulse: Detail page is not present");		 

			Thread.sleep(15000);

			}
			try {
				APS.download().click();
				Thread.sleep(8000);
//			    ExtentManager.test.createNode("Security Pulse: Detail page is present");		 

			}

			catch (org.openqa.selenium.NoSuchElementException e) {
//			ExtentManager.test.createNode("Security Pulse: Detail page is not present");		 

			}

			Thread.sleep(15000);

			
			WebElement daterange = APS.Clickdaterange();

			if (daterange.isDisplayed()) {
				Thread.sleep(5000);
				daterange.click();
				Thread.sleep(2000);
				List<WebElement> CalenderDates = driver.findElements(By.xpath("//span[@class='rdrStaticRangeLabel']"));

				Thread.sleep(5000);

				for (WebElement k : CalenderDates) {

					if (k.getText().equalsIgnoreCase("Last Month")) {

						k.click();

						break;
					}
				}
				Thread.sleep(1000);
//				ExtentManager.test.createNode("PSecurity Pulse: Date Range is working");
			} else {
				Thread.sleep(1000);
//				ExtentManager.test.createNode("Security Pulse: Date Range is not working");
			}
						
			
			
//			  ExtentManager.test.createNode("Security Pulse : Test Case Passed Successfully!");	


			
			
			
			
//			     APS.Add().click();
//			     Thread.sleep(5000);
//			     APS.Enter_Page_Title().sendKeys(TestCaseData.Enter_Page_Title);
//			     Thread.sleep(5000);
//			     APS.CRITICALITY().click();
//			     Thread.sleep(5000);
//			     APS.CRITICALITY_High().click();
//			     Thread.sleep(5000);
//			     APS.Enter_Main_Section_Title().sendKeys(TestCaseData.Enter_Main_Section_Title);
//			     //graph
//			     APS.upload_graph().click();
//				 Robot graph= new Robot();
//				 graph.delay(2000);
//					
//			      // StringSelection s = new StringSelection("C:\\Users\\hp\\OneDrive\\Pictures\\Testing Screenshot.png");
//					
//				 StringSelection s = new StringSelection("C:\\Users\\hp\\OneDrive\\Desktop\\Testing.png");
//				 Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s,null);
//				      
//				 // graph.keyPress(KeyEvent.VK_ENTER);
//				      
//				 graph.keyPress(KeyEvent.VK_CONTROL);
//				 graph.keyPress(KeyEvent.VK_V);
//				 graph.keyRelease(KeyEvent.VK_CONTROL);
//				 graph.keyRelease(KeyEvent.VK_V);
//				 graph.keyPress(KeyEvent.VK_ENTER);
//				      //releasing enter
//				 graph.keyRelease(KeyEvent.VK_ENTER);
//					
//				 Thread.sleep(5000);
//				 JavascriptExecutor js = (JavascriptExecutor) driver;
//				 Thread.sleep(5000);
//				 js.executeScript("window.scrollBy(0,800)", "");
//				 Thread.sleep(5000);
//				 APS.Enter_Information().sendKeys(TestCaseData.Enter_Information);     
//				 Thread.sleep(5000);
//				 APS.recommendation().sendKeys(TestCaseData.recommendation);     
//				 Thread.sleep(5000);
//				 APS.enter_link_title().sendKeys(TestCaseData.enter_link_title);     
//				 Thread.sleep(5000);
//				 APS.enter_link_url().sendKeys(TestCaseData.enter_link_url);
//				 Thread.sleep(5000);
//				 APS.Security_Pulse_assets().sendKeys(TestCaseData.Security_Pulse_assets);     
//				 Thread.sleep(5000);
//				 APS.Security_Pulse_entity().sendKeys(TestCaseData.Security_Pulse_entity);
//				 Thread.sleep(5000);
//			     Thread.sleep(5000);
//			     APS.Preview().click();
//			     Thread.sleep(8000);
//			     APS.Security_Pulse_publish().click();

		}

	}
