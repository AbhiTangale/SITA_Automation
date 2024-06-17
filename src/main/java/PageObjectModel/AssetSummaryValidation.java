package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AssetSummaryValidation {

	
public WebDriver driver;
	
private By Admin = By.linkText("Admin");

private By entity_onboarding = By.xpath("//p[normalize-space()='Entity Onboarding']");
private By asv = By.xpath("//div[contains(text(),'Asset summary validation')]");
private By total1 = By.xpath("(//input[@type='number'])[1]");

private By total2 = By.xpath("(//input[@type='number'])[2]");
private By total3 = By.xpath("(//input[@type='number'])[3]");
private By total4 = By.xpath("(//input[@type='number'])[4]");
private By total5 = By.xpath("(//input[@type='number'])[5]");
private By total6 = By.xpath("(//input[@type='number'])[6]");
private By total7 = By.xpath("(//input[@type='number'])[7]");
private By total8 = By.xpath("(//input[@type='number'])[8]");
private By total9 = By.xpath("(//input[@type='number'])[9]");
private By total10 = By.xpath("(//input[@type='number'])[10]");

private By checkbox = By.xpath("(//input[@id='default-checkbox'])[1]");



public AssetSummaryValidation(WebDriver driver2) {
this.driver=driver2;
}

public WebElement Admin() {

	return driver.findElement(Admin);
}

public WebElement entity_onboarding() {

	return driver.findElement(entity_onboarding);
}
public WebElement asv() {

	return driver.findElement(asv);
}
public WebElement total1() {

	return driver.findElement(total1);
}
public WebElement total2() {

	return driver.findElement(total2);
}
public WebElement total3() {

	return driver.findElement(total3);
}
public WebElement total4() {

	return driver.findElement(total4);
}
public WebElement total5() {

	return driver.findElement(total5);
}
public WebElement total6() {

	return driver.findElement(total6);
}
public WebElement total7() {

	return driver.findElement(total7);
}
public WebElement total8() {

	return driver.findElement(total8);
}
public WebElement total9() {

	return driver.findElement(total9);
}
public WebElement total10() {

	return driver.findElement(total10);
}
public WebElement checkbox() {

	return driver.findElement(checkbox);
}
}
