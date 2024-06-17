package TestCase;

import org.testng.annotations.Test;

import PageObjectModel.Admin;
import PageObjectModel.LoginPageObject;
import Resources.BaseClass;
import Resources.TestCaseData;

public class VerifyAdmin extends BaseClass {

	
@Test
	
	public void admin() throws InterruptedException {
	    Thread.sleep(5000);
		LoginPageObject lpo = new LoginPageObject(driver);
		Thread.sleep(5000);
		lpo.EnterUsername().sendKeys(TestCaseData.username);
		Thread.sleep(5000);
		lpo.EnterPassword().sendKeys(TestCaseData.password);
		lpo.ClickSubmit().click();
		Thread.sleep(30000);

		Admin ad = new Admin(driver);

		Thread.sleep(5000);
		ad.clickAdmin().click();

		Thread.sleep(10000);
		ad.entity_onboarding().click();

//	Thread.sleep(5000);
//    ad.CompanyName().sendKeys(TestCaseData.CompanyName);
//		
//    Thread.sleep(5000);
//    ad.CompanySchema().sendKeys(TestCaseData.CompanySchema);		
//		
//    Thread.sleep(5000);
//    ad.Domain().sendKeys(TestCaseData.Domain);
//
//    Thread.sleep(10000);
//   ad.Package().click();
//
//    Thread.sleep(10000);
//	ad.Silver().click();

	}

}
