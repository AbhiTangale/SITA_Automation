package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Analysis_Advisory {

	
	
public WebDriver driver;
	
	
	private By clickonAnalysis = By.linkText("Analysis");
	private By clickonAdvisory = By.xpath("//a[normalize-space()='Advisory']");
	private By detail = By.xpath("(//*[local-name()='svg'][@fill='currentColor'])[4]");
	private By download = By.xpath("(//button[@type='button'])[3]");
	private By share = By.xpath("(//button[@type='button'])[4]");

	
	
	
	
	
	
	
public Analysis_Advisory(WebDriver driver2) {
		this.driver=driver2;
	}
public WebElement clickonAnalysis() {
		
		return driver.findElement(clickonAnalysis);	
   }
public WebElement clickonAdvisory() {
	
	return driver.findElement(clickonAdvisory);	
}
public WebElement detail() {
	
	return driver.findElement(detail);	
}
public WebElement download() {
	
	return driver.findElement(download);	
}    
public WebElement share() {
	
	return driver.findElement(share);	
} 	
}
