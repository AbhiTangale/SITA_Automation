package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CostOfSecurityControl {


	public WebDriver driver;
	
	//private By csc= By.xpath("//a[@href='/CostOfSecurityControls']//div[@class='sc-bZnhIo cMRgvl']//div[@class='sc-iTONeN fJnaAM']//div[@class='sc-iAvgwm cReBPA']");
	private By csc= By.xpath("//p[normalize-space()='Cost Of Security Controls']");

	
	private By  Admin= By.linkText("Admin");
    private By TacticLevel =By.xpath("//input[@id='cs_strategicqty_input']");
	private By StrategicLevel = By.xpath("//input[@id='cs_tacticqty_input']");
	private By costannual1 = By.xpath("//input[@id='cs_strategiccost']");
	private By costannual2 = By.xpath("//input[@id='cs_tacticcost']");
	private By soc = By.xpath("//input[@id='cs_soccost']");
	private By netseg = By.xpath("//input[@id='cs_netseg_cost']");
	private By othercost = By.xpath("//input[@id='cs_othercost']");
	private By totalemployee = By.xpath("//input[@id='cs_totalemployees']");
	private By Coverage = By.xpath("//input[@id='cs_unitcoverage']");
	private By totalcostannualCoverage = By.xpath("//input[@id='cs_totalcost']");
	private By perusertechDropdown = By.xpath("//select[@id='user_dropdown']");
	private By perusertechonologyunitcostMonthly= By.xpath("//input[@id='user_edit_monthlycost']");
	private By perusertechonologyunitcostAnnual= By.xpath("//input[@id='user_edit_annualinput']");
	private By perusertechAddbutton= By.xpath("(//button[@type='button'])[2]");
	private By entitylevelsharedtechnologydropdown= By.xpath("//select[@id='enity_dropdown']");
	private By entitylevelsharedtechnologyUnitCostMonthly= By.xpath("//input[@id='entity_edit_input']");
    private By entitylevelsharedtechnologyUnitCostAnual= By.xpath("//input[@id='entity_annual_input']");
    private By entitylevelsharedtechnologyAdd= By.xpath("(//button[@type='button'])[3]");
    private By perAssettechdropdown= By.xpath("//select[@id='asset_dropdown']");
    private By perAssettechUnitCostMonthly= By.xpath("//input[@id='asset_edit_monthlycost']");
    private By perAssettechUnitCostAnnual= By.xpath("//input[@id='asset_annualcost']");
    private By perAssettechAddButton= By.xpath("(//button[@type='button'])[4]");
    private By save= By.xpath("//button[normalize-space()='Save']");
    private By cancel= By.xpath("//button[normalize-space()='Cancel']");
    private By previous= By.xpath("//button[normalize-space()='Previous']");
    private By ok= By.xpath("(//button[@type='button'])[8]");
    private By mfa= By.xpath("//*[contains(text(),'MFA')]");
    private By ips= By.xpath("//*[contains(text(),'IPS')]");
    private By antivirus= By.xpath("//*[contains(text(),'Antivirus')]");
    private By putcheckbox1= By.xpath("(//input[@id='select-0'])[1]");
    private By putcheckbox2= By.xpath("//body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/table[1]/tbody[1]/tr[2]/td[1]/div[1]/div[1]/input[1]");
    private By putcheckbox3= By.xpath("//body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/table[1]/tbody[1]/tr[3]/td[1]/div[1]/div[1]/input[1]");
    private By putcheckbox4= By.xpath("//body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/table[1]/tbody[1]/tr[4]/td[1]/div[1]/div[1]/input[1]");
    private By putcheckbox5= By.xpath("//body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/table[1]/tbody[1]/tr[5]/td[1]/div[1]/div[1]/input[1]");
    private By putcheckbox6= By.xpath("//body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/table[1]/tbody[1]/tr[6]/td[1]/div[1]/div[1]/input[1]");

    private By putcheckboxedit= By.xpath("//*[name()='svg'][@id='user_edit_btn']");
    private By putcheckboxmonthlyedit= By.xpath("//input[@id='user_edit_monthlyinput']");
    private By puteditsave= By.xpath("(//*[name()='svg'][@id='user_save_btn'])[1]");

    
  
    
    private By putcheckboxdelete= By.xpath("(//*[name()='svg'][@id='user_trash_btn'])[1]");

    
  
    
	
	public CostOfSecurityControl(WebDriver driver2) {
		this.driver=driver2;
	}
	public WebElement csc() {
		return driver.findElement(csc);
	}	
	public WebElement Admin() {
		return driver.findElement(Admin);
	}	
	public WebElement TacticLevel() {
		return driver.findElement(TacticLevel);
	}	
	public WebElement StrategicLevel() {
		return driver.findElement(StrategicLevel);
	}	
	public WebElement costannual1() {
		return driver.findElement(costannual1);
	}	
	public WebElement costannual2() {
		return driver.findElement(costannual2);
	}	
	public WebElement soc() {
		return driver.findElement(soc);
	}	
	public WebElement netseg() {
		return driver.findElement(netseg);
	}	
	public WebElement othercost() {
		return driver.findElement(othercost);
	}
	public WebElement totalemployee() {
		return driver.findElement(totalemployee);
	}
	public WebElement Coverage() {
		return driver.findElement(Coverage);
	}
	public WebElement totalcostannualCoverage() {
		return driver.findElement(totalcostannualCoverage);
	}
	public WebElement perusertechDropdown() {
		return driver.findElement(perusertechDropdown);
	}
	public WebElement perusertechonologyunitcostMonthly() {
		return driver.findElement(perusertechonologyunitcostMonthly);
	}
	public WebElement perusertechonologyunitcostAnnual() {
		return driver.findElement(perusertechonologyunitcostAnnual);
	}
	public WebElement perusertechAddbutton() {
		return driver.findElement(perusertechAddbutton);
	}
	public WebElement entitylevelsharedtechnologydropdown() {
		return driver.findElement(entitylevelsharedtechnologydropdown);
	}
	public WebElement entitylevelsharedtechnologyUnitCostMonthly() {
		return driver.findElement(entitylevelsharedtechnologyUnitCostMonthly);
	}
	public WebElement entitylevelsharedtechnologyUnitCostAnual() {
		return driver.findElement(entitylevelsharedtechnologyUnitCostAnual);
	}
	public WebElement entitylevelsharedtechnologyAdd() {
		return driver.findElement(entitylevelsharedtechnologyAdd);
	}
	public WebElement perAssettechdropdown() {
		return driver.findElement(perAssettechdropdown);
	}
	public WebElement perAssettechUnitCostMonthly() {
		return driver.findElement(perAssettechUnitCostMonthly);
	}
	public WebElement perAssettechUnitCostAnnual() {
		return driver.findElement(perAssettechUnitCostAnnual);
	}
	public WebElement perAssettechAddButton() {
		return driver.findElement(perAssettechAddButton);
	}
	
	public WebElement save() {
		return driver.findElement(save);
	}
	public WebElement cancel() {
		return driver.findElement(cancel);
	}
	public WebElement previous() {
		return driver.findElement(previous);
	}
	public WebElement ok() {
		return driver.findElement(ok);
	}
	public WebElement mfa() {
		return driver.findElement(mfa);
	}
	public WebElement ips() {
		return driver.findElement(ips);
	}
	public WebElement antivirus() {
		return driver.findElement(antivirus);
	}
	public WebElement putcheckbox1() {
		return driver.findElement(putcheckbox1);
	}
	public WebElement putcheckbox2() {
		return driver.findElement(putcheckbox2);
	}
	public WebElement putcheckbox3() {
		return driver.findElement(putcheckbox3);
	}
	public WebElement putcheckbox4() {
		return driver.findElement(putcheckbox4);
	}
	public WebElement putcheckbox5() {
		return driver.findElement(putcheckbox5);
	}
	public WebElement putcheckbox6() {
		return driver.findElement(putcheckbox6);
	}
	public WebElement putcheckboxdelete() {
		return driver.findElement(putcheckboxdelete);
	}
	public WebElement putcheckboxedit() {
		return driver.findElement(putcheckboxedit);
	}
	public WebElement putcheckboxmonthlyedit() {
		return driver.findElement(putcheckboxmonthlyedit);
	}
	public WebElement puteditsave() {
		return driver.findElement(puteditsave);
	}
}
