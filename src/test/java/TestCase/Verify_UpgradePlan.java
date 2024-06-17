package TestCase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import Resources.BaseClass;
import extentManager.ExtentManager;

public class Verify_UpgradePlan extends BaseClass{

	@Test
	
	public void UpgradePlan() throws InterruptedException {
	
		driver.get("https://salesforce.dev.netrum-tech.com/");
		Thread.sleep(10000);
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("rushi@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Rushi@1234");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[normalize-space()='Submit']")).click();
		Thread.sleep(30000);
	    
		Thread.sleep(3000);
        
		
		WebElement risk =driver.findElement(By.xpath("//a[normalize-space()='Risk']"));
		Thread.sleep(3000);
		risk.click();
		Thread.sleep(3000);
		WebElement riskpopup =driver.findElement(By.xpath("//div[contains(text(),'Please Upgrade to Enterprise Plan - Contact Us')]"));
		Thread.sleep(3000);
		String riskactualAlertText = riskpopup.getText();
		Thread.sleep(3000);
		String riskexpectedAlertText = "Please Upgrade to Enterprise Plan - Contact Us";
		Thread.sleep(3000);
		Assert.assertEquals(riskactualAlertText, riskexpectedAlertText, "Alert text does not match the expected text.");
		System.out.println(riskactualAlertText);
		ExtentManager.test.createNode("Risk - Upgrade to Enterprise Plan is working");

		
		
		WebElement rosi= driver.findElement(By.xpath("//a[normalize-space()='RoSI']"));
		rosi.click();
		WebElement rosipopup =driver.findElement(By.xpath("//div[contains(text(),'Please Upgrade to Enterprise Plan - Contact Us')]"));
		Thread.sleep(3000);
		String rosiactualAlertText = rosipopup.getText();
		Thread.sleep(3000);
		String rosiexpectedAlertText = "Please Upgrade to Enterprise Plan - Contact Us";
		Thread.sleep(3000);
		Assert.assertEquals(rosiactualAlertText, rosiexpectedAlertText, "Alert text does not match the expected text.");
		Thread.sleep(3000);
		ExtentManager.test.createNode("RoSI - Upgrade to Enterprise Plan is working");

		
		driver.findElement(By.linkText("Admin")).click();
		Thread.sleep(10000);
		
		WebElement riskcontrol= driver.findElement(By.xpath("//p[normalize-space()='Risk Controls']"));
		riskcontrol.click();
		WebElement riskcontrolpopup =driver.findElement(By.xpath("//div[contains(text(),'Please Upgrade to Enterprise Plan - Contact Us')]"));
		Thread.sleep(3000);
		String riskcontrolactualAlertText = riskcontrolpopup.getText();
		Thread.sleep(3000);
		String riskcontrolexpectedAlertText = "Please Upgrade to Enterprise Plan - Contact Us";
		Thread.sleep(3000);
		Assert.assertEquals(riskcontrolactualAlertText, riskcontrolexpectedAlertText, "Alert text does not match the expected text.");
		ExtentManager.test.createNode("RisK Control - Upgrade to Enterprise Plan is working");

		
		Thread.sleep(3000);
		WebElement riskimpact= driver.findElement(By.xpath("//p[normalize-space()='Risk Impact']"));
		riskimpact.click();
		WebElement riskimpactpopup =driver.findElement(By.xpath("//div[contains(text(),'Please Upgrade to Enterprise Plan - Contact Us')]"));
		Thread.sleep(3000);
		String riskimpactactualAlertText = riskimpactpopup.getText();
		Thread.sleep(3000);
		String riskimpactexpectedAlertText = "Please Upgrade to Enterprise Plan - Contact Us";
		Thread.sleep(3000);
		Assert.assertEquals(riskimpactactualAlertText, riskimpactexpectedAlertText, "Alert text does not match the expected text.");
		ExtentManager.test.createNode("RisK Impact - Upgrade to Enterprise Plan is working");

		
		Thread.sleep(3000);
		WebElement costofsecuritycontrol= driver.findElement(By.xpath("//p[normalize-space()='Cost Of Security Controls']"));
		costofsecuritycontrol.click();
		WebElement costofsecuritycontrolpopup =driver.findElement(By.xpath("//div[contains(text(),'Please Upgrade to Enterprise Plan - Contact Us')]"));
		Thread.sleep(3000);
		String costofsecuritycontrolactualAlertText = costofsecuritycontrolpopup.getText();
		Thread.sleep(3000);
		String costofsecuritycontrolexpectedAlertText = "Please Upgrade to Enterprise Plan - Contact Us";
		Thread.sleep(3000);
		Assert.assertEquals(costofsecuritycontrolactualAlertText, costofsecuritycontrolexpectedAlertText, "Alert text does not match the expected text.");
		ExtentManager.test.createNode("Cost of security control - Upgrade to Enterprise Plan is working");

		
	}
}
		
		
		
		
		
		
		
		
//        
//
//		driver.findElement(By.linkText("Admin")).click();
//        
//        
//        

		
		
		
		
		
		
		
	
	
/*

risk

rosi

risk control

risk impact

cost of security control





*/
