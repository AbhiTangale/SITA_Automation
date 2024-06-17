package TestCase;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.aventstack.extentreports.markuputils.ExtentColor;

import PageObjectModel.Insights;
import PageObjectModel.LoginPageObject;
import Resources.BaseClass;
import Resources.TestCaseData;
import extentManager.ExtentManager;

public class VerifyInsights extends BaseClass{
	
	@Test
    public void Insights() throws InterruptedException {
    	
		Thread.sleep(4000);
		LoginPageObject lpo = new LoginPageObject(driver);
		Thread.sleep(4000);
		lpo.EnterUsername().sendKeys(TestCaseData.username);
		Thread.sleep(4000);
		lpo.EnterPassword().sendKeys(TestCaseData.password);
		Thread.sleep(4000);
		lpo.ClickSubmit().click();
		Thread.sleep(30000);

		Insights ins = new Insights(driver);
		Thread.sleep(2000);
		ins.clickoninsights().click();
		Thread.sleep(2000);

		Thread.sleep(5000);

		WebElement daterange = ins.Clickdaterange();

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
			ExtentManager.test.createNode("Insights Date Range is working");
		} else {
			Thread.sleep(1000);
			ExtentManager.test.createNode("Insights Date Range is not working");
		}

		Thread.sleep(3000);

		if (ins.chartmenu().isDisplayed()) {
			Thread.sleep(3000);
			ins.chartmenu().click();
			Thread.sleep(3000);
			ins.pngimage().click();
			Thread.sleep(3000);
			ins.chartmenu().click();
			Thread.sleep(3000);
			ins.jpegimage().click();
			Thread.sleep(3000);
			ins.chartmenu().click();
			Thread.sleep(3000);
			ins.cvgimage().click();
			Thread.sleep(3000);
			ins.chartmenu().click();
			Thread.sleep(3000);
			ins.svgimage().click();
			Thread.sleep(3000);
			ins.chartmenu().click();
			Thread.sleep(3000);
			ins.xlsimage().click();
			Thread.sleep(3000);
			ExtentManager.test.createNode("Insights chart manu is working");
		} else {

			ExtentManager.test.createNode("Insights chart manu is not working");
		}

		Actions actions = new Actions(driver);
		Thread.sleep(3000);
		// alertsbyconfidence
		if (ins.alertsbyconfidence_chart1().isDisplayed()) {

			Thread.sleep(2000);
			WebElement alertsbyconfidencechart1 = ins.alertsbyconfidence_chart1();
			actions.moveToElement(alertsbyconfidencechart1).click().build().perform();

			ExtentManager.test.createNode("Insights : Alert by confidence is present");
		} else {

			ExtentManager.test.createNode("Insights : Alert by confidence is not present");
		}

//alert_type
		Thread.sleep(3000);
		try {
			ins.alert_type1().isDisplayed();
			WebElement alerttype1 = ins.alert_type1();
			actions.moveToElement(alerttype1).click().build().perform();
			ins.reset_filters().click();
			ExtentManager.test.createNode("Alert Type is present");
		}

		catch (org.openqa.selenium.NoSuchElementException e) {
			ExtentManager.test.createNode("Alert Type  is not present");
		}

		Thread.sleep(3000);
		try {
			ins.alert_type2().isDisplayed();
			WebElement alerttype2 = ins.alert_type2();
			actions.moveToElement(alerttype2).click().build().perform();
			Thread.sleep(2000);
			ins.reset_filters().click();
			ExtentManager.test.createNode("Alert Type is present");
		}

		catch (org.openqa.selenium.NoSuchElementException e) {
			ExtentManager.test.createNode("Alert Type is present is not present");
		}

		try {
			ins.alert_type3().isDisplayed();
			WebElement alerttype3 = ins.alert_type3();
			actions.moveToElement(alerttype3).click().build().perform();
			Thread.sleep(2000);
			ins.reset_filters().click();
			ExtentManager.test.createNode("Alert Type is present");
		}

		catch (org.openqa.selenium.NoSuchElementException e) {
			ExtentManager.test.createNode("Alert Type is present is not present");
		}

