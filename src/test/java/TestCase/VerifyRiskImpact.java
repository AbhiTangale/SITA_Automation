package TestCase;

import java.io.IOException;
import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.github.javafaker.Faker;

import PageObjectModel.LoginPageObject;
import PageObjectModel.RiskImpact;
import Resources.BaseClass;
import Resources.TestCaseData;
import extentManager.ExtentManager;

public class VerifyRiskImpact extends BaseClass{
	
@Test

public void  RiskImpactTestCase() throws IOException, InterruptedException {
		
		
		LoginPageObject lpo = new LoginPageObject(driver);

        Faker faker = new Faker();

		int length = 8; // Desired length of the local part of the email
		String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
		StringBuilder localPart = new StringBuilder();
		


		Random random = new Random();

	
		
	
		
		for (int i = 0; i < length; i++) {
			int index = random.nextInt(characters.length());
			char randomChar = characters.charAt(index);
			localPart.append(randomChar);
		}


		
		String randomEmail = localPart.toString();
		System.out.println(randomEmail);
		
		
		int min = 1;
		int max = 100000000;
		int randomNumber = random.nextInt(max - min + 1) + min;
		String tacticnumber = Integer.toString(randomNumber);

		Thread.sleep(3000);
		lpo.EnterUsername().sendKeys(TestCaseData.username);
		Thread.sleep(3000);
		lpo.EnterPassword().sendKeys(TestCaseData.password);
		Thread.sleep(3000);
		lpo.ClickSubmit().click();
		Thread.sleep(30000);

		RiskImpact ri = new RiskImpact(driver);
		Thread.sleep(2000);
		ri.Admin().click();
		Thread.sleep(2000);
	    ri.riskimpact().click();
	    Thread.sleep(20000);
	    
	    ri.Enterbusinessunit().sendKeys(faker.company().name());
	    Thread.sleep(5000);
	    ri.EnterAnnualAmount().sendKeys(tacticnumber);
	    Thread.sleep(5000);
	    ri.clickadd().click();
	    
		Thread.sleep(5000);

	    List<WebElement> checkboxes = driver.findElements(By.xpath("(//input[@id='default-checkbox'])"));

        // Check if there are checkboxes on the page
        if (checkboxes.size() > 0) {
            // Generate a random index to select a checkbox
            Random checbox = new Random();
            int randomIndex = checbox.nextInt(checkboxes.size());

            checkboxes.get(randomIndex).click();

            System.out.println("Random checkbox selected!");
        } else {
            System.out.println("No checkboxes found on the page.");
        }
		Thread.sleep(2000);
	    ri.save().click();
	    
		Thread.sleep(2000);

		ri.togglebutton().click();

		Thread.sleep(5000);

		List<WebElement> process = driver.findElements(By.xpath("(//input[@id='default-checkbox'])"));

		if (process.size() > 0) {
			Random checbox = new Random();
			int randomIndex = checbox.nextInt(process.size());

			process.get(randomIndex).click();

			System.out.println("Random checkbox selected!");
		} else {
			System.out.println("No checkboxes found on the page.");
		}

		Thread.sleep(5000);

		List<WebElement> editrgu = driver.findElements(By.xpath(" //div[@height='9.25rem']"));

		if (editrgu.size() > 0) {
			Random checbox = new Random();
			int randomIndex = checbox.nextInt(editrgu.size());

			editrgu.get(randomIndex).click();
			ri.edit().click();
			ri.EnterAnnualAmount().sendKeys("441");
			ri.clickadd().click();

			System.out.println("Random checkbox selected!");
		} else {
			System.out.println("No checkboxes found on the page.");
		}

		Thread.sleep(5000);

		List<WebElement> deletergu = driver.findElements(By.xpath(" //div[@height='9.25rem']"));

		if (deletergu.size() > 0) {
			Random checbox = new Random();
			int randomIndex = checbox.nextInt(deletergu.size());

			deletergu.get(randomIndex).click();
			ri.delete().click();

			System.out.println("Random checkbox selected!");
		} else {
			System.out.println("No checkboxes found on the page.");
		}

		Thread.sleep(5000);
		ri.save().click();
		Thread.sleep(5000);
		ri.Review().click();
		Thread.sleep(8000);
	    ri.close().click();
	    
	    
		ExtentManager.test.createNode("RGU Test Passed Successfully!");
	   
	    
	    
	    
	    
	    
	    
	    
	    
	    
//		ExtentManager.test.createNode("RGU-Business Unit and Annual Amount is Added Successfully ");
// 
//	    
//	    Thread.sleep(5000);
//	    ri.clickonrgu().click();
//	    Thread.sleep(5000);
//	    ri.clickonfunction().click();
//	    Thread.sleep(5000);
//	    ri.save().click();
//	    Thread.sleep(5000);
//		ExtentManager.test.createNode("RGU Added and Updated Successfully");
//
//	    ri.Review().click();
//	    Thread.sleep(5000);
//		ExtentManager.test.createNode("Review Screen Open Successfully");
//
//	    ri.close().click();
//		ExtentManager.test.createNode("Review Screen Close and Admin page Open Successfully");
//
//	    Thread.sleep(5000);
//	    ri.riskimpact().click();
//	    Thread.sleep(5000);
//	    driver.findElement(By.xpath("//div[@id='rgu_container_5']//div[2]")).click();
//	    Thread.sleep(2000);
//	    ri.edit().click();
//	    Thread.sleep(2000);
//	    ri.Enterbusinessunit().sendKeys("edit");
//	    Thread.sleep(2000);
//	    ri.EnterAnnualAmount().sendKeys("3441");
//	    Thread.sleep(2000);
//	    ri.clickadd().click();
//	    Thread.sleep(200);
//		ExtentManager.test.createNode("RGU Edited and Updated Successfully");
//	    Thread.sleep(5000);
//	    
//	    driver.findElement(By.xpath("//div[@id='rgu_container_5']//div[2]")).click();
//	    Thread.sleep(2000);
//	    ri.delete().click();
//	    Thread.sleep(200);
//		ExtentManager.test.createNode("RGU Deleted Successfully");
//	    Thread.sleep(2000);
//		ExtentManager.test.createNode("Risk Test Passed Successfully!");

}

private String generateNineDigitNumber(Faker faker) {
	// TODO Auto-generated method stub
	return null;
}
}
