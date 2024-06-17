package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RiskImpact {

public WebDriver driver;
	
	
	
	
	private By riskimpact= By.xpath("//p[normalize-space()='Risk Impact']");	
	private By  Admin= By.linkText("Admin");
	private By Enterbusinessunit= By.xpath("//input[@id='rgu_name_input']");	
	private By EnterAnnualAmount= By.xpath("//input[@id='rgu_revenue_input']");	
	private By clickadd= By.xpath("//button[@id='rgu_add_button']");	
	private By clickonrgu= By.xpath("//div[@id='rgu_container_0']//div[2]");	
	private By clickonfunction= By.xpath("//div[@id='rgu_function_0']//div[contains(text(),'')]");	
	private By save= By.xpath("//button[normalize-space()='Save']");	
	private By Review= By.xpath("//button[normalize-space()='Review']");	
	private By close= By.xpath("//button[normalize-space()='Close']");	
	private By edit= By.xpath("(//*[name()='svg'][@stroke='currentColor'])[3]");	
	private By delete= By.xpath("(//*[name()='svg'][@stroke='currentColor'])[4]");	

	private By togglebutton= By.xpath("(//span)[8]");	

	
	 
    		 
    
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	


	public RiskImpact(WebDriver driver2) {
		this.driver=driver2;
	}

	public WebElement riskimpact() {
		
		return driver.findElement(riskimpact);
	}	

	public WebElement Admin() {
		
		return driver.findElement(Admin);
	}	
   public WebElement Enterbusinessunit() {
		
		return driver.findElement(Enterbusinessunit);
	}	
   public WebElement EnterAnnualAmount() {
		
		return driver.findElement(EnterAnnualAmount);
	}	
   public WebElement clickonrgu() {
		
		return driver.findElement(clickonrgu);
	}	
  
   public WebElement clickadd() {
		
		return driver.findElement(clickadd);
	}	
   public WebElement clickonfunction() {
		
		return driver.findElement(clickonfunction);
	}	
   public WebElement save() {
		
		return driver.findElement(save);
	}	
   public WebElement Review() {
		
		return driver.findElement(Review);
	}	
   public WebElement close() {
		
		return driver.findElement(close);
	}	
   public WebElement edit() {
		
		return driver.findElement(edit);
	}	
   public WebElement delete() {
		
		return driver.findElement(delete);
	}	
   public WebElement togglebutton() {
		
		return driver.findElement(togglebutton);
	}	
}