		Thread.sleep(3000);
		try {
			ins.alert_type4().isDisplayed();
			WebElement alerttype4 = ins.alert_type4();
			actions.moveToElement(alerttype4).click().build().perform();
			Thread.sleep(2000);
			ins.reset_filters().click();
			ExtentManager.test.createNode("Alert Type is present");
		}

		catch (org.openqa.selenium.NoSuchElementException e) {
			ExtentManager.test.createNode("Alert Type is present is not present");
		}
		Thread.sleep(3000);
		try {
			ins.alert_type5().isDisplayed();
			WebElement alerttype5 = ins.alert_type5();
			actions.moveToElement(alerttype5).click().build().perform();
			Thread.sleep(2000);
			ins.reset_filters().click();
			ExtentManager.test.createNode("Alert Type is present");
		}

		catch (org.openqa.selenium.NoSuchElementException e) {
			ExtentManager.test.createNode("Alert Type is present is not present");
		}
		Thread.sleep(3000);
		try {
			ins.alert_type6().isDisplayed();
			WebElement alerttype6 = ins.alert_type6();
			actions.moveToElement(alerttype6).click().build().perform();
			Thread.sleep(2000);
			ins.reset_filters().click();
			ExtentManager.test.createNode("Alert Type is present");
		}

		catch (org.openqa.selenium.NoSuchElementException e) {
			ExtentManager.test.createNode("Alert Type is present is not present");
		}
		Thread.sleep(3000);
		try {
			ins.alert_type7().isDisplayed();
			Thread.sleep(10000);
			WebElement alerttype7 = ins.alert_type7();
			actions.moveToElement(alerttype7).click().build().perform();
			Thread.sleep(2000);
			ins.reset_filters().click();
			ExtentManager.test.createNode("Alert Type is present");
		}

		catch (org.openqa.selenium.NoSuchElementException e) {
			ExtentManager.test.createNode("Alert Type is present is not present");
		}

		// request_type
		try {
			ins.request_type1().isDisplayed();
			Thread.sleep(2000);
			WebElement requesttype1 = ins.request_type1();
			actions.moveToElement(requesttype1).click().build().perform();
			Thread.sleep(2000);
			ins.reset_filters().click();
			ExtentManager.test.createNode("Insights : Request Type is present");
		}

		catch (org.openqa.selenium.NoSuchElementException e) {
			ExtentManager.test.createNode("Insights : Request Type is not present");
		}

		try {
			ins.request_type2().isDisplayed();
			Thread.sleep(2000);
			WebElement requesttype2 = ins.request_type2();
			actions.moveToElement(requesttype2).click().build().perform();
			Thread.sleep(500);
			ins.reset_filters().click();
			ExtentManager.test.createNode("Insights : Request Type is present");
		}

		catch (org.openqa.selenium.NoSuchElementException e) {
			ExtentManager.test.createNode("Insights : Request Type is not present");
		}
		try {
			ins.request_type3().isDisplayed();
			Thread.sleep(2000);
			WebElement requesttype3 = ins.request_type3();
			actions.moveToElement(requesttype3).click().build().perform();
			Thread.sleep(500);
			ins.reset_filters().click();
			ExtentManager.test.createNode("Insights : Request Type is present");
		}

		catch (org.openqa.selenium.NoSuchElementException e) {
			ExtentManager.test.createNode("Insights : Request Type is not present");
		}

		try {
			ins.request_status1().isDisplayed();
			WebElement requeststatus1 = ins.request_status1();
			actions.moveToElement(requeststatus1).click().build().perform();
			ins.reset_filters().click();
			ExtentManager.test.createNode("Insights : Request Status is present");
		}

		catch (org.openqa.selenium.NoSuchElementException e) {
			ExtentManager.test.createNode("Insights : Request Status is not present");
		}
		try {
			ins.request_status2().isDisplayed();
			Thread.sleep(2000);
			WebElement requeststatus2 = ins.request_status2();
			actions.moveToElement(requeststatus2).click().build().perform();
			Thread.sleep(500);
			ins.reset_filters().click();
			ExtentManager.test.createNode("Insights : Request Status is present");
		}

