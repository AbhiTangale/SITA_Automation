package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class OEINegative {
	
	
public WebDriver driver;
	
	
	private By clickoei= By.linkText("OEI");
    private By Category= By.xpath("//input[@id='Category']");
	private By Priority= By.xpath("//input[@id='Priority']");
	private By Status= By.xpath("//input[@id='Status']");
	private By Reopened= By.xpath("//input[@id='Reopened']");
	private By First_Response_Time= By.xpath("//input[@id='First Response Time']");
	private By Resolution_Time= By.xpath("//input[@id='Resolution Time']");
	private By False_Positives= By.xpath("//input[@id='False Positives']");
	
	private By Assignbutton  = By.xpath("//tbody/tr[1]/td[9]/div[1]/button[1]//*[name()='svg']");


	private By Assign = By.xpath("//input[@id='userName']");

	private By submit1 = By.xpath("//button[normalize-space()='Submit']");
		
	private By details = By.xpath("//tbody/tr[1]/td[9]/div[1]/button[3]//*[name()='svg']");
	
	private By searchbar= By.xpath("//input[@id='search-bar-0']");	
	
	private By incident= By.xpath("//span[normalize-space()='23266']");	

	private By Searchupdate= By.xpath("//input[@placeholder='Search update']");

	private By typehere = By.xpath("//textarea[@placeholder='Type update here...']");

	private By Update = By.xpath("//button[@class='btn btn-outline-primary mt-2 btn-sm']");	
		
	private By back = By.xpath("//a[@class='back-link']");
	
	private By comment = By.xpath("//tbody/tr[1]/td[9]/div[1]/button[4]//*[name()='svg']");

	private By commenttype = By.xpath("//input[@id='comment']");

	private By commentsubmit = By.xpath("//button[normalize-space()='Submit']");	
		
	
	
	
	
public OEINegative(WebDriver driver2) {
		// TODO Auto-generated constructor stub
	this.driver=driver2;
	}
public WebElement clickoei() {
	
	return driver.findElement(clickoei);
	}	
public WebElement Category() {
	
	return driver.findElement(Category);
	}	
public WebElement Priority() {
	
	return driver.findElement(Priority);
	}	
public WebElement Status() {
	
	return driver.findElement(Status);
	}		
public WebElement Reopened() {
	
	return driver.findElement(Reopened);
	}	
public WebElement First_Response_Time() {
	
	return driver.findElement(First_Response_Time);
	}	
public WebElement Resolution_Time() {
	
	return driver.findElement(Resolution_Time);
	}	
public WebElement False_Positives() {
	
	return driver.findElement(False_Positives);
	}
public WebElement Assignbutton() {
	
	return driver.findElement(Assignbutton);
	}
public WebElement Assign() {
	
	return driver.findElement(Assign);
	}
public WebElement submit1() {
	
	return driver.findElement(submit1);
	}
public WebElement details() {
	
	return driver.findElement(details);
	}
public WebElement searchbar() {
	
	return driver.findElement(searchbar);
	}
public WebElement incident() {
	
	return driver.findElement(incident);
	}
public WebElement Searchupdate() {
	
	return driver.findElement(Searchupdate);
	}
public WebElement typehere() {
	
	return driver.findElement(typehere);
	}
public WebElement Update() {
	
	return driver.findElement(Update);
	}
public WebElement back() {
	
	return driver.findElement(back);
	}
public WebElement comment() {
	
	return driver.findElement(comment);
	}

public WebElement commenttype() {
	
	return driver.findElement(commenttype);
	}
public WebElement commentsubmit() {
	
	return driver.findElement(commentsubmit);
	}

}
