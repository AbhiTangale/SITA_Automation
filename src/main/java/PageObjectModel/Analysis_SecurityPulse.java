package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Analysis_SecurityPulse {

public WebDriver driver;	

    private By Analysis = By.linkText("Analysis");
    

	private By Security_Pulse = By.linkText("Security Pulse");
	private By Add = By.xpath("//button[normalize-space()='Add']");

	private By Enter_Page_Title = By.xpath("//input[@placeholder='ENTER PAGE TITLE']");

	private By CRITICALITY = By.xpath("//div[contains(text(),'CRITICALITY')]");

	private By Enter_Main_Section_Title = By.xpath("//input[@placeholder='ENTER MAIN SECTION TITLE']");

	private By recommendation = By.xpath("//input[@id='validationCustomRecommendation0']");

	private By enter_link_title = By.xpath("//input[@placeholder='ENTER LINK TITLE']");

	private By enter_link_url = By.xpath("//input[@placeholder='ENTER LINK URL']");

	private By Security_Pulse_assets = By.xpath("//input[@placeholder='Assets']");

	private By Security_Pulse_entity = By.xpath("//input[@placeholder='Entity']");

	private By Security_Pulse_incidents = By.xpath("//input[@placeholder='Incidents']");
	private By upload_graph = By.xpath("//button[@class='border rmt form-control btn btn-light']");

	private By Enter_Information = By.xpath("//textarea[@id='exampleForm.ControlTextarea1']");

	private By CRITICALITY_High = By.xpath("//div[contains(text(),'High')]");

	private By Preview = By.xpath("//button[normalize-space()='Preview']");

	private By Security_Pulse_incidents_click = By.xpath("//button[@class='btn btn-light']");

	private By Security_Pulse_publish = By.xpath("//button[normalize-space()='Publish']");

	private By detail = By.xpath("(//*[local-name()='svg'][@fill='currentColor'])[5]");
	
	private By download = By.xpath("//tbody/tr[1]/td[7]/div[1]/button[2]//*[name()='svg']");

	private By share = By.xpath("(//button[@type='button'])[5]");
	
	
	private By back = By.xpath("//span[contains(text(),'SITA')]");

	private By Clickdaterange=By.xpath("//button[@class='btn btn-outline  mt-1 dateSelectorButton ']");

	
	
	
	
public Analysis_SecurityPulse(WebDriver driver2) {
this.driver=driver2;
	}
public WebElement Analysis() {
	
	return driver.findElement(Analysis);	
   }
public WebElement Security_Pulse() {
		
	return driver.findElement(Security_Pulse);	
   }	

public WebElement Add() {
	
	return driver.findElement(Add);	
   }
public WebElement Enter_Page_Title() {
	
	return driver.findElement(Enter_Page_Title);	
   }
public WebElement CRITICALITY() {
	
	return driver.findElement(CRITICALITY);	
   }
public WebElement Enter_Main_Section_Title() {
	
	return driver.findElement(Enter_Main_Section_Title);	
   }
public WebElement enter_link_title() {
	
	return driver.findElement(enter_link_title);	
   }
public WebElement recommendation() {
	
	return driver.findElement(recommendation);	
   }
public WebElement enter_link_url() {
	
	return driver.findElement(enter_link_url);	
   }
public WebElement Security_Pulse_assets() {
	
	return driver.findElement(Security_Pulse_assets);	
   }
public WebElement Security_Pulse_entity() {
	
	return driver.findElement(Security_Pulse_entity);	
   }
public WebElement Security_Pulse_incidents() {
	
	return driver.findElement(Security_Pulse_incidents);	
   }
public WebElement upload_graph() {
	
	return driver.findElement(upload_graph);	
   }
public WebElement Enter_Information() {
	
	return driver.findElement(Enter_Information);	
   }
public WebElement CRITICALITY_High() {
	
	return driver.findElement(CRITICALITY_High);	
   }
public WebElement Preview() {
	
	return driver.findElement(Preview);	
   }
public WebElement Security_Pulse_incidents_click() {
	
	return driver.findElement(Security_Pulse_incidents_click);	
   }
public WebElement Security_Pulse_publish() {
	
	return driver.findElement(Security_Pulse_publish);	
   }

public WebElement detail() {
	
	return driver.findElement(detail);	
   }
public WebElement back() {
	
	return driver.findElement(back);	
   }
public WebElement share() {
	
	return driver.findElement(share);	
   }
public WebElement download() {
	
	return driver.findElement(download);	
   }
public WebElement Clickdaterange() {
	
	return driver.findElement(Clickdaterange);	
   }
}
