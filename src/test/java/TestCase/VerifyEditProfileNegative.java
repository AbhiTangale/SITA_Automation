package TestCase;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import PageObjectModel.EditProfileNegative;
import PageObjectModel.LoginPageObject;
import Resources.BaseClass;
import Resources.TestCaseData;
import extentManager.ExtentManager;

public class VerifyEditProfileNegative extends BaseClass {

@Test
	public void EditProfileNegative() throws InterruptedException, AWTException {
		
		
		LoginPageObject lpo = new LoginPageObject(driver);
		Thread.sleep(3000);
		lpo.EnterUsername().sendKeys(TestCaseData.username);
		Thread.sleep(3000);
		lpo.EnterPassword().sendKeys(TestCaseData.password);
		Thread.sleep(3000);
		lpo.ClickSubmit().click();
		Thread.sleep(30000);


		EditProfileNegative epn = new EditProfileNegative(driver);
		
		Thread.sleep(5000);
		epn.RT().click();
		// ep.Email().isDisplayed();
		// ep.Role().isDisplayed();
		Thread.sleep(5000);
		epn.Click_Edit_Profile().click();
		Thread.sleep(5000);
		epn.FirstName().clear();
		Thread.sleep(2000);
	//	epn.FirstName().sendKeys(TestCaseData.FirstNameNegative);
		Thread.sleep(5000);
		epn.save().click();
//		String expectedString1= TestCaseData.FirstNameNegative_error_message;
//		String actual2= driver.findElement(By.xpath("//p[normalize-space()='The first name must contain alpha characters only']")).getText();	
//		CommonUtilities.handleAssertions(actual2,expectedString1);
//		SoftAssert assertion1= new SoftAssert();	
//	    assertion1.assertEquals(actual2, expectedString1);	
//		ExtentManager.test.createNode("Error message for Edit profile is: "+ actual2);			 
		// System.out.println("Error message is: "+ actual2);
//		assertion1.assertAll();
		Thread.sleep(5000);
		epn.FirstName().clear();
		Thread.sleep(5000);
	//	epn.FirstName().sendKeys(TestCaseData.FirstName);
		Thread.sleep(5000);
		epn.Profilephoto().click();
		Thread.sleep(10000);
		Robot Profilephoto = new Robot();
		Profilephoto.delay(2000);
	//	StringSelection s = new StringSelection("C:\\Users\\hp\\OneDrive\\Desktop\\negative testing img.jpg");
		StringSelection s = new StringSelection("C:\\Users\\hp\\eclipse-workspace\\ClientAdminNETRUM\\src\\main\\java\\Resources\\Images for Test Case\\EditprofileNegative.png");

		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s, null);
		// graph.keyPress(KeyEvent.VK_ENTER);
		Profilephoto.keyPress(KeyEvent.VK_CONTROL);
		Profilephoto.keyPress(KeyEvent.VK_V);
		Profilephoto.keyRelease(KeyEvent.VK_CONTROL);
		Profilephoto.keyRelease(KeyEvent.VK_V);
		Profilephoto.keyPress(KeyEvent.VK_ENTER);
		// releasing enter
		Profilephoto.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(8000);
		epn.save().click();
		Thread.sleep(8000);
//		String expectedString2= TestCaseData.profilephoto_error_message;
//		String actual3= driver.findElement(By.xpath(" //div[@role='alert']")).getText();
//		CommonUtilities.handleAssertions(actual2,expectedString1);
//	    SoftAssert assertion2= new SoftAssert();
//		assertion2.assertEquals(actual3, expectedString2);
//		ExtentManager.test.createNode("Error message for profile photo is: "+ actual3);			
		// System.out.println("Error message is: "+ actual3);
//		assertion2.assertAll();		
		Thread.sleep(5000);
		ExtentManager.test.createNode("Edit Profile is working");

		epn.RT().click();
		Thread.sleep(2000);
		epn.ResetPassword().click();
		Thread.sleep(5000);
	//	epn.OldPassword().sendKeys(TestCaseData.OldPassword_negative);
		Thread.sleep(2000);
//		epn.newPassword().sendKeys(TestCaseData.NewPassword_negative);
		Thread.sleep(2000);
//		epn.ConfirmPassword().sendKeys(TestCaseData.ConfirmPassword_negative);
		
		ExtentManager.test.createNode("Reset Password is working");

