package TestCase;

import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import PageObjectModel.CostOfSecurityControl;
import PageObjectModel.LoginPageObject;
import Resources.BaseClass;
import Resources.CommonUtilities;
import Resources.TestCaseData;
import extentManager.ExtentManager;

public class VerifyCostOfSecurityControl extends BaseClass{

	
@Test

public void CostOfSecurityControl() throws InterruptedException {
		

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
	int max = 100000;
//	int randomNumber = randomvalue.nextInt(max - min + 1) + min;
//	String randominputnumbers = Integer.toString(randomNumber);

	CostOfSecurityControl csc = new CostOfSecurityControl(driver);
	// INFORMATION SECURITY TEAM
	Thread.sleep(2000);
	csc.Admin().click();
	Thread.sleep(10000);
	csc.csc().click();
	Thread.sleep(5000);
	int randomNumber = randomvalue.nextInt(max - min + 1) + min;
	String tacticnumber = Integer.toString(randomNumber);
	csc.TacticLevel().sendKeys(tacticnumber);
	
	int randomNumber1 = randomvalue.nextInt(max - min + 1) + min;
	String strategicnumber = Integer.toString(randomNumber1);
	Thread.sleep(2000);
	csc.StrategicLevel().sendKeys(strategicnumber);
	
	int randomNumber2 = randomvalue.nextInt(max - min + 1) + min;
	String costannual1number = Integer.toString(randomNumber2);
	Thread.sleep(2000);
	csc.costannual1().sendKeys(costannual1number);
	
	int randomNumber3 = randomvalue.nextInt(max - min + 1) + min;
	String costannual2number = Integer.toString(randomNumber3);
	Thread.sleep(2000);
	csc.costannual2().sendKeys(costannual2number);
	
	ExtentManager.test.createNode("Cost Of Security Control - Information Security Team is working");

	

	// COST PER SECURITY PROCESS
	
	int randomNumber4 = randomvalue.nextInt(max - min + 1) + min;
	String socnumber = Integer.toString(randomNumber4);
	Thread.sleep(2000);
	csc.soc().sendKeys(socnumber);
	Thread.sleep(2000);
	
	int randomNumber5 = randomvalue.nextInt(max - min + 1) + min;
	String netsegnumber = Integer.toString(randomNumber5);
	csc.netseg().sendKeys(netsegnumber);
	
	int randomNumber6 = randomvalue.nextInt(max - min + 1) + min;
	String othercost = Integer.toString(randomNumber6);
	Thread.sleep(2000);
	csc.othercost().sendKeys(othercost);
	
	ExtentManager.test.createNode("Cost Of Security Control - COST PER SECURITY PROCESS is working");


	// INFORMATION SECURITY AWARENESS PROGRAM

	int randomNumber7 = randomvalue.nextInt(max - min + 1) + min;
	String totalemployee = Integer.toString(randomNumber7);
	Thread.sleep(2000);
	csc.totalemployee().sendKeys(totalemployee);
	
	Thread.sleep(2000);
	csc.Coverage().sendKeys("80");
	
	int randomNumber8 = randomvalue.nextInt(max - min + 1) + min;
	String totalcostannualCoverage = Integer.toString(randomNumber8);
	Thread.sleep(2000);
	csc.totalcostannualCoverage().sendKeys(totalcostannualCoverage);
	
	
	ExtentManager.test.createNode("Cost Of Security Control - INFORMATION SECURITY AWARENESS PROGRAM is working");

	
	
	
	
	Thread.sleep(5000);
	WebElement dropdownElement = driver.findElement(By.xpath("//select[@id='user_dropdown']"));

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
				csc.perusertechonologyunitcostMonthly().sendKeys(perusertech);
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

	while (attempts < maxAttempts) {
		int randomIndex = random.nextInt(select.getOptions().size());

		try {
			select.selectByIndex(randomIndex);

			if (select.getFirstSelectedOption().isEnabled()) {
				int randomNumber9 = randomvalue.nextInt(max - min + 1) + min;
				String perusertech = Integer.toString(randomNumber9);
				Thread.sleep(3000);
				select.selectByIndex(randomIndex);
				csc.perusertechonologyunitcostMonthly().sendKeys(perusertech);
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

// check Checkbox	604
	try {
		Thread.sleep(5000);
		csc.putcheckbox1().click();
		Thread.sleep(3000);
		csc.putcheckboxedit().click();
		int randomNumber11 = randomvalue.nextInt(max - min + 1) + min;
		String perusertech = Integer.toString(randomNumber11);
		Thread.sleep(3000);
		csc.putcheckboxmonthlyedit().sendKeys(perusertech);
		Thread.sleep(2000);
		csc.puteditsave().click();
		// csc.putcheckboxdelete().click();
		System.out.println("present");
	} catch (org.openqa.selenium.NoSuchElementException e) {
		System.out.println("Checkbox is not present on the page");
	}

	
	ExtentManager.test.createNode("Cost Of Security Control - PER USER TECHNOLOGIES is working");

// Entity level    

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
				csc.entitylevelsharedtechnologyUnitCostMonthly().sendKeys(perusertech);
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
	ExtentManager.test.createNode("Cost Of Security Control - ENTITY LEVEL SHARED TECHNOLOGIES is working");
	

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
				Thread.sleep(3000);
				asset.selectByIndex(randomIndex);
				csc.perAssettechUnitCostMonthly().sendKeys(perusertech);
				Thread.sleep(2000);
				csc.perAssettechAddButton().click();
				System.out.println("Successfully selected an enabled option.");

				break;

			}
		} catch (java.lang.UnsupportedOperationException e) {
			System.out.println("Caught ElementNotInteractableException. Trying another option.");
		}

		attempts++;
	}
    
	ExtentManager.test.createNode("Cost Of Security Control - PER ASSET TECHNOLOGIES is working");

	

	Thread.sleep(3000);
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("window.scrollBy(0,800)", "");
	Thread.sleep(3000);
	csc.save().click();
	Thread.sleep(300);
	ExtentManager.test.createNode("Cost Of Security Control Test Case Passed Successfully!");
	
	
	
	
}
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
    
    
    

