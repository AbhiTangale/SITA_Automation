package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RoSIPageObject {
	
	
public WebDriver driver;
	
	
private By rosi = By.xpath("//a[normalize-space()='RoSI']");
private By rosichartmenu= By.xpath("(//*[local-name()='svg']//*[name()='g' and @class='highcharts-exporting-group']//*[name()='path'])[1]");
private By pngimage= By.xpath("//li[normalize-space()='Download PNG Image']");	
private By jpegimage= By.xpath("//li[normalize-space()='Download JPEG Image']");	
private By svgimage= By.xpath("//li[normalize-space()='Download SVG Vector Image']");	
private By cvgimage= By.xpath("//li[normalize-space()='Download CSV']");	
private By xlsimage = By.xpath("//li[normalize-space()='Download XLS']");
private By iocchartmenu= By.xpath("(//*[local-name()='svg']//*[name()='g' and @class='highcharts-exporting-group']//*[name()='path'])[2]");
private By sifchartmenu= By.xpath("(//*[local-name()='svg']//*[name()='g' and @class='highcharts-exporting-group']//*[name()='path'])[3]");
private By siachartmenu= By.xpath("(//*[local-name()='svg']//*[name()='g' and @class='highcharts-exporting-group']//*[name()='path'])[4]");
private By tichartmenu= By.xpath("(//*[local-name()='svg']//*[name()='g' and @class='highcharts-exporting-group']//*[name()='path'])[5]");




public RoSIPageObject(WebDriver driver2) {
	this.driver = driver2;

}

public WebElement rosi() {

	return driver.findElement(rosi);
}

public WebElement rosichartmenu() {

	return driver.findElement(rosichartmenu);
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
public WebElement iocchartmenu() {

	return driver.findElement(iocchartmenu);
}
public WebElement sifchartmenu() {

	return driver.findElement(sifchartmenu);
}
public WebElement siachartmenu() {

	return driver.findElement(siachartmenu);
}
public WebElement tichartmenu() {

	return driver.findElement(tichartmenu);
}

}
