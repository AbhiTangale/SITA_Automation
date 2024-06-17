package TestCase;

import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import PageObjectModel.CostOfSecurityControl;
import PageObjectModel.LoginPageObject;
import Resources.BaseClass;
import Resources.TestCaseData;
import extentManager.ExtentManager;

public class VerifyCostOfSecurityControlNegative extends BaseClass{
	
	@Test
	public void CostOfSecurityControlNegative() throws InterruptedException {
		
		LoginPageObject lpo = new LoginPageObject(driver);
		Thread.sleep(3000);
		lpo.EnterUsername().sendKeys(TestCaseData.username);
		Thread.sleep(3000);
		lpo.EnterPassword().sendKeys(TestCaseData.password);
		Thread.sleep(3000);
		lpo.ClickSubmit().click();
		Thread.sleep(30000);

		Random randomvalue = new Random();
		int min = 1;
		int max = 1000000000;
//		int randomNumber = randomvalue.nextInt(max - min + 1) + min;
//		String randominputnumbers = Integer.toString(randomNumber);

		
		
		CostOfSecurityControl csc = new CostOfSecurityControl(driver);

// INFORMATION SECURITY TEAM
		
		
		
		Thread.sleep(2000);
		csc.Admin().click();
		Thread.sleep(10000);
		csc.csc().click();
		Thread.sleep(15000);
		
		int randomNumber = randomvalue.nextInt(max - min + 1) + min;
		String tacticnumber = Integer.toString(randomNumber);
		WebElement tactic = csc.TacticLevel();
		tactic.sendKeys(tacticnumber);
		String tacticValue = tactic.getAttribute("value");
		Assert.assertTrue(tacticValue.length() <= 5, "Input field accepted a number with an increase of 5 digits.");
		
	
		int randomNumber1 = randomvalue.nextInt(max - min + 1) + min;
		String strategicnumber = Integer.toString(randomNumber1);
		Thread.sleep(2000);
		WebElement strategic = csc.StrategicLevel();
		strategic.sendKeys(strategicnumber);
		String strategicvalue = strategic.getAttribute("value");
		Assert.assertTrue(strategicvalue.length() <= 5, "Input field accepted a number with an increase of 5 digits.");
		
	
		int randomNumber2 = randomvalue.nextInt(max - min + 1) + min;
		String costannual1number = Integer.toString(randomNumber2);
		Thread.sleep(2000);
		WebElement cost = csc.costannual1();
		cost.sendKeys(costannual1number);
		String costvalue = cost.getAttribute("value");
		System.out.println(costvalue.length()); // length is 12
		Assert.assertTrue(costvalue.length() <= 12, "Input field accepted a number with an increase of 9 digits.");
	
		Thread.sleep(2000);
		int randomNumber3 = randomvalue.nextInt(max - min + 1) + min;
		String costannual2number = Integer.toString(randomNumber3);
		Thread.sleep(2000);
		WebElement costannual = csc.costannual2();
		costannual.sendKeys(costannual2number);
		String costanuualvalue = costannual.getAttribute("value");
		System.out.println(costanuualvalue.length());
		Assert.assertTrue(costanuualvalue.length() <= 12, "Input field accepted a number with an increase of 9 digits.");
		
		

		// COST PER SECURITY PROCESS
		
		
		
		int randomNumber4 = randomvalue.nextInt(max - min + 1) + min;
		String socnumber = Integer.toString(randomNumber4);
		Thread.sleep(2000);
		
		WebElement soc =csc.soc();
		soc.sendKeys(socnumber);
		String socValue123 = soc.getAttribute("value");
		Thread.sleep(2000);
		System.out.println(socValue123.length()); // length is 11
		Assert.assertTrue(socValue123.length() <= 12, "Input field accepted a number with an increase of 9 digits");
	
	
		Thread.sleep(2000);
		int randomNumber5 = randomvalue.nextInt(max - min + 1) + min;
		String netsegnumber = Integer.toString(randomNumber5);
		
		WebElement netseg =csc.netseg();
		netseg.sendKeys(netsegnumber);
		String netsegValue = netseg.getAttribute("value");
		System.out.println(netsegValue.length());
		Assert.assertTrue(netsegValue.length() <= 12, "Input field accepted a number with an increase of 9 digits.");
		
		
		
		int randomNumber6 = randomvalue.nextInt(max - min + 1) + min;
		String othercost = Integer.toString(randomNumber6);
		Thread.sleep(2000);
		
		WebElement otherscost =csc.othercost();
		otherscost.sendKeys(othercost);
		String othercostValue = otherscost.getAttribute("value");
		System.out.println(othercostValue.length());
		Assert.assertTrue(othercostValue.length() <= 12, "Input field accepted a number with an increase of 9 digits.");
		
		
		
		// INFORMATION SECURITY AWARENESS PROGRAM

		int randomNumber7 = randomvalue.nextInt(max - min + 1) + min;
		String totalemployee = Integer.toString(randomNumber7);
		Thread.sleep(2000);
		WebElement totalemploye = csc.totalemployee();
		totalemploye.sendKeys(totalemployee);
		String totalemployeecValue = totalemploye.getAttribute("value");
		System.out.println(totalemployeecValue.length());
		Assert.assertTrue(totalemployeecValue.length() <= 5, "Input field accepted a number with an increase of 5 digits.");
		
		
		Thread.sleep(2000);
		csc.Coverage().sendKeys("80");
	
		
		int randomNumber8 = randomvalue.nextInt(max - min + 1) + min;
		String totalcostannualCoverage = Integer.toString(randomNumber8);
		Thread.sleep(2000);
		
		WebElement Coverage = csc.totalcostannualCoverage();
		Coverage.sendKeys(totalcostannualCoverage);
		String CoverageValue = Coverage.getAttribute("value");
		System.out.println(CoverageValue.length());
		Assert.assertTrue(CoverageValue.length() <= 12, "Input field accepted a number with an increase of 5 digits.");
		
		
		
		// PER USER TECHNOLOGIES

		
		
		WebElement dropdownElement = csc.perusertechDropdown();

	    Select select = new Select(dropdownElement);

	    Random random = new Random();

		int attempts = 0;
		int maxAttempts = 5;
		Thread.sleep(5000);
		while (attempts < maxAttempts) {
			int randomIndex = random.nextInt(select.getOptions().size());

			try {
				select.selectByIndex(randomIndex);

				if (select.getFirstSelectedOption().isEnabled()) {
					int randomNumber9 = randomvalue.nextInt(max - min + 1) + min;
					String perusertech = Integer.toString(randomNumber9);
					Thread.sleep(3000);
					select.selectByIndex(randomIndex);
					WebElement perusertechunitcostMonthly = csc.perusertechonologyunitcostMonthly();
					perusertechunitcostMonthly.sendKeys(perusertech);					
					String perusertechunitcostMonthlyValue = perusertechunitcostMonthly.getAttribute("value");
					System.out.println(perusertechunitcostMonthlyValue.length());
					Assert.assertTrue(perusertechunitcostMonthlyValue.length() <= 12, "Input field accepted a number with an increase of 5 digits.");
					Thread.sleep(2000);
					csc.perusertechAddbutton().click();
					System.out.println("Successfully selected an enabled option.");

					break;

				}
			} catch (java.lang.UnsupportedOperationException e) {
				System.out.println("Caught ElementNotInteractableException. Trying another option.");
			}

			attempts++;
		}
		
		
		Thread.sleep(5000);
		WebElement entitylevel = csc.entitylevelsharedtechnologydropdown();
		Select entity = new Select(entitylevel);

		Thread.sleep(5000);
		while (attempts < maxAttempts) {
			int randomIndex = random.nextInt(entity.getOptions().size());

			try {
				entity.selectByIndex(randomIndex);

				if (entity.getFirstSelectedOption().isEnabled()) {
					int randomNumber9 = randomvalue.nextInt(max - min + 1) + min;
					String perusertech = Integer.toString(randomNumber9);
					Thread.sleep(3000);
					entity.selectByIndex(randomIndex);
					
					WebElement entitylevelsharedtechnologyUnitCostMonthly = csc.entitylevelsharedtechnologyUnitCostMonthly();
					entitylevelsharedtechnologyUnitCostMonthly.sendKeys(perusertech);
					String entityValue = entitylevelsharedtechnologyUnitCostMonthly.getAttribute("value");
					System.out.println(entityValue.length());
					Assert.assertTrue(entityValue.length() <= 12, "Input field accepted a number with an increase of 5 digits.");
		
					Thread.sleep(2000);
					csc.entitylevelsharedtechnologyAdd().click();
					System.out.println("Successfully selected an enabled option.");

					break;

				}
			} catch (java.lang.UnsupportedOperationException e) {
				System.out.println("Caught ElementNotInteractableException. Trying another option.");
			}

			attempts++;
		}
		
		
		
		// asset tech  
		Thread.sleep(5000);
		WebElement assettech = csc.perAssettechdropdown();
		Select asset = new Select(assettech);

		Thread.sleep(5000);
		while (attempts < maxAttempts) {
			int randomIndex = random.nextInt(asset.getOptions().size());

			try {
				asset.selectByIndex(randomIndex);

				if (asset.getFirstSelectedOption().isEnabled()) {
					int randomNumber9 = randomvalue.nextInt(max - min + 1) + min;
					String perusertech = Integer.toString(randomNumber9);
					asset.selectByIndex(randomIndex);
					WebElement perAssettechUnitCostMonthly = csc.perAssettechUnitCostMonthly();
					perAssettechUnitCostMonthly.sendKeys(perusertech);
					String assetValue = perAssettechUnitCostMonthly.getAttribute("value");
					System.out.println(assetValue.length());
					Assert.assertTrue(assetValue.length() <= 12, "Input field accepted a number with an increase of 5 digits.");
					Thread.sleep(3000);
					csc.perAssettechAddButton().click();
					System.out.println("Successfully selected an enabled option.");

					break;

				}
			} catch (java.lang.UnsupportedOperationException e) {
				System.out.println("Caught ElementNotInteractableException. Trying another option.");
			}

			attempts++;
		}
	    
		
		Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,800)", "");
		Thread.sleep(3000);
		csc.save().click();
		Thread.sleep(300);
		ExtentManager.test.createNode("Cost Of Security Control Negative Test Case Passed Successfully!");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		WebElement dropdownElement = csc.perusertechDropdown();
//		dropdownElement.click();
//		Select dropdown = new Select(dropdownElement);
//		List<WebElement> allOptions = dropdown.getOptions();
//		Random random = new Random();
//		int randomIndex = random.nextInt(allOptions.size());
//
//		try {
//			int randomNumber9 = randomvalue.nextInt(max - min + 1) + min;
//			String perusertech = Integer.toString(randomNumber9);
//			Thread.sleep(3000);
//			dropdown.selectByIndex(randomIndex);
//			WebElement perusertechunitcostMonthly = csc.perusertechonologyunitcostMonthly();
//			perusertechunitcostMonthly.sendKeys(perusertech);
//			String perusertechunitcostMonthlyValue = perusertechunitcostMonthly.getAttribute("value");
//			System.out.println(perusertechunitcostMonthlyValue.length());
//			Assert.assertTrue(perusertechunitcostMonthlyValue.length() <= 12, "Input field accepted a number with an increase of 5 digits.");
//			Thread.sleep(2000);
//			csc.perusertechAddbutton().click();
//			System.out.println("present");
//		} catch (org.openqa.selenium.NoSuchElementException e) {
//			System.out.println("Checkbox is not present on the page");
//		}
//
//		Thread.sleep(5000);
//		try {
//			int randomNumber10 = randomvalue.nextInt(max - min + 1) + min;
//			String perusertech = Integer.toString(randomNumber10);
//			Thread.sleep(3000);
//			dropdown.selectByIndex(randomIndex);
//			
//			WebElement perusertechunitcostMonthly = csc.perusertechonologyunitcostMonthly();
//			perusertechunitcostMonthly.sendKeys(perusertech);
//			String perusertechunitcostMonthlyValue = perusertechunitcostMonthly.getAttribute("value");
//			System.out.println(perusertechunitcostMonthlyValue.length());
//			Assert.assertTrue(perusertechunitcostMonthlyValue.length() <= 12, "Input field accepted a number with an increase of 5 digits.");
//			Thread.sleep(2000);
//			csc.perusertechAddbutton().click();
//			System.out.println("present");
//		} catch (org.openqa.selenium.NoSuchElementException e) {
//			System.out.println("Checkbox is not present on the page");
//		}
//
//		Thread.sleep(5000);
//
//		try {
//			int randomNumber10 = randomvalue.nextInt(max - min + 1) + min;
//			String perusertech = Integer.toString(randomNumber10);
//			Thread.sleep(3000);
//			dropdown.selectByIndex(randomIndex);
//			
//			WebElement perusertechunitcostMonthly = csc.perusertechonologyunitcostMonthly();
//			perusertechunitcostMonthly.sendKeys(perusertech);
//			String perusertechunitcostMonthlyValue = perusertechunitcostMonthly.getAttribute("value");
//			System.out.println(perusertechunitcostMonthlyValue.length());
//			Assert.assertTrue(perusertechunitcostMonthlyValue.length() <= 12, "Input field accepted a number with an increase of 5 digits.");
//			Thread.sleep(2000);
//			csc.perusertechAddbutton().click();
//			System.out.println("present");
//		} catch (org.openqa.selenium.NoSuchElementException e) {
//			System.out.println("Checkbox is not present on the page");
//		}
//
//		Thread.sleep(5000);
//
//		try {
//			int randomNumber11 = randomvalue.nextInt(max - min + 1) + min;
//			String perusertech = Integer.toString(randomNumber11);
//			Thread.sleep(3000);
//			dropdown.selectByIndex(randomIndex);
//			
//			WebElement perusertechunitcostMonthly = csc.perusertechonologyunitcostMonthly();
//			perusertechunitcostMonthly.sendKeys(perusertech);
//			String perusertechunitcostMonthlyValue = perusertechunitcostMonthly.getAttribute("value");
//			System.out.println(perusertechunitcostMonthlyValue.length());
//			Assert.assertTrue(perusertechunitcostMonthlyValue.length() <= 12, "Input field accepted a number with an increase of 5 digits.");
//	
//			Thread.sleep(2000);
//			csc.perusertechAddbutton().click();
//			System.out.println("present");
//		} catch (org.openqa.selenium.NoSuchElementException e) {
//			System.out.println("Checkbox is not present on the page");
//		}
//
//		Thread.sleep(5000);
//		try {
//			int randomNumber11 = randomvalue.nextInt(max - min + 1) + min;
//			String perusertech = Integer.toString(randomNumber11);
//			Thread.sleep(3000);
//			dropdown.selectByIndex(randomIndex);
//			WebElement perusertechunitcostMonthly = csc.perusertechonologyunitcostMonthly();
//			perusertechunitcostMonthly.sendKeys(perusertech);
//			String perusertechunitcostMonthlyValue = perusertechunitcostMonthly.getAttribute("value");
//			System.out.println(perusertechunitcostMonthlyValue.length());
//			Assert.assertTrue(perusertechunitcostMonthlyValue.length() <= 12, "Input field accepted a number with an increase of 5 digits.");
//
//			Thread.sleep(2000);
//			csc.perusertechAddbutton().click();
//			System.out.println("present");
//		} catch (org.openqa.selenium.NoSuchElementException e) {
//			System.out.println("Checkbox is not present on the page");
//		}
//
//		Thread.sleep(5000);
//		try {
//			int randomNumber11 = randomvalue.nextInt(max - min + 1) + min;
//			String perusertech = Integer.toString(randomNumber11);
//			Thread.sleep(3000);
//			dropdown.selectByIndex(randomIndex);
//			
//			WebElement perusertechunitcostMonthly = csc.perusertechonologyunitcostMonthly();
//			perusertechunitcostMonthly.sendKeys(perusertech);
//			String perusertechunitcostMonthlyValue = perusertechunitcostMonthly.getAttribute("value");
//			System.out.println(perusertechunitcostMonthlyValue.length());
//			Assert.assertTrue(perusertechunitcostMonthlyValue.length() <= 12, "Input field accepted a number with an increase of 5 digits.");
//			
//			Thread.sleep(2000);
//			csc.perusertechAddbutton().click();
//			System.out.println("present");
//		} catch (org.openqa.selenium.NoSuchElementException e) {
//			System.out.println("Checkbox is not present on the page");
//		}
//
//		Thread.sleep(5000);
//		try {
//			int randomNumber11 = randomvalue.nextInt(max - min + 1) + min;
//			String perusertech = Integer.toString(randomNumber11);
//			Thread.sleep(3000);
//			dropdown.selectByIndex(randomIndex);
//			
//			WebElement perusertechunitcostMonthly = csc.perusertechonologyunitcostMonthly();
//			perusertechunitcostMonthly.sendKeys(perusertech);
//			String perusertechunitcostMonthlyValue = perusertechunitcostMonthly.getAttribute("value");
//			System.out.println(perusertechunitcostMonthlyValue.length());
//			Assert.assertTrue(perusertechunitcostMonthlyValue.length() <= 12, "Input field accepted a number with an increase of 5 digits.");
//			
//			Thread.sleep(2000);
//			csc.perusertechAddbutton().click();
//			System.out.println("present");
//		} catch (org.openqa.selenium.NoSuchElementException e) {
//			System.out.println("Checkbox is not present on the page");
//		}
//
////	 	 check Checkbox	604
//		try {
//			Thread.sleep(5000);
//			csc.putcheckbox1().click();
//			Thread.sleep(3000);
//			csc.putcheckboxedit().click();
//			int randomNumber11 = randomvalue.nextInt(max - min + 1) + min;
//			String perusertech = Integer.toString(randomNumber11);
//			Thread.sleep(3000);
//			
//			WebElement putcheckboxmonthlyedit = csc.putcheckboxmonthlyedit();
//			putcheckboxmonthlyedit.sendKeys(perusertech);
//			String perusertechunitcostMonthlyValue = putcheckboxmonthlyedit.getAttribute("value");
//			System.out.println(perusertechunitcostMonthlyValue.length());
//			Assert.assertTrue(perusertechunitcostMonthlyValue.length() <= 12, "Input field accepted a number with an increase of 5 digits.");
//			Thread.sleep(2000);
//			csc.puteditsave().click();
//			// csc.putcheckboxdelete().click();
//			System.out.println("present");
//		} catch (org.openqa.selenium.NoSuchElementException e) {
//			System.out.println("Checkbox is not present on the page");
//		}
//
//	//ENTITY LEVEL SHARED TECHNOLOGIES		
//		WebElement entitylevel = csc.entitylevelsharedtechnologydropdown();
//		entitylevel.click();
//		Select dropdown1 = new Select(entitylevel);
//		List<WebElement> allOptions1 = dropdown.getOptions();
//		Random random1 = new Random();
//		int randomIndex1 = random1.nextInt(allOptions1.size());
//
//		try {
//			Thread.sleep(3000);
//			dropdown1.selectByIndex(randomIndex1);
//			int randomNumber11 = randomvalue.nextInt(max - min + 1) + min;
//			String perusertech = Integer.toString(randomNumber11);
//			
//			WebElement entitylevelsharedtechnologyUnitCostMonthly = csc.entitylevelsharedtechnologyUnitCostMonthly();
//			entitylevelsharedtechnologyUnitCostMonthly.sendKeys(perusertech);
//			String perusertechunitcostMonthlyValue = entitylevelsharedtechnologyUnitCostMonthly.getAttribute("value");
//			System.out.println(perusertechunitcostMonthlyValue.length());
//			Assert.assertTrue(perusertechunitcostMonthlyValue.length() <= 12, "Input field accepted a number with an increase of 5 digits.");
//
//			Thread.sleep(2000);
//			csc.entitylevelsharedtechnologyAdd().click();
//			System.out.println("present");
//		} catch (org.openqa.selenium.NoSuchElementException e) {
//			System.out.println("Checkbox is not present on the page");
//		}
//
//	// PER ASSET TECHNOLOGIES		
//		WebElement perassettech = csc.perAssettechdropdown();
//		perassettech.click();
//		Select perassettechnology = new Select(perassettech);
//
//		List<WebElement> allOptions2 = dropdown.getOptions();
//		Random random2 = new Random();
//		int randomIndex2 = random2.nextInt(allOptions2.size());
//
//		try {
//			int randomNumber11 = randomvalue.nextInt(max - min + 1) + min;
//			String perusertech = Integer.toString(randomNumber11);
//			Thread.sleep(3000);
//			perassettechnology.selectByIndex(randomIndex2);
//			
//			WebElement perAssettechUnitCostMonthly = csc.perAssettechUnitCostMonthly();
//			perAssettechUnitCostMonthly.sendKeys(perusertech);
//			String perusertechunitcostMonthlyValue = perAssettechUnitCostMonthly.getAttribute("value");
//			System.out.println(perusertechunitcostMonthlyValue.length());
//			Assert.assertTrue(perusertechunitcostMonthlyValue.length() <= 12, "Input field accepted a number with an increase of 5 digits.");
//			
//			Thread.sleep(2000);
//			csc.perAssettechAddButton().click();
//			System.out.println("present");
//		} catch (org.openqa.selenium.NoSuchElementException e) {
//			System.out.println("Checkbox is not present on the page");
//		}
//
//		Thread.sleep(1000);
//
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("window.scrollBy(0, 500);");
//
//		Thread.sleep(3000);
//		csc.save().click();
//		Thread.sleep(300);
//	
//		ExtentManager.test.createNode("Cost Of Security Control Negative Test Case Passed Successfully!");
//
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//        WebElement inputField = csc.TacticLevel();
//
//        inputField.sendKeys("14871846168");
//		  String enteredValue = inputField.getAttribute("value");
//        Assert.assertTrue(enteredValue.length() <= 5, "Input field accepted a number with an increase of 5 digits.");
//		
		
		
		

	
	
	
	
	
	
	
	
	
	
	}	

}
