package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class EditProfileNegative {
public WebDriver driver;
		
	private By RT = By.xpath("//a[@id='navbarDropdown']//*[name()='svg']");
	private By Edit_Profile = By.xpath("//span[normalize-space()='Edit Profile']");
	private By Email = By.xpath("//h5[normalize-space()='SitaAdmin']");
	private By Role = By.xpath("//h5[normalize-space()='rushikesh.taware@samta.ai']");
	private By FirstName = By.xpath("//input[@id='formHorizontalFirstName']");
	private By LastName = By.xpath("//div[@class='col-sm-8']//input[@id='formHorizontalLastName']");
	private By Profilephoto = By.xpath("//label[normalize-space()='Choose file']");
	private By phonenumber = By.xpath("//input[@placeholder='1 (702) 123-4567']");
	private By save = By.xpath("//button[normalize-space()='Save']");
	private By customSwitches = By.xpath("//label[@for='checkbox']");
	private By Translater = By.xpath("//select[@aria-label='Language Translate Widget']");
	private By ResetPassword = By.xpath("//span[normalize-space()='Reset Password']");
	private By OldPassword = By.xpath("(//input[@type='password'])[1]");
	private By newPassword = By.xpath("(//input[@type='password'])[2]");
	private By ConfirmPassword = By.xpath("(//input[@type='password'])[3]");
	private By ContactUs= By.xpath("//span[normalize-space()='Contact Us']");
	private By Description= By.xpath("//textarea[@id='exampleForm.ControlTextarea1']");	
	private By ContactUsEmail= By.xpath("//p[normalize-space()='info@netrum-tech.com']");
	private By Address= By.xpath("//p[contains(text(),'C 910-911, Noida One Building, Noida Sector 62, No')]");
	private By Logout= By.xpath("//span[normalize-space()='Logout']");

	private By submit= By.xpath("//button[normalize-space()='Submit']");

	
	
	
	
public EditProfileNegative(WebDriver driver2) {
		// TODO Auto-generated constructor stub
	this.driver= driver2;
	}
public WebElement RT() {
		
	return driver.findElement(RT);	
		
}
public WebElement Click_Edit_Profile() {
		
		return driver.findElement(Edit_Profile);
		}	
public WebElement Email() {
	
	return driver.findElement(Email);
	}	
public WebElement Role() {
	
	return driver.findElement(Role);
	}	
public WebElement FirstName() {
	
	return driver.findElement(FirstName);
	}	
public WebElement LastName() {
	
	return driver.findElement(LastName);
	}	
public WebElement Profilephoto() {
	
	return driver.findElement(Profilephoto);
	}	
public WebElement phonenumber() {
	
	return driver.findElement(phonenumber);
	}	
public WebElement save() {
	
	return driver.findElement(save);
	}

public WebElement customSwitches() {
	
	return driver.findElement(customSwitches);
	}

public WebElement Translater() {
	
	return driver.findElement(Translater);
	}	
public WebElement OldPassword() {
	
	return driver.findElement(OldPassword);
	}
public WebElement ResetPassword() {
	
	return driver.findElement(ResetPassword);
	}


public WebElement newPassword() {
	
	return driver.findElement(newPassword);
}

public WebElement ConfirmPassword() {
	
	return driver.findElement(ConfirmPassword);
	}
public WebElement Description() {
	
	return driver.findElement(Description);
	}
public WebElement ContactUs() {
	
	return driver.findElement(ContactUs);
	}

public WebElement ContactUsEmail() {
	
	return driver.findElement(ContactUsEmail);
	}
public WebElement Address() {
	
	return driver.findElement(Address);
	}


public WebElement Logout() {
	
	return driver.findElement(Logout);
	}


public WebElement submit() {
	
	return driver.findElement(submit);
	}

}