	// PER USER TECHNOLOGIES

//	WebElement dropdownElement = csc.perusertechDropdown();
//	dropdownElement.click();
//	Select dropdown = new Select(dropdownElement);
//	List<WebElement> allOptions = dropdown.getOptions();
//	Random random = new Random();
//	int randomIndex = random.nextInt(allOptions.size());
//
//	try {
//		int randomNumber9 = randomvalue.nextInt(max - min + 1) + min;
//		String perusertech = Integer.toString(randomNumber9);
//		Thread.sleep(3000);
//		dropdown.selectByIndex(randomIndex);
//		csc.perusertechonologyunitcostMonthly().sendKeys(perusertech);
//		Thread.sleep(2000);
//		csc.perusertechAddbutton().click();
//		System.out.println("present");
//	} catch (org.openqa.selenium.NoSuchElementException e) {
//		System.out.println("Checkbox is not present on the page");
//	}
//
//	Thread.sleep(5000);
//	try {
//		int randomNumber10 = randomvalue.nextInt(max - min + 1) + min;
//		String perusertech = Integer.toString(randomNumber10);
//		Thread.sleep(3000);
//		dropdown.selectByIndex(randomIndex);
//		csc.perusertechonologyunitcostMonthly().sendKeys(perusertech);
//		Thread.sleep(2000);
//		csc.perusertechAddbutton().click();
//		System.out.println("present");
//	} catch (org.openqa.selenium.NoSuchElementException e) {
//		System.out.println("Checkbox is not present on the page");
//	}
//
//	Thread.sleep(5000);
//
//	try {
//		int randomNumber10 = randomvalue.nextInt(max - min + 1) + min;
//		String perusertech = Integer.toString(randomNumber10);
//		Thread.sleep(3000);
//		dropdown.selectByIndex(randomIndex);
//		csc.perusertechonologyunitcostMonthly().sendKeys(perusertech);
//		Thread.sleep(2000);
//		csc.perusertechAddbutton().click();
//		System.out.println("present");
//	} catch (org.openqa.selenium.NoSuchElementException e) {
//		System.out.println("Checkbox is not present on the page");
//	}
//
//	Thread.sleep(5000);
//
//	try {
//		int randomNumber11 = randomvalue.nextInt(max - min + 1) + min;
//		String perusertech = Integer.toString(randomNumber11);
//		Thread.sleep(3000);
//		dropdown.selectByIndex(randomIndex);
//		csc.perusertechonologyunitcostMonthly().sendKeys(perusertech);
//		Thread.sleep(2000);
//		csc.perusertechAddbutton().click();
//		System.out.println("present");
//	} catch (org.openqa.selenium.NoSuchElementException e) {
//		System.out.println("Checkbox is not present on the page");
//	}
//
//	Thread.sleep(5000);
//	try {
//		int randomNumber11 = randomvalue.nextInt(max - min + 1) + min;
//		String perusertech = Integer.toString(randomNumber11);
//		Thread.sleep(3000);
//		dropdown.selectByIndex(randomIndex);
//		csc.perusertechonologyunitcostMonthly().sendKeys(perusertech);
//		Thread.sleep(2000);
//		csc.perusertechAddbutton().click();
//		System.out.println("present");
//	} catch (org.openqa.selenium.NoSuchElementException e) {
//		System.out.println("Checkbox is not present on the page");
//	}
//
//	Thread.sleep(5000);
//	try {
//		int randomNumber11 = randomvalue.nextInt(max - min + 1) + min;
//		String perusertech = Integer.toString(randomNumber11);
//		Thread.sleep(3000);
//		dropdown.selectByIndex(randomIndex);
//		csc.perusertechonologyunitcostMonthly().sendKeys(perusertech);
//		Thread.sleep(2000);
//		csc.perusertechAddbutton().click();
//		System.out.println("present");
//	} catch (org.openqa.selenium.NoSuchElementException e) {
//		System.out.println("Checkbox is not present on the page");
//	}
//
//	Thread.sleep(5000);
//	try {
//		int randomNumber11 = randomvalue.nextInt(max - min + 1) + min;
//		String perusertech = Integer.toString(randomNumber11);
//		Thread.sleep(3000);
//		dropdown.selectByIndex(randomIndex);
//		csc.perusertechonologyunitcostMonthly().sendKeys(perusertech);
//		Thread.sleep(2000);
//		csc.perusertechAddbutton().click();
//		System.out.println("present");
//	} catch (org.openqa.selenium.NoSuchElementException e) {
//		System.out.println("Checkbox is not present on the page");
//	}
//
//// 	 check Checkbox	604
//	try {
//		Thread.sleep(5000);
//		csc.putcheckbox1().click();
//		Thread.sleep(3000);
//		csc.putcheckboxedit().click();
//		int randomNumber11 = randomvalue.nextInt(max - min + 1) + min;
//		String perusertech = Integer.toString(randomNumber11);
//		Thread.sleep(3000);
//		csc.putcheckboxmonthlyedit().sendKeys(perusertech);
//		Thread.sleep(2000);
//		csc.puteditsave().click();
//		// csc.putcheckboxdelete().click();
//		System.out.println("present");
//	} catch (org.openqa.selenium.NoSuchElementException e) {
//		System.out.println("Checkbox is not present on the page");
//	}
//
////ENTITY LEVEL SHARED TECHNOLOGIES		
//	WebElement entitylevel = csc.entitylevelsharedtechnologydropdown();
//	entitylevel.click();
//	Select dropdown1 = new Select(entitylevel);
//	List<WebElement> allOptions1 = dropdown.getOptions();
//	Random random1 = new Random();
//	int randomIndex1 = random1.nextInt(allOptions1.size());
//
//	try {
//		Thread.sleep(3000);
//		dropdown1.selectByIndex(randomIndex1);
//		int randomNumber11 = randomvalue.nextInt(max - min + 1) + min;
//		String perusertech = Integer.toString(randomNumber11);
//		csc.entitylevelsharedtechnologyUnitCostMonthly().sendKeys(perusertech);
//		Thread.sleep(2000);
//		csc.entitylevelsharedtechnologyAdd().click();
//		System.out.println("present");
//	} catch (org.openqa.selenium.NoSuchElementException e) {
//		System.out.println("Checkbox is not present on the page");
//	}
//
//// PER ASSET TECHNOLOGIES		
//	WebElement perassettech = csc.perAssettechdropdown();
//	perassettech.click();
//	Select perassettechnology = new Select(perassettech);
//
//	List<WebElement> allOptions2 = dropdown.getOptions();
//	Random random2 = new Random();
//	int randomIndex2 = random2.nextInt(allOptions2.size());
//
//	try {
//		int randomNumber11 = randomvalue.nextInt(max - min + 1) + min;
//		String perusertech = Integer.toString(randomNumber11);
//		Thread.sleep(3000);
//		perassettechnology.selectByIndex(randomIndex2);
//		csc.perAssettechUnitCostMonthly().sendKeys(perusertech);
//		Thread.sleep(2000);
//		csc.perAssettechAddButton().click();
//		System.out.println("present");
//	} catch (org.openqa.selenium.NoSuchElementException e) {
//		System.out.println("Checkbox is not present on the page");
//	}
//
//	Thread.sleep(1000);
//
//	JavascriptExecutor js = (JavascriptExecutor) driver;
//	js.executeScript("window.scrollBy(0, 500);");
//
//	Thread.sleep(3000);
//	csc.save().click();
//	Thread.sleep(8000);
//	csc.ok().click();
//		
//		
//	ExtentManager.test.createNode("Cost Of Security Control Test Case Passed Successfully!");
//	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//
//       
//        js.executeScript("window.scrollBy(0, 500);");
//		
//		
//		Thread.sleep(5000);
//		try {
//			Thread.sleep(3000);
//			csc.putcheckbox1().click();
//			Thread.sleep(3000);
//			csc.putcheckboxdelete().click();
//			System.out.println("present");
//		} catch (org.openqa.selenium.NoSuchElementException e) {
//			System.out.println("Checkbox is not present on the page.");
//		}
//
//        js.executeScript("window.scrollBy(0, -500);");
//
//		Thread.sleep(5000);
//		try {
//			Thread.sleep(3000);
//			csc.putcheckbox2().click();
//			Thread.sleep(3000);
//			csc.putcheckboxdelete().click();
//			System.out.println("present");
//		} catch (org.openqa.selenium.NoSuchElementException e) {
//			System.out.println("Checkbox is not present on the page.");
//		}
//		
//        js.executeScript("window.scrollBy(0, 500);");
//
//		Thread.sleep(5000);
//		try {
//			Thread.sleep(3000);
//			csc.putcheckbox3().click();
//			Thread.sleep(3000);
//			csc.putcheckboxdelete().click();
//			System.out.println("present");
//		} catch (org.openqa.selenium.NoSuchElementException e) {
//			System.out.println("Checkbox is not present on the page.");
//		}
//		
//        js.executeScript("window.scrollBy(0, -500);");
//
//		Thread.sleep(5000);
//		try {
//			Thread.sleep(3000);
//			csc.putcheckbox4().click();
//			Thread.sleep(3000);
//			csc.putcheckboxdelete().click();
//			System.out.println("present");
//		} catch (org.openqa.selenium.NoSuchElementException e) {
//			System.out.println("Checkbox is not present on the page.");
//		}
//		
//        js.executeScript("window.scrollBy(0, 500);");
//
//		Thread.sleep(5000);
//		try {
//			Thread.sleep(3000);
//			csc.putcheckbox5().click();
//			Thread.sleep(3000);
//			csc.putcheckboxdelete().click();
//			System.out.println("present");
//		} catch (org.openqa.selenium.NoSuchElementException e) {
//			System.out.println("Checkbox is not present on the page.");
//		}
//		
//        js.executeScript("window.scrollBy(0, -500);");
//
//		Thread.sleep(5000);
//		try {
//			Thread.sleep(3000);
//			csc.putcheckbox6().click();
//			Thread.sleep(3000);
//			csc.putcheckboxdelete().click();
//			System.out.println("present");
//		} catch (org.openqa.selenium.NoSuchElementException e) {
//			System.out.println("Checkbox is not present on the page.");
//		}
//		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		try {
//			        putcheckbox.isDisplayed();
//					Thread.sleep(3000);
//					csc.putcheckbox().click();
//					Thread.sleep(3000);
//					csc.putcheckboxdelete().click();
//					System.out.println("present");
//	           
//	        } 
//
//		 catch (org.openqa.selenium.NoSuchElementException e) {
//	            System.out.println("Checkbox is not present on the page.");
//	        }
//		
		  
		
		
		
		
		
		
		

		
		
		
		
//		WebElement dropdownElement=  csc.perusertechDropdown();
//		dropdownElement.click();
//        Thread.sleep(3000);
//
//        Select dropdown = new Select(dropdownElement);
//        Thread.sleep(3000);
//        dropdown.selectByVisibleText("MFA");    
        
        
  	
		  
	
