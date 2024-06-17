package TestCase;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import PageObjectModel.AssetSummaryValidation;
import PageObjectModel.LoginPageObject;
import Resources.BaseClass;
import Resources.TestCaseData;
import extentManager.ExtentManager;

public class VerifyAssetSummaryValidation extends BaseClass {

	@Test
	public void AssetSummaryValidation() throws InterruptedException {

	LoginPageObject lpo = new LoginPageObject(driver);
	Thread.sleep(3000);
	lpo.EnterUsername().sendKeys(TestCaseData.username);
	Thread.sleep(3000);
	lpo.EnterPassword().sendKeys(TestCaseData.password);
	Thread.sleep(3000);
	lpo.ClickSubmit().click();
	Thread.sleep(30000);
	AssetSummaryValidation asv = new AssetSummaryValidation(driver);
	Thread.sleep(3000);
	asv.Admin().click();
	Thread.sleep(5000);
	asv.entity_onboarding().click();
	Thread.sleep(5000);

	asv.asv().click();
	Thread.sleep(5000);
    asv.total1().sendKeys("8");
    String firstinput = driver.findElement(By.xpath("//div[5]//div[1]//p[1]")).getText();
    Assert.assertNotEquals(firstinput, "100%", "Percentage value is expected to not be 100%, but it is: " + firstinput);
    
	ExtentManager.test.createNode("When the 'Total' value and 'Enrolled' value in Input Field 1 are not equal, the expected value should be less than 100%, and the actual value is less than 100%");

	Thread.sleep(1000);
    asv.total2().sendKeys("9");
    String secondinput = driver.findElement(By.xpath("//div[10]//div[1]//p[1]")).getText();
    Assert.assertNotEquals(secondinput, "100%", "Percentage value is expected to not be 100%, but it is: " + secondinput);
	ExtentManager.test.createNode("When the 'Total' value and 'Enrolled' value in Input Field 2 are not equal, the expected value should be less than 100%, and the actual value is less than 100%");

    
	Thread.sleep(1000);
    asv.total3().sendKeys("4");
    String thirdinput = driver.findElement(By.xpath("//div[15]//div[1]//p[1]")).getText();
    Assert.assertNotEquals(thirdinput, "100%", "Percentage value is expected to not be 100%, but it is: " + thirdinput);
	ExtentManager.test.createNode("When the 'Total' value and 'Enrolled' value in Input Field 3 are not equal, the expected value should be less than 100%, and the actual value is less than 100%");


	Thread.sleep(1000);
    asv.total4().sendKeys("5");
    String forthinput = driver.findElement(By.xpath("//div[20]//div[1]//p[1]")).getText();
    Assert.assertNotEquals(forthinput, "100%", "Percentage value is expected to not be 100%, but it is: " + forthinput);
	ExtentManager.test.createNode("When the 'Total' value and 'Enrolled' value in Input Field 4 are not equal, the expected value should be less than 100%, and the actual value is less than 100%");

    
	Thread.sleep(1000);
    asv.total5().sendKeys("2");
    String fifthinput = driver.findElement(By.xpath("//div[25]//div[1]//p[1]")).getText();
    Assert.assertNotEquals(fifthinput, "100%", "Percentage value is expected to not be 100%, but it is: " + fifthinput);
	ExtentManager.test.createNode("When the 'Total' value and 'Enrolled' value in Input Field 5 are not equal, the expected value should be less than 100%, and the actual value is less than 100%");

    
	Thread.sleep(1000);
    asv.total6().sendKeys("5");
    String sixinput = driver.findElement(By.xpath("//div[30]//div[1]//p[1]")).getText();
    Assert.assertNotEquals(sixinput, "100%", "Percentage value is expected to not be 100%, but it is: " + sixinput);
	ExtentManager.test.createNode("When the 'Total' value and 'Enrolled' value in Input Field 6 are not equal, the expected value should be less than 100%, and the actual value is less than 100%");

	Thread.sleep(1000);
    asv.total7().sendKeys("6");
    String seveninput = driver.findElement(By.xpath("//div[35]//div[1]//p[1]")).getText();
    Assert.assertNotEquals(seveninput, "100%", "Percentage value is expected to not be 100%, but it is: " + seveninput);
	ExtentManager.test.createNode("When the 'Total' value and 'Enrolled' value in Input Field 7 are not equal, the expected value should be less than 100%, and the actual value is less than 100%");

	Thread.sleep(1000);
    asv.total8().sendKeys("7");
    String eightinput = driver.findElement(By.xpath("//div[40]//div[1]//p[1]")).getText();
    Assert.assertNotEquals(eightinput, "100%", "Percentage value is expected to not be 100%, but it is: " + eightinput);
	ExtentManager.test.createNode("When the 'Total' value and 'Enrolled' value in Input Field 8 are not equal, the expected value should be less than 100%, and the actual value is less than 100%");

	Thread.sleep(1000);
    asv.total9().sendKeys("3");
    String ninthinput = driver.findElement(By.xpath("//div[45]//div[1]//p[1]")).getText();
    Assert.assertNotEquals(ninthinput, "100%", "Percentage value is expected to not be 100%, but it is: " + ninthinput);
	ExtentManager.test.createNode("When the 'Total' value and 'Enrolled' value in Input Field 9 are not equal, the expected value should be less than 100%, and the actual value is less than 100%");

	Thread.sleep(1000);
    asv.total10().sendKeys("6");
    String tenthinput = driver.findElement(By.xpath("//div[50]//div[1]//p[1]")).getText();
    Assert.assertNotEquals(tenthinput, "100%", "Percentage value is expected to not be 100%, but it is: " + tenthinput);
	ExtentManager.test.createNode("When the 'Total' value and 'Enrolled' value in Input Field 10 are not equal, the expected value should be less than 100%, and the actual value is less than 100%");

    Thread.sleep(3000);
    List<WebElement> b= driver.findElements(By.xpath("//input[@id='default-checkbox']"));
	for(WebElement k:b) {
    k.click();
	}

	Thread.sleep(1000);
	String firstinput1 = driver.findElement(By.xpath("//div[5]//div[1]//p[1]")).getText();
	Assert.assertEquals(firstinput1, "100%", "Percentage value is expected to be 100%, but it is: " +firstinput1);
	ExtentManager.test.createNode("When the 'Total' value and 'Enrolled' value in Input Field 1 are equal, the expected value should be 100%, and the actual value is 100%");

	Thread.sleep(1000);
	String secondinput1 = driver.findElement(By.xpath("//div[10]//div[1]//p[1]")).getText();
	Assert.assertEquals(secondinput1, "100%", "Percentage value is expected to be 100%, but it is: " +secondinput1);
	ExtentManager.test.createNode("When the 'Total' value and 'Enrolled' value in Input Field 2 are equal, the expected value should be 100%, and the actual value is 100%");

	Thread.sleep(1000);
	String thirdinput1 = driver.findElement(By.xpath("//div[15]//div[1]//p[1]")).getText();
	Assert.assertEquals(thirdinput1, "100%", "Percentage value is expected to be 100%, but it is: " +thirdinput1);
	ExtentManager.test.createNode("When the 'Total' value and 'Enrolled' value in Input Field 3 are equal, the expected value should be 100%, and the actual value is 100%");

	Thread.sleep(1000);
	String forthinput1 = driver.findElement(By.xpath("//div[20]//div[1]//p[1]")).getText();
	Assert.assertEquals(forthinput1, "100%", "Percentage value is expected to be 100%, but it is: " +forthinput1);
	ExtentManager.test.createNode("When the 'Total' value and 'Enrolled' value in Input Field 4 are equal, the expected value should be 100%, and the actual value is 100%");

	Thread.sleep(1000);
	String fifthinput1 = driver.findElement(By.xpath("//div[25]//div[1]//p[1]")).getText();
	Assert.assertEquals(fifthinput1, "100%", "Percentage value is expected to be 100%, but it is: " +fifthinput1);
	ExtentManager.test.createNode("When the 'Total' value and 'Enrolled' value in Input Field 5 are equal, the expected value should be 100%, and the actual value is 100%");

	Thread.sleep(1000);
	String sixinput1 = driver.findElement(By.xpath("//div[30]//div[1]//p[1]")).getText();
	Assert.assertEquals(sixinput1, "100%", "Percentage value is expected to be 100%, but it is: " +sixinput1);
	ExtentManager.test.createNode("When the 'Total' value and 'Enrolled' value in Input Field 6 are equal, the expected value should be 100%, and the actual value is 100%");

	Thread.sleep(1000);
	String seveninput1 = driver.findElement(By.xpath("//div[35]//div[1]//p[1]")).getText();
	Assert.assertEquals(seveninput1, "100%", "Percentage value is expected to be 100%, but it is: " +seveninput1);
	ExtentManager.test.createNode("When the 'Total' value and 'Enrolled' value in Input Field 7 are equal, the expected value should be 100%, and the actual value is 100%");

	Thread.sleep(1000);
	String eightinput1 = driver.findElement(By.xpath("//div[40]//div[1]//p[1]")).getText();
	Assert.assertEquals(eightinput1, "100%", "Percentage value is expected to be 100%, but it is: " +eightinput1);
	ExtentManager.test.createNode("When the 'Total' value and 'Enrolled' value in Input Field 8 are equal, the expected value should be 100%, and the actual value is 100%");

	Thread.sleep(1000);
	String ninthinput1 = driver.findElement(By.xpath("//div[45]//div[1]//p[1]")).getText();
	Assert.assertEquals(ninthinput1, "100%", "Percentage value is expected to be 100%, but it is: " +ninthinput1);
	ExtentManager.test.createNode("When the 'Total' value and 'Enrolled' value in Input Field 9 are equal, the expected value should be 100%, and the actual value is 100%");
	
	Thread.sleep(1000);
	String tenthinput1 = driver.findElement(By.xpath("//div[50]//div[1]//p[1]")).getText();
	Assert.assertEquals(tenthinput1, "100%", "Percentage value is expected to be 100%, but it is: " +tenthinput1);
	ExtentManager.test.createNode("When the 'Total' value and 'Enrolled' value in Input Field 10 are equal, the expected value should be 100%, and the actual value is 100%");

	
	ExtentManager.test.createNode("Asset Summary Validation Test Case Passed Successfully!");

	
	}
}
	
	
	
	
	
	
	
	
	
	
	
	
	

