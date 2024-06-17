package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Analysis_Perspective {
	
public WebDriver driver;
	
	//private By RT = By.xpath("//span[contains(text(),'RT')]");
	
	private By clickonAnalysis = By.linkText("Analysis");

	private By clickonPerspective = By.xpath("//a[normalize-space()='Perspective']");
	private By Clickdaterange=By.xpath("//button[@class='btn btn-outline  mt-1 ']");

	
	private By perspective_type_dropdown = By.xpath("//div[contains(text(),'Perspective Type')]");

	
	private By action_taken_dropdown = By.xpath("//div[contains(text(),'Action Taken')]");

	private By status_dropdown = By.xpath("//div[contains(text(),'Status')]");

	private By clickonAdd = By.xpath("//button[normalize-space()='Add']");

	private By PERSPECTIVETYPE = By.xpath("//div[@class='row']//div[1]//div[1]//div[1]//div[2]//div[1]//*[name()='svg']");

	//div[@id='react-select-2-placeholder']
	
	private By in_parentincident = By.xpath("//input[@placeholder='Incidents/Parent Incident']");

	private By actedupon = By.xpath("//div[@id='react-select-9-placeholder']");
	
	
	private By  Pattern= By.xpath("//div[contains(text(),'Pattern')]");

	private By Incident = By.xpath("//div[contains(text(),'Incident')]");

	private By INCIDENT_STATUS = By.xpath("//div[@id='react-select-10-placeholder']");
	
	private By perspective_title = By.xpath("//input[@placeholder='PERSPECTIVE TITLE']");

	
	private By upload_graph = By.xpath("//body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[3]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/button[1]/span[1]");

	private By graphtitle = By.xpath("//input[@placeholder='ENTER GRAPH TITLE']");

	
	private By Perspective_info = By.xpath("(//textarea[@placeholder='Enter Information'])[1]");

	private By recommendations_info = By.xpath("(//textarea[@placeholder='Enter Information'])[2]");

	private By tags_assets = By.xpath("//input[@placeholder='Assets']");
	private By tags_entity = By.xpath("//input[@placeholder='Entity']");

//	private By Preview = By.xpath("(//button[@type='submit'])[2]");

	private By clickonIncidents = By.xpath("//span[@class='text-capitalize']");

	private By save = By.xpath("//button[normalize-space()='Save as Draft']");

	private By Preview = By.xpath("//button[normalize-space()='Preview']");
	private By publish = By.xpath("//button[normalize-space()='Publish']");

	private By detail = By.xpath("(//*[local-name()='svg'][@fill='currentColor'])[5]");
	
//	private By detail = By.xpath("(//*[local-name()='svg'][@fill='currentColor']//*[local-name()='path'])[6]");

//	private By download = By.xpath("(//button[@type='button'])[4]");
	private By download = By.xpath("(//*[name()='svg'][@stroke='currentColor'])[8]");

	
	

//	private By share = By.xpath("(//button[@type='button'])[5]");

	private By share = By.xpath("(//*[name()='svg'][@stroke='currentColor'])[9]");

	
		
	private By back = By.xpath("//div[contains(@class,'my-3 align-items-center justify-content-between p-2 row')]//span[1]");

	
	
			
				
		
			
					
					
	
	public Analysis_Perspective(WebDriver driver2) {
		this.driver=driver2;
	}
	public WebElement clickonAnalysis() {
		
		return driver.findElement(clickonAnalysis);	
   }
    public WebElement clickonPerspective() {
		
		return driver.findElement(clickonPerspective);	
			
	}
 public WebElement perspective_type_dropdown() {
		
		return driver.findElement(perspective_type_dropdown);			
	}
 public WebElement action_taken_dropdown() {
		
		return driver.findElement(action_taken_dropdown);			
	}
 
 
 public WebElement status_dropdown() {
		
		return driver.findElement(status_dropdown);			
	}

 public WebElement  clickonAdd() {
		
		return driver.findElement(clickonAdd);			
	}
 public WebElement  PERSPECTIVETYPE() {
		
		return driver.findElement(PERSPECTIVETYPE);			
	}
 
 public WebElement  in_parentincident() {
		
		return driver.findElement(in_parentincident);			
	}

 public WebElement  actedupon() {
		
		return driver.findElement(actedupon);			
	}
 
 public WebElement  Pattern() {
		
		return driver.findElement(Pattern);			
	}

 public WebElement  Incident() {
		
		return driver.findElement(Incident);			
	}
 public WebElement  INCIDENT_STATUS() {
		
		return driver.findElement(INCIDENT_STATUS);			
	}
 public WebElement  perspective_title() {
		
		return driver.findElement(perspective_title);			
	}
 public WebElement  upload_graph() {
		
		return driver.findElement(upload_graph);			
	}
 public WebElement  graphtitle() {
		
		return driver.findElement(graphtitle);			
	}
 public WebElement  Perspective_info() {
		
		return driver.findElement(Perspective_info);			
	}
 public WebElement recommendations_info() {
		
		return driver.findElement(recommendations_info);			
	}
 public WebElement tags_assets() {
		
		return driver.findElement(tags_assets);			
	}
 public WebElement tags_entity() {
		
		return driver.findElement(tags_entity);			
	}
 public WebElement Preview() {
		
		return driver.findElement(Preview);		
	}
 
 public WebElement clickonIncidents() {
		
		return driver.findElement(clickonIncidents);		
	}
 
 public WebElement save() {
		
		return driver.findElement(save);		
	}

 
 public WebElement publish() {
		
		return driver.findElement(publish);		
	}
 
 public WebElement detail() {
		
		return driver.findElement(detail);		
	}
 
 public WebElement back() {
		
		return driver.findElement(back);		
	}
 public WebElement Clickdaterange() {
		
		return driver.findElement(Clickdaterange);		
	}

 public WebElement download() {
		
		return driver.findElement(download);		
	}
 public WebElement share() {
		
		return driver.findElement(share);		
	}
 
}
