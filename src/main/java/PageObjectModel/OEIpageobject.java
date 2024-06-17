package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class OEIpageobject {

	
	
public WebDriver driver;
	
	
	private By clickoei= By.linkText("OEI");
	
	
	
	
	private By mttdchart= By.xpath("(//*[local-name()='svg']//*[name()='g' and @class='highcharts-exporting-group']//*[name()='path'])[1]");	
	private By mttnchart= By.xpath("(//*[local-name()='svg']//*[name()='g' and @class='highcharts-exporting-group']//*[name()='path'])[2]");	
	private By mttrchart= By.xpath("(//*[local-name()='svg']//*[name()='g' and @class='highcharts-exporting-group']//*[name()='path'])[3]");	
	private By falsepositiveratechart= By.xpath("(//*[local-name()='svg']//*[name()='g' and @class='highcharts-exporting-group']//*[name()='path'])[4]");	
	private By alertchar= By.xpath("(//*[local-name()='svg']//*[name()='g' and @class='highcharts-exporting-group']//*[name()='path'])[5]");	

	
	
	
	private By pngimage= By.xpath("//li[normalize-space()='Download PNG Image']");	
	private By jpegimage= By.xpath("//li[normalize-space()='Download JPEG Image']");	
	private By svgimage= By.xpath("//li[normalize-space()='Download SVG Vector Image']");	
	private By cvgimage= By.xpath("//li[normalize-space()='Download CSV']");	
	private By xlsimage = By.xpath("//li[normalize-space()='Download XLS']");
    private By Clickdaterange=By.xpath("//button[@class='btn btn-outline dateSelectorButton']");

	
	
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
		
	private By mtd = By.xpath("((//*[local-name()='svg']//*[name()='g' and @class='highcharts-legend highcharts-no-tooltip'])[1]//*[name()='path'])[2]");	

	private By mtr = By.xpath("((//*[local-name()='svg']//*[name()='g' and @class='highcharts-legend highcharts-no-tooltip'])[2]//*[name()='path'])[2]");	

	private By mtn = By.xpath("((//*[local-name()='svg']//*[name()='g' and @class='highcharts-legend highcharts-no-tooltip'])[3]//*[name()='path'])[2]");	

	private By irr = By.xpath("((//*[local-name()='svg']//*[name()='g' and @class='highcharts-legend highcharts-no-tooltip'])[4]//*[name()='path'])[2]");	

	private By fpr = By.xpath("((//*[local-name()='svg']//*[name()='g' and @class='highcharts-legend highcharts-no-tooltip'])[5]//*[name()='path'])[2]");	

	private By number_of_alerts_1 = By.xpath("(//*[local-name()='svg']//*[name()='g' and @class='highcharts-legend highcharts-no-tooltip']//*[name()='rect'])[5]");	

	private By number_of_alerts_2 = By.xpath("(//*[local-name()='svg']//*[name()='g' and @class='highcharts-legend highcharts-no-tooltip']//*[name()='rect'])[7]");	

	private By reset = By.xpath("(//button[@id='dropdown-basic'])[2]");	

	
	
	
	
	
	
	
	
	

public OEIpageobject(WebDriver driver2) {
	this.driver=driver2;
		// TODO Auto-generated constructor stub
	}
public WebElement Clickdaterange() {
	
	return driver.findElement(Clickdaterange);
	}
public WebElement clickoei() {
	
	return driver.findElement(clickoei);
	}

public WebElement alertchar() {
	
	return driver.findElement(alertchar);
	}	
public WebElement mttnchart() {
	
	return driver.findElement(mttnchart);
	}	
public WebElement mttrchart() {
	
	return driver.findElement(mttrchart);
	}	
public WebElement falsepositiveratechart() {
	
	return driver.findElement(falsepositiveratechart);
	}	
public WebElement mttdchart() {
	
	return driver.findElement(mttdchart);
	}	
public WebElement pngimage() {
	
	return driver.findElement(pngimage);
	}	
public WebElement jpegimage() {
	
	return driver.findElement(jpegimage);
	}	
public WebElement svgimage() {
	
	return driver.findElement(svgimage);
	}	
public WebElement cvgimage() {
	
	return driver.findElement(cvgimage);
	}	
public WebElement xlsimage() {
	
	return driver.findElement(xlsimage);
	
	
	
	
	
	
	
	
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
public WebElement mtd() {
	
	return driver.findElement(mtd);
	}
public WebElement mtr() {
	
	return driver.findElement(mtr);
	}
public WebElement mtn() {
	
	return driver.findElement(mtn);
	}
public WebElement irr() {
	
	return driver.findElement(irr);
	}
public WebElement fpr() {
	
	return driver.findElement(fpr);
	}
public WebElement number_of_alerts_1() {
	
	return driver.findElement(number_of_alerts_1);
	}
public WebElement number_of_alerts_2() {
	
	return driver.findElement(number_of_alerts_2);
	}
public WebElement reset() {
	
	return driver.findElement(reset);
	}
}