//  (//p[normalize-space()='100%'])[1] 

//String ab = driver.findElement(By.xpath("//div[5]//div[1]//p[1]")).getText();
//System.out.println(ab);
  
//Thread.sleep(5000);
//
//
//	
//	
//String ab = driver.findElement(By.xpath("//div[5]//div[1]//p[1]")).getText();
//
//WebElement searchTextBox= driver.findElement(By.xpath("(//input[@type='number'])[1]"));	
//Thread.sleep(5000);
//
//String typeValue=searchTextBox.getAttribute("value");
//	
//System.out.println(typeValue);
////String value = "10"; // Replace with your desired value
////inputField1.sendKeys(value);
////inputField2.sendKeys(value);
//
//
//Thread.sleep(500);
//
//Assert.assertEquals(ab, "100%", "Percentage value is not 100% when values match.");
//	
//	
//	
	
	
	
	
	
	
	
	
  
  
//	  try {
//		  WebElement inputField2 = driver.findElement(By.xpath("//div[@class='sc-elYLMi lkaGCU']/parent::div[@class='sc-dvwKko bPuugb']"));
//		  WebElement inputField1 = driver.findElement(By.xpath("//div[@class='sc-elYLMi iBmVUg']/parent::div[@class='sc-dvwKko bPuugb']"));
//
//          // Locate the two input fields by their IDs (you can use other locators)
//                
//          
//          
//      	  Thread.sleep(500);
//
//          String value1 = inputField1.getText();
//      	  Thread.sleep(500);
//
//          String value2 = inputField2.getText();
//
//          // Compare the values
//          if (value1.equals(value2)) {
//              System.out.println("Both input fields have the same number: " + value1);
//          } else {
//              System.out.println("Input fields have different numbers."+ value2);
//          }
//      } catch (Exception e) {
//          e.printStackTrace();
//      }
//	
	
	
	
	
	
	
	
	