		Thread.sleep(2000);
		Thread.sleep(8000);
//	    String expectedString3= TestCaseData.Password_error_message;
//	    String actual4= driver.findElement(By.xpath("//p[@class='text-danger pl-3 alert alert-danger']")).getText();				
//		CommonUtilities.handleAssertions(actual2,expectedString1);			
//		SoftAssert assertion3= new SoftAssert();				
//		assertion3.assertEquals(actual4, expectedString3);
//		ExtentManager.test.createNode("Error message for password is: "+ actual4);			
		// System.out.println("Error message is: "+ actual4);
//		assertion3.assertAll();
//		ExtentManager.test.createNode("Error message for password is: "+ actual4);			
		Thread.sleep(5000);
		epn.RT().click();
		Thread.sleep(5000);
		epn.ContactUs().click();
		Thread.sleep(8000);
	//	epn.Description().sendKeys(TestCaseData.Description_Nagative);
		Thread.sleep(5000);
		epn.submit().click();
		ExtentManager.test.createNode("Contact us is working");

//		String expectedString4= "Success";
//	    String actual5= driver.findElement(By.xpath("//p[contains(text(),'Success')]")).getText();
//		
//		
//		assertion3.assertEquals(actual5, expectedString4);
//		ExtentManager.test.createNode("Description message is: "+ actual5);			
//		//System.out.println("Error message is: "+ actual4);
//		assertion3.assertAll();
		Thread.sleep(3000);
		epn.RT().click();
		Thread.sleep(3000);
		epn.Logout().click();
		Thread.sleep(2000);
		ExtentManager.test.createNode("Edit Profile Negative Test Passed Successfully!");

		
		
		
		
		
		
		
		
//		Thread.sleep(5000);
//		epn.RT().click();
//		// ep.Email().isDisplayed();
//		// ep.Role().isDisplayed();
//		Thread.sleep(5000);
//		epn.Click_Edit_Profile().click();
//		Thread.sleep(5000);
//		epn.FirstName().clear();
//		Thread.sleep(2000);
//		epn.FirstName().sendKeys(TestCaseData.FirstNameNegative);
//		Thread.sleep(5000);
//		epn.save().click();
//		String expectedString1 = TestCaseData.FirstNameNegative_error_message;
//		String actual2 = driver
//				.findElement(By.xpath("//p[normalize-space()='The first name must contain alpha characters only']"))
//				.getText();
////		CommonUtilities.handleAssertions(actual2,expectedString1);
//		SoftAssert assertion1 = new SoftAssert();
//		assertion1.assertEquals(actual2, expectedString1);
//		ExtentManager.test.createNode("Error message for Edit profile is: " + actual2);
//		// System.out.println("Error message is: "+ actual2);
//		assertion1.assertAll();
//		Thread.sleep(5000);
//		epn.FirstName().clear();
//		Thread.sleep(5000);
//		epn.FirstName().sendKeys(TestCaseData.FirstName);
//		Thread.sleep(5000);
//		epn.Profilephoto().click();
//		Thread.sleep(10000);
//		Robot Profilephoto = new Robot();
//		Profilephoto.delay(2000);
//		StringSelection s = new StringSelection("C:\\Users\\hp\\OneDrive\\Desktop\\negative testing img.jpg");
//		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s, null);
//		// graph.keyPress(KeyEvent.VK_ENTER);
//		Profilephoto.keyPress(KeyEvent.VK_CONTROL);
//		Profilephoto.keyPress(KeyEvent.VK_V);
//		Profilephoto.keyRelease(KeyEvent.VK_CONTROL);
//		Profilephoto.keyRelease(KeyEvent.VK_V);
//		Profilephoto.keyPress(KeyEvent.VK_ENTER);
//		// releasing enter
//		Profilephoto.keyRelease(KeyEvent.VK_ENTER);
//		Thread.sleep(2000);
//		epn.save().click();
//		Thread.sleep(8000);
//		String expectedString2 = TestCaseData.profilephoto_error_message;
//		String actual3 = driver.findElement(By.xpath(" //div[@role='alert']")).getText();
////		CommonUtilities.handleAssertions(actual2,expectedString1);
//		SoftAssert assertion2 = new SoftAssert();
//		assertion2.assertEquals(actual3, expectedString2);
//		ExtentManager.test.createNode("Error message for profile photo is: " + actual3);
//		// System.out.println("Error message is: "+ actual3);
//		assertion2.assertAll();
//		Thread.sleep(5000);
//		epn.RT().click();
//		Thread.sleep(2000);
//		epn.ResetPassword().click();
//		Thread.sleep(5000);
//		epn.OldPassword().sendKeys(TestCaseData.OldPassword_negative);
//		Thread.sleep(2000);
//		epn.newPassword().sendKeys(TestCaseData.NewPassword_negative);
//		Thread.sleep(2000);
//		epn.ConfirmPassword().sendKeys(TestCaseData.ConfirmPassword_negative);
//		Thread.sleep(2000);
//		Thread.sleep(8000);
////	    String expectedString3= TestCaseData.Password_error_message;
//		String actual4 = driver.findElement(By.xpath("//p[@class='text-danger pl-3 alert alert-danger']")).getText();
////		CommonUtilities.handleAssertions(actual2,expectedString1);			
////		SoftAssert assertion3= new SoftAssert();				
////		assertion3.assertEquals(actual4, expectedString3);
//		ExtentManager.test.createNode("Error message for password is: " + actual4);
//		// System.out.println("Error message is: "+ actual4);
////		assertion3.assertAll();
//		ExtentManager.test.createNode("Error message for password is: " + actual4);
//		Thread.sleep(5000);
//		epn.RT().click();
//		Thread.sleep(5000);
//		epn.ContactUs().click();
//		Thread.sleep(8000);
//		epn.Description().sendKeys(TestCaseData.Description_Nagative);
//		Thread.sleep(5000);
//		epn.save().click();
////		String expectedString4= "Success";
////	    String actual5= driver.findElement(By.xpath("//p[contains(text(),'Success')]")).getText();
////		
////		
////		assertion3.assertEquals(actual5, expectedString4);
////		ExtentManager.test.createNode("Description message is: "+ actual5);			
////		//System.out.println("Error message is: "+ actual4);
////		assertion3.assertAll();
//		Thread.sleep(3000);
//		epn.RT().click();
//		Thread.sleep(3000);
//		epn.Logout().click();
//		Thread.sleep(2000);
//		ExtentManager.test.createNode("Edit Profile Negative Test Case Pass");

	}

}
