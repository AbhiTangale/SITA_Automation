package TestCase;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import PageObjectModel.DashBoard;
import PageObjectModel.LoginPageObject;
import Resources.BaseClass;
import Resources.TestCaseData;
import extentManager.ExtentManager;

public class VerifyDashboard extends BaseClass{

	@Test
	public void Dashboard() throws InterruptedException {
		

		LoginPageObject lpo = new LoginPageObject(driver);
		Thread.sleep(3000);
		lpo.EnterUsername().sendKeys(TestCaseData.username);
		Thread.sleep(3000);
		lpo.EnterPassword().sendKeys(TestCaseData.password);
		Thread.sleep(3000);
		lpo.ClickSubmit().click();
		Thread.sleep(30000);

		DashBoard dash = new DashBoard(driver);
//		WebElement logo = driver.findElement(By.xpath("//img[@class='acme macme']"));
//		if (logo.isDisplayed()) {
//			ExtentManager.test.createNode("Logo is present");
//		} else {
//
//			ExtentManager.test.createNode("Logo is not present");
//		}
//		Thread.sleep(5000);

		WebElement daterange = dash.Clickdaterange();

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
			ExtentManager.test.createNode("Dashboard Date Range is working");
		} else {
			Thread.sleep(1000);
			ExtentManager.test.createNode("Dashboard Date Range is not working");
		}

		Thread.sleep(5000);
		String verticalxpath1 = "//*[local-name()='svg']//*[name()='g' and @class='highcharts-series-group']//*[name()='rect']";
		List<WebElement> barlist1 = driver.findElements(By.xpath(verticalxpath1));

		Thread.sleep(5000);

		System.out.println("total bars :" + barlist1.size());

		Actions act1 = new Actions(driver);

		for (WebElement e : barlist1) {

			act1.moveToElement(e).perform();

			Thread.sleep(100);

		}

		Thread.sleep(500);
//		String a = driver.findElement(By.xpath("(//h4[@data-for='React-tooltip'])[1]")).getText();
//		ExtentManager.test.createNode("Funnel Data:- Collection :" + a);
//		Thread.sleep(500);
//		String b = driver.findElement(By.xpath("(//h4[@data-for='React-tooltip'])[2]")).getText();
//		ExtentManager.test.createNode("Funnel Data:- Detection :" + b);
//		Thread.sleep(500);
//		String c = driver.findElement(By.xpath("(//h4[@data-for='React-tooltip'])[3]")).getText();
//		ExtentManager.test.createNode("Funnel Data:- Triage :" + c);
//		Thread.sleep(500);
//		String d = driver.findElement(By.xpath("(//h4[@data-for='React-tooltip'])[4]")).getText();
//		ExtentManager.test.createNode("Funnel Data:- Remediated :" + d);

		// Dynamic functionality
		Thread.sleep(5000);
		Actions action = new Actions(driver);
		WebElement alertbyconfidence = driver.findElement(By.xpath("(//div[@id='ALERT BY CONFIDENCE'])[2]"));
		WebElement OEi = driver.findElement(By.xpath("(//div[@id='OPERATIONAL EFFICIENCY INDEX'])[2]"));
		Thread.sleep(2000);
		action.dragAndDrop(alertbyconfidence, OEi).build().perform();
		Thread.sleep(2000);
		WebElement entityriskmap = driver.findElement(By.xpath("(//div[@id='GEOGRAPHICAL LOCATIONS'])[2]"));
		WebElement OEi1 = driver.findElement(By.xpath("(//div[@id='OPERATIONAL EFFICIENCY INDEX'])[2]"));
		Thread.sleep(2000);
		action.dragAndDrop(entityriskmap, OEi1).build().perform();
		Thread.sleep(2000);
		ExtentManager.test.createNode("Dynamic functionality in Dashboard is working");
		

		Thread.sleep(5000);
		// show charts
		driver.findElement(By.xpath("//button[@id='dropdown-basic']")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//input[@id='custom-switch-0']")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//input[@id='custom-switch-1']")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//input[@id='custom-switch-2']")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//input[@id='custom-switch-3']")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//input[@id='custom-switch-4']")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//input[@id='custom-switch-5']")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//button[@id='dropdown-basic']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[@id='dropdown-basic']")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//input[@id='custom-switch-0']")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//input[@id='custom-switch-1']")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//input[@id='custom-switch-2']")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//input[@id='custom-switch-3']")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//input[@id='custom-switch-4']")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//input[@id='custom-switch-5']")).click();
		Thread.sleep(2000);
		ExtentManager.test.createNode("Show charts in Dashboard is working");
		
		
		WebElement reset = dash.resetbutton();
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
		Thread.sleep(2000);
		ExtentManager.test.createNode("Dashboard Test Case Pass");
	}
}
