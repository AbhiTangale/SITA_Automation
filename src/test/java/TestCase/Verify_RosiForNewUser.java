package TestCase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import Resources.BaseClass;

public class Verify_RosiForNewUser extends BaseClass{

	@Test
	
	public void RoSIForNewUser() throws InterruptedException {


	driver.get("https://softwaretesting.dev.netrum-tech.com/");
	Thread.sleep(10000);
	driver.findElement(By.xpath("//input[@type='email']")).sendKeys("test@gmail.com");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@type='password']")).sendKeys("newuser@123");
	Thread.sleep(2000);
    driver.findElement(By.xpath("//button[normalize-space()='Submit']")).click();
	Thread.sleep(30000);
    driver.findElement(By.xpath("//a[normalize-space()='RoSI']")).click();
	Thread.sleep(15000);
    WebElement okButton = driver.findElement(By.xpath("//button[normalize-space()='Ok']"));
    
  
//	Thread.sleep(15000);
//
//	Assert.assertTrue(okButton.isDisplayed(),"Test failed: OK button not found.");

    
	}
}