		catch (org.openqa.selenium.NoSuchElementException e) {
			ExtentManager.test.createNode("Insights : Request Status is not present");
		}
		try {
			ins.request_status3().isDisplayed();
			Thread.sleep(2000);
			WebElement requeststatus3 = ins.request_status3();
			actions.moveToElement(requeststatus3).click().build().perform();
			Thread.sleep(500);
			ins.reset_filters().click();
			ExtentManager.test.createNode("Insights : Request Status is present");
		}

		catch (org.openqa.selenium.NoSuchElementException e) {
			ExtentManager.test.createNode("Insights : Request Status is not present");
		}

		// top10assets
		try {
			ins.top10assets_a_c_1().isDisplayed();
			Thread.sleep(1000);
			WebElement top10assets_a_c_1 = ins.top10assets_a_c_1();
			actions.moveToElement(top10assets_a_c_1).click().build().perform();
			Thread.sleep(100);
			ins.reset_filters().click();
			ExtentManager.test.createNode("Insights : TOP 10 ASSETS BY ALERT COUNT is present");
		}

		catch (org.openqa.selenium.NoSuchElementException e) {
			ExtentManager.test.createNode("Insights : TOP 10 ASSETS BY ALERT COUNT is not present");
		}
		try {
			ins.top10assets_a_c_2().isDisplayed();
			Thread.sleep(1000);
			WebElement top10assets_a_c_2 = ins.top10assets_a_c_2();
			actions.moveToElement(top10assets_a_c_2).click().build().perform();
			Thread.sleep(100);
			ins.reset_filters().click();
			ExtentManager.test.createNode("Insights : TOP 10 ASSETS BY ALERT COUNT is present");
		}

		catch (org.openqa.selenium.NoSuchElementException e) {
			ExtentManager.test.createNode("Insights : TOP 10 ASSETS BY ALERT COUNT is not present");
		}
		try {
			ins.top10assets_a_c_3().isDisplayed();
			Thread.sleep(1000);
			WebElement top10assets_a_c_3 = ins.top10assets_a_c_3();
			actions.moveToElement(top10assets_a_c_3).click().build().perform();
			Thread.sleep(100);
			ins.reset_filters().click();
			ExtentManager.test.createNode("Insights : TOP 10 ASSETS BY ALERT COUNT is present");
		}

		catch (org.openqa.selenium.NoSuchElementException e) {
			ExtentManager.test.createNode("Insights : TOP 10 ASSETS BY ALERT COUNT is not present");
		}
		try {
			ins.top10assets_a_c_4().isDisplayed();
			Thread.sleep(1000);
			WebElement top10assets_a_c_4 = ins.top10assets_a_c_4();
			actions.moveToElement(top10assets_a_c_4).click().build().perform();
			Thread.sleep(100);
			ins.reset_filters().click();
			ExtentManager.test.createNode("Insights : TOP 10 ASSETS BY ALERT COUNT is present");
		}

		catch (org.openqa.selenium.NoSuchElementException e) {
			ExtentManager.test.createNode("Insights : TOP 10 ASSETS BY ALERT COUNT is not present");
		}
		try {
			ins.top10assets_a_c_5().isDisplayed();
			Thread.sleep(1000);
			WebElement top10assets_a_c_5 = ins.top10assets_a_c_5();
			actions.moveToElement(top10assets_a_c_5).click().build().perform();
			Thread.sleep(100);
			ins.reset_filters().click();
			ExtentManager.test.createNode("Insights : TOP 10 ASSETS BY ALERT COUNT is present");
		}

		catch (org.openqa.selenium.NoSuchElementException e) {
			ExtentManager.test.createNode("Insights : TOP 10 ASSETS BY ALERT COUNT is not present");
		}
		try {
			ins.top10assets_a_c_6().isDisplayed();
			Thread.sleep(1000);
			WebElement top10assets_a_c_6 = ins.top10assets_a_c_6();
			actions.moveToElement(top10assets_a_c_6).click().build().perform();
			Thread.sleep(500);
			ins.reset_filters().click();
			ExtentManager.test.createNode("Insights : TOP 10 ASSETS BY ALERT COUNT is present");
		}

