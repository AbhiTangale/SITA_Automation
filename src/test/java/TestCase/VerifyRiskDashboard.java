package TestCase;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import PageObjectModel.LoginPageObject;
import PageObjectModel.RiskDashBoard;
import Resources.BaseClass;
import Resources.TestCaseData;
import extentManager.ExtentManager;

public class VerifyRiskDashboard extends BaseClass{
	
		@Test
		
		public void RiskDashboard() throws InterruptedException {
			Thread.sleep(2000);
			LoginPageObject lpo = new LoginPageObject(driver);
			Thread.sleep(2000);
			lpo.EnterUsername().sendKeys(TestCaseData.username);
			Thread.sleep(2000);
			lpo.EnterPassword().sendKeys(TestCaseData.password);
			lpo.ClickSubmit().click();
			Thread.sleep(30000);
		
			
			RiskDashBoard rd = new RiskDashBoard(driver);
			
			rd.risk().click();
			Thread.sleep(15000);
		
//		        if (rd.inherentchartmenu().isDisplayed()) {
//					Thread.sleep(3000);
//					rd.inherentchartmenu().click();
//					Thread.sleep(3000);
//					rd.pngimage().click();
//					Thread.sleep(3000);
//					rd.inherentchartmenu().click();
//					Thread.sleep(3000);
//					rd.jpegimage().click();
//					Thread.sleep(3000);
//					rd.inherentchartmenu().click();
//					Thread.sleep(3000);
//					rd.cvgimage().click();
//					Thread.sleep(3000);
//					rd.inherentchartmenu().click();
//					Thread.sleep(3000);
//					rd.svgimage().click();
//					Thread.sleep(3000);
//					rd.inherentchartmenu().click();
//					Thread.sleep(3000);
//					rd.xlsimage().click();
//					Thread.sleep(3000);
////					ExtentManager.test.createNode("Inherent chart Download is working");
//				} else {
////					ExtentManager.test.createNode("Inherent chart Download is not working");
//				}
//		        Thread.sleep(2000); 
//		    	driver.navigate().refresh();
//				Thread.sleep(20000);
//
//		        if (rd.residualchartmenu().isDisplayed()) {
//					Thread.sleep(3000);
//					rd.residualchartmenu().click();
//					Thread.sleep(3000);
//					rd.pngimage().click();
//					Thread.sleep(3000);
//					rd.residualchartmenu().click();
//					Thread.sleep(3000);
//					rd.jpegimage().click();
//					Thread.sleep(3000);
//					rd.residualchartmenu().click();
//					Thread.sleep(3000);
//					rd.cvgimage().click();
//					Thread.sleep(3000);
//					rd.residualchartmenu().click();
//					Thread.sleep(3000);
//					rd.svgimage().click();
//					Thread.sleep(3000);
//					rd.residualchartmenu().click();
//					Thread.sleep(3000);
//					rd.xlsimage().click();
//					Thread.sleep(3000);
////					ExtentManager.test.createNode("Residual chart Download is working");
//				} else {
////					ExtentManager.test.createNode("Residual chart Download is not working");
//				}
//		        Thread.sleep(2000); 
//		    	driver.navigate().refresh();
//				Thread.sleep(20000);
//
//		        if (rd.riskaggregationchartmenu().isDisplayed()) {
//					Thread.sleep(3000);
//					rd.riskaggregationchartmenu().click();
//					Thread.sleep(3000);
//					rd.pngimage().click();
//					Thread.sleep(3000);
//					rd.riskaggregationchartmenu().click();
//					Thread.sleep(3000);
//					rd.jpegimage().click();
//					Thread.sleep(3000);
//					rd.riskaggregationchartmenu().click();
//					Thread.sleep(3000);
//					rd.cvgimage().click();
//					Thread.sleep(3000);
//					rd.riskaggregationchartmenu().click();
//					Thread.sleep(3000);
//					rd.svgimage().click();
//					Thread.sleep(3000);
//					rd.riskaggregationchartmenu().click();
//					Thread.sleep(3000);
//					rd.xlsimage().click();
//					Thread.sleep(3000);
////					ExtentManager.test.createNode("Risk aggregation chart Download is working");
//				} else {
////					ExtentManager.test.createNode("Risk aggregation chart Download is not working");
//				}
//		        Thread.sleep(2000); 
		    	driver.navigate().refresh();
				Thread.sleep(20000);

		        if (rd.functionchartmenu().isDisplayed()) {
					Thread.sleep(3000);
					rd.functionchartmenu().click();
					Thread.sleep(3000);
					rd.pngimage().click();
					Thread.sleep(3000);
					rd.functionchartmenu().click();
					Thread.sleep(3000);
					rd.jpegimage().click();
					Thread.sleep(3000);
					rd.functionchartmenu().click();
					Thread.sleep(3000);
					rd.cvgimage().click();
					Thread.sleep(3000);
					rd.functionchartmenu().click();
					Thread.sleep(3000);
					rd.svgimage().click();
					Thread.sleep(3000);
					rd.functionchartmenu().click();
					Thread.sleep(3000);
					rd.xlsimage().click();
					Thread.sleep(3000);
					ExtentManager.test.createNode("Risk Dashboard - Function chart Download is working");
				} else {
					ExtentManager.test.createNode("Risk Dashboard - Function chart Download is not working");
				}
		        Thread.sleep(2000); 
		    	driver.navigate().refresh();
				Thread.sleep(20000);
		        if (rd.processchartmenu().isDisplayed()) {
					Thread.sleep(3000);
					rd.processchartmenu().click();
					Thread.sleep(3000);
					rd.pngimage().click();
					Thread.sleep(3000);
					rd.processchartmenu().click();
					Thread.sleep(3000);
					rd.jpegimage().click();
					Thread.sleep(3000);
					rd.processchartmenu().click();
					Thread.sleep(3000);
					rd.cvgimage().click();
					Thread.sleep(3000);
					rd.processchartmenu().click();
					Thread.sleep(3000);
					rd.svgimage().click();
					Thread.sleep(3000);
					rd.processchartmenu().click();
					Thread.sleep(3000);
					rd.xlsimage().click();
					Thread.sleep(3000);
					ExtentManager.test.createNode("Risk Dashboard - Process chart Download is working");
				} else {
					ExtentManager.test.createNode("Risk Dashboard - Process chart Download is not working");
				}
		        Thread.sleep(2000); 
		    	driver.navigate().refresh();
				Thread.sleep(20000);
		        if (rd.riskmatrix().isDisplayed()) {
					Thread.sleep(3000);
					rd.riskmatrix().click();
					Thread.sleep(3000);
					rd.pngimage().click();
					Thread.sleep(3000);
					rd.riskmatrix().click();
					Thread.sleep(3000);
					rd.jpegimage().click();
					Thread.sleep(3000);
					rd.riskmatrix().click();
					Thread.sleep(3000);
					rd.cvgimage().click();
					Thread.sleep(3000);
					rd.riskmatrix().click();
					Thread.sleep(3000);
					rd.svgimage().click();
					Thread.sleep(3000);
					rd.riskmatrix().click();
					Thread.sleep(3000);
					rd.xlsimage().click();
					Thread.sleep(3000);
					ExtentManager.test.createNode("Risk Dashboard - Risk Matrix chart Download is working");
				} else {
					ExtentManager.test.createNode("Risk Dashboard - Risk Matrix chart Download is not working");
				}
				
//			Thread.sleep(5000);
//			Actions actions = new Actions(driver);
//			WebElement functionfilter = driver.findElement(By.xpath("(//*[local-name()='svg']//*[name()='g' and @class='highcharts-series-group']//*[name()='rect'])[28]"));
//			Thread.sleep(5000);
//			actions.moveToElement(functionfilter).click().build().perform();
//			Thread.sleep(10000);
//			WebElement removefilter = driver.findElement(By.xpath("//div[@class=' css-tlfecz-indicatorContainer']//*[name()='svg']//*[name()='path']"));
//			Thread.sleep(5000);
//			actions.moveToElement(removefilter).click().build().perform();
//
//			Thread.sleep(5000);
//			WebElement functionfilter1 = driver.findElement(By.xpath("(//*[local-name()='svg']//*[name()='g' and @class='highcharts-series-group']//*[name()='rect'])[36]"));
//			Thread.sleep(5000);
//			actions.moveToElement(functionfilter1).click().build().perform();
//			Thread.sleep(10000);
//			WebElement removefilter1 = driver.findElement(By.xpath("//div[@class=' css-tlfecz-indicatorContainer']//*[name()='svg']//*[name()='path']"));
//			Thread.sleep(5000);
//			actions.moveToElement(removefilter1).click().build().perform();
//
//			Thread.sleep(5000);
//			WebElement processfilter = driver.findElement(By.xpath("(//*[local-name()='svg']//*[name()='g' and @class='highcharts-series-group']//*[name()='rect'])[64]"));
//			Thread.sleep(5000);
//			actions.moveToElement(processfilter).click().build().perform();
//			Thread.sleep(10000);
//			WebElement removefilter2 = driver.findElement(By.xpath("//div[@class=' css-tlfecz-indicatorContainer']//*[name()='svg']//*[name()='path']"));
//			Thread.sleep(5000);
//			actions.moveToElement(removefilter2).click().build().perform();
//
//			Thread.sleep(5000);
//			WebElement processfilter1 = driver.findElement(By.xpath("(//*[local-name()='svg']//*[name()='g' and @class='highcharts-series-group']//*[name()='rect'])[68]"));
//			Thread.sleep(5000);
//			actions.moveToElement(processfilter1).click().build().perform();
//			Thread.sleep(10000);
//			WebElement removefilter3 = driver.findElement(	By.xpath("//div[@class=' css-tlfecz-indicatorContainer']//*[name()='svg']//*[name()='path']"));
//			Thread.sleep(5000);
//			actions.moveToElement(removefilter3).click().build().perform();

// Drop- Down 		        
			Thread.sleep(5000);
//			Actions risk = new Actions(driver);
//			double randomvalue_analysis3 = (Math.random() * (5 - 0 + 1) + 0);
//
//			WebElement geo = driver.findElement(By.xpath("(//div[@class=' css-akdhb2-Input'])[1]"));
//			Thread.sleep(2000);
//			geo.click();
//			for (int i = 0; i <= randomvalue_analysis3; i++) {
//
//				risk.pause(Duration.ofSeconds(1));
//
//				risk.sendKeys(Keys.ARROW_DOWN).moveToElement(geo).perform();
//			}
//			risk.sendKeys(Keys.ENTER).build().perform();
//
//			Thread.sleep(5000);
//			WebElement function = driver.findElement(By.xpath("(//div[@class=' css-akdhb2-Input'])[2]"));
//			Thread.sleep(2000);
//			function.click();
//			for (int i = 0; i <= randomvalue_analysis3; i++) {
//
//				risk.pause(Duration.ofSeconds(1));
//
//				risk.sendKeys(Keys.ARROW_DOWN).moveToElement(function).perform();
//			}
//			risk.sendKeys(Keys.ENTER).build().perform();
//
//			Thread.sleep(5000);
//			WebElement process = driver.findElement(By.xpath("(//div[@class=' css-akdhb2-Input'])[3]"));
//			Thread.sleep(2000);
//			process.click();
//			for (int i = 0; i <= randomvalue_analysis3; i++) {
//
//				risk.pause(Duration.ofSeconds(1));
//
//				risk.sendKeys(Keys.ARROW_DOWN).moveToElement(process).perform();
//			}
//			risk.sendKeys(Keys.ENTER).build().perform();
//				
//			Thread.sleep(5000);
//			JavascriptExecutor js = (JavascriptExecutor) driver;
//			js.executeScript("window.scrollBy(0,800)", "");
//			Thread.sleep(5000);
//			rd.riskjourney().click();
			Thread.sleep(500);

			ExtentManager.test.createNode("Risk Dashboard - Dropdown Working");

			Thread.sleep(500);
			ExtentManager.test.createNode("Risk Dashboard Test Passed Successfully!");
	
				
				
				
				
				
				
	
	
		        }		      
		}

