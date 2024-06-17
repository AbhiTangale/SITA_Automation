package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class EntityOnboarding {
	
	public WebDriver driver;
	
	private By  Admin= By.linkText("Admin");

	private By  entity_onboarding= By.xpath("//p[normalize-space()='Entity Onboarding']");

	private By country = By.xpath("(//div[@class=' css-akdhb2-Input'])[1]");

	private By state = By.xpath("(//div[@class=' css-akdhb2-Input'])[2]");

	private By city = By.xpath("(//div[@class=' css-akdhb2-Input'])[3]");

	private By Location = By.xpath("(//input[@type='text'])[6]");

	
//	private By  add_location= By.linkText("Add Location");
	
	
	private By add_location = By.xpath("(//button[@type='button'])[2]");

	private By  Save=  By.xpath("(//button[@type='button'])[15]");


	private By  next= By.xpath("(//button[@type='button'])[16]");

	private By  predefine_functions= By.xpath("(//*[local-name()='svg']//*[name()='path'])[1]");

	private By functions= By.xpath("//div[contains(text(),'Audit')]");
	private By functions_and_process_save= By.xpath("//button[normalize-space()='Save']");

	
	
	private By predefine_process= By.xpath("//div[@class='sc-jgbSNz iYzLTA']//div[1]//div[2]//*[name()='svg']//*[name()='path' and contains(@fill-rule,'evenodd')]");

	private By FUNCTION_PROCESS_HIERARCHY= By.xpath("(//div[@class='sc-eKszNL cGLRbO'])[1]");

	private By FUNCTION_PROCESS_HIERARCHY1= By.xpath("//div[@class='sc-olbas bJetBj']");

	private By asset_category= By.xpath("(//div[@class='sc-lbOyJj fIOAxL'])[5]");

	private By asset_sub_category= By.xpath("(//div[@class='sc-lbOyJj fIOAxL'])[8]");

	private By asset_type= By.xpath("(//div[@class='sc-lbOyJj fIOAxL'])[10]");

	private By asset_sub_type= By.xpath("(//div[@class='sc-lbOyJj fIOAxL'])[14]");

	
	private By company_name_location= By.xpath("(//div[@class='sc-eKszNL cGLRbO'])[4]");
	private By fun_process_next= By.xpath("(//button[@type='button'])[6]");

	private By Asset_name= By.xpath("//input[@placeholder='Asset Name']");

	private By Asset_tags= By.xpath("//div[@class=' css-akdhb2-Input']");

	private By Asset_add= By.xpath(" (//button[@type='button'])[3]");

	private By Asset_save= By.xpath("(//button[@type='button'])[5]");
  
	private By Asset_next= By.xpath("(//button[@type='button'])[4]");

	private By Asset_submit= By.xpath("//button[normalize-space()='Submit']");

	
	private By ASV= By.xpath("(//button[@type='button'])[4]");

	
	
	
	
	
	
	
	
	
	public EntityOnboarding(WebDriver driver2) {

	this.driver=driver2;
	}

	public WebElement Admin() {
		
		return driver.findElement(Admin);
		}
	

	public WebElement entity_onboarding() {
		
		return driver.findElement(entity_onboarding);
		}	
    public WebElement country() {
		
		return driver.findElement(country);
		}	
 public WebElement state() {
		
		return driver.findElement(state);
		}	
		
 public WebElement city() {
	
	return driver.findElement(city);
	}
 public WebElement Location() {
	
	return driver.findElement(Location);
	}	
	
 public WebElement add_location() {
		
		return driver.findElement(add_location);
		}		
	
 public WebElement save() {
		
		return driver.findElement(Save);
		}
 public WebElement next() {
		
		return driver.findElement(next);
		}
 public WebElement predefine_functions() {
		
		return driver.findElement(predefine_functions);
		}
 public WebElement functions() {
		
		return driver.findElement(functions);
		}
 public WebElement predefine_process() {
		
		return driver.findElement(predefine_process);
		}	
 public WebElement FUNCTION_PROCESS_HIERARCHY() {
		
		return driver.findElement(FUNCTION_PROCESS_HIERARCHY);
		}	
 public WebElement FUNCTION_PROCESS_HIERARCHY1() {
		
		return driver.findElement(FUNCTION_PROCESS_HIERARCHY1);
		}	
 public WebElement functions_and_process_save() {
		
		return driver.findElement(functions_and_process_save);
		}	
 public WebElement company_name_location() {
		
		return driver.findElement(company_name_location);
		}	
	
 public WebElement fun_process_next() {
		
		return driver.findElement(fun_process_next);
		}
 
	
public WebElement asset_type() {
		
		return driver.findElement(asset_type);
		}

public WebElement asset_category() {
	
	return driver.findElement(asset_category);
	}

public WebElement asset_sub_category() {
	
	return driver.findElement(asset_sub_category);
	}

public WebElement asset_sub_type() {
	
	return driver.findElement(asset_sub_type);
	}
 
public WebElement Asset_name() {
	
	return driver.findElement(Asset_name);
	}
 
public WebElement Asset_tags() {
	
	return driver.findElement(Asset_tags);
	}
 
public WebElement Asset_add() {
	
	return driver.findElement(Asset_add);
	}
public WebElement Asset_save() {
	
	return driver.findElement(Asset_save);
	}
public WebElement Asset_next() {
	
	return driver.findElement(Asset_next);
	}
public WebElement Asset_submit() {
	
	return driver.findElement(Asset_submit);
	}
 
 
public WebElement ASV() {
	
	return driver.findElement(ASV);
	}
 
 
 
}
