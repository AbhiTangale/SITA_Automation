package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DashBoard {
	
public WebDriver  driver;
	
private By EnterEmail = By.xpath("//input[@placeholder='Enter Email']");	//decalre private-use-encapsulation-opps concept
private By EnterPassword = By.xpath("//input[@placeholder='EnterPassword']");	//private access within that class only 
private By ClickSubmit=By.xpath("//button[normalize-space()='Submit']");
private By Clickdaterange=By.xpath("//button[@class='btn btn-outline dateSelectorButton']");
private By Clickdaterange1=By.xpath(" //div[@class='rdrStaticRanges']");
private By d_Yesterday= By.xpath("//span[normalize-space()='Yesterday']");	
private By Insights_thirtyday= By.xpath("//input[@id='InsightCard - 30 Days']");	
private By Insights_sevenday= By.xpath("/input[@id='InsightCard - 7 Days']");	
private By Insights_oneday= By.xpath("//input[@id='InsightCard - 1 Day']");	
private By oei_oneday= By.xpath("//input[@id='OeiCard - 1 Day']");	
private By oei_sevenday= By.xpath("//input[@id='OeiCard - 7 Days']");	
private By oei_thirtyday= By.xpath("//input[@id='OeiCard - 30 Days']");	
private By Perspective_thirtyday= By.xpath("//input[@id='Analysis - 30 Days']");	
private By Perspective_sevenday= By.xpath("//input[@id='Analysis - 7 Days']");	
private By Perspective_oneday= By.xpath("//input[@id='Analysis - 1 Day']");	
private By Perspective_More= By.xpath("//button[normalize-space()='More']");	
private By critical= By.xpath("(//*[local-name()='svg']//*[name()='g' and @data-z-index='1']//*[name()='rect'])[1]");	
private By high= By.xpath("(//*[local-name()='svg']//*[name()='g' and @data-z-index='1']//*[name()='rect'])[2]");	
private By medium= By.xpath("(//*[local-name()='svg']//*[name()='g' and @data-z-index='1']//*[name()='rect'])[3]");	
private By low= By.xpath("(//*[local-name()='svg']//*[name()='g' and @data-z-index='1']//*[name()='rect'])[4]");
private By alert_by_confidence= By.xpath("(//div[@class='card-title h5'])[1]");	
private By prespective_more= By.xpath("(//button[@type='button'])[15]");	
private By Security_pulse= By.xpath("//div[@class='sc-TRNrF loklCh']");	
private By dashboard= By.xpath("//a[normalize-space()='Dashboard']");	
private By resetbutton= By.xpath("(//button[@id='dropdown-basic'])[2]");	




public DashBoard(WebDriver driver2) {
this.driver= driver2;
	
}
public WebElement EnterUsername() {

return driver.findElement(EnterEmail);//need to return so remove void above 
}

public WebElement EnterPassword() {
	
return driver.findElement(EnterPassword);
}

public WebElement ClickSubmit() {
return driver.findElement(ClickSubmit);
}
public WebElement Clickdaterange() {
	
return driver.findElement(Clickdaterange);
}	
public WebElement Clickdaterange1() {

return driver.findElement(Clickdaterange);
}	
public WebElement Insights_oneday() {

return driver.findElement(Insights_oneday);
}	
public WebElement d_Yesterday() {
	
	return driver.findElement(d_Yesterday);
	}	
public WebElement Insights_sevenday() {

return driver.findElement(Insights_sevenday);
}	
public WebElement Insights_thirtyday() {

return driver.findElement(Insights_thirtyday);
}	
public WebElement oei_oneday() {

return driver.findElement(oei_oneday);
}	
public WebElement oei_sevenday() {

return driver.findElement(oei_sevenday);
}	
public WebElement oei_thirtyday() {

return driver.findElement(oei_thirtyday);
}	
public WebElement Perspective_thirtyday() {

return driver.findElement(Perspective_thirtyday);
}	
public WebElement Perspective_sevenday() {

return driver.findElement(Perspective_sevenday);
}	
public WebElement Perspective_oneday() {

return driver.findElement(Perspective_oneday);
}

public WebElement Perspective_More() {

return driver.findElement(Perspective_More);
}
public WebElement critical() {

return driver.findElement(critical);
}
public WebElement high() {

return driver.findElement(high);
}
public WebElement medium() {

return driver.findElement(medium);
}
public WebElement low() {

return driver.findElement(low);
}
public WebElement alert_by_confidence() {

return driver.findElement(alert_by_confidence);
}
public WebElement prespective_more() {

return driver.findElement(prespective_more);
}
public WebElement Security_pulse() {

return driver.findElement(Security_pulse);
}
public WebElement dashboard() {

return driver.findElement(dashboard);
}
public WebElement resetbutton() {

return driver.findElement(resetbutton);
}
}
