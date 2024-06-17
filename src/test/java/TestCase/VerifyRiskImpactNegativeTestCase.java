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
import PageObjectModel.RiskImpactNegative;
import Resources.BaseClass;
import Resources.TestCaseData;
import extentManager.ExtentManager;

public class VerifyRiskImpactNegativeTestCase extends BaseClass{

	
@Test 
public void  RiskImpactNegativeTestCase() throws IOException, InterruptedException {
		
		
		LoginPageObject lpo = new LoginPageObject(driver);

		
	
		Thread.sleep(5000);
		lpo.EnterUsername().sendKeys(TestCaseData.username);
		Thread.sleep(5000);

		lpo.EnterPassword().sendKeys(TestCaseData.password);
		Thread.sleep(4000);
		lpo.ClickSubmit().click();

		Thread.sleep(30000);

		RiskImpactNegative rin = new RiskImpactNegative(driver);
		Thread.sleep(5000);
		rin.Admin().click();
		Thread.sleep(2000);
	    rin.riskimpact().click();
	    Thread.sleep(2000);
	    
	    // Business unit - special character  
	    
	    WebElement Enterbusinessunit =  rin.Enterbusinessunit();
	    Thread.sleep(200);
	    Enterbusinessunit.sendKeys("(&^^%$%$#@^()}?>");	    
	    Thread.sleep(2000);
        String businessunit = Enterbusinessunit.getAttribute("value");
        Thread.sleep(2000);
	    Assert.assertFalse(containsSpecialCharacters(businessunit), "Input field should not allow special characters");
	    System.out.println("this is value :"+businessunit);
	    
	    //AnnualAmount - special character 
	    
	    WebElement EnterAnnualAmount =  rin.EnterAnnualAmount();
	    Thread.sleep(2000);
	    EnterAnnualAmount.sendKeys("(&^^%$%$#@^()}?>");
        String AnnualAmount = EnterAnnualAmount.getAttribute("value");
        Thread.sleep(2000);
	    Assert.assertFalse(containsSpecialCharacters(AnnualAmount), "Input field should not allow special characters");
	    System.out.println("this is value :"+AnnualAmount);
	    
	    
	    // Business unit - number 
	    
	    WebElement Enterbusinessunit1 =  rin.Enterbusinessunit();
	    Thread.sleep(2000);
	    Enterbusinessunit1.sendKeys("764149771413");	    
	    Thread.sleep(2000);
        String businessunit1 = Enterbusinessunit1.getAttribute("value");
        Thread.sleep(2000);
        Assert.assertTrue(!businessunit1.matches(".*\\d.*"), "Input field should not accept more than 9 numbers.");
        System.out.println("this is value :"+businessunit1);
	    
	    
	    // Business unit - alphabets  

	    WebElement EnterAnnualAmount1 =  rin.EnterAnnualAmount();
	    Thread.sleep(2000);
	    EnterAnnualAmount1.sendKeys("abcdef");	    
	    Thread.sleep(2000);
        String AnnualAmount1 = EnterAnnualAmount1.getAttribute("value");
        Thread.sleep(2000);
        Assert.assertFalse(AnnualAmount1.matches(".*[a-zA-Z].*"), "Input field should not accept alphabets.");
        System.out.println("this is value :"+AnnualAmount1);
	    
	    
        WebElement Enterbusinessunit2 =  rin.Enterbusinessunit();
	    Thread.sleep(2000);
	    Enterbusinessunit2.sendKeys("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyzX");	    
	    Thread.sleep(2000);
        String businessunit3 = Enterbusinessunit2.getAttribute("value");
        Thread.sleep(2000);
        Assert.assertEquals(businessunit3.length(), 75, "Input field should not accept more than 75 alphabets.");
        System.out.println("this is value :"+businessunit3);
        Thread.sleep(2000);

        Enterbusinessunit.clear();
	    
	    // Add button disabled check 
		Thread.sleep(2000);
		WebElement Enterbusinessunit3 = rin.Enterbusinessunit();
		// WebElement AnnualAmount2 = rin.EnterAnnualAmount();
		WebElement addButton = rin.clickadd();
		Enterbusinessunit3.sendKeys("Value");
		Assert.assertFalse(addButton.isEnabled(), "Add button should be disabled when only one input field is filled.");

		Thread.sleep(2000);


	
		ExtentManager.test.createNode("RGU Negative Test Passed Successfully!");


            
            
        
}
		
		
		
        
//        Thread.sleep(2000);
//        
//        Enterbusinessunit3.clear();
//        Thread.sleep(1000);
        
    
        
        
        
        
        
        
        
        
        
//	    Thread.sleep(2000);
//
//	 
//        WebElement Enterbusinessunit21 =  rin.Enterbusinessunit();
//	    Thread.sleep(2000);
//	    Enterbusinessunit21.sendKeys("                 ");	    
//	    Thread.sleep(2000);
//       // String businessunit31 = Enterbusinessunit21.getAttribute("value");
//        Thread.sleep(2000);
//       
//        Assert.assertFalse(Enterbusinessunit21.getAttribute("value").contains("                 "), "Input field should not accept spaces.");

	    
	    
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
//	    WebElement strategic =  rin.EnterAnnualAmount();
//		strategic.sendKeys("999999999999999");
//		String strategicvalue = strategic.getAttribute("value");
//		
//	    System.out.println("this is value :"+strategicvalue);
//
//        Assert.assertEquals(strategicvalue.length(), 11, "Input field should only accept nine numbers");
//
//	    
//	    
//	    
//	    
//	    
//	    
//	    Thread.sleep(5000);
//	  // rin.clickadd().click();
//	    Thread.sleep(5000);

    

       
    
        
	    
private static boolean containsSpecialCharacters(String s) {
    return s.matches("[^a-zA-Z0-9]+");
}	

	    
	    
	    
	    
//	    WebElement invalidbusinessunit = rin.Enterbusinessunit();
//	    invalidbusinessunit.sendKeys("QA Testing12345");
//        // Retrieve the text from the input field
//        String invalidinputValue = invalidbusinessunit.getAttribute("value");
//        // Use assertions to verify that the text in the input field does not contain numbers or special characters
//        Assert.assertFalse(invalidinputValue.matches("QA Testing12345"), "Business unit should contain only characters");
//	    Thread.sleep(2000);
//		WebElement perAssettechUnitCostMonthly = rin.EnterAnnualAmount();
//		perAssettechUnitCostMonthly.sendKeys("123456789123");
//		String perusertechunitcostMonthlyValue = perAssettechUnitCostMonthly.getAttribute("value");
//		System.out.println(perusertechunitcostMonthlyValue.length());
//		Assert.assertTrue(perusertechunitcostMonthlyValue.length() <= 11,"The Business unit Revenue should contain nine or less than nine values.");
//		Thread.sleep(2000);
//	    rin.clickadd().click();
//		ExtentManager.test.createNode("RGU-Business Unit and Annual Amount is Added Successfully ");
//
//	    Thread.sleep(5000);
//	    rin.clickonrgu().click();
//	    Thread.sleep(5000);
//	    rin.clickonfunction().click();
//	    Thread.sleep(5000);
//	    rin.save().click();
//	    Thread.sleep(5000);
//	    rin.Review().click();
//	    
//	    
//	    
//		ExtentManager.test.createNode("Risk Impact Negative Test Case Pass");

	
	
	
	
}
	
	
	

