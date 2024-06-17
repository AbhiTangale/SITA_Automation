package TestCase;

import java.time.Duration;
import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import PageObjectModel.EntityOnboarding;
import PageObjectModel.LoginPageObject;
import Resources.BaseClass;
import Resources.TestCaseData;
import extentManager.ExtentManager;

public class VerifyEntityOnboarding extends BaseClass{

	
	@Test
	
	public void EntityOnboarding() throws InterruptedException {

		LoginPageObject lpo = new LoginPageObject(driver);
		Thread.sleep(3000);
		lpo.EnterUsername().sendKeys(TestCaseData.username);
		Thread.sleep(3000);
		lpo.EnterPassword().sendKeys(TestCaseData.password);
		Thread.sleep(3000);
		lpo.ClickSubmit().click();

		Thread.sleep(30000);

		EntityOnboarding eo = new EntityOnboarding(driver);

		Thread.sleep(5000);
		eo.Admin().click();
		Thread.sleep(15000);
		eo.entity_onboarding().click();
		Thread.sleep(30000);
		WebElement country = eo.country();
		Thread.sleep(5000);
		country.click();
		Actions a = new Actions(driver);
		double randomvalue_country = (Math.random() * (20 - 0 + 1) + 0);
		for (int i = 0; i <= randomvalue_country; i++) {

			a.pause(Duration.ofSeconds(1));

			a.sendKeys(Keys.ARROW_DOWN).moveToElement(country).perform();
		}
		a.sendKeys(Keys.ENTER).build().perform();

		Thread.sleep(5000);
		WebElement state = eo.state();
		state.click();
		Actions a1 = new Actions(driver);
		double randomvalue_state = (Math.random() * (5 - 0 + 1) + 0);
		for (int i = 0; i <= randomvalue_state; i++) {
			a1.pause(Duration.ofSeconds(1));

			a1.sendKeys(Keys.ARROW_DOWN).moveToElement(state).perform();
		}
		a1.sendKeys(Keys.ENTER).build().perform();

		Thread.sleep(5000);
		WebElement city = eo.city();
		city.click();
		Actions a2 = new Actions(driver);
		double randomvalue_city = (Math.random() * (5 - 0 + 1) + 0);
		for (int i = 0; i <= randomvalue_city; i++) {
			a2.pause(Duration.ofSeconds(1));
			a2.sendKeys(Keys.ARROW_DOWN).moveToElement(city).perform();
		}
		a2.sendKeys(Keys.ENTER).build().perform();

		Thread.sleep(2000);
	//	eo.Location().sendKeys(TestCaseData.Location);
		Thread.sleep(2000);
		eo.add_location().click();
		Thread.sleep(5000);
		eo.save().click();
		Thread.sleep(15000);
		eo.next().click();
		Thread.sleep(20000);
//		eo.next().click();
		Thread.sleep(25000);

//		WebElement predefine_functions = driver.findElement(By.xpath("(//*[name()='svg'][@stroke='currentColor'])"));
//		Thread.sleep(5000);
//		double randomvalue = (Math.random() * (5 - 0 + 1) + 0);
//		for (int i = 0; i <= randomvalue; i++) {
//			Thread.sleep(1000);
//			predefine_functions.click();
//		}
//
		Thread.sleep(10000);

		eo.functions().click();
		Thread.sleep(15000);

		driver.findElement(By.xpath("(//*[name()='svg'][@stroke='currentColor'])[23]")).click();

		Thread.sleep(10000);
		driver.findElement(By.xpath("//button[normalize-space()='Save']")).click();
		Thread.sleep(5000);
		eo.fun_process_next().click();

		Thread.sleep(5000);
		// driver.findElement(By.xpath("//div[normalize-space()='Audit']")).click();
		driver.findElement(By.xpath("//div[@class='my-1 col-md-12']//div[3]//div[1]")).click();

		driver.findElement(By.xpath("//div[@class='my-1 col-md-12']//div[3]//div[2]")).click();
		Thread.sleep(1000);
		// driver.findElement(By.xpath("(//div[@class='sc-ciZhAO
		// blTeUN'])[7]")).click();

		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[contains(text(),'new sangvi, Pune, Maharashtra, India')]")).click();
		Thread.sleep(5000);
		// eo.next().click();
		Thread.sleep(25000);
		driver.findElement(By.xpath("//div[contains(text(),'Endpoint')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[contains(text(),'Desktop')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[contains(text(),'Windows')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[contains(text(),'Windows 11')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@placeholder='ASSET NAME']")).sendKeys("Automation Testing");
		Thread.sleep(1000);

		// drop down
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[normalize-space()='Add']")).click();
		Thread.sleep(15000);
		driver.findElement(By.xpath("//button[normalize-space()='Save']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[normalize-space()='Next']")).click();
		Thread.sleep(10000);
		
		eo.Asset_next().click();
		Thread.sleep(5000);
//		eo.ASV().click();
//		Thread.sleep(5000);
		eo.Asset_submit().click();
		
		ExtentManager.test.createNode("Admin Test Case Passed Successfully!");
	
		
		

	}

}