		catch (org.openqa.selenium.NoSuchElementException e) {
			ExtentManager.test.createNode("Insights : TOP 10 ASSETS BY ALERT COUNT is not present");
		}
		try {
			ins.top10assets_a_c_7().isDisplayed();
			Thread.sleep(1000);
			WebElement top10assets_a_c_7 = ins.top10assets_a_c_7();
			actions.moveToElement(top10assets_a_c_7).click().build().perform();
			Thread.sleep(500);
			ins.reset_filters().click();
			ExtentManager.test.createNode("Insights : TOP 10 ASSETS BY ALERT COUNT is present");
		}

		catch (org.openqa.selenium.NoSuchElementException e) {
			ExtentManager.test.createNode("Insights : TOP 10 ASSETS BY ALERT COUNT is not present");
		}
		try {
			ins.top10assets_a_c_8().isDisplayed();
			Thread.sleep(1000);
			WebElement top10assets_a_c_8 = ins.top10assets_a_c_8();
			actions.moveToElement(top10assets_a_c_8).click().build().perform();
			Thread.sleep(500);
			ins.reset_filters().click();
			ExtentManager.test.createNode("Insights : TOP 10 ASSETS BY ALERT COUNT is present");
		}

		catch (org.openqa.selenium.NoSuchElementException e) {
			ExtentManager.test.createNode("Insights : TOP 10 ASSETS BY ALERT COUNT is not present");
		}
		try {
			ins.top10assets_a_c_9().isDisplayed();
			Thread.sleep(1000);
			WebElement top10assets_a_c_9 = ins.top10assets_a_c_9();
			actions.moveToElement(top10assets_a_c_9).click().build().perform();
			Thread.sleep(500);
			ins.reset_filters().click();
			ExtentManager.test.createNode("Insights : TOP 10 ASSETS BY ALERT COUNT is present");
		}

		catch (org.openqa.selenium.NoSuchElementException e) {
			ExtentManager.test.createNode("Insights : TOP 10 ASSETS BY ALERT COUNT is not present");
		}

		try {
			ins.top10assets_a_c_10().isDisplayed();
			Thread.sleep(1000);
			WebElement top10assets_a_c_10 = ins.top10assets_a_c_10();
			actions.moveToElement(top10assets_a_c_10).click().build().perform();
			Thread.sleep(500);
			ins.reset_filters().click();
			ExtentManager.test.createNode("Insights : TOP 10 ASSETS BY ALERT COUNT is present");
		}

		catch (org.openqa.selenium.NoSuchElementException e) {
			ExtentManager.test.createNode("Insights : TOP 10 ASSETS BY ALERT COUNT is not present");
		}

		Thread.sleep(5000);

		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("window.scrollBy(0,800)", "");

		Thread.sleep(10000);

		ins.details().click();
		Thread.sleep(5000);
	//	ins.Searchupdate().sendKeys(TestCaseData.ins_search);
		Thread.sleep(5000);
	//	ins.typehere().sendKeys(TestCaseData.ins_type_here);
		Thread.sleep(5000);
		ins.update_ins().click();
		Thread.sleep(3000);
		ins.back_ins().click();
		Thread.sleep(300);
		ExtentManager.test.createNode("Insights Detail Page is working");

	
		Thread.sleep(5000);
//		js.executeScript("window.scrollBy(0,800)", "");

		Thread.sleep(5000);
		ins.share_ins().click();
		Thread.sleep(500);
		ExtentManager.test.createNode("Insights Share option is working");

		
		Thread.sleep(2000);
		ins.assign_ins().click();
		Thread.sleep(2000);
	//	ins.assign_to_ins().sendKeys(TestCaseData.assign_to);
		ExtentManager.test.createNode("Insights Assign option is working");
		Thread.sleep(8000);
		ins.submit_ins().click();
		
		
		Thread.sleep(5000);
		ins.comment_ins().click();
		Thread.sleep(2000);
	//	ins.add_comment().sendKeys(TestCaseData.add_comment);
		ExtentManager.test.createNode("Insights Add Comment option is working");

		
		Thread.sleep(2000);
		ins.submit_ins().click();
		Thread.sleep(500);
		ExtentManager.test.createNode("Insights Grid page is working");

