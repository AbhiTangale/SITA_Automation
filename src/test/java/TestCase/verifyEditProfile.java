package TestCase;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import PageObjectModel.EditProfile;
import PageObjectModel.LoginPageObject;
import Resources.BaseClass;
import Resources.TestCaseData;
import extentManager.ExtentManager;

public class verifyEditProfile extends BaseClass{

	@Test
public void EditProfile() throws InterruptedException, AWTException {
	

	LoginPageObject lpo = new LoginPageObject(driver);
	Thread.sleep(3000);
	lpo.EnterUsername().sendKeys(TestCaseData.username);
	Thread.sleep(3000);
	lpo.EnterPassword().sendKeys(TestCaseData.password);
	Thread.sleep(3000);
	lpo.ClickSubmit().click();

	Thread.sleep(30000);
	
	EditProfile ep = new EditProfile(driver);

	Thread.sleep(5000);
	ep.RT().click();
	// ep.Email().isDisplayed();

	// ep.Role().isDisplayed();
	Thread.sleep(4000);
	ep.Click_Edit_Profile().click();

//	Thread.sleep(4000);
//
//	ep.FirstName().clear();
//
//	Thread.sleep(4000);
//	ep.FirstName().sendKeys(TestCaseData.FirstName);
//	Thread.sleep(4000);
//	ep.LastName().clear();
//
//	Thread.sleep(5000);
//	ep.LastName().sendKeys(TestCaseData.LastName);

	Thread.sleep(50000);
	ep.Profilephoto().click();
	Thread.sleep(10000);

	Robot Profilephoto = new Robot();

	Profilephoto.delay(2000);

	//StringSelection s = new StringSelection("C:\\Users\\hp\\OneDrive\\Desktop\\Testing.png");
	StringSelection s = new StringSelection("C:\\Users\\hp\\eclipse-workspace\\ClientAdminNETRUM\\src\\main\\java\\Resources\\Images for Test Case\\EditprofilePositiveTest.png");
	Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s, null);
	Profilephoto.keyPress(KeyEvent.VK_CONTROL);
	Profilephoto.keyPress(KeyEvent.VK_V);
	Profilephoto.keyRelease(KeyEvent.VK_CONTROL);
	Profilephoto.keyRelease(KeyEvent.VK_V);
	Profilephoto.keyPress(KeyEvent.VK_ENTER);
	// releasing enter
	Profilephoto.keyRelease(KeyEvent.VK_ENTER);
	Thread.sleep(3000);
	ep.phonenumber().clear();
	Thread.sleep(3000);
//	ep.phonenumber().sendKeys(TestCaseData.phonenumber);
	Thread.sleep(3000);
	ep.customSwitches().click();
	Thread.sleep(5000);
	ep.customSwitches().click();
	ExtentManager.test.createNode("Edit Profile is working");


//	      Thread.sleep(5000);
//		  WebElement a= ep.Translater();
//
//		  Thread.sleep(5000);     
//	      Select s1= new Select(a);
//	      Thread.sleep(5000);
//	      s1.selectByVisibleText("Hindi");
//	      
//	      Thread.sleep(5000);
//	      s1.selectByVisibleText("English");
//	      Thread.sleep(5000);            
//	      ep.submit().click();

	Thread.sleep(5000);
	ep.RT().click();

	Thread.sleep(2000);
	ep.ResetPassword().click();
	Thread.sleep(2000);
//	ep.OldPassword().sendKeys(TestCaseData.OldPassword);

	Thread.sleep(2000);
//	ep.newPassword().sendKeys(TestCaseData.newPassword);

	Thread.sleep(2000);
//	ep.ConfirmPassword().sendKeys(TestCaseData.ConfirmPassword);
	
	ExtentManager.test.createNode("Reset Password is working");

	Thread.sleep(5000);
	ep.RT().click();
	

	ep.ContactUs().click();

	Thread.sleep(5000);
//	ep.Description().sendKeys(TestCaseData.Description);

	Thread.sleep(5000);
	String exp = "info@netrum-tech.com";

	WebElement m = ep.ContactUsEmail();

	String act = m.getText();

	ExtentManager.test.createNode("For contact us email address: " + act);
	Assert.assertEquals(exp, act);

	Thread.sleep(5000);
	String exp1 = "C 910-911, Noida One Building, Noida Sector 62, Noida - 201309";

	WebElement w = ep.Address();

	String act1 = w.getText();

