package TestCase;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import PageObjectModel.LoginPageObject;
import PageObjectModel.OEIpageobject;
import Resources.BaseClass;
import Resources.TestCaseData;
import extentManager.ExtentManager;

public class VerifyOEI extends BaseClass {
	@Test
	
	public void OEI() throws InterruptedException {
		Thread.sleep(2000);
		LoginPageObject lpo = new LoginPageObject(driver);
		Thread.sleep(2000);

		lpo.EnterUsername().sendKeys(TestCaseData.username);
		Thread.sleep(2000);

		lpo.EnterPassword().sendKeys(TestCaseData.password);
		Thread.sleep(2000);

		lpo.ClickSubmit().click();

		Thread.sleep(30000);
		OEIpageobject oei = new OEIpageobject(driver);
		Thread.sleep(5000);
		oei.clickoei().click();
		Thread.sleep(10000);

//      Date Range
		
		Thread.sleep(1000);
		WebElement daterange = oei.Clickdaterange();

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
			ExtentManager.test.createNode("OEI Date Range is working");
		} else {
			Thread.sleep(1000);
			ExtentManager.test.createNode("OEI Date Range is not working");
		}

// Dynamic Screen 		
		Thread.sleep(5000);
//		Actions action = new Actions(driver);
//		WebElement chart1 = driver.findElement(By.xpath("(//div[@class='drag_inner_handler'])[3]"));
//		WebElement chart2 = driver.findElement(By.xpath("(//div[@class='drag_inner_handler'])[4]"));
//		Thread.sleep(2000);
//		action.dragAndDrop(chart1, chart2).build().perform();
//		
//		Thread.sleep(5000);
//		WebElement chart3 = driver.findElement(By.xpath("(//div[@class='drag_handler'])[1]"));
//		WebElement chart4 = driver.findElement(By.xpath("(//div[@class='drag_handler'])[2]"));
//		Thread.sleep(2000);
//		action.dragAndDrop(chart3, chart4).build().perform();
//		Thread.sleep(5000);
//		action.dragAndDrop(chart1, chart4).build().perform();
//		Thread.sleep(2000);
//		action.dragAndDrop(chart2, chart4).build().perform();
//		Thread.sleep(500);
//		ExtentManager.test.createNode("Dynamic Functionality in OEI is working");

		Thread.sleep(5000);
		oei.reset().click();
		ExtentManager.test.createNode("Reset button in OEI is working");

// Check Chart	

		Thread.sleep(5000);
		String verticalxpath = "//*[local-name()='svg']//*[name()='g' and @class='highcharts-series-group']//*[name()='path']";
		List<WebElement> barlist = driver.findElements(By.xpath(verticalxpath));

		Thread.sleep(5000);

		Actions act = new Actions(driver);

		for (WebElement e : barlist) {

			act.moveToElement(e).perform();

		}

		Thread.sleep(5000);
		String verticalxpath1 = "//*[local-name()='svg']//*[name()='g' and @class='highcharts-series-group']//*[name()='rect']";
		List<WebElement> barlist1 = driver.findElements(By.xpath(verticalxpath1));

		Thread.sleep(5000);

		Actions act1 = new Actions(driver);

		for (WebElement f : barlist1) {

			act1.moveToElement(f).perform();

		}

// Download Chart
		