		Thread.sleep(500);
//		js.executeScript("window.scrollBy(0,-800)", "");
		Thread.sleep(5000);
		
		// dynamic functionality 
//		Actions action = new Actions(driver);
//		driver.findElement(By.xpath("//a[normalize-space()='Insights']")).click();
//		Thread.sleep(5000);
//		WebElement chart1 = driver.findElement(By.xpath("(//div[@class='drag_handler'])[1]"));
//		WebElement chart2 = driver.findElement(By.xpath("(//div[@class='drag_handler'])[2]"));
//		Thread.sleep(2000);
//		action.dragAndDrop(chart1, chart2).build().perform();
//		
//		WebElement chart3 = driver.findElement(By.xpath("(//div[@class='drag_handler'])[3]"));
//		Thread.sleep(2000);
//		action.dragAndDrop(chart1, chart3).build().perform();
//		
//		Thread.sleep(2000);
//		ExtentManager.test.createNode("Dynamic functionality in Insights is working");
		
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//button[@id='dropdown-basic'])[1]")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//input[@id='ALERT BY CONFIDENCE']")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//input[@id='ALERT TYPE']")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//input[@id='TOP 10 ASSETS BY ALERT COUNT']")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//input[@id='REQUEST TYPE']")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//input[@id='REQUEST STATUS']")).click();
		
		Thread.sleep(2000);
		ExtentManager.test.createNode("Show charts in Insights is working");
		
		//reset button 
		WebElement reset = ins.resetbutton();
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
		
		WebElement a = driver.findElement(By.xpath("(//div[@class=' css-akdhb2-Input'])[1]"));
		Thread.sleep(2000);

		a.click();

		Actions analysis = new Actions(driver);

		double randomvalue_analysis = (Math.random() * (5 - 0 + 1) + 0);

		for (int i = 0; i <= randomvalue_analysis; i++) {

			analysis.pause(Duration.ofSeconds(1));

			analysis.sendKeys(Keys.ARROW_DOWN).moveToElement(a).perform();
		}

		analysis.sendKeys(Keys.ENTER).build().perform();

		Thread.sleep(2000);
		WebElement b = driver.findElement(By.xpath("(//div[@class=' css-akdhb2-Input'])[2]"));
		Thread.sleep(2000);

		b.click();

		Actions analysis1 = new Actions(driver);

		double randomvalue_analysis1 = (Math.random() * (5 - 0 + 1) + 0);

		for (int i = 0; i <= randomvalue_analysis1; i++) {

			analysis1.pause(Duration.ofSeconds(1));

			analysis1.sendKeys(Keys.ARROW_DOWN).moveToElement(b).perform();
		}

		analysis1.sendKeys(Keys.ENTER).build().perform();

		Thread.sleep(2000);
		WebElement c = driver.findElement(By.xpath("(//div[@class=' css-akdhb2-Input'])[3]"));
		Thread.sleep(2000);

		c.click();

		Actions analysis2 = new Actions(driver);

		double randomvalue_analysis2 = (Math.random() * (5 - 0 + 1) + 0);

		for (int i = 0; i <= randomvalue_analysis2; i++) {

			analysis2.pause(Duration.ofSeconds(1));

			analysis2.sendKeys(Keys.ARROW_DOWN).moveToElement(c).perform();
		}

		analysis2.sendKeys(Keys.ENTER).build().perform();

		Thread.sleep(2000);
		WebElement d = driver.findElement(By.xpath("(//div[@class=' css-akdhb2-Input'])[4]"));
		Thread.sleep(2000);

		d.click();

		Actions analysis3 = new Actions(driver);

		double randomvalue_analysis3 = (Math.random() * (5 - 0 + 1) + 0);

		for (int i = 0; i <= randomvalue_analysis3; i++) {

			analysis3.pause(Duration.ofSeconds(1));

			analysis3.sendKeys(Keys.ARROW_DOWN).moveToElement(d).perform();
		}

		analysis3.sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(200);
		ExtentManager.test.createNode("Insights Drop-Down is working");


		

		Thread.sleep(2000);
		ExtentManager.test.createNode("Insights Test Case Passed Successfully!");

	}           
	}

