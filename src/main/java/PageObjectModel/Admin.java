package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Admin {
	
public WebDriver driver;
	
	//private By RT = By.xpath("//span[contains(text(),'RT')]");
	
	private By  Admin= By.linkText("Admin");

	private By  entity_onboarding= By.linkText("ENTITY ONBOARDING");

	
	
	private By clickonPerspective = By.xpath("//a[normalize-space()='Perspective']");
	
	private By perspective_type_dropdown = By.xpath("//div[contains(text(),'Perspective Type')]");

	
	private By action_taken_dropdown = By.xpath("//div[contains(text(),'Action Taken')]");

	
	
	
	
	
	
	
public Admin(WebDriver driver2) {
	
this.driver=driver2;
}


public WebElement  clickAdmin() {
		
		return driver.findElement(Admin);			
	}
public WebElement  entity_onboarding() {
	
	return driver.findElement(entity_onboarding);			
}
 	
	
	
}
