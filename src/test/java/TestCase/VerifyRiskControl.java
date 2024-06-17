package TestCase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import PageObjectModel.LoginPageObject;
import PageObjectModel.RiskControl;
import PageObjectModel.Riskpageobject;
import Resources.TestCaseData;

public class VerifyRiskControl {

	public WebDriver driver;
	
	public void Risk_Control() throws InterruptedException {

		LoginPageObject lpo = new LoginPageObject(driver);

		lpo.EnterUsername().sendKeys(TestCaseData.username);
		lpo.EnterPassword().sendKeys(TestCaseData.password);
		lpo.ClickSubmit().click();
		Thread.sleep(20000);

		int arrayslider[] = { 0, 200, 400, 600, 800, 1000 };
		int randomvalue = (int) (Math.random() * (5 - 0 + 1) + 0);

		RiskControl r = new RiskControl(driver);
		Thread.sleep(15000);
		r.Admin().click();
		Thread.sleep(5000);
		r.clickRiskControl().click();

		Thread.sleep(5000);
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
		WebElement audit_slider = r.audit_slider();

		Thread.sleep(5000);
		Actions action1 = new Actions(driver);
		randomvalue = (int) (Math.random() * (5 - 0 + 1) + 0);

		action1.dragAndDropBy(audit_slider, 0, 0).perform();

		action1.dragAndDropBy(audit_slider, arrayslider[randomvalue], 0).perform();

		Thread.sleep(500);

		r.direct_reports().clear();

		Thread.sleep(500);
//		r.direct_reports().sendKeys(TestCaseData.direct_reports);
		Thread.sleep(500);
		r.indirect_reports().clear();
		Thread.sleep(500);
//		r.indirect_reports().sendKeys(TestCaseData.indirect_reports);
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

//		Thread.sleep(500);
//		r.Budget().clear();
//		Thread.sleep(1000);
//		r.Budget().sendKeys(TestCaseData.Budget);
//
//		Thread.sleep(5000);
//		r.ISO_27001().click();
//		Thread.sleep(5000);
//		r.ISO_27001_cycle().sendKeys(TestCaseData.ISO_27001_cycle);
//
//		Thread.sleep(5000);
//		r.ISO31000().click();
//		Thread.sleep(2000);
//		r.ISO31000_cycle().sendKeys(TestCaseData.ISO31000_cycle);
//		Thread.sleep(2000);
//		r.ISO31000_cycle().clear();
//
////		Thread.sleep(2000);
////		r.SOC1TYPE1().click();
//		Thread.sleep(1000);
//		r.SOC1TYPE1().click();
//
//		Thread.sleep(2000);
//		r.SOC1TYPE1_cycle().sendKeys(TestCaseData.SOC1TYPE1_cycle);
//		Thread.sleep(1000);
//
//		Thread.sleep(500);
//		r.SOC2TYPE1().click();
//		Thread.sleep(2000);
//		r.SOC2TYPE1_cycle().sendKeys(TestCaseData.SOC2TYPE1_cycle);
//
//		Thread.sleep(500);
//		r.SOC2TYPE2().click();
//		Thread.sleep(2000);
//		r.SOC2TYPE2_cycle().sendKeys(TestCaseData.SOX_cycle);
//
//		Thread.sleep(500);
//		r.HITRUST().click();
//
//		Thread.sleep(500);
//		r.HITRUST_cycle().sendKeys(TestCaseData.HITRUST_cycle);
//
//		Thread.sleep(500);
//		r.HIPAA().click();
//
//		Thread.sleep(500);
//		r.HIPAA_cycle().sendKeys(TestCaseData.HIPAA_cycle);
//
//		Thread.sleep(500);
//		r.PCIDSS().click();
//		Thread.sleep(500);
//
//		r.PCIDSS_cycle().sendKeys(TestCaseData.PCIDSS_cycle);
//
//		Thread.sleep(500);
//
//		r.SOX().click();
//
//		Thread.sleep(500);
//		r.SOX_cycle().sendKeys(TestCaseData.SOX_cycle);
//
//		Thread.sleep(500);
//		r.save().click();
//		Thread.sleep(2000);
//		r.Next().click();

		Thread.sleep(5000);

		// Active_Directory
		Thread.sleep(5000);
		WebElement Active_Directory_1 = r.risk_slider_1();
		Thread.sleep(1000);
		Actions action_0 = new Actions(driver);
		randomvalue = (int) (Math.random() * (5 - 0 + 1) + 0);
		action_0.dragAndDropBy(Active_Directory_1, -1000, 0).perform();
		action_0.dragAndDropBy(Active_Directory_1, arrayslider[randomvalue], 0).perform();

		Thread.sleep(5000);
		WebElement Active_Directory_2 = r.risk_slider_2();
		Thread.sleep(1000);
		Actions action_01 = new Actions(driver);
		randomvalue = (int) (Math.random() * (5 - 0 + 1) + 0);
		action_01.dragAndDropBy(Active_Directory_2, -1000, 0).perform();
		action_01.dragAndDropBy(Active_Directory_2, arrayslider[randomvalue], 0).perform();

		Thread.sleep(5000);
		WebElement Active_Directory_3 = r.risk_slider_3();
		Thread.sleep(1000);
		Actions action2 = new Actions(driver);
		randomvalue = (int) (Math.random() * (5 - 0 + 1) + 0);
		action2.dragAndDropBy(Active_Directory_3, -1000, 0).perform();
		action2.dragAndDropBy(Active_Directory_3, arrayslider[randomvalue], 0).perform();

		Thread.sleep(5000);
		WebElement Active_Directory_4 = r.risk_slider_4();
		Thread.sleep(1000);
		Actions action3 = new Actions(driver);
		randomvalue = (int) (Math.random() * (5 - 0 + 1) + 0);
		action3.dragAndDropBy(Active_Directory_4, -1000, 0).perform();
		action3.dragAndDropBy(Active_Directory_4, arrayslider[randomvalue], 0).perform();

		Thread.sleep(5000);
		WebElement Active_Directory_5 = r.risk_slider_5();
		Thread.sleep(1000);
		Actions action4 = new Actions(driver);
		randomvalue = (int) (Math.random() * (5 - 0 + 1) + 0);
		action4.dragAndDropBy(Active_Directory_5, -1000, 0).perform();
		action4.dragAndDropBy(Active_Directory_5, arrayslider[randomvalue], 0).perform();

		r.save().click();
		r.Next().click();

		Thread.sleep(5000);

		// User Security
		Thread.sleep(5000);
		WebElement user_security_1 = r.risk_slider_1();
		Thread.sleep(1000);
		Actions action5 = new Actions(driver);
		randomvalue = (int) (Math.random() * (5 - 0 + 1) + 0);
		action5.dragAndDropBy(user_security_1, -1000, 0).perform();
		action5.dragAndDropBy(user_security_1, arrayslider[randomvalue], 0).perform();

		Thread.sleep(5000);
		WebElement user_security_2 = r.risk_slider_2();
		Thread.sleep(1000);
		Actions action6 = new Actions(driver);
		randomvalue = (int) (Math.random() * (5 - 0 + 1) + 0);
		action6.dragAndDropBy(user_security_2, -1000, 0).perform();
		action6.dragAndDropBy(user_security_2, arrayslider[randomvalue], 0).perform();

		Thread.sleep(5000);
		WebElement user_security_3 = r.risk_slider_3();
		Thread.sleep(1000);
		Actions action7 = new Actions(driver);
		randomvalue = (int) (Math.random() * (5 - 0 + 1) + 0);
		action7.dragAndDropBy(user_security_3, -1000, 0).perform();
		action7.dragAndDropBy(user_security_3, arrayslider[randomvalue], 0).perform();

		Thread.sleep(5000);
		WebElement user_security_4 = r.risk_slider_4();
		Thread.sleep(1000);
		Actions action8 = new Actions(driver);
		randomvalue = (int) (Math.random() * (5 - 0 + 1) + 0);
		action8.dragAndDropBy(user_security_4, -1000, 0).perform();
		action8.dragAndDropBy(user_security_4, arrayslider[randomvalue], 0).perform();

		Thread.sleep(5000);
		WebElement user_security_5 = r.risk_slider_5();
		Thread.sleep(1000);
		Actions action9 = new Actions(driver);
		randomvalue = (int) (Math.random() * (5 - 0 + 1) + 0);
		action9.dragAndDropBy(user_security_5, -1000, 0).perform();
		action9.dragAndDropBy(user_security_5, arrayslider[randomvalue], 0).perform();

		r.save().click();
		r.Next().click();

		Thread.sleep(5000);

		// Endpoint Security

		Thread.sleep(5000);
		WebElement endpoint_security = r.risk_slider_1();
		Thread.sleep(1000);
		Actions action10 = new Actions(driver);
		randomvalue = (int) (Math.random() * (5 - 0 + 1) + 0);
		action10.dragAndDropBy(endpoint_security, -1000, 0).perform();
		action10.dragAndDropBy(endpoint_security, arrayslider[randomvalue], 0).perform();

		Thread.sleep(5000);
		WebElement endpoint_security_1 = r.risk_slider_2();
		Thread.sleep(1000);
		Actions action11 = new Actions(driver);
		randomvalue = (int) (Math.random() * (5 - 0 + 1) + 0);
		action11.dragAndDropBy(endpoint_security_1, -1000, 0).perform();
		action11.dragAndDropBy(endpoint_security_1, arrayslider[randomvalue], 0).perform();

		Thread.sleep(5000);
		WebElement endpoint_security_2 = r.risk_slider_3();
		Thread.sleep(1000);
		Actions action12 = new Actions(driver);
		randomvalue = (int) (Math.random() * (5 - 0 + 1) + 0);
		action12.dragAndDropBy(endpoint_security_2, -1000, 0).perform();
		action12.dragAndDropBy(endpoint_security_2, arrayslider[randomvalue], 0).perform();

		Thread.sleep(5000);
		WebElement endpoint_security_3 = r.risk_slider_4();
		Thread.sleep(1000);
		Actions action13 = new Actions(driver);
		randomvalue = (int) (Math.random() * (5 - 0 + 1) + 0);
		action13.dragAndDropBy(endpoint_security_3, -1000, 0).perform();
		action8.dragAndDropBy(endpoint_security_3, arrayslider[randomvalue], 0).perform();

		Thread.sleep(5000);
		WebElement endpoint_security_4 = r.risk_slider_5();
		Thread.sleep(1000);
		Actions action14 = new Actions(driver);
		randomvalue = (int) (Math.random() * (5 - 0 + 1) + 0);
		action14.dragAndDropBy(endpoint_security_4, -1000, 0).perform();
		action14.dragAndDropBy(endpoint_security_4, arrayslider[randomvalue], 0).perform();

		r.save().click();
		r.Next().click();

		Thread.sleep(5000);

		// Data Security

		Thread.sleep(5000);
		WebElement data_security = r.risk_slider_1();
		Thread.sleep(1000);
		Actions action15 = new Actions(driver);
		randomvalue = (int) (Math.random() * (5 - 0 + 1) + 0);
		action15.dragAndDropBy(data_security, -1000, 0).perform();
		action15.dragAndDropBy(data_security, arrayslider[randomvalue], 0).perform();

		Thread.sleep(5000);
		WebElement data_security_1 = r.risk_slider_2();
		Thread.sleep(1000);
		Actions action16 = new Actions(driver);
		randomvalue = (int) (Math.random() * (5 - 0 + 1) + 0);
		action16.dragAndDropBy(data_security_1, -1000, 0).perform();
		action16.dragAndDropBy(data_security_1, arrayslider[randomvalue], 0).perform();

		Thread.sleep(5000);
		WebElement data_security_3 = r.risk_slider_3();
		Thread.sleep(1000);
		Actions action17 = new Actions(driver);
		randomvalue = (int) (Math.random() * (5 - 0 + 1) + 0);
		action17.dragAndDropBy(data_security_3, -1000, 0).perform();
		action17.dragAndDropBy(data_security_3, arrayslider[randomvalue], 0).perform();

		Thread.sleep(5000);
		WebElement data_security_4 = r.risk_slider_4();
		Thread.sleep(1000);
		Actions action18 = new Actions(driver);
		randomvalue = (int) (Math.random() * (5 - 0 + 1) + 0);
		action18.dragAndDropBy(data_security_4, -1000, 0).perform();
		action18.dragAndDropBy(data_security_4, arrayslider[randomvalue], 0).perform();

		Thread.sleep(5000);
		WebElement data_security_5 = r.risk_slider_5();
		Thread.sleep(1000);
		Actions action19 = new Actions(driver);
		randomvalue = (int) (Math.random() * (5 - 0 + 1) + 0);
		action19.dragAndDropBy(data_security_5, -1000, 0).perform();
		action19.dragAndDropBy(data_security_5, arrayslider[randomvalue], 0).perform();

		r.save().click();
		r.Next().click();

//Operational Security				

		Thread.sleep(5000);
		WebElement operational_security_1 = r.risk_slider_1();
		Thread.sleep(1000);
		Actions action20 = new Actions(driver);
		randomvalue = (int) (Math.random() * (5 - 0 + 1) + 0);
		action20.dragAndDropBy(operational_security_1, -1000, 0).perform();
		action20.dragAndDropBy(operational_security_1, arrayslider[randomvalue], 0).perform();

		Thread.sleep(5000);
		WebElement operational_security_2 = r.risk_slider_2();
		Thread.sleep(1000);
		Actions action21 = new Actions(driver);
		randomvalue = (int) (Math.random() * (5 - 0 + 1) + 0);
		action21.dragAndDropBy(operational_security_2, -1000, 0).perform();
		action21.dragAndDropBy(operational_security_2, arrayslider[randomvalue], 0).perform();

		Thread.sleep(5000);
		WebElement operational_security_3 = r.risk_slider_3();
		Thread.sleep(1000);
		Actions action22 = new Actions(driver);
		randomvalue = (int) (Math.random() * (5 - 0 + 1) + 0);
		action22.dragAndDropBy(operational_security_3, -1000, 0).perform();
		action22.dragAndDropBy(operational_security_3, arrayslider[randomvalue], 0).perform();

		Thread.sleep(5000);
		WebElement operational_security_4 = r.risk_slider_4();
		Thread.sleep(1000);
		Actions action23 = new Actions(driver);
		randomvalue = (int) (Math.random() * (5 - 0 + 1) + 0);
		action23.dragAndDropBy(operational_security_4, -1000, 0).perform();
		action23.dragAndDropBy(operational_security_4, arrayslider[randomvalue], 0).perform();

		Thread.sleep(5000);
		WebElement operational_security_5 = r.risk_slider_5();
		Thread.sleep(1000);
		Actions action24 = new Actions(driver);
		randomvalue = (int) (Math.random() * (5 - 0 + 1) + 0);
		action24.dragAndDropBy(operational_security_5, -1000, 0).perform();
		action24.dragAndDropBy(operational_security_5, arrayslider[randomvalue], 0).perform();

		r.save().click();
		r.Next().click();

//Network Security					

		Thread.sleep(5000);
		WebElement network_security_1 = r.risk_slider_1();
		Thread.sleep(1000);
		Actions action25 = new Actions(driver);
		randomvalue = (int) (Math.random() * (5 - 0 + 1) + 0);
		action25.dragAndDropBy(network_security_1, -1000, 0).perform();
		action25.dragAndDropBy(network_security_1, arrayslider[randomvalue], 0).perform();

		Thread.sleep(5000);
		WebElement network_security_2 = r.risk_slider_2();
		Thread.sleep(1000);
		Actions action26 = new Actions(driver);
		randomvalue = (int) (Math.random() * (5 - 0 + 1) + 0);
		action26.dragAndDropBy(network_security_2, -1000, 0).perform();
		action26.dragAndDropBy(network_security_2, arrayslider[randomvalue], 0).perform();

		Thread.sleep(5000);
		WebElement network_security_3 = r.risk_slider_3();
		Thread.sleep(1000);
		Actions action27 = new Actions(driver);
		randomvalue = (int) (Math.random() * (5 - 0 + 1) + 0);
		action27.dragAndDropBy(network_security_3, -1000, 0).perform();
		action27.dragAndDropBy(network_security_3, arrayslider[randomvalue], 0).perform();

		Thread.sleep(5000);
		WebElement network_security_4 = r.risk_slider_4();
		Thread.sleep(1000);
		Actions action28 = new Actions(driver);
		randomvalue = (int) (Math.random() * (5 - 0 + 1) + 0);
		action28.dragAndDropBy(network_security_4, -1000, 0).perform();
		action28.dragAndDropBy(network_security_4, arrayslider[randomvalue], 0).perform();

		Thread.sleep(5000);
		WebElement network_security_5 = r.risk_slider_5();
		Thread.sleep(1000);
		Actions action29 = new Actions(driver);
		randomvalue = (int) (Math.random() * (5 - 0 + 1) + 0);
		action29.dragAndDropBy(network_security_5, -1000, 0).perform();
		action29.dragAndDropBy(network_security_5, arrayslider[randomvalue], 0).perform();

		r.save().click();
		r.Next().click();
//Software Security

		Thread.sleep(5000);
		WebElement software_security_1 = r.risk_slider_1();
		Thread.sleep(1000);
		Actions action30 = new Actions(driver);
		randomvalue = (int) (Math.random() * (5 - 0 + 1) + 0);
		action30.dragAndDropBy(software_security_1, -1000, 0).perform();
		action30.dragAndDropBy(software_security_1, arrayslider[randomvalue], 0).perform();

		Thread.sleep(5000);
		WebElement software_security_2 = r.risk_slider_2();
		Thread.sleep(1000);
		Actions action31 = new Actions(driver);
		randomvalue = (int) (Math.random() * (5 - 0 + 1) + 0);
		action31.dragAndDropBy(software_security_2, -1000, 0).perform();
		action31.dragAndDropBy(software_security_2, arrayslider[randomvalue], 0).perform();

		Thread.sleep(5000);
		WebElement software_security_3 = r.risk_slider_3();
		Thread.sleep(1000);
		Actions action32 = new Actions(driver);
		randomvalue = (int) (Math.random() * (5 - 0 + 1) + 0);
		action32.dragAndDropBy(software_security_3, -1000, 0).perform();
		action32.dragAndDropBy(software_security_3, arrayslider[randomvalue], 0).perform();

		Thread.sleep(5000);
		WebElement software_security_4 = r.risk_slider_4();
		Thread.sleep(1000);
		Actions action33 = new Actions(driver);
		randomvalue = (int) (Math.random() * (5 - 0 + 1) + 0);
		action33.dragAndDropBy(software_security_4, -1000, 0).perform();
		action33.dragAndDropBy(software_security_4, arrayslider[randomvalue], 0).perform();

		Thread.sleep(5000);
		WebElement software_security_5 = r.risk_slider_5();
		Thread.sleep(1000);
		Actions action34 = new Actions(driver);
		randomvalue = (int) (Math.random() * (5 - 0 + 1) + 0);
		action34.dragAndDropBy(software_security_5, -1000, 0).perform();
		action34.dragAndDropBy(software_security_5, arrayslider[randomvalue], 0).perform();

		Thread.sleep(5000);
		r.risk_ok().click();

	}
}
