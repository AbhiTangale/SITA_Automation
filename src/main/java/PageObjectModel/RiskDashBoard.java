package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RiskDashBoard {

	
	public WebDriver driver;
	
	
	private By risk = By.xpath("//a[normalize-space()='Risk']");
	private By functionchartmenu= By.xpath("(//*[local-name()='svg']//*[name()='g' and @class='highcharts-exporting-group']//*[name()='path'])[1]");
	private By pngimage= By.xpath("//li[normalize-space()='Download PNG Image']");	
	private By jpegimage= By.xpath("//li[normalize-space()='Download JPEG Image']");	
	private By svgimage= By.xpath("//li[normalize-space()='Download SVG Vector Image']");	
	private By cvgimage= By.xpath("//li[normalize-space()='Download CSV']");	
	private By xlsimage = By.xpath("//li[normalize-space()='Download XLS']");
	private By processchartmenu= By.xpath("(//*[local-name()='svg']//*[name()='g' and @class='highcharts-exporting-group']//*[name()='path'])[2]");
	private By riskmatrix= By.xpath("(//*[local-name()='svg']//*[name()='g' and @class='highcharts-exporting-group']//*[name()='path'])[3]");
//	private By functionchartmenu= By.xpath("(//*[local-name()='svg']//*[name()='g' and @class='highcharts-exporting-group']//*[name()='path'])[4]");
//	private By processchartmenu= By.xpath("(//*[local-name()='svg']//*[name()='g' and @class='highcharts-exporting-group']//*[name()='path'])[5]");
//	private By riskmatrix= By.xpath("(//*[local-name()='svg']//*[name()='g' and @class='highcharts-exporting-group']//*[name()='path'])[6]");

	private By riskjourney= By.xpath("//button[normalize-space()='Risk Controls']");


	

	
	
	
	
	
	
	public RiskDashBoard(WebDriver driver2) {
		this.driver=driver2;
	}
	
	public WebElement risk() {

		return driver.findElement(risk);
	}	
//	public WebElement inherentchartmenu() {
//
//		return driver.findElement(inherentchartmenu);
//	}	
//	public WebElement residualchartmenu() {
//
//		return driver.findElement(residualchartmenu);
//	}	
//	
//	public WebElement riskaggregationchartmenu() {
//
//		return driver.findElement(riskaggregationchartmenu);
//	}	
//	
	public WebElement functionchartmenu() {

		return driver.findElement(functionchartmenu);
	}	
	
	public WebElement processchartmenu() {

		return driver.findElement(processchartmenu);
	}	
	public WebElement riskmatrix() {

		return driver.findElement(riskmatrix);
	}	
	
	public WebElement pngimage() {

		return driver.findElement(pngimage);
	}	
	public WebElement jpegimage() {

		return driver.findElement(jpegimage);
	}	
	public WebElement cvgimage() {

		return driver.findElement(cvgimage);
	}	
	public WebElement svgimage() {

		return driver.findElement(svgimage);
	}	
	public WebElement xlsimage() {

		return driver.findElement(xlsimage);
	}	
	public WebElement riskjourney() {

		return driver.findElement(riskjourney);
	}	
	
}
