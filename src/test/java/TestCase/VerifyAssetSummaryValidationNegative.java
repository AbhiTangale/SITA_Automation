package TestCase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import PageObjectModel.AssetSummaryValidationNegative;
import PageObjectModel.LoginPageObject;
import Resources.BaseClass;
import Resources.TestCaseData;
import extentManager.ExtentManager;

public class VerifyAssetSummaryValidationNegative extends BaseClass{

	@Test
	public void AssetSummaryValidationNegative() throws InterruptedException {

		LoginPageObject lpo = new LoginPageObject(driver);
		Thread.sleep(3000);
		lpo.EnterUsername().sendKeys(TestCaseData.username);
		Thread.sleep(3000);
		lpo.EnterPassword().sendKeys(TestCaseData.password);
		Thread.sleep(3000);
		lpo.ClickSubmit().click();
		Thread.sleep(35000);
	
		AssetSummaryValidationNegative asvn = new AssetSummaryValidationNegative(driver);
	
		Thread.sleep(2000);

		asvn.Admin().click();
		Thread.sleep(20000);
		asvn.entity_onboarding().click();
		Thread.sleep(5000);
		asvn.asv().click();
		Thread.sleep(5000);
		
		Thread.sleep(2000);
		asvn.total1().sendKeys("83435525");
	    WebElement firstinput = asvn.total1();
		Thread.sleep(2000);
		String first = firstinput.getAttribute("value");
		Thread.sleep(2000);
		Assert.assertTrue(first.length() <=5, "Input field accepted a number with an increase of 5 digits.");
	    System.out.println(first.length());
		ExtentManager.test.createNode("Input Field 1 - The input field only accepts five or less than five numbers.");


		Thread.sleep(2000);

		asvn.total2().sendKeys("35525");
	    WebElement secondinput = asvn.total2();
		Thread.sleep(2000);
		String second = secondinput.getAttribute("value");
		Thread.sleep(2000);
		Assert.assertTrue(second.length() <=5, "Input field accepted a number with an increase of 5 digits.");
	    System.out.println(second.length());
		ExtentManager.test.createNode("Input Field 2 - The input field only accepts five or less than five numbers.");

		Thread.sleep(2000);
		asvn.total3().sendKeys("435525");
		WebElement thirdinput = asvn.total3();
		Thread.sleep(2000);
		String third = thirdinput.getAttribute("value");
		Thread.sleep(2000);
		Assert.assertTrue(third.length() <= 5, "Input field accepted a number with an increase of 5 digits.");
		System.out.println(third.length());
		ExtentManager.test.createNode("Input Field 3 - The input field only accepts five or less than five numbers.");
 
		
		
		Thread.sleep(2000);
		asvn.total4().sendKeys("23245525");
		WebElement forthinput = asvn.total4();
		Thread.sleep(2000);
		String forth = forthinput.getAttribute("value");
		Thread.sleep(2000);
		Assert.assertTrue(forth.length() <= 5, "Input field accepted a number with an increase of 5 digits.");
		System.out.println(forth.length());
		ExtentManager.test.createNode("Input Field 4 - The input field only accepts five or less than five numbers.");

	 	    
		Thread.sleep(2000);
		asvn.total5().sendKeys("15635525");
		WebElement fifthinput = asvn.total5();
		Thread.sleep(2000);
		String fifth = fifthinput.getAttribute("value");
		Thread.sleep(2000);
		Assert.assertTrue(fifth.length() <= 5, "Input field accepted a number with an increase of 5 digits.");
		System.out.println(fifth.length());
	 	    
		ExtentManager.test.createNode("Input Field 5 - The input field only accepts five or less than five numbers.");

		
		Thread.sleep(2000);

		asvn.total6().sendKeys("74735525");
		WebElement sixinput = asvn.total6();
		Thread.sleep(2000);
		String six = sixinput.getAttribute("value");
		Thread.sleep(2000);
		Assert.assertTrue(six.length() <= 5, "Input field accepted a number with an increase of 5 digits.");
		System.out.println(six.length());
		ExtentManager.test.createNode("Input Field 6 - The input field only accepts five or less than five numbers.");

	 	    
		Thread.sleep(2000);
		asvn.total7().sendKeys("43425525");
		WebElement seveninput = asvn.total7();
		Thread.sleep(2000);
		String seven = seveninput.getAttribute("value");
		Thread.sleep(2000);
		Assert.assertTrue(seven.length() <= 5, "Input field accepted a number with an increase of 5 digits.");
		System.out.println(seven.length());
		ExtentManager.test.createNode("Input Field 7 - The input field only accepts five or less than five numbers.");

	 	    
		Thread.sleep(2000);

		asvn.total8().sendKeys("24445525");
		WebElement eightinput = asvn.total8();
		Thread.sleep(2000);
		String eight = eightinput.getAttribute("value");
		Thread.sleep(2000);
		Assert.assertTrue(eight.length() <= 5, "Input field accepted a number with an increase of 5 digits.");
		System.out.println(eight.length());
		ExtentManager.test.createNode("Input Field 8 - The input field only accepts five or less than five numbers.");
    
		
		
		
		Thread.sleep(2000);

		asvn.total9().sendKeys("75635525");
		WebElement nineinput = asvn.total9();
		Thread.sleep(2000);
		String nine = nineinput.getAttribute("value");
		Thread.sleep(2000);
		Assert.assertTrue(nine.length() <= 5, "Input field accepted a number with an increase of 5 digits.");
		System.out.println(nine.length());
		ExtentManager.test.createNode("Input Field 9 - The input field only accepts five or less than five numbers.");

		
		
		
		Thread.sleep(2000);

		asvn.total10().sendKeys("434325525");
		WebElement teninput = asvn.total10();
		Thread.sleep(2000);
		String ten = teninput.getAttribute("value");
		Thread.sleep(2000);
		Assert.assertTrue(ten.length() <= 5, "Input field accepted a number with an increase of 5 digits.");
		System.out.println(ten.length());
		ExtentManager.test.createNode("Input Field 10 - The input field only accepts five or less than five numbers.");


		Thread.sleep(2000);
		ExtentManager.test.createNode("Asset Summary Validation Negative Test Case Passed Successfully!");

	
	
	
	
	
	
	
	
	
	
	
	
	
	}	
}