	ExtentManager.test.createNode("For contact us office address: " + act1);

	Assert.assertEquals(exp1, act1);

	Thread.sleep(8000);
	ep.submit().click();
	ExtentManager.test.createNode("Contact us is working");

	Thread.sleep(5000);

	ep.RT().click();
	Thread.sleep(2000);
	ep.Logout().click();

	Thread.sleep(2000);
	ExtentManager.test.createNode("Edit Profile Test Case Passed Successfully!");

//	EditProfile ep = new EditProfile(driver);
//
//	Thread.sleep(5000);
//	ep.RT().click();
//	// ep.Email().isDisplayed();
//
//	// ep.Role().isDisplayed();
//	Thread.sleep(1000);
//	ep.Click_Edit_Profile().click();
//
//	Thread.sleep(1000);
//
//	ep.FirstName().clear();
//
//	Thread.sleep(1000);
//	ep.FirstName().sendKeys(TestCaseData.FirstName);
//	Thread.sleep(2000);
//	ep.LastName().clear();
//
//	Thread.sleep(5000);
//	ep.LastName().sendKeys(TestCaseData.LastName);
//
//	ep.Profilephoto().click();
//	Thread.sleep(10000);
//
//	Robot Profilephoto = new Robot();
//
//	Profilephoto.delay(2000);
//
//	StringSelection s = new StringSelection("C:\\Users\\hp\\OneDrive\\Desktop\\Testing.png");
//
//	Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s, null);
//
//	Profilephoto.keyPress(KeyEvent.VK_CONTROL);
//
//	Profilephoto.keyPress(KeyEvent.VK_V);
//
//	Profilephoto.keyRelease(KeyEvent.VK_CONTROL);
//	Profilephoto.keyRelease(KeyEvent.VK_V);
//
//	Profilephoto.keyPress(KeyEvent.VK_ENTER);
//	// releasing enter
//	Profilephoto.keyRelease(KeyEvent.VK_ENTER);
//
//	Thread.sleep(5000);
//
//	ep.phonenumber().clear();
//	Thread.sleep(5000);
//
//	ep.phonenumber().sendKeys(TestCaseData.phonenumber);
//
//	Thread.sleep(5000);
//	ep.customSwitches().click();
//
//	Thread.sleep(5000);
//	ep.customSwitches().click();
//
//	Thread.sleep(5000);
////		  WebElement a= ep.Translater();
////
////		  Thread.sleep(5000);
//
////	      Select s1= new Select(a);
////	      Thread.sleep(5000);
////	      s1.selectByVisibleText("Hindi");
////	      
////	      Thread.sleep(5000);
////	      s1.selectByVisibleText("English");
////	      Thread.sleep(5000);
//
////	      ep.submit().click();
//
//	Thread.sleep(5000);
//	ep.RT().click();
//
//	Thread.sleep(1000);
//	ep.ResetPassword().click();
//	Thread.sleep(1000);
//	ep.OldPassword().sendKeys(TestCaseData.OldPassword);
//
//	Thread.sleep(1000);
//	ep.newPassword().sendKeys(TestCaseData.newPassword);
//
//	Thread.sleep(1000);
//	ep.ConfirmPassword().sendKeys(TestCaseData.ConfirmPassword);
//
//	Thread.sleep(5000);
//	ep.RT().click();
//	;
//
//	ep.ContactUs().click();
//
//	Thread.sleep(5000);
//	ep.Description().sendKeys(TestCaseData.Description);
//
//	Thread.sleep(5000);
//	String exp = "info@netrum-tech.com";
//
//	WebElement m = ep.ContactUsEmail();
//
//	String act = m.getText();
//
//	ExtentManager.test.createNode("For contact us email address: " + act);
//	Assert.assertEquals(exp, act);
//
//	Thread.sleep(5000);
//	String exp1 = "C 910-911, Noida One Building, Noida Sector 62, Noida - 201309";
//
//	WebElement w = ep.Address();
//
//	String act1 = w.getText();
//
//	ExtentManager.test.createNode("For contact us office address: " + act1);
//
//	Assert.assertEquals(exp1, act1);
//
//	Thread.sleep(8000);
//	ep.submit().click();
//	Thread.sleep(5000);
//
//	ep.RT().click();
//	Thread.sleep(2000);
//	ep.Logout().click();
//
//	Thread.sleep(2000);
//	ExtentManager.test.createNode("Edit Profile Test Case Pass");

}

}
