package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPageObjectNegative {

	
	
public WebDriver driver;
	
	private By username1= By.xpath("//input[@type='email']");	
	
	private By password1= By.xpath("//input[@type='password']");	
	
	private By submit = By.xpath("//button[@type='submit']");
	
	
	private By erroruser = By.xpath("//div[@role='alert']");
	
	private By nouserfound = By.linkText("Password verification failed.");
	
	
	private By ForgetPassword  = By.xpath("(//h5[normalize-space()='Forget Password ?'])[1]");
	
	
	private By EnterEmail_forgetpassword  = By.xpath("//input[@class='form-control']");

	
	
	//span[@class='text-danger']
	//private By errorpassword = By.xpath("//div[@role='alert']");
	
	
	

public LoginPageObjectNegative(WebDriver driver2) {
		// TODO Auto-generated constructor stub
	this.driver=driver2;
	}
public WebElement EnterUsername() {
	
	return driver.findElement(username1);
	
}
public WebElement EnterPassword() {
	
	return driver.findElement(password1);
	
	
}
	
public WebElement ClickSubmit () {
	
	return driver.findElement(submit);	
		
}	

public WebElement erroruser () {
	
	return driver.findElement(erroruser);

}
public WebElement  nouserfound() {
	
	return driver.findElement(nouserfound);

}
public WebElement ForgetPassword () {
	
	return driver.findElement(ForgetPassword);

}
	public WebElement EnterEmail_forgetpassword () {
		
	return driver.findElement(EnterEmail_forgetpassword);

	}







}