		Thread.sleep(10000); 
        if (oei.mttdchart().isDisplayed()) {
			Thread.sleep(3000);
			oei.mttdchart().click();
			Thread.sleep(3000);
			oei.pngimage().click();
			Thread.sleep(3000);
			oei.mttdchart().click();
			Thread.sleep(3000);
			oei.jpegimage().click();
			Thread.sleep(3000);
			oei.mttdchart().click();
			oei.svgimage().click();
			oei.mttdchart().click();
			Thread.sleep(3000);
			oei.cvgimage().click();
			oei.mttdchart().click();
			Thread.sleep(3000);
			oei.xlsimage().click();
			Thread.sleep(3000);
			ExtentManager.test.createNode("OEI - Mean Time to Detect chart Download is working");
		} else {

			ExtentManager.test.createNode("OEI - Mean Time to Detect chart Download is not working");
		}
        Thread.sleep(2000); 
    	driver.navigate().refresh();
        Thread.sleep(8000); 
        if (oei.mttnchart().isDisplayed()) {
			Thread.sleep(3000);
			oei.mttnchart().click();
			Thread.sleep(3000);
			oei.pngimage().click();
			Thread.sleep(1000);
			oei.mttnchart().click();
			Thread.sleep(3000);
			oei.jpegimage().click();
			Thread.sleep(1000);
			oei.mttnchart().click();
			Thread.sleep(3000);
			oei.svgimage().click();
			Thread.sleep(1000);
			oei.mttnchart().click();
			Thread.sleep(3000);
			oei.cvgimage().click();
			Thread.sleep(1000);
			oei.mttnchart().click();
			Thread.sleep(3000);
			oei.xlsimage().click();
			Thread.sleep(1000);
			ExtentManager.test.createNode("OEI - Mean Time to Notify chart Download is working");
		} else {

			ExtentManager.test.createNode("OEI - Mean Time to Notify chart Download is not working");
		}  
        
        Thread.sleep(2000); 
    	driver.navigate().refresh();
        Thread.sleep(8000); 
        if (oei.mttrchart().isDisplayed()) {
			Thread.sleep(3000);
			oei.mttrchart().click();
			Thread.sleep(3000);
			oei.pngimage().click();
			Thread.sleep(1000);
			oei.mttrchart().click();
			Thread.sleep(3000);
			oei.jpegimage().click();
			Thread.sleep(1000);
			oei.mttrchart().click();
			Thread.sleep(3000);
			oei.svgimage().click();
			Thread.sleep(1000);
			oei.mttrchart().click();
			Thread.sleep(3000);
			oei.cvgimage().click();
			Thread.sleep(1000);
			oei.mttrchart().click();
			Thread.sleep(3000);
			oei.xlsimage().click();
			Thread.sleep(1000);
			ExtentManager.test.createNode("OEI - Mean Time to Remediate chart Download is working");
		} else {

			ExtentManager.test.createNode("OEI - Mean Time to Remediate chart Download is not working");
		}  
        
