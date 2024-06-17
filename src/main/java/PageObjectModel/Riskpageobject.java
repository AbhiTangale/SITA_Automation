package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Riskpageobject {

	
public WebDriver driver;
	
	
	
    private By riskjourney= By.xpath("//button[normalize-space()='Risk Controls']");	

    private By clickRisk= By.xpath("//a[normalize-space()='Risk']");
	
	private By CISO_ceo= By.xpath("(//input[@name='CEO'])[1]");	

	private By CISO_cfo= By.xpath("(//input[@name='CFO'])[1]");	

	private By CISO_board = By.xpath("(//input[@name='BOARD'])[1]");	

	private By CISO_cio= By.xpath("(//input[@name='CIO'])[1]");	

	private By CISO_cro= By.xpath("(//input[@name='CRO'])[1]");	

	private By CISO_audit = By.xpath("(//input[@name='AUDIT'])[1]");	

	private  By CISO_others= By.xpath("(//input[@name='OTHERS'])[1]");	
	
	private  By SteeringCommittee_yes = By.xpath("//input[@value='Yes']");	

	private  By SteeringCommittee_no= By.xpath("//input[@value='No']");	

	private  By members_ceo= By.xpath("(//input[@name='CEO'])[2]");	

	private  By members_cfo= By.xpath("(//input[@name='CFO'])[2]");	

	private  By members_board= By.xpath("(//input[@name='BOARD'])[2]");	

	private  By members_cio= By.xpath("(//input[@name='CIO'])[2]");	
		
	private  By members_cro= By.xpath("(//input[@name='CRO'])[2]");	

	private  By members_audit= By.xpath("(//input[@name='AUDIT'])[2]");	
				
	private  By members_others= By.xpath("(//input[@name='OTHERS'])[2]");	

	private  By meet_slider= By.xpath("(//div[@class='rc-slider-handle'])[1]");	

	private  By audit_slider= By.xpath("(//div[@class='rc-slider-handle'])[2]");	

	private  By budget_slider= By.xpath("(//div[@class='rc-slider-handle'])[3]");	

	private  By direct_reports= By.xpath("(//input[@id='formHorizontalFirstName'])[1]");	

	private  By indirect_reports= By.xpath("(//input[@id='formHorizontalFirstName'])[2]");	

	private  By CYBERSECURITY_CISOOrg= By.xpath("(//input[@name='CYBERSECURITY'])[1]");	

	private  By CYBERSECURITY_OutsideCISOOrg= By.xpath("(//input[@name='CYBERSECURITY'])[2]");	

	private  By CYBERSECURITY_NA= By.xpath("(//input[@name='CYBERSECURITY'])[3]");	

	private  By COMPLIANCE_CISOOrg= By.xpath("(//input[@name='COMPLIANCE(SECURITY)'])[1]");	
	private  By COMPLIANCE_OutsideCISOOrg= 	By.xpath("(//input[@name='COMPLIANCE(SECURITY)'])[2]");	
	private  By COMPLIANCE_NA= By.xpath("(//input[@name='COMPLIANCE(SECURITY)'])[3]");	

	private  By RISK_CISOOrg= By.xpath("(//input[@name='RISK'])[1]");	
	private  By RISK_CISOOrg_OutsideCISOOrg=By.xpath("(//input[@name='RISK'])[2]");	
	private  By RISK_NA= By.xpath("(//input[@name='RISK'])[2]");	

	private  By SOC_CISOOrg= By.xpath("(//input[@name='SOC'])[1]");	
	private  By SOC_CISOOrg_OutsideCISOOrg= By.xpath("(//input[@name='SOC'])[2]");	
	private  By SOC_NA= By.xpath("(//input[@name='SOC'])[3]");	

	private  By OTSECURITY_CISOOrg= By.xpath("(//input[@name='OT SECURITY'])[1]");	
	private  By OTSECURITY_OutsideCISOOrg= By.xpath("(//input[@name='OT SECURITY'])[1]");	
	private  By OTSECURITY_NA= By.xpath("(//input[@name='OT SECURITY'])[1]");	

	private  By FRAUD_CISOOrg= By.xpath("(//input[@name='FRAUD'])[1]");	
	private  By FRAUD_OutsideCISOOrg= By.xpath("(//input[@name='FRAUD'])[2]");	
	private  By FRAUD_NA= By.xpath("(//input[@name='FRAUD'])[3]");	

	private  By Budget= By.xpath("//input[@placeholder='ENTER AMOUNT']");	
	private  By ISO_27001= By.xpath("(//input[@name='ISO27001'])[1]");	

	private  By ISO_27001_cycle= By.xpath("(//input[@name='ISO27001'])[2]");	

	private  By ISO31000= By.xpath("(//input[@name='ISO31000'])[1]");	
	private  By ISO31000_cycle= By.xpath("(//input[@name='ISO31000'])[2]");	

	
	
	private  By SOC1TYPE1= By.xpath("(//input[@name='SOC1TYPE1'])[1]");	
	private  By SOC1TYPE1_cycle= By.xpath("(//input[@name='SOC1TYPE1'])[2]");	

	private  By SOC1TYPE2= By.xpath("(//input[@name='SOC1TYPE2'])[1");	
	private  By SOC1TYPE2_cycle= By.xpath("(//input[@name='SOC1TYPE2'])[2]");	

	private  By SOC2TYPE1= By.xpath("(//input[@name='SOC2TYPE1'])[1]");
	private  By SOC2TYPE1_cycle= By.xpath("(//input[@name='SOC2TYPE1'])[2]");

	
	private  By SOC2TYPE2= By.xpath("(//input[@name='SOC2TYPE2'])[1]");
	private  By SOC2TYPE2_cycle= By.xpath("(//input[@name='SOC2TYPE2'])[2]");
	
	private  By HITRUST= By.xpath("(//input[@name='HITRUST'])[1]");	
	private  By HIPAA= By.xpath("(//input[@name='HIPAA'])[1]");
	private  By HIPAA_cycle= By.xpath("(//input[@name='HIPAA'])[2]");	

	private  By HITRUST_cycle= By.xpath("(//input[@name='HITRUST'])[2]");	

	private  By PCIDSS= By.xpath("(//input[@name='PCIDSS'])[1]");
	private  By PCIDSS_cycle= By.xpath("(//input[@name='PCIDSS'])[2]");

	private  By SOX= By.xpath("(//input[@name='SOX'])[1]");	
	private  By SOX_cycle= By.xpath("(//input[@name='SOX'])[1]");	
//	private  By SOC1TYPE2_cycle= By.xpath("(//input[@name='SOC1TYPE2'])[2]");	
	private  By save= By.xpath("(//button[@type='button'])[3]");	

	private  By Next= By.xpath("(//button[@class='btn-sm unfilled-btn-style btn btn-outline-secondary'])[2]");	

	private  By risk_slider_1= By.xpath("(//div[@class='rc-slider-handle'])[1]");	
	private  By risk_slider_2= By.xpath("(//div[@class='rc-slider-handle'])[2]");	
	private  By risk_slider_3= By.xpath("(//div[@class='rc-slider-handle'])[3]");	
	private  By risk_slider_4= By.xpath("(//div[@class='rc-slider-handle'])[4]");	
	private  By risk_slider_5= By.xpath("(//div[@class='rc-slider-handle'])[5]");	

	private  By risk_ok= By.xpath("//button[normalize-space()='Ok']");	

	private  By risk_Submit= By.xpath("//button[normalize-space()='Submit']");	

	
					
							
											
							
													
	
	
	public Riskpageobject(WebDriver driver2) {
		this.driver=driver2;
	}
public WebElement riskjourney() {
		
		return driver.findElement(riskjourney	);
	}
public WebElement clickRisk() {
		
		return driver.findElement(clickRisk	);
	}	
	
	public WebElement CISO_ceo() {
		
		return driver.findElement(CISO_ceo);
	}	
public WebElement CISO_cfo() {
		
		return driver.findElement(CISO_cfo);
	}	
public WebElement CISO_board() {
	
	return driver.findElement(CISO_board);
}	
public WebElement CISO_cio() {
	
	return driver.findElement(CISO_cio);
}	
public WebElement CISO_cro() {
	
	return driver.findElement(CISO_cro);
}	
public WebElement CISO_audit() {
	
	return driver.findElement(CISO_audit);
}	
public WebElement CISO_others() {
	
	return driver.findElement(CISO_others);
}	
public WebElement SteeringCommittee_yes() {
	
	return driver.findElement(SteeringCommittee_yes);
}	
public WebElement SteeringCommittee_no() {
	
	return driver.findElement(SteeringCommittee_no);
}	
public WebElement members_ceo() {
	
	return driver.findElement(members_ceo);
}	
public WebElement members_cfo() {
	
	return driver.findElement(members_cfo);
}	
public WebElement members_board() {
	
	return driver.findElement(members_board);
}	
public WebElement members_cio() {
	
	return driver.findElement(members_cio);
}	
public WebElement members_cro() {
	
	return driver.findElement(members_cro);
}	
public WebElement members_audit() {
	
	return driver.findElement(members_audit);
}	
public WebElement members_others() {
	
	return driver.findElement(members_others);
}	

public WebElement meet_slider() {
	
	return driver.findElement(meet_slider);
}	

public WebElement audit_slider() {
	
	return driver.findElement(audit_slider);
}
public WebElement budget_slider() {
	
	return driver.findElement(budget_slider);
}
public WebElement direct_reports() {
	
	return driver.findElement(direct_reports);
}
public WebElement indirect_reports() {
	
	return driver.findElement(indirect_reports);
}

public WebElement CYBERSECURITY_CISOOrg() {
	
	return driver.findElement(CYBERSECURITY_CISOOrg);
}
public WebElement CYBERSECURITY_OutsideCISOOrg() {
	
	return driver.findElement(CYBERSECURITY_OutsideCISOOrg);
}
public WebElement CYBERSECURITY_NA() {
	
	return driver.findElement(CYBERSECURITY_NA);
}
public WebElement COMPLIANCE_CISOOrg() {
	
	return driver.findElement(COMPLIANCE_CISOOrg);
}
public WebElement COMPLIANCE_OutsideCISOOrg() {
	
	return driver.findElement(COMPLIANCE_OutsideCISOOrg);
}
public WebElement COMPLIANCE_NA() {
	
	return driver.findElement(COMPLIANCE_NA);
}
public WebElement RISK_CISOOrg() {
	
	return driver.findElement(RISK_CISOOrg);
}
public WebElement RISK_CISOOrg_OutsideCISOOrg() {
	
	return driver.findElement(RISK_CISOOrg_OutsideCISOOrg);
}
public WebElement RISK_NA() {
	
	return driver.findElement(RISK_NA);
}
public WebElement SOC_CISOOrg() {
	
	return driver.findElement(SOC_CISOOrg);
}public WebElement SOC_CISOOrg_OutsideCISOOrg() {
	
	return driver.findElement(SOC_CISOOrg_OutsideCISOOrg);
}public WebElement SOC_NA() {
	
	return driver.findElement(SOC_NA);
}
public WebElement OTSECURITY_CISOOrg() {
	
	return driver.findElement(OTSECURITY_CISOOrg);
}
public WebElement OTSECURITY_OutsideCISOOrg() {
	
	return driver.findElement(OTSECURITY_OutsideCISOOrg);
}
public WebElement OTSECURITY_NA() {
	
	return driver.findElement(OTSECURITY_NA);
}
public WebElement FRAUD_CISOOrg() {
	
	return driver.findElement(FRAUD_CISOOrg);
}

public WebElement FRAUD_OutsideCISOOrg() {
	
	return driver.findElement(FRAUD_OutsideCISOOrg);
}

public WebElement FRAUD_NA() {
	
	return driver.findElement(FRAUD_NA);
}
public WebElement Budget() {
	
	return driver.findElement(Budget);
}
public WebElement ISO_27001() {
	
	return driver.findElement(ISO_27001);
}
public WebElement ISO_27001_cycle() {
	
	return driver.findElement(ISO_27001_cycle);
}
public WebElement ISO31000() {
	
	return driver.findElement(ISO31000);
}
public WebElement ISO31000_cycle() {
	
	return driver.findElement(ISO31000_cycle);
}


public WebElement SOC1TYPE1() {
	
	return driver.findElement(SOC1TYPE1);
}
public WebElement SOC1TYPE1_cycle() {
	
	return driver.findElement(SOC1TYPE1_cycle);
}
public WebElement SOC1TYPE2() {
	
	return driver.findElement(SOC1TYPE2);
}
public WebElement SOC1TYPE2_cycle() {
	
	return driver.findElement(SOC1TYPE2_cycle);
}
public WebElement SOC2TYPE1_cycle() {
	
	return driver.findElement(SOC2TYPE1_cycle);
}
public WebElement SOC2TYPE1() {
	
	return driver.findElement(SOC2TYPE1);  
}
public WebElement SOC2TYPE2() {
	
	return driver.findElement(SOC2TYPE2);
}
public WebElement SOC2TYPE2_cycle() {
	
	return driver.findElement(SOC2TYPE2_cycle);
}

public WebElement HITRUST() {
	
	return driver.findElement(HITRUST);
}
public WebElement HITRUST_cycle() {
	
	return driver.findElement(HITRUST_cycle);
}
public WebElement HIPAA() {
	
	return driver.findElement(HIPAA);
}

public WebElement HIPAA_cycle() {
	
	return driver.findElement(HIPAA_cycle);
}

public WebElement PCIDSS() {
	
	return driver.findElement(PCIDSS);
}
public WebElement PCIDSS_cycle() {
	
	return driver.findElement(PCIDSS_cycle);
}
public WebElement SOX() {
	
	return driver.findElement(SOX);
}
public WebElement SOX_cycle() {
	
	return driver.findElement(SOX_cycle);
}
public WebElement save() {
	
	return driver.findElement(save);
}
public WebElement Next() {
	
	return driver.findElement(Next);
}
public WebElement risk_slider_1() {
	
	return driver.findElement(risk_slider_1);
}
public WebElement risk_slider_2() {
	
	return driver.findElement(risk_slider_2);
}
public WebElement risk_slider_3() {
	
	return driver.findElement(risk_slider_3);
}
public WebElement risk_slider_4() {
	
	return driver.findElement(risk_slider_4);
}
public WebElement risk_slider_5() {
	
	return driver.findElement(risk_slider_5);
}

public WebElement risk_ok() {
	
	return driver.findElement(risk_ok);
}
public WebElement risk_Submit() {
	
	return driver.findElement(risk_Submit);
}


}
