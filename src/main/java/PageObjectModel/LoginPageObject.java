package PageObjectModel;



	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;

	public class LoginPageObject {// store all xpath here 
		//this driver dont have scope 
		public WebDriver  driver;
		
	//driver.findElement(By.xpath("").sendkeys();	


	    	//decalre private-use-encapsulation-opps concept

	   	//private access within that class only 
		
	   
	// we have achived encapsulation here 
		private By EnterEmail = By.xpath("//input[@type='email']");	//decalre private-use-encapsulation-opps concept
		private By EnterPassword = By.xpath("//input[@type='password']");	//private acc
	    private By ClickSubmit=By.xpath("//button[normalize-space()='Submit']"); 
	    private By  TryForFree = By.xpath("//a[@id='signup_link']");
	    private By  Dashboard = By.linkText("Dashboard");

		//giving scope to driver by using this//this means this class
		

		public LoginPageObject(WebDriver driver2) {
		this.driver =driver2;
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
		
	    public WebElement ClickOnTryForFree () {
	    return driver.findElement( TryForFree );
	}
		
	    public WebElement Dashboard () {
		    return driver.findElement( Dashboard );
		}
		
		
		
		
		
	}


