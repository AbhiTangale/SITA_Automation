package TestCase;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import PageObjectModel.LoginPageObject;
import PageObjectModel.RoSIPageObject;
import Resources.BaseClass;
import Resources.TestCaseData;
import extentManager.ExtentManager;

public class VerifyRoSI extends BaseClass{

	
	@Test
	
	public void RoSI() throws InterruptedException {
		Thread.sleep(2000);
		LoginPageObject lpo = new LoginPageObject(driver);
		Thread.sleep(2000);
		lpo.EnterUsername().sendKeys(TestCaseData.username);
		Thread.sleep(2000);
		lpo.EnterPassword().sendKeys(TestCaseData.password);
		lpo.ClickSubmit().click();
		Thread.sleep(30000);
	
		RoSIPageObject rpo = new RoSIPageObject(driver);
		Thread.sleep(2000);
		rpo.rosi().click();
		Thread.sleep(10000); 
//      Download Charts		
        Thread.sleep(10000); 
        if (rpo.rosichartmenu().isDisplayed()) {
			Thread.sleep(3000);
			rpo.rosichartmenu().click();
			Thread.sleep(3000);
			rpo.pngimage().click();
			Thread.sleep(3000);
			rpo.rosichartmenu().click();
			Thread.sleep(3000);
			rpo.jpegimage().click();
			Thread.sleep(3000);
			rpo.rosichartmenu().click();
			Thread.sleep(3000);
			rpo.cvgimage().click();
			Thread.sleep(3000);
			rpo.rosichartmenu().click();
			Thread.sleep(3000);
			rpo.svgimage().click();
			Thread.sleep(3000);
			rpo.rosichartmenu().click();
			Thread.sleep(3000);
			rpo.xlsimage().click();
			Thread.sleep(3000);
			ExtentManager.test.createNode("RoSI chart Download is working");
		} else {

			ExtentManager.test.createNode("RoSI chart Download is not working");
		}
        Thread.sleep(2000); 
    	driver.navigate().refresh();
        Thread.sleep(12000); 

    	if (rpo.iocchartmenu().isDisplayed()) {
			Thread.sleep(3000);
			rpo.iocchartmenu().click();
			Thread.sleep(3000);
			rpo.pngimage().click();
			Thread.sleep(3000);
			rpo.iocchartmenu().click();
			Thread.sleep(3000);
			rpo.jpegimage().click();
			Thread.sleep(3000);
			rpo.iocchartmenu().click();
			Thread.sleep(3000);
			rpo.cvgimage().click();
			Thread.sleep(3000);
			rpo.iocchartmenu().click();
			Thread.sleep(3000);
			rpo.svgimage().click();
			Thread.sleep(3000);
			rpo.iocchartmenu().click();
			Thread.sleep(3000);
			rpo.xlsimage().click();
			Thread.sleep(3000);
			ExtentManager.test.createNode("Investment Optimization Chart Download is working");
		} else {

			ExtentManager.test.createNode("Investment Optimization Chart Download is not working");
		}
    	Thread.sleep(2000); 
    	driver.navigate().refresh();
        Thread.sleep(12000); 

    	if (rpo.sifchartmenu().isDisplayed()) {
			Thread.sleep(3000);
			rpo.sifchartmenu().click();
			Thread.sleep(3000);
			rpo.pngimage().click();
			Thread.sleep(3000);
			rpo.sifchartmenu().click();
			Thread.sleep(3000);
			rpo.jpegimage().click();
			Thread.sleep(3000);
			rpo.sifchartmenu().click();
			Thread.sleep(3000);
			rpo.cvgimage().click();
			Thread.sleep(3000);
			rpo.sifchartmenu().click();
			Thread.sleep(3000);
			rpo.svgimage().click();
			Thread.sleep(3000);
			rpo.sifchartmenu().click();
			Thread.sleep(3000);
			rpo.xlsimage().click();
			Thread.sleep(3000);
			ExtentManager.test.createNode("Security Investment / Function Chart Download is working");
		} else {

			ExtentManager.test.createNode("Security Investment / Function Chart Download is not working");
		}
    	Thread.sleep(2000); 
    	driver.navigate().refresh();
        Thread.sleep(12000); 

    	if (rpo.siachartmenu().isDisplayed()) {
			Thread.sleep(3000);
			rpo.siachartmenu().click();
			Thread.sleep(3000);
			rpo.pngimage().click();
			Thread.sleep(3000);
			rpo.siachartmenu().click();
			Thread.sleep(3000);
			rpo.jpegimage().click();
			Thread.sleep(3000);
			rpo.siachartmenu().click();
			Thread.sleep(3000);
			rpo.cvgimage().click();
			Thread.sleep(3000);
			rpo.siachartmenu().click();
			Thread.sleep(3000);
			rpo.svgimage().click();
			Thread.sleep(3000);
			rpo.siachartmenu().click();
			Thread.sleep(3000);
			rpo.xlsimage().click();
			Thread.sleep(3000);
			ExtentManager.test.createNode("Security Investment / Asset Category Chart Download is working");
		} else {

			ExtentManager.test.createNode("Security Investment / Asset Category Chart Download is not working");
		}
    	Thread.sleep(2000); 
    	driver.navigate().refresh();
        Thread.sleep(12000); 

    	if (rpo.tichartmenu().isDisplayed()) {
			Thread.sleep(3000);
			rpo.tichartmenu().click();
			Thread.sleep(3000);
			rpo.pngimage().click();
			Thread.sleep(3000);
			rpo.tichartmenu().click();
			Thread.sleep(3000);
			rpo.jpegimage().click();
			Thread.sleep(3000);
			rpo.tichartmenu().click();
			Thread.sleep(3000);
			rpo.cvgimage().click();
			Thread.sleep(3000);
			rpo.tichartmenu().click();
			Thread.sleep(3000);
			rpo.svgimage().click();
			Thread.sleep(3000);
			rpo.tichartmenu().click();
			Thread.sleep(3000);
			rpo.xlsimage().click();
			Thread.sleep(3000);
			ExtentManager.test.createNode("Total Investment / Control Cost Chart Download is working");
		} else {

			ExtentManager.test.createNode("Total Investment / Control Cost Chart Download is not working");
		}

	
//		WebElement svgChartElement = driver.findElement(By.xpath("(//*[local-name()='svg']//*[name()='g' and @class='highcharts-series-group']//*[name()='path'])[5]"));
//        Actions actions = new Actions(driver);
//		Thread.sleep(5000);
//		actions.moveToElement(svgChartElement).click().build().perform();
//		Thread.sleep(10000);
//		WebElement svgChartElement1 = driver.findElement(By.xpath("(//*[local-name()='svg']//*[name()='g' and @class='highcharts-series-group']//*[name()='path'])[2]"));
//		Thread.sleep(10000);
//		actions.moveToElement(svgChartElement1).click().build().perform(); 
//		
		

		Thread.sleep(5000);
		Actions rosi = new Actions(driver);
		double randomvalue_analysis3 = (Math.random() * (5 - 0 + 1) + 0);

		WebElement geo = driver.findElement(By.xpath("(//div[@class=' css-akdhb2-Input'])[1]"));
		Thread.sleep(2000);
		geo.click();
		for (int i = 0; i <= randomvalue_analysis3; i++) {

			rosi.pause(Duration.ofSeconds(1));

			rosi.sendKeys(Keys.ARROW_DOWN).moveToElement(geo).perform();
		}
		rosi.sendKeys(Keys.ENTER).build().perform();
			

		Thread.sleep(5000);
		WebElement function = driver.findElement(By.xpath("(//div[@class=' css-akdhb2-Input'])[2]"));
		Thread.sleep(2000);
		function.click();
		for (int i = 0; i <= randomvalue_analysis3; i++) {

			rosi.pause(Duration.ofSeconds(1));

			rosi.sendKeys(Keys.ARROW_DOWN).moveToElement(function).perform();
		}
		rosi.sendKeys(Keys.ENTER).build().perform();

		
		Thread.sleep(5000);
		WebElement process = driver.findElement(By.xpath("(//div[@class=' css-akdhb2-Input'])[3]"));
		Thread.sleep(2000);
		process.click();
		for (int i = 0; i <= randomvalue_analysis3; i++) {

			rosi.pause(Duration.ofSeconds(1));

			rosi.sendKeys(Keys.ARROW_DOWN).moveToElement(process).perform();
		}
		rosi.sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(500);
		ExtentManager.test.createNode("RoSI Test Passed Successfully!");
	
	
	}
	}	