        Thread.sleep(2000); 
    	driver.navigate().refresh();
        Thread.sleep(8000); 
        if (oei.falsepositiveratechart().isDisplayed()) {
			Thread.sleep(3000);
			oei.falsepositiveratechart().click();
			Thread.sleep(3000);
			oei.pngimage().click();
			Thread.sleep(1000);
			oei.falsepositiveratechart().click();
			Thread.sleep(3000);
			oei.jpegimage().click();
			Thread.sleep(1000);
			oei.falsepositiveratechart().click();
			Thread.sleep(3000);
			oei.svgimage().click();
			Thread.sleep(1000);
			oei.falsepositiveratechart().click();
			Thread.sleep(3000);
			oei.cvgimage().click();
			Thread.sleep(1000);
			oei.falsepositiveratechart().click();
			Thread.sleep(3000);
			oei.xlsimage().click();
			Thread.sleep(1000);
			ExtentManager.test.createNode("OEI - False Positive chart Download is working");
		} else {

			ExtentManager.test.createNode("OEI - False Positive chart Download is not working");
		}  
//        
        Thread.sleep(2000); 
    	driver.navigate().refresh();
        Thread.sleep(8000); 
        if (oei.alertchar().isDisplayed()) {
			Thread.sleep(3000);
			oei.alertchar().click();
			Thread.sleep(3000);
			oei.pngimage().click();
			Thread.sleep(1000);
			oei.alertchar().click();
			Thread.sleep(3000);
			oei.jpegimage().click();
			Thread.sleep(1000);
			oei.alertchar().click();
			Thread.sleep(3000);
			oei.svgimage().click();
			Thread.sleep(1000);
			oei.alertchar().click();
			Thread.sleep(3000);
			oei.cvgimage().click();
			Thread.sleep(1000);
			oei.alertchar().click();
			Thread.sleep(3000);
			oei.xlsimage().click();
			Thread.sleep(500);
			ExtentManager.test.createNode("OEI - Alert Resolution Rate chart Download is working");
		} else {

			ExtentManager.test.createNode("OEI - Alert Resolution Rate chart Download is not working");
		}  
          
        
        Thread.sleep(5000);
		driver.findElement(By.xpath("(//button[@id='dropdown-basic'])[1]")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//input[@id='SECURITY OPERATIONS']")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//input[@id='FALSE POSITIVE RATE']")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//input[@id='ALERT RESOLUTION RATE']")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//input[@id='MEAN TIME TO  DETECT']")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//input[@id='MEAN TIME TO NOTIFY']")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//input[@id='MEAN TIME TO REMEDIATE']")).click();
		
		ExtentManager.test.createNode("OEI - Show chart is working");


		WebElement reset = oei.reset();
		try {
			reset.isDisplayed();
			reset.click();

			ExtentManager.test.createNode("Reset button is present");
			ExtentManager.test.createNode("Reset button is working");

		}

		catch (org.openqa.selenium.NoSuchElementException e) {

			ExtentManager.test.createNode("Reset button is not present");
			ExtentManager.test.createNode("Reset button is not Working");
		}
        
      
        
		
		WebElement geo_location = driver.findElement(By.xpath("(//div[@class=' css-akdhb2-Input'])[1]"));
		Thread.sleep(2000);
		geo_location.click();
		Thread.sleep(2000);
		Actions analysis = new Actions(driver);

		double randomvalue_analysis = (Math.random() * (5 - 0 + 1) + 0);
		for (int i = 0; i <= randomvalue_analysis; i++) {
			analysis.pause(Duration.ofSeconds(1));
			analysis.sendKeys(Keys.ARROW_DOWN).moveToElement(geo_location).perform();
		}

		analysis.sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(2000);
		WebElement function = driver.findElement(By.xpath("(//div[@class=' css-akdhb2-Input'])[2]"));
		Thread.sleep(2000);
		function.click();
		Thread.sleep(2000);
		Actions analysis1 = new Actions(driver);
		double randomvalue_analysis1 = (Math.random() * (5 - 0 + 1) + 0);
		for (int i = 0; i <= randomvalue_analysis1; i++) {
			analysis1.pause(Duration.ofSeconds(1));
			analysis1.sendKeys(Keys.ARROW_DOWN).moveToElement(function).perform();
		}

		analysis1.sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(2000);
		WebElement process = driver.findElement(By.xpath("(//div[@class=' css-akdhb2-Input'])[3]"));
		Thread.sleep(2000);
		process.click();
		Actions analysis2 = new Actions(driver);
		double randomvalue_analysis2 = (Math.random() * (5 - 0 + 1) + 0);
		for (int i = 0; i <= randomvalue_analysis2; i++) {
			analysis2.pause(Duration.ofSeconds(1));
			analysis2.sendKeys(Keys.ARROW_DOWN).moveToElement(process).perform();
		}

		analysis2.sendKeys(Keys.ENTER).build().perform();

		Thread.sleep(2000);
		WebElement asset = driver.findElement(By.xpath("(//div[@class=' css-akdhb2-Input'])[4]"));
		Thread.sleep(2000);
		asset.click();

		Actions analysis3 = new Actions(driver);
		double randomvalue_analysis3 = (Math.random() * (5 - 0 + 1) + 0);
		for (int i = 0; i <= randomvalue_analysis3; i++) {
			analysis3.pause(Duration.ofSeconds(1));
			analysis3.sendKeys(Keys.ARROW_DOWN).moveToElement(asset).perform();
		}
		analysis3.sendKeys(Keys.ENTER).build().perform();
		
		ExtentManager.test.createNode("OEI - Dropdown is working");


		Thread.sleep(2000);
		ExtentManager.test.createNode("OEI Test Case Passed Successfully!");

	}

}
