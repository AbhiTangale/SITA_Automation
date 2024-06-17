package TestCase;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import PageObjectModel.LoginPageObject;
import PageObjectModel.Riskpageobject;
import Resources.BaseClass;
import Resources.TestCaseData;
import extentManager.ExtentManager;

public class VerifyRisk extends BaseClass {
	
@Test
public void Risk() throws InterruptedException {

	LoginPageObject lpo = new LoginPageObject(driver);
	Thread.sleep(2000);
	lpo.EnterUsername().sendKeys(TestCaseData.username);
	Thread.sleep(2000);
	lpo.EnterPassword().sendKeys(TestCaseData.password);
	Thread.sleep(2000);
	lpo.ClickSubmit().click();
	Thread.sleep(30000);

	int arrayslider[] = { 0, 200, 400, 600, 800, 1000 };
	int randomvalue = (int) (Math.random() * (5 - 0 + 1) + 0);

	Riskpageobject r = new Riskpageobject(driver);
	
	Thread.sleep(5000);
	r.clickRisk().click();
	Thread.sleep(30000);
	r.riskjourney().click();
	Thread.sleep(800);
	ExtentManager.test.createNode("Risk Control button is working");

	
	Thread.sleep(8000);
	r.CISO_ceo().click();
	Thread.sleep(100);
	r.CISO_cfo().click();

	Thread.sleep(100);
	r.CISO_board().click();
	Thread.sleep(100);
	r.CISO_cio().click();

	Thread.sleep(1000);
	r.CISO_cro().click();

	Thread.sleep(100);
	r.CISO_audit().click();
	Thread.sleep(100);
	r.CISO_others().click();

	Thread.sleep(100);
	r.SteeringCommittee_yes().click();
	Thread.sleep(100);
	r.SteeringCommittee_no().click();
	Thread.sleep(200);
	r.members_ceo().click();
	r.members_cfo().click();
	r.members_board().click();
	r.members_cio().click();
	r.members_cio().click();
	r.members_audit().click();
	r.members_others().click();
	
	Thread.sleep(5000);
	WebElement meet_slider = r.meet_slider();
	Thread.sleep(5000);
	Actions action = new Actions(driver);
	randomvalue = (int) (Math.random() * (5 - 0 + 1) + 0);
	action.dragAndDropBy(meet_slider, 0, 0).perform();
	action.dragAndDropBy(meet_slider, arrayslider[randomvalue], 0).perform();
	Thread.sleep(5000);
	
	JavascriptExecutor js = (JavascriptExecutor) driver;
	Thread.sleep(5000);
	js.executeScript("window.scrollBy(0,800)", "");
	
	WebElement audit_slider = r.audit_slider();
	Thread.sleep(5000);
	Actions action1 = new Actions(driver);
	randomvalue = (int) (Math.random() * (5 - 0 + 1) + 0);
	action1.dragAndDropBy(audit_slider, 0, 0).perform();
	action1.dragAndDropBy(audit_slider, arrayslider[randomvalue], 0).perform();
	
	Thread.sleep(2000);
    int pixelsToScrollUp = -500; // Negative value scrolls up
    js.executeScript("window.scrollBy(0, arguments[0]);", pixelsToScrollUp);


	Thread.sleep(2000);
	r.direct_reports().clear();
	Thread.sleep(500);
//	r.direct_reports().sendKeys(TestCaseData.direct_reports);
	Thread.sleep(500);
	r.indirect_reports().clear();
	Thread.sleep(500);
//	r.indirect_reports().sendKeys(TestCaseData.indirect_reports);
	Thread.sleep(500);
	r.CYBERSECURITY_CISOOrg().click();
	Thread.sleep(500);
	r.CYBERSECURITY_OutsideCISOOrg().click();
	Thread.sleep(500);
	r.CYBERSECURITY_NA().click();
	Thread.sleep(500);
	r.COMPLIANCE_CISOOrg().click();
	Thread.sleep(500);
	r.COMPLIANCE_OutsideCISOOrg().click();
	Thread.sleep(500);
	r.COMPLIANCE_NA().click();
	Thread.sleep(500);
	r.RISK_CISOOrg().click();
	Thread.sleep(500);
	r.RISK_CISOOrg_OutsideCISOOrg().click();
	Thread.sleep(500);
	r.RISK_NA().click();
	Thread.sleep(500);
	r.SOC_CISOOrg().click();
	Thread.sleep(500);
	r.SOC_CISOOrg_OutsideCISOOrg().click();
	Thread.sleep(500);
	r.SOC_NA().click();
	Thread.sleep(500);
	r.OTSECURITY_CISOOrg().click();
	Thread.sleep(500);
	r.OTSECURITY_OutsideCISOOrg().click();
	Thread.sleep(500);
	r.OTSECURITY_NA().click();
	Thread.sleep(500);
	r.FRAUD_CISOOrg().click();
	Thread.sleep(500);
	Thread.sleep(500);
	Thread.sleep(100);
	r.FRAUD_NA().click();
	Thread.sleep(500);
	
//	js.executeScript("window.scrollBy(800)", "");
//	Thread.sleep(2000);

	
	r.Budget().clear();
	Thread.sleep(2000);

//    int pixelsToScrollUp1 = -500; // Negative value scrolls up
//	js.executeScript("window.scrollBy(0, arguments[0]);", pixelsToScrollUp1);

	Thread.sleep(3000);
//	r.Budget().sendKeys(TestCaseData.Budget);
	Thread.sleep(5000);
	r.ISO_27001().click();
	Thread.sleep(5000);
//	r.ISO_27001_cycle().sendKeys(TestCaseData.ISO_27001_cycle);
	Thread.sleep(5000);
	r.ISO31000().click();
	Thread.sleep(2000);
//	r.ISO31000_cycle().sendKeys(TestCaseData.ISO31000_cycle);
	Thread.sleep(2000);
	r.ISO31000_cycle().clear();
//	        Thread.sleep(2000);
//			r.SOC1TYPE1().click();
//	Thread.sleep(5000);
//	r.SOC1TYPE1().click();
//	Thread.sleep(2000);
//	r.SOC1TYPE1_cycle().sendKeys(TestCaseData.SOC1TYPE1_cycle);
//	Thread.sleep(1000);
//	Thread.sleep(500);
//	r.SOC2TYPE1().click();
//	Thread.sleep(2000);
//	r.SOC2TYPE1_cycle().sendKeys(TestCaseData.SOC2TYPE1_cycle);
//	Thread.sleep(500);
//	r.SOC2TYPE2().click();
//	Thread.sleep(2000);
//	r.SOC2TYPE2_cycle().sendKeys(TestCaseData.SOX_cycle);
//	Thread.sleep(500);
//	r.HITRUST().click();
//	Thread.sleep(500);
//	r.HITRUST_cycle().sendKeys(TestCaseData.HITRUST_cycle);
//	Thread.sleep(500);
//	r.HIPAA().click();
//	Thread.sleep(500);
//	r.HIPAA_cycle().sendKeys(TestCaseData.HIPAA_cycle);
//	Thread.sleep(500);
//	r.PCIDSS().click();
//	Thread.sleep(500);
//	r.PCIDSS_cycle().sendKeys(TestCaseData.PCIDSS_cycle);
//	Thread.sleep(500);
//	r.SOX().click();
//	Thread.sleep(500);
//	r.SOX_cycle().sendKeys(TestCaseData.SOX_cycle);
////	Thread.sleep(500);
////	js.executeScript("window.scrollBy(-500)", "");


	Thread.sleep(500);
	r.save().click();
	Thread.sleep(15000);
	r.Next().click();
	Thread.sleep(5000);
	ExtentManager.test.createNode("Risk Control Security Management Page Passed Successfully!");

	
	
	// Active_Directory
	Thread.sleep(5000);
	WebElement Active_Directory_1 = r.risk_slider_1();
	Thread.sleep(1000);
	Actions action_0 = new Actions(driver);
	randomvalue = (int) (Math.random() * (5 - 0 + 1) + 0);
	action_0.dragAndDropBy(Active_Directory_1, arrayslider[randomvalue], randomvalue).perform();

	Thread.sleep(5000);
	WebElement Active_Directory_2 = r.risk_slider_2();
	Thread.sleep(1000);
	Actions action_01 = new Actions(driver);
	randomvalue = (int) (Math.random() * (5 - 0 + 1) + 0);
	action_01.dragAndDropBy(Active_Directory_2, arrayslider[randomvalue], randomvalue).perform();

	Thread.sleep(5000);
	WebElement Active_Directory_3 = r.risk_slider_3();
	Thread.sleep(1000);
	Actions action2 = new Actions(driver);
	randomvalue = (int) (Math.random() * (5 - 0 + 1) + 0);
	action2.dragAndDropBy(Active_Directory_3, arrayslider[randomvalue], randomvalue).perform();

	Thread.sleep(5000);
	WebElement Active_Directory_4 = r.risk_slider_4();
	Thread.sleep(1000);
	Actions action3 = new Actions(driver);
	randomvalue = (int) (Math.random() * (5 - 0 + 1) + 0);
	action3.dragAndDropBy(Active_Directory_4, arrayslider[randomvalue], randomvalue).perform();

	Thread.sleep(5000);
	WebElement Active_Directory_5 = r.risk_slider_5();
	Thread.sleep(1000);
	Actions action4 = new Actions(driver);
	randomvalue = (int) (Math.random() * (5 - 0 + 1) + 0);
	action4.dragAndDropBy(Active_Directory_5, arrayslider[randomvalue], randomvalue).perform();
	Thread.sleep(1000);
	r.save().click();
	Thread.sleep(15000);
	r.Next().click();
	Thread.sleep(5000);
	ExtentManager.test.createNode("Active Directory Page Passed Successfully!");

	
	
	// User Security
	Thread.sleep(5000);
	WebElement user_security_1 = r.risk_slider_1();
	Thread.sleep(1000);
	Actions action5 = new Actions(driver);
	randomvalue = (int) (Math.random() * (5 - 0 + 1) + 0);
	action5.dragAndDropBy(user_security_1, arrayslider[randomvalue], randomvalue).perform();

	Thread.sleep(5000);
	WebElement user_security_2 = r.risk_slider_2();
	Thread.sleep(1000);
	Actions action6 = new Actions(driver);
	randomvalue = (int) (Math.random() * (5 - 0 + 1) + 0);
	action6.dragAndDropBy(user_security_2, arrayslider[randomvalue], randomvalue).perform();

	Thread.sleep(5000);
	WebElement user_security_3 = r.risk_slider_3();
	Thread.sleep(1000);
	Actions action7 = new Actions(driver);
	randomvalue = (int) (Math.random() * (5 - 0 + 1) + 0);
	action7.dragAndDropBy(user_security_3, arrayslider[randomvalue], randomvalue).perform();

	Thread.sleep(5000);
	WebElement user_security_4 = r.risk_slider_4();
	Thread.sleep(1000);
	Actions action8 = new Actions(driver);
	randomvalue = (int) (Math.random() * (5 - 0 + 1) + 0);
	action8.dragAndDropBy(user_security_4, arrayslider[randomvalue], randomvalue).perform();

	Thread.sleep(5000);
	WebElement user_security_5 = r.risk_slider_5();
	Thread.sleep(1000);
	Actions action9 = new Actions(driver);
	randomvalue = (int) (Math.random() * (5 - 0 + 1) + 0);
	action9.dragAndDropBy(user_security_5, arrayslider[randomvalue], randomvalue).perform();
	Thread.sleep(1000);
	r.save().click();
	Thread.sleep(15000);
	r.Next().click();
	Thread.sleep(5000);
	ExtentManager.test.createNode("User Security Page Passed Successfully!");


	// Endpoint Security
	Thread.sleep(5000);
	WebElement endpoint_security = r.risk_slider_1();
	Thread.sleep(1000);
	Actions action10 = new Actions(driver);
	randomvalue = (int) (Math.random() * (5 - 0 + 1) + 0);
	action10.dragAndDropBy(endpoint_security, arrayslider[randomvalue], randomvalue).perform();

	Thread.sleep(5000);
	WebElement endpoint_security_1 = r.risk_slider_2();
	Thread.sleep(1000);
	Actions action11 = new Actions(driver);
	randomvalue = (int) (Math.random() * (5 - 0 + 1) + 0);
	action11.dragAndDropBy(endpoint_security_1, arrayslider[randomvalue], randomvalue).perform();
	Thread.sleep(5000);
	WebElement endpoint_security_2 = r.risk_slider_3();
	Thread.sleep(1000);
	Actions action12 = new Actions(driver);
	randomvalue = (int) (Math.random() * (5 - 0 + 1) + 0);
//			action12.dragAndDropBy(endpoint_security_2, -1000, 0).perform();		
	action12.dragAndDropBy(endpoint_security_2, arrayslider[randomvalue], randomvalue).perform();
	Thread.sleep(5000);
	WebElement endpoint_security_3 = r.risk_slider_4();
	Thread.sleep(1000);
	Actions action13 = new Actions(driver);
	randomvalue = (int) (Math.random() * (5 - 0 + 1) + 0);
	action13.dragAndDropBy(endpoint_security_3, arrayslider[randomvalue], randomvalue).perform();
	Thread.sleep(5000);
	WebElement endpoint_security_4 = r.risk_slider_5();
	Thread.sleep(1000);
	Actions action14 = new Actions(driver);
	randomvalue = (int) (Math.random() * (5 - 0 + 1) + 0);
	action14.dragAndDropBy(endpoint_security_4, arrayslider[randomvalue], randomvalue).perform();
	Thread.sleep(1000);
	r.save().click();
	Thread.sleep(15000);
	r.Next().click();
	Thread.sleep(5000);
	ExtentManager.test.createNode("Endpoint Security Page Passed Successfully!");


	// Data Security
	Thread.sleep(5000);
	WebElement data_security = r.risk_slider_1();
	Thread.sleep(1000);
	Actions action15 = new Actions(driver);
	randomvalue = (int) (Math.random() * (5 - 0 + 1) + 0);
	action15.dragAndDropBy(data_security, arrayslider[randomvalue], randomvalue).perform();

	Thread.sleep(5000);
	WebElement data_security_1 = r.risk_slider_2();
	Thread.sleep(1000);
	Actions action16 = new Actions(driver);
	randomvalue = (int) (Math.random() * (5 - 0 + 1) + 0);
	action16.dragAndDropBy(data_security_1, arrayslider[randomvalue], randomvalue).perform();

	Thread.sleep(5000);
	WebElement data_security_3 = r.risk_slider_3();
	Thread.sleep(1000);
	Actions action17 = new Actions(driver);
	randomvalue = (int) (Math.random() * (5 - 0 + 1) + 0);
	action17.dragAndDropBy(data_security_3, arrayslider[randomvalue], randomvalue).perform();
	Thread.sleep(5000);
	WebElement data_security_4 = r.risk_slider_4();
	Thread.sleep(1000);
	Actions action18 = new Actions(driver);
	randomvalue = (int) (Math.random() * (5 - 0 + 1) + 0);
	action18.dragAndDropBy(data_security_4, arrayslider[randomvalue], randomvalue).perform();
	Thread.sleep(5000);
	WebElement data_security_5 = r.risk_slider_5();
	Thread.sleep(1000);
	Actions action19 = new Actions(driver);
	randomvalue = (int) (Math.random() * (5 - 0 + 1) + 0);
	action19.dragAndDropBy(data_security_5, arrayslider[randomvalue], randomvalue).perform();
	Thread.sleep(1000);
	r.save().click();
	Thread.sleep(15000);
	r.Next().click();
	Thread.sleep(5000);
	ExtentManager.test.createNode("Data Security Page Passed Successfully!");


	// Operational Security

	Thread.sleep(5000);
	WebElement operational_security_1 = r.risk_slider_1();
	Thread.sleep(1000);
	Actions action20 = new Actions(driver);
	randomvalue = (int) (Math.random() * (5 - 0 + 1) + 0);
	action20.dragAndDropBy(operational_security_1, arrayslider[randomvalue], randomvalue).perform();
	Thread.sleep(5000);
	WebElement operational_security_2 = r.risk_slider_2();
	Thread.sleep(1000);
	Actions action21 = new Actions(driver);
	randomvalue = (int) (Math.random() * (5 - 0 + 1) + 0);
	action21.dragAndDropBy(operational_security_2, arrayslider[randomvalue], randomvalue).perform();
	Thread.sleep(5000);
	WebElement operational_security_3 = r.risk_slider_3();
	Thread.sleep(1000);
	Actions action22 = new Actions(driver);
	randomvalue = (int) (Math.random() * (5 - 0 + 1) + 0);
	action22.dragAndDropBy(operational_security_3, arrayslider[randomvalue], randomvalue).perform();
	Thread.sleep(5000);
	WebElement operational_security_4 = r.risk_slider_4();
	Thread.sleep(1000);
	Actions action23 = new Actions(driver);
	randomvalue = (int) (Math.random() * (5 - 0 + 1) + 0);
	action23.dragAndDropBy(operational_security_4, arrayslider[randomvalue], randomvalue).perform();

	Thread.sleep(5000);
	WebElement operational_security_5 = r.risk_slider_5();
	Thread.sleep(1000);
	Actions action24 = new Actions(driver);
	randomvalue = (int) (Math.random() * (5 - 0 + 1) + 0);
	action24.dragAndDropBy(operational_security_5, arrayslider[randomvalue], randomvalue).perform();
	Thread.sleep(1000);
	r.save().click();
	Thread.sleep(15000);
	r.Next().click();
	Thread.sleep(5000);
	ExtentManager.test.createNode("Operational Security Page Passed Successfully!");


//Network Security					

	Thread.sleep(5000);
	WebElement network_security_1 = r.risk_slider_1();
	Thread.sleep(1000);
	Actions action25 = new Actions(driver);
	randomvalue = (int) (Math.random() * (5 - 0 + 1) + 0);
	action25.dragAndDropBy(network_security_1, arrayslider[randomvalue], randomvalue).perform();
	Thread.sleep(5000);
	WebElement network_security_2 = r.risk_slider_2();
	Thread.sleep(1000);
	Actions action26 = new Actions(driver);
	randomvalue = (int) (Math.random() * (5 - 0 + 1) + 0);
	action26.dragAndDropBy(network_security_2, arrayslider[randomvalue], randomvalue).perform();
	Thread.sleep(5000);
	WebElement network_security_3 = r.risk_slider_3();
	Thread.sleep(1000);
	Actions action27 = new Actions(driver);
	randomvalue = (int) (Math.random() * (5 - 0 + 1) + 0);
	action27.dragAndDropBy(network_security_3, arrayslider[randomvalue], randomvalue).perform();
	Thread.sleep(5000);
	WebElement network_security_4 = r.risk_slider_4();
	Thread.sleep(1000);
	Actions action28 = new Actions(driver);
	randomvalue = (int) (Math.random() * (5 - 0 + 1) + 0);
	action28.dragAndDropBy(network_security_4, arrayslider[randomvalue], randomvalue).perform();
	Thread.sleep(5000);
	WebElement network_security_5 = r.risk_slider_5();
	Thread.sleep(1000);
	Actions action29 = new Actions(driver);
	randomvalue = (int) (Math.random() * (5 - 0 + 1) + 0);
	action29.dragAndDropBy(network_security_5, arrayslider[randomvalue], randomvalue).perform();
	Thread.sleep(1000);
	r.save().click();
	Thread.sleep(15000);
	r.Next().click();
	Thread.sleep(5000);
	ExtentManager.test.createNode("Network Security Page Passed Successfully!");

//Software Security
	Thread.sleep(5000);
	driver.findElement(By.xpath("//div[contains(text(),'Software Security')]")).click();
	Thread.sleep(5000);
	WebElement software_security_1 = r.risk_slider_1();
	Thread.sleep(1000);
	Actions action30 = new Actions(driver);
	randomvalue = (int) (Math.random() * (5 - 0 + 1) + 0);
	action30.dragAndDropBy(software_security_1, arrayslider[randomvalue], randomvalue).perform();

	Thread.sleep(5000);
	WebElement software_security_2 = r.risk_slider_2();
	Thread.sleep(1000);
	Actions action31 = new Actions(driver);
	randomvalue = (int) (Math.random() * (5 - 0 + 1) + 0);
	action31.dragAndDropBy(software_security_2, arrayslider[randomvalue], randomvalue).perform();

	Thread.sleep(5000);
	WebElement software_security_3 = r.risk_slider_3();
	Thread.sleep(1000);
	Actions action32 = new Actions(driver);
	randomvalue = (int) (Math.random() * (5 - 0 + 1) + 0);
	action32.dragAndDropBy(software_security_3, arrayslider[randomvalue], randomvalue).perform();

	Thread.sleep(5000);
	WebElement software_security_4 = r.risk_slider_4();
	Thread.sleep(1000);
	Actions action33 = new Actions(driver);
	randomvalue = (int) (Math.random() * (5 - 0 + 1) + 0);
	action33.dragAndDropBy(software_security_4, arrayslider[randomvalue], randomvalue).perform();

	Thread.sleep(5000);
	WebElement software_security_5 = r.risk_slider_5();
	Thread.sleep(1000);
	Actions action34 = new Actions(driver);
	randomvalue = (int) (Math.random() * (5 - 0 + 1) + 0);
	action34.dragAndDropBy(software_security_5, arrayslider[randomvalue], randomvalue).perform();
	Thread.sleep(15000);
	r.save().click();
	Thread.sleep(5000);
	r.risk_Submit().click();
	Thread.sleep(5000);
	r.risk_ok().click();
	Thread.sleep(1000);
	ExtentManager.test.createNode("Software Security Page Passed Successfully!");


	Thread.sleep(2000);
	ExtentManager.test.createNode("Risk Test Passed Successfully!");

}
}
