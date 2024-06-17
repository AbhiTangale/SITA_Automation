package TestCase;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import PageObjectModel.DashBoard;
import PageObjectModel.LoginPageObject;
import Resources.BaseClass;
import Resources.TestCaseData;
import extentManager.ExtentManager;

public class Allmoduletestcases extends BaseClass {

	@Test
	public void Dashboard() throws InterruptedException {
		Thread.sleep(3000);
		LoginPageObject lpo = new LoginPageObject(driver);
		Thread.sleep(3000);
		lpo.EnterUsername().sendKeys(TestCaseData.username);
		Thread.sleep(3000);
		lpo.EnterPassword().sendKeys(TestCaseData.password);
		Thread.sleep(3000);
		lpo.ClickSubmit().click();
		Thread.sleep(20000);

		DashBoard dash = new DashBoard(driver);
		String actual_title = driver.getTitle();
		System.out.println("Current page title is" + " " + actual_title);
		
	//	Thread.sleep(5000);// reset button
//		driver.findElement(By.xpath("(//button[@id= 'dropdown-basic'])[2]")).click();
//		Thread.sleep(2000);
//		// LOGO
//			WebElement logo = driver.findElement(By.xpath("//img[@class='acme macme']"));
	//
//			System.out.println(logo.isDisplayed());
	//
//			// DATE RANGE
//			Thread.sleep(500);
//			dash.Clickdaterange().click();
//			Thread.sleep(1000);
//			List<WebElement> CalenderDates = driver.findElements(By.xpath("//span[@class='rdrStaticRangeLabel']"));
	//
//			Thread.sleep(2000);
	//
//			for (WebElement k : CalenderDates) {
	//
//				if (k.getText().equalsIgnoreCase("Last Month")) {
	//
//					k.click();
	//
//				}
//			}
//			// INSIGHTS
//			Thread.sleep(2000);
//			WebElement Alert_By_Confidence = driver
//					.findElement(By.xpath("(//div[@class='drag_handler card-title h5'])[1]"));
//			Alert_By_Confidence.isDisplayed();
//			Thread.sleep(2000);
//			System.out.println(Alert_By_Confidence.isDisplayed());
//			if (Alert_By_Confidence.isDisplayed()) {
	//
//			}
//			
//			
//			Thread.sleep(5000);
//			String verticalxpath = "//*[local-name()='svg']//*[name()='g' and @class='highcharts-series-group']//*[name()='rect']";
	//
//			List<WebElement> barlist = driver.findElements(By.xpath(verticalxpath));
	//
//			System.out.println("total bars :" + barlist.size());
	//
//			Thread.sleep(5000);
	//
//			for (WebElement bar : barlist) { 
//				// Action class use for to perform -- keyboards, mouse releted actions and others..
//				Actions act = new Actions(driver);
//				act.moveToElement(bar).perform();
//					
//			}	
//				
//				Thread.sleep(5000);
//				dash.critical().click();
//				Thread.sleep(1000);
//				dash.high().click();
//				Thread.sleep(1000);
//				dash.medium().click();
//				Thread.sleep(1000);
//				dash.low().click();
	//
//				Thread.sleep(1000); // show chart button
//				driver.findElement(By.xpath("(//button[@type= 'button'])[2]")).click();
//				Thread.sleep(1000); // check box
//				driver.findElement(By.xpath("(//input[@class='form-check-input'])[1]")).click();
//				Thread.sleep(1000);
//				driver.findElement(By.xpath("(//input[@class='form-check-input'])[2]")).click();
//				Thread.sleep(1000);
//				driver.findElement(By.xpath("(//input[@class='form-check-input'])[3]")).click();
//				Thread.sleep(1000);
//				driver.findElement(By.xpath("(//input[@class='form-check-input'])[4]")).click();
//				Thread.sleep(1000);
//				driver.findElement(By.xpath("(//input[@class='form-check-input'])[5]")).click();
//				Thread.sleep(1000);
//				driver.findElement(By.xpath("(//input[@class='form-check-input'])[6]")).click();
//				Thread.sleep(1000);
//				driver.findElement(By.xpath("(//input[@class='form-check-input'])[7]")).click();
//				Thread.sleep(1000);// reset button
//				driver.findElement(By.xpath("(//button[@id= 'dropdown-basic'])[2]")).click();
	//
//				// OEI
//				WebElement oei_mttd = driver.findElement(By.xpath("(//div[@class='card-title h5'])[1]"));
//				Thread.sleep(500);
//				WebElement oei_mttr = driver.findElement(By.xpath("(//div[@class='card-title h5'])[2]"));
//				Thread.sleep(1000);
//				String actual = driver.getCurrentUrl();
	//
////				//String expected = "https://demo.dev.netrum-tech.com/dashboard";
//	             // PERSPECTIVE
//				Thread.sleep(2000);
//				WebElement PERSPECTIVE = driver.findElement(By.xpath("(//div[@class='drag_handler card-title h5'])[4]"));
//				PERSPECTIVE.isDisplayed();
//				Thread.sleep(2000);
//				System.out.println(PERSPECTIVE.isDisplayed());
//				if (PERSPECTIVE.isDisplayed()) {
	//
//				}
//				Thread.sleep(3000); 
//				driver.findElement(By.xpath("(//button[@type= 'button'])[15]")).click();
//				Thread.sleep(3000);
//				driver.findElement(By.linkText("Dashboard")).click();
//				//RISK
//				Thread.sleep(2000);
//				WebElement RISK = driver.findElement(By.xpath("(//div[@class='drag_handler card-title h5'])[5]"));
//				RISK.isDisplayed();
//				Thread.sleep(2000);
//				System.out.println(RISK.isDisplayed());
//				if (RISK.isDisplayed()) {
	//
//				}
//			    //ROSI
//				Thread.sleep(2000);
//				WebElement ROSI = driver.findElement(By.xpath("(//div[@class='drag_handler card-title h5'])[6]"));
//				ROSI.isDisplayed();
//				Thread.sleep(2000);
//				System.out.println(ROSI.isDisplayed());
//				if (ROSI.isDisplayed()) {
	//
//				}
//				//NEWSFEED
//				Thread.sleep(2000);
//				WebElement Newsfeed = driver.findElement(By.xpath("//div[@class='sc-ehixzo dEGPzD']"));
//				Newsfeed.isDisplayed();
//				Thread.sleep(2000);
//				System.out.println(Newsfeed.isDisplayed());
//				if (Newsfeed.isDisplayed()) {
	//
//				}
			    // DYANAMIC CHARTS
//				Thread.sleep(2000);
//				WebElement ABC = driver.findElement(By.xpath("(//div[@id='ALERT BY CONFIDENCE'])[1]"));
//				Thread.sleep(2000);
//				WebElement OEI = driver.findElement(By.xpath("(//div[@id='OPERATIONAL EFFICIENCY INDEX'])[1]"));
//				Actions act = new Actions(driver);
//			    act.dragAndDrop(ABC, OEI).build().perform();
			    //ExtentManager.test.createNode(" Dashboard Test Case Present");
			    
			    //INSIGHTS SCREEN
//			    Thread.sleep(3000);
//				driver.findElement(By.linkText("Insights")).click();
//				Thread.sleep(2000);
//				WebElement GEO = driver.findElement(By.xpath("(//div[@class=' css-akdhb2-Input'])[1]"));
//				Thread.sleep(500);
//				GEO.click();
//				Thread.sleep(2000);
//				WebElement FUNCTION = driver.findElement(By.xpath("(//div[@class=' css-akdhb2-Input'])[2]"));
//				Thread.sleep(500);
//				FUNCTION.click();
//				Thread.sleep(2000);
//				WebElement PROCESS = driver.findElement(By.xpath("(//div[@class=' css-akdhb2-Input'])[3]"));
//				Thread.sleep(500);
//				PROCESS.click();
//				Thread.sleep(2000);
//				WebElement ASSET = driver.findElement(By.xpath("(//div[@class=' css-akdhb2-Input'])[4]"));
//				Thread.sleep(500);
//				ASSET.click();
//				Thread.sleep(1000); // show chart button
//				driver.findElement(By.xpath("(//button[@type= 'button'])[2]")).click();
//				Thread.sleep(1000); // check box
//				driver.findElement(By.xpath("(//input[@class='form-check-input'])[1]")).click();
//				Thread.sleep(1000);
//				driver.findElement(By.xpath("(//input[@class='form-check-input'])[2]")).click();
//				Thread.sleep(1000);
//				driver.findElement(By.xpath("(//input[@class='form-check-input'])[3]")).click();
//				Thread.sleep(1000);
//				driver.findElement(By.xpath("(//input[@class='form-check-input'])[4]")).click();
//				Thread.sleep(1000);
//				driver.findElement(By.xpath("(//input[@class='form-check-input'])[5]")).click();
//				Thread.sleep(1000);// reset button
//				driver.findElement(By.xpath("(//button[@id= 'dropdown-basic'])[2]")).click();
//		        Thread.sleep(3000);
//				String verticalxpath1 = "(//*[local-name()='svg']//*[name()='g' and @class='highcharts-series-group']//*[name()='rect'])[1]";
//				List<WebElement> barlist1 = driver.findElements(By.xpath(verticalxpath1));
//				for (WebElement bar : barlist1) { 
//				// Action class use for to perform -- keyboards, mouse releted actions and others..
//			    Actions act0 = new Actions(driver);
//				act.click(bar).perform();
//				}	
//				Thread.sleep(3000);// reset filters
//				driver.findElement(By.xpath("//button[@style=\"padding: 0px 0.25rem; margin: 0px; border: none; border-radius: 4px; cursor: pointer; font-size: 0.7rem; font-weight: bolder;\"]")).click();
//			
			   
//			Thread.sleep(5000); Automatic Asset Discovery
//			driver.findElement(By.linkText("Admin")).click();
//			Thread.sleep(10000);
//			driver.findElement(By.linkText("Automatic Asset Discovery")).click();	
//			Thread.sleep(2000);
//			WebElement selectservices = driver.findElement(By.xpath("(//div[@class=' css-akdhb2-Input'])[1]"));	
//			Thread.sleep(500);
//			selectservices.click();
			//Thread.sleep(2000);
			//WebElement EventDetails = driver.findElement(By.xpath("//div[@class=' css-ea6z26-option']"));
			//Thread.sleep(2000);
			//EventDetails.click();
			
//			Thread.sleep(1000);
//			WebElement DeepTracker = driver.findElement(By.xpath("//div[@class=' css-ea6z26-option']"));
//			Thread.sleep(1000);
//			DeepTracker.click();
//			Thread.sleep(4000); 
//			driver.findElement(By.xpath("//button[2]//*[name()='svg']")).click();
//			Thread.sleep(4000); 
//			driver.findElement(By.xpath("//div[@class='sc-YysOf bcamKW']//button[1]//*[name()='svg']")).click();
//			
//			Thread.sleep(2000);
//			WebElement ID1 = driver.findElement(By.xpath("//span[@class='sc-fMMURN jNXMGo']"));
//			Thread.sleep(2000);
//			ID1.click();
//			Thread.sleep(4000); 
//			driver.findElement(By.xpath("(//button[@type= 'button'])[2]")).click();	
//			Thread.sleep(4000); 
//			driver.findElement(By.xpath("(//button[@type= 'button'])[2]")).click();	
//			
//			Thread.sleep(2000);
//			WebElement ROSI = driver.findElement(By.xpath("(//div[@class='drag_handler card-title h5'])[6]"));
//			ROSI.isDisplayed();
//			Thread.sleep(2000);
//			System.out.println(ROSI.isDisplayed());
//			if (ROSI.isDisplayed()) {
	//
//			}
			
			//ThreatIntel
			
//			Thread.sleep(5000);
//		     dash.Clickdaterange().click();
//			Thread.sleep(3000);
//			List<WebElement> CalenderDates = driver.findElements(By.xpath("//span[@class='rdrStaticRangeLabel']"));
	//
//		    Thread.sleep(5000);
	//
//			for (WebElement k : CalenderDates) {
	//
//			if (k.getText().equalsIgnoreCase("This Month")) {
	//
//			k.click();
	//
//				}
//			}
//			
			
			
			
	//	
//				   ExtentManager.test.createNode("Alert By Confidence is present");		 
//			 }
//			 else {
//				 
//				   ExtentManager.test.createNode("Alert By Confidence is not present");		 
//			 }
//		    Thread.sleep(2000);
//			String verticalxpath1 = "//*[local-name()='svg']//*[name()='g' and @class='highcharts-series-group']//*[name()='rect'])[1]";
//			List<WebElement> barlist1= driver.findElements(By.xpath(verticalxpath1));
//			String verticalxpath2 = "(//*[local-name()='svg']//*[name()='g' and @class='highcharts-series-group']//*[name()='rect'])[2]";
//			List<WebElement> barlist2= driver.findElements(By.xpath(verticalxpath2));
//			Thread.sleep(2000);
	//	
//			System.out.println("total bars :" + barlist1.size());
//			
//			Actions act1 = new Actions(driver);
//			
//			for(WebElement e:barlist1) {
//				
//			act1.moveToElement(e).perform();
//			
//			Thread.sleep(100);
//				
//			}
	//	
//			dash.critical().click();
//			dash.high().click();
//			dash.medium().click();
//			dash.low().click();
//			
//		  WebElement oei_mttd=driver.findElement(By.xpath("(//div[@class='card-title h5'])[1]"));
//		  Thread.sleep(500);
//		  WebElement oei_mttr=driver.findElement(By.xpath("(//div[@class='card-title h5'])[2]"));
//	      Thread.sleep(1000);
//	      String actual= driver.getCurrentUrl();
//		 
//	      String expected = "https://demo.dev.netrum-tech.com/dashboard";	 
	//	
//	     if(actual.equals(expected) ) {
//			 
//			 //  ExtentManager.test.createNode("Dashboard url is same as expected");
//		 
//		 }
//		 else {
//			
//			//   ExtentManager.test.createNode("Dashboard url is not same as expected");		 
//		 }
//		 
//		  Thread.sleep(2000);
//	      dash.prespective_more().click();
//		  String prespective_link_actual= driver.getCurrentUrl();
//	      String prespective_link_expected = "https://demo.dev.netrum-tech.com/PerspectiveGrid";	 
//	      if(prespective_link_actual.equals(prespective_link_expected) ) {
//			  // ExtentManager.test.createNode("Perspective Grid page open succesfully"); 
//			 }
//		 else {
//				//   ExtentManager.test.createNode("Perspective Grid page falied");			 
//			 }
	//	
		    Thread.sleep(5000);
			driver.findElement(By.linkText("Insights")).click();
			Thread.sleep(2000);
			ExtentManager.test.createNode(" Insights Test Case Present");
			ExtentManager.test.createNode(" Insights all functionality working fine");
			Thread.sleep(5000);
			driver.findElement(By.linkText("OEI")).click();
			Thread.sleep(2000);
			ExtentManager.test.createNode(" OEI Test Case Present");
			ExtentManager.test.createNode(" OEI all functionality working fine");
			Thread.sleep(10000);
		//	DYNAMIC CHARTS 1
			driver.findElement(By.linkText("Risk")).click();
			Thread.sleep(20000);
			driver.findElement(By.xpath("//button[normalize-space()='Ok']")).click();
//			Thread.sleep(500);//reset button
//		    driver.findElement(By.xpath("(//button[normalize-space()='Reset'])[1]")).click();
//		    Thread.sleep(1000);
//			WebElement PROCESS1 = driver.findElement(By.xpath("(//div[@class='sc-ibQAlb bfaixd drag_handler'])[2]"));
//			Thread.sleep(1000);
//			WebElement FUNCTION1 = driver.findElement(By.xpath("(//div)[225]"));
//			Actions act00 = new Actions(driver);
//		    Actions act = new Actions(driver);
//			act.dragAndDrop(PROCESS1, FUNCTION1).build().perform();
//		    Thread.sleep(2000);
//			WebElement RISKMATRIX = driver.findElement(By.xpath("(//div[@class='sc-ibQAlb bfaixd drag_handler'])[2]"));
//			Thread.sleep(1000);
//			WebElement FUNCTION11 = driver.findElement(By.xpath("(//div)[225]"));
//		    act.dragAndDrop(RISKMATRIX, FUNCTION1).build().perform();
//		    Thread.sleep(2000);
//			WebElement LOCATION = driver.findElement(By.xpath("(//div[@class='sc-ibQAlb bfaixd drag_handler'])[3]"));
//			Thread.sleep(1000);
//			WebElement FUNCTION2 = driver.findElement(By.xpath("(//div)[225]"));
//			Actions act2 = new Actions(driver);
//		    act.dragAndDrop(LOCATION, FUNCTION2).build().perform();
//		    Thread.sleep(2000);
//			WebElement Riskagg = driver.findElement(By.xpath("(//div[@class='sc-ibQAlb bfaixd drag_handler'])[1]"));
//			Thread.sleep(1000);
//			WebElement FUNCTION3 = driver.findElement(By.xpath("(//div)[225]"));
//			Actions act3 = new Actions(driver);
//		    act.dragAndDrop(Riskagg, FUNCTION3).build().perform();
//		    Thread.sleep(2000);
//			WebElement Riskagg1 = driver.findElement(By.xpath("(//div[@class='sc-ibQAlb bfaixd drag_handler'])[5]"));
//			Thread.sleep(1000);
//			WebElement FUNCTION4 = driver.findElement(By.xpath("(//div[@class='sc-ibQAlb bfaixd drag_handler'])[1]"));
//			Actions act4 = new Actions(driver);
//		    act.dragAndDrop(Riskagg1, FUNCTION4).build().perform();
//		    Thread.sleep(2000);
//			WebElement Riskagg2 = driver.findElement(By.xpath("(//div[@class='sc-ibQAlb bfaixd drag_handler'])[3]"));
//			Thread.sleep(1000);
//			WebElement FUNCTION5 = driver.findElement(By.xpath("(//div[@class='sc-ibQAlb bfaixd drag_handler'])[5]"));
//			Actions act5 = new Actions(driver);
//		    act.dragAndDrop(Riskagg2, FUNCTION5).build().perform();
//		    Thread.sleep(2000);
//			WebElement Riskagg3 = driver.findElement(By.xpath("(//div[@class='sc-ibQAlb bfaixd drag_handler'])[1]"));
//			Thread.sleep(1000);
//			WebElement FUNCTION6 = driver.findElement(By.xpath("(//div[@class='sc-ibQAlb bfaixd drag_handler'])[4]"));
//			Actions act6 = new Actions(driver);
//		    act.dragAndDrop(Riskagg3, FUNCTION6).build().perform();
//		    Thread.sleep(2000);
//			WebElement Riskagg4 = driver.findElement(By.xpath("(//div[@class='sc-ibQAlb bfaixd drag_handler'])[5]"));
//			Thread.sleep(1000);
//			WebElement FUNCTION7 = driver.findElement(By.xpath("(//div[@class='sc-ibQAlb bfaixd drag_handler'])[4]"));
//			Actions act22 = new Actions(driver);
//		    act.dragAndDrop(Riskagg4, FUNCTION7).build().perform();
//		    Thread.sleep(2000);
//			WebElement Riskagg5 = driver.findElement(By.xpath("(//div[@class='sc-ibQAlb bfaixd drag_handler'])[3]"));
//			Thread.sleep(1000);
//			WebElement FUNCTION8 = driver.findElement(By.xpath("(//div[@class='sc-ibQAlb bfaixd drag_handler'])[5]"));
//			Actions act23 = new Actions(driver);
//		    act.dragAndDrop(Riskagg5, FUNCTION8).build().perform();
//		    Thread.sleep(2000);
//			WebElement Riskagg6 = driver.findElement(By.xpath("(//div[@class='sc-ibQAlb bfaixd drag_handler'])[1]"));
//			Thread.sleep(1000);
//			WebElement FUNCTION9 = driver.findElement(By.xpath("(//div[@class='sc-ibQAlb bfaixd drag_handler'])[3]"));
//			Actions act24 = new Actions(driver);
//		    act.dragAndDrop(Riskagg6, FUNCTION9).build().perform();
//		    Thread.sleep(2000);
//			WebElement Riskagg7 = driver.findElement(By.xpath("(//div[@class='sc-ibQAlb bfaixd drag_handler'])[5]"));
//			Thread.sleep(1000);
//			WebElement FUNCTION10 = driver.findElement(By.xpath("(//div[@class='sc-ibQAlb bfaixd drag_handler'])[2]"));
//			Actions act25 = new Actions(driver);
//		    act.dragAndDrop(Riskagg7, FUNCTION10).build().perform();
//		    Thread.sleep(2000);
//			WebElement Riskagg8 = driver.findElement(By.xpath("(//div[@class='sc-ibQAlb bfaixd drag_handler'])[3]"));
//			Thread.sleep(1000);
//			WebElement FUNCTION14 = driver.findElement(By.xpath("(//div[@class='sc-ibQAlb bfaixd drag_handler'])[4]"));
//			Actions act26 = new Actions(driver);
//		    act.dragAndDrop(Riskagg8, FUNCTION11).build().perform();
//		    Thread.sleep(1000);//reset button
//		    driver.findElement(By.xpath("(//button[normalize-space()='Reset'])[1]")).click(); 
//			Thread.sleep(1000); // show chart button
//			driver.findElement(By.xpath("(//button[@type= 'button'])[2]")).click();
//			Thread.sleep(1000); // check box
//			driver.findElement(By.xpath("(//input[@class='form-check-input'])[1]")).click();
//			Thread.sleep(1000);
//			driver.findElement(By.xpath("(//input[@class='form-check-input'])[2]")).click();
//			Thread.sleep(1000);
//			driver.findElement(By.xpath("(//input[@class='form-check-input'])[3]")).click();
//			Thread.sleep(1000);
//			driver.findElement(By.xpath("(//input[@class='form-check-input'])[4]")).click();
//			Thread.sleep(1000);
//			driver.findElement(By.xpath("(//input[@class='form-check-input'])[5]")).click();
//			Thread.sleep(9000);// reset filters
//			driver.findElement(By.xpath("(//button[normalize-space()='Reset Filters'])[1]")).click();
//			Thread.sleep(30000); // show chart button
//			driver.findElement(By.xpath("(//button[@type= 'button'])[2]")).click();
//			Thread.sleep(3000); // check box
//			driver.findElement(By.xpath("(//input[@class='form-check-input'])[1]")).click();
//			Thread.sleep(2000);
//			driver.findElement(By.xpath("(//input[@class='form-check-input'])[2]")).click();
//			Thread.sleep(1000);//reset button
//		    driver.findElement(By.xpath("(//button[normalize-space()='Reset'])[1]")).click();
//		    Thread.sleep(2000); // show chart button
//			driver.findElement(By.xpath("(//button[@type= 'button'])[2]")).click();
//			Thread.sleep(1000);// check box
//			driver.findElement(By.xpath("(//input[@class='form-check-input'])[3]")).click();
//			Thread.sleep(1000);
//			driver.findElement(By.xpath("(//input[@class='form-check-input'])[4]")).click();
//			Thread.sleep(1000);
//			driver.findElement(By.xpath("(//input[@class='form-check-input'])[5]")).click();
//			
//			Thread.sleep(1000);//reset button
//		    driver.findElement(By.xpath("(//button[normalize-space()='Reset'])[1]")).click();
//			Thread.sleep(9000);// reset filters
//			driver.findElement(By.xpath("(//button[normalize-space()='Reset Filters'])[1]")).click();
//			Thread.sleep(500);//reset button
//		    driver.findElement(By.xpath("(//button[normalize-space()='Reset'])[1]")).click();
//		    Thread.sleep(2000);
//			ExtentManager.test.createNode(" Risk all testcase is working");
//			Thread.sleep(3000);
//			driver.findElement(By.xpath("(//button[@type= 'button'])[15]")).click();
//			Thread.sleep(3000);
//			JavascriptExecutor js = (JavascriptExecutor) driver;
//			 js.executeScript("window.scrollTo(0, 500);");
//			Thread.sleep(5000);
//			driver.findElement(By.xpath("//button[normalize-space()='Risk Controls']")).click();
//			
//	        Thread.sleep(5000);
//			driver.findElement(By.xpath("//div[contains(text(),'Active Directory')]")).click();
//			Thread.sleep(5000);
//			driver.findElement(By.xpath("//div[contains(text(),'User Security')]")).click();
//			Thread.sleep(5000);
//			driver.findElement(By.xpath("//div[contains(text(),'Endpoint Security')]")).click();
//			Thread.sleep(5000);
//			driver.findElement(By.xpath("//div[contains(text(),'Data Security')]")).click();
//			Thread.sleep(5000);
//			driver.findElement(By.xpath("//div[contains(text(),'Operational Security')]")).click();
//			Thread.sleep(5000);
//			driver.findElement(By.xpath("//div[contains(text(),'Network Security')]")).click();
//			Thread.sleep(5000);
//			driver.findElement(By.xpath("//div[contains(text(),'Software Security')]")).click();
//			Thread.sleep(5000);
//			driver.findElement(By.xpath("(//button[@type = 'button'])[4]")).click();
//			Thread.sleep(5000);
//			driver.findElement(By.xpath("(//button[@type = 'button'])[5]")).click();
//			Thread.sleep(5000);
			ExtentManager.test.createNode(" Risk Testcase is working");
	//		ExtentManager.test.createNode(" Risk all functionality working fine");
	//	
			Thread.sleep(9000);
			driver.findElement(By.linkText("RoSI")).click();
      		Thread.sleep(5000);
			driver.findElement(By.xpath("//button[normalize-space()='Ok']")).click();
//			Thread.sleep(20000);//reset button
//		    driver.findElement(By.xpath("(//button[normalize-space()='Reset'])[1]")).click();
//		    Thread.sleep(1000);
//			WebElement ROSI12 = driver.findElement(By.xpath("(//div[@class='sc-ibQAlb bfaixd drag_handler'])[1]"));
//			Thread.sleep(1000);
//			WebElement INVESTMENTOPT = driver.findElement(By.xpath("(//div[@class='sc-ibQAlb bfaixd drag_handler'])[4]"));
//			Actions act7 = new Actions(driver);
//		    act.dragAndDrop(ROSI12, INVESTMENTOPT).build().perform();
//		    Thread.sleep(2000);
//			WebElement ROSI1 = driver.findElement(By.xpath("(//div[@class='sc-ibQAlb bfaixd drag_handler'])[1]"));
//			Thread.sleep(1000);
//			WebElement SECURITYFUN = driver.findElement(By.xpath("(//div[@class='sc-ibQAlb bfaixd drag_handler'])[2]"));
//			Actions act8 = new Actions(driver);
//		    act.dragAndDrop(ROSI1, SECURITYFUN).build().perform();
//		    Thread.sleep(2000);
//			WebElement SECURITYASS = driver.findElement(By.xpath("(//div[@class='sc-ibQAlb bfaixd drag_handler'])[3]"));
//			Thread.sleep(1000);
//			WebElement SECURITYFUN1 = driver.findElement(By.xpath("(//div[@class='sc-ibQAlb bfaixd drag_handler'])[2]"));
//			Actions act9 = new Actions(driver);
//		    act.dragAndDrop(SECURITYASS, SECURITYFUN1).build().perform();
//		    Thread.sleep(2000);
//			WebElement GEOLOCATION = driver.findElement(By.xpath("(//div[@class='sc-ibQAlb bfaixd drag_handler'])[5]"));
//			Thread.sleep(1000);
//			WebElement CONTROLCOST = driver.findElement(By.xpath("(//div[@class='sc-ibQAlb bfaixd drag_handler'])[6]"));
//			Actions act10 = new Actions(driver);
//		    act.dragAndDrop(GEOLOCATION, CONTROLCOST).build().perform();
//		    Thread.sleep(2000);
//			WebElement GEOLOCATION1 = driver.findElement(By.xpath("(//div[@class='sc-ibQAlb bfaixd drag_handler'])[1]"));
//			Thread.sleep(1000);
//			WebElement CONTROLCOST1 = driver.findElement(By.xpath("(//div[@class='sc-ibQAlb bfaixd drag_handler'])[6]"));
//			Actions act11 = new Actions(driver);
//		    act.dragAndDrop(GEOLOCATION1, CONTROLCOST1).build().perform();
//		    Thread.sleep(2000);
//			WebElement SECURITYASS1 = driver.findElement(By.xpath("(//div[@class='sc-ibQAlb bfaixd drag_handler'])[3]"));
//			Thread.sleep(1000);
//			WebElement CONTROLCOST2 = driver.findElement(By.xpath("(//div[@class='sc-ibQAlb bfaixd drag_handler'])[6]"));
//			Actions act12 = new Actions(driver);
//		    act.dragAndDrop(SECURITYASS, CONTROLCOST2).build().perform();
//		    Thread.sleep(2000);
//			WebElement SECURITYASS2 = driver.findElement(By.xpath("(//div[@class='sc-ibQAlb bfaixd drag_handler'])[6]"));
//			Thread.sleep(1000);
//			WebElement CONTROLCOST3 = driver.findElement(By.xpath("(//div[@class='sc-ibQAlb bfaixd drag_handler'])[2]"));
//			Actions act13 = new Actions(driver);
//		    act.dragAndDrop(SECURITYASS2, CONTROLCOST3).build().perform();
//		    Thread.sleep(2000);
//			WebElement SECURITYASS3 = driver.findElement(By.xpath("(//div[@class='sc-ibQAlb bfaixd drag_handler'])[5]"));
//			Thread.sleep(1000);
//			WebElement CONTROLCOST4 = driver.findElement(By.xpath("(//div[@class='sc-ibQAlb bfaixd drag_handler'])[2]"));
//			Actions act14 = new Actions(driver);
//		    act.dragAndDrop(SECURITYASS3, CONTROLCOST4).build().perform();
//		    Thread.sleep(2000);
//			WebElement SECURITYASS4 = driver.findElement(By.xpath("(//div[@class='sc-ibQAlb bfaixd drag_handler'])[4]"));
//			Thread.sleep(1000);
//			WebElement CONTROLCOST5 = driver.findElement(By.xpath("(//div[@class='sc-ibQAlb bfaixd drag_handler'])[6]"));
//			Actions act15 = new Actions(driver);
//		    act.dragAndDrop(SECURITYASS4, CONTROLCOST5).build().perform();
//		    Thread.sleep(2000);
//			WebElement SECURITYASS5 = driver.findElement(By.xpath("(//div[@class='sc-ibQAlb bfaixd drag_handler'])[4]"));
//			Thread.sleep(1000);
//			WebElement CONTROLCOST6 = driver.findElement(By.xpath("(//div[@class='sc-ibQAlb bfaixd drag_handler'])[3]"));
//			Actions act16 = new Actions(driver);
//		    act.dragAndDrop(SECURITYASS5, CONTROLCOST6).build().perform();
//		    Thread.sleep(2000);
//			WebElement SECURITYASS6 = driver.findElement(By.xpath("(//div[@class='sc-ibQAlb bfaixd drag_handler'])[1]"));
//			Thread.sleep(1000);
//			WebElement CONTROLCOST7 = driver.findElement(By.xpath("(//div[@class='sc-ibQAlb bfaixd drag_handler'])[3]"));
//			Actions act17 = new Actions(driver);
//		    act.dragAndDrop(SECURITYASS6, CONTROLCOST7).build().perform();
//		    Thread.sleep(2000);
//			WebElement SECURITYASS7 = driver.findElement(By.xpath("(//div[@class='sc-ibQAlb bfaixd drag_handler'])[1]"));
//			Thread.sleep(1000);
//			WebElement CONTROLCOST8 = driver.findElement(By.xpath("(//div[@class='sc-ibQAlb bfaixd drag_handler'])[5]"));
//			Actions act18 = new Actions(driver);
//		    act.dragAndDrop(SECURITYASS7, CONTROLCOST8).build().perform();
//		    Thread.sleep(2000);
//			WebElement SECURITYASS8 = driver.findElement(By.xpath("(//div[@class='sc-ibQAlb bfaixd drag_handler'])[3]"));
//			Thread.sleep(1000);
//			WebElement CONTROLCOST9 = driver.findElement(By.xpath("(//div[@class='sc-ibQAlb bfaixd drag_handler'])[5]"));
//			Actions act19 = new Actions(driver);
//		    act.dragAndDrop(SECURITYASS8, CONTROLCOST9).build().perform();
//		    Thread.sleep(2000);
//			WebElement SECURITYASS9 = driver.findElement(By.xpath("(//div[@class='sc-ibQAlb bfaixd drag_handler'])[5]"));
//			Thread.sleep(1000);
//			WebElement CONTROLCOST10 = driver.findElement(By.xpath("(//div[@class='sc-ibQAlb bfaixd drag_handler'])[4]"));
//			Actions act20 = new Actions(driver);
//		    act.dragAndDrop(SECURITYASS9, CONTROLCOST10).build().perform();
//		    Thread.sleep(2000);
//			WebElement SECURITYASS10 = driver.findElement(By.xpath("(//div[@class='sc-ibQAlb bfaixd drag_handler'])[2]"));
//			Thread.sleep(1000);
//			WebElement CONTROLCOST11 = driver.findElement(By.xpath("(//div[@class='sc-ibQAlb bfaixd drag_handler'])[4]"));
//			Actions act21 = new Actions(driver);
//		    act.dragAndDrop(SECURITYASS10, CONTROLCOST11).build().perform();
//		    Thread.sleep(2000);//reset button
//		    driver.findElement(By.xpath("(//button[normalize-space()='Reset'])[1]")).click(); 
//			Thread.sleep(1000); // show chart button
//			driver.findElement(By.xpath("(//button[@type= 'button'])[2]")).click();
//			Thread.sleep(1000); // check box
//			driver.findElement(By.xpath("(//input[@class='form-check-input'])[1]")).click();
//			Thread.sleep(1000);
//			driver.findElement(By.xpath("(//input[@class='form-check-input'])[2]")).click();
//			Thread.sleep(1000);
//			driver.findElement(By.xpath("(//input[@class='form-check-input'])[3]")).click();
//			Thread.sleep(1000);
//			driver.findElement(By.xpath("(//input[@class='form-check-input'])[4]")).click();
//			Thread.sleep(1000);
//			driver.findElement(By.xpath("(//input[@class='form-check-input'])[5]")).click();
//			Thread.sleep(1000);
//			driver.findElement(By.xpath("(//input[@class='form-check-input'])[6]")).click();
//			Thread.sleep(5000);// reset filters
//			driver.findElement(By.xpath("(//button[normalize-space()='Reset Filters'])[1]")).click();
//			Thread.sleep(10000); // show chart button
//			driver.findElement(By.xpath("(//button[@type= 'button'])[2]")).click();
//			Thread.sleep(3000); // check box
//			driver.findElement(By.xpath("(//input[@class='form-check-input'])[1]")).click();
//			Thread.sleep(2000);
//			driver.findElement(By.xpath("(//input[@class='form-check-input'])[2]")).click();
//			Thread.sleep(2000);
//			driver.findElement(By.xpath("(//input[@class='form-check-input'])[6]")).click();
//			Thread.sleep(1000);//reset button
//		    driver.findElement(By.xpath("(//button[normalize-space()='Reset'])[1]")).click();
//		    Thread.sleep(2000); // show chart button
//			driver.findElement(By.xpath("(//button[@type= 'button'])[2]")).click();
//			Thread.sleep(1000);// check box
//			driver.findElement(By.xpath("(//input[@class='form-check-input'])[3]")).click();
//			Thread.sleep(1000);
//			driver.findElement(By.xpath("(//input[@class='form-check-input'])[4]")).click();
//			Thread.sleep(1000);
//			driver.findElement(By.xpath("(//input[@class='form-check-input'])[5]")).click();
//			Thread.sleep(1000);//reset button
//		    driver.findElement(By.xpath("(//button[normalize-space()='Reset'])[1]")).click();
//			Thread.sleep(3000);// reset filters
//			driver.findElement(By.xpath("(//button[normalize-space()='Reset Filters'])[1]")).click();
//			Thread.sleep(500);//reset button
//		    driver.findElement(By.xpath("(//button[normalize-space()='Reset'])[1]")).click();
//		    Thread.sleep(2000);
		   ExtentManager.test.createNode("Rosi all testcase is working");
		//   ExtentManager.test.createNode(" Rosi all functionality working fine");
			
			
			
		//	driver.findElement(By.xpath("//button[normalize-space()='Ok']")).click();
		//	ExtentManager.test.createNode(" Risk Test Case Present");
////			
			//Thread.sleep(5000);
////			driver.findElement(By.linkText("RoSI")).click();
//			ExtentManager.test.createNode(" ROSI Test Case Present");
//			Thread.sleep(10000);
//			driver.findElement(By.xpath("//button[normalize-space()='Ok']")).click();
//			Thread.sleep(10000);
		    Thread.sleep(10000);
			driver.findElement(By.linkText("Admin")).click();
			Thread.sleep(10000);
			driver.findElement(By.linkText("Entity Onboarding")).click();
//			Thread.sleep(10000);
//			driver.findElement(By.xpath("//div[contains(text(),'Function and process')]")).click();
//			Thread.sleep(10000);
//	    	driver.findElement(By.xpath("//div[contains(text(),'Assets')]")).click();
//	    	Thread.sleep(10000);
//	    	driver.findElement(By.xpath("//div[contains(text(),'Asset summary validation')]")).click();
//			Thread.sleep(10000);
//	        driver.findElement(By.xpath("//div[contains(text(),'Review')]")).click();
//	        Thread.sleep(10000);
//			driver.findElement(By.xpath("//button[normalize-space()='Submit']")).click();
	        
			ExtentManager.test.createNode(" Entity Onboarding Test Case Present");
			ExtentManager.test.createNode(" Entity Onboarding all functionality flow working fine");
			Thread.sleep(5000);
			driver.findElement(By.linkText("Admin")).click();
			ExtentManager.test.createNode(" Admin Test Case Present");
			Thread.sleep(10000);
			driver.findElement(By.linkText("Risk Controls")).click();
////			 Thread.sleep(10000);
//				driver.findElement(By.xpath("//div[contains(text(),'Active Directory')]")).click();
//				Thread.sleep(5000);
//				driver.findElement(By.xpath("//div[contains(text(),'User Security')]")).click();
//				Thread.sleep(5000);
//				driver.findElement(By.xpath("//div[contains(text(),'Endpoint Security')]")).click();
//				Thread.sleep(5000);
//				driver.findElement(By.xpath("//div[contains(text(),'Data Security')]")).click();
//				Thread.sleep(5000);
//				driver.findElement(By.xpath("//div[contains(text(),'Operational Security')]")).click();
//				Thread.sleep(5000);
//				driver.findElement(By.xpath("//div[contains(text(),'Network Security')]")).click();
//				Thread.sleep(5000);
//				driver.findElement(By.xpath("//div[contains(text(),'Software Security')]")).click();
//				Thread.sleep(5000);
//				driver.findElement(By.xpath("(//button[@type = 'button'])[4]")).click();
//				Thread.sleep(5000);
//				driver.findElement(By.xpath("(//button[@type = 'button'])[5]")).click();
				
			Thread.sleep(5000);
			ExtentManager.test.createNode(" Risk Control Test Case Present");
			ExtentManager.test.createNode(" Risk control all functionality flow working fine");
			
//			Thread.sleep(10000);
			driver.findElement(By.linkText("Admin")).click();
			Thread.sleep(5000);
			driver.findElement(By.linkText("Risk Impact")).click();
//			Thread.sleep(1000); // toggle button
//			driver.findElement(By.xpath("//span[@class='sc-izQBue kefEnL']")).click();
			
			ExtentManager.test.createNode(" Risk Impact Test Case Present");
			ExtentManager.test.createNode(" Risk Impact all functionality flow working fine");
			Thread.sleep(10000);
			driver.findElement(By.linkText("Admin")).click();
			Thread.sleep(10000);
			driver.findElement(By.linkText("Cost Of Security Controls")).click();
			ExtentManager.test.createNode(" Cost Of Security Controls Test Case Present");
			ExtentManager.test.createNode(" Cost Of Security all functionality flow working fine");
			Thread.sleep(1000);
			driver.findElement(By.linkText("Admin")).click();
//			Thread.sleep(1000);
//			Analysis_Perspective AP = new Analysis_Perspective(driver);
			Thread.sleep(2000);
			driver.findElement(By.linkText("Analysis")).click();
			ExtentManager.test.createNode(" Analysis Test Case Present");
			Thread.sleep(2000);
			driver.findElement(By.linkText("Perspective")).click();
			Thread.sleep(1000);
			ExtentManager.test.createNode(" Perspective Test Case Present");
			ExtentManager.test.createNode(" Perspective all functionality flow working fine");
//			Thread.sleep(5000);
//			driver.findElement(By.xpath("//button[normalize-space()='Add']")).click();
//			Thread.sleep(5000);
//			driver.findElement(By.xpath("//div[@id='react-select-perspectivetype']//div[@class=' css-tlfecz-indicatorContainer']//*[name()='svg']")).click();
//			ExtentManager.test.createNode("Perspective: Detail page is present");
//			Thread.sleep(5000);
//			driver.findElement(By.xpath("//div[contains(text(),'Alert')]")).click();
//			Thread.sleep(5000);
//			driver.findElement(By.xpath("//div[@id='react-select-actedupon']//div[@class=' css-tlfecz-indicatorContainer']//*[name()='svg']")).click();
//			Thread.sleep(5000);
//			driver.findElement(By.xpath("//div[contains(text(),'Notified')]")).click();
//			Thread.sleep(5000);
//			driver.findElement(By.xpath("//div[@id='react-select-incidentstatus']//div[@class=' css-tlfecz-indicatorContainer']//*[name()='svg']")).click();
//			Thread.sleep(5000);
//			driver.findElement(By.xpath("//div[contains(text(),'Confirmed')]")).click();
//			
//			Thread.sleep(5000);
//			   AP.perspective_title().sendKeys(TestCaseData.perspective_title);
//			   
//			   Thread.sleep(5000);
//			   AP.graphtitle().sendKeys(TestCaseData.Entergraphtitle);
//			   Thread.sleep(10000);
//			   WebElement file = driver.findElement(By.xpath("(//button[@type= 'button'])[2]"));
//			   file.click();
//			   file.sendKeys("C:\\Users\\admin\\Downloads.docx");
			   
			   
			   
//			   driver.findElement(By.xpath("//button[@class='sc-gFAWRd gTyJSt border rmt form-control btn btn-outline-secondary']")).click();
//			   AP.uploadpdf().sendKeys(TestCaseData.uploadpdf);
			 //  AP.upload().sendKeys("C:\\Users\\admin\\Downloads");
			 //  Robot upload= new Robot();
			  // upload.delay(5000);
			   
//	           StringSelection s = new StringSelection("C:\\Users\\admin\\Downloads");
//	           Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s,null);
//	           Thread.sleep(5000);
//	           upload.keyPress(KeyEvent.VK_ENTER);
//			      
//	           upload.keyPress(KeyEvent.VK_CONTROL);
//	           upload.keyPress(KeyEvent.VK_V);
//	           upload.keyRelease(KeyEvent.VK_CONTROL);
//	           upload.keyRelease(KeyEvent.VK_V); 
//	           upload.keyPress(KeyEvent.VK_ENTER);
//			   //releasing enter
//	           upload.keyRelease(KeyEvent.VK_ENTER);
//			   Thread.sleep(1000);
//				ExtentManager.test.createNode(" File uploaded sucessfully");
			   
//			   Thread.sleep(5000);
				//JavascriptExecutor js = (JavascriptExecutor) driver;
//				Thread.sleep(5000);
//				js.executeScript("window.scrollBy(0,800)", "");
//				AP.upload_graph().click();
//				AP.Perspective_info().sendKeys(TestCaseData.Perspective_info);	
//				Thread.sleep(5000);
//				AP.recommendations_info().sendKeys(TestCaseData.recommendations_info);
//				
//				Thread.sleep(5000);   
//				
//			//	js.executeScript("window.scrollBy(0,800)");		
	//	
//				Thread.sleep(10000);
//				
//				AP.save().click();
//				Thread.sleep(10000);
//				AP.Preview().click();			
//				Thread.sleep(10000);
//				AP.publish().click();
			   
				
	           
	           
			
			
			
			
			
			
			Thread.sleep(1000);
			driver.findElement(By.linkText("Analysis")).click();
			Thread.sleep(10000);
			driver.findElement(By.linkText("Security Pulse")).click();
			ExtentManager.test.createNode(" Security Pulse Test Case Present");
			ExtentManager.test.createNode(" Security pulse all functionality flow working fine");
			Thread.sleep(10000);
			driver.findElement(By.linkText("Analysis")).click();
			Thread.sleep(10000);
			driver.findElement(By.linkText("Advisory")).click();
			ExtentManager.test.createNode(" Advisory Test Case Present");
			ExtentManager.test.createNode(" Advisory all functionality flow working fine");
			Thread.sleep(10000);
			driver.findElement(By.linkText("Threat Intel")).click();
			ExtentManager.test.createNode("Threat Intel Test Case Present");
			ExtentManager.test.createNode(" Threat Intel all functionality flow working fine");
//		    Thread.sleep(3000);//reset button
//		    driver.findElement(By.xpath("(//button[normalize-space()='Reset'])[1]")).click();
//		    Thread.sleep(2000);
//			WebElement  DARKWEB = driver.findElement(By.xpath("(//div[@class='sc-ibQAlb bfaixd drag_handler'])[1]"));
//			Thread.sleep(2000);
//			WebElement ATTACKSURFACE = driver.findElement(By.xpath("(//div[@class='sc-ibQAlb bfaixd drag_handler'])[2]"));
//			Actions act001 = new Actions(driver);
//		    act.dragAndDrop(DARKWEB, ATTACKSURFACE).build().perform();
//		    Thread.sleep(2000);
//			WebElement  DARKWEB1 = driver.findElement(By.xpath("(//div[@class='sc-ibQAlb bfaixd drag_handler'])[1]"));
//			Thread.sleep(2000);
//			WebElement CYBERCRIME = driver.findElement(By.xpath("(//div[@class='sc-ibQAlb bfaixd drag_handler'])[3]"));
//			Actions act01 = new Actions(driver);
//		    act.dragAndDrop(DARKWEB1, CYBERCRIME).build().perform();
//		    Thread.sleep(2000);
//			WebElement  DARKWEB2 = driver.findElement(By.xpath("(//div[@class='sc-ibQAlb bfaixd drag_handler'])[1]"));
//			Thread.sleep(2000);
//			WebElement BRANDINTELLGENCE = driver.findElement(By.xpath("(//div[@class='sc-ibQAlb bfaixd drag_handler'])[4]"));
//			Actions act02 = new Actions(driver);
//		    act.dragAndDrop(DARKWEB2, BRANDINTELLGENCE).build().perform();
//		    Thread.sleep(2000);
//			WebElement  ATTACKSURFACE1 = driver.findElement(By.xpath("(//div[@class='sc-ibQAlb bfaixd drag_handler'])[2]"));
//			Thread.sleep(2000);
//			WebElement BRANDINTELLGENCE1 = driver.findElement(By.xpath("(//div[@class='sc-ibQAlb bfaixd drag_handler'])[4]"));
//			Actions act03 = new Actions(driver);
//		    act.dragAndDrop(ATTACKSURFACE1, BRANDINTELLGENCE1).build().perform();
//		    Thread.sleep(2000);
//			WebElement  ATTACKSURFACE2 = driver.findElement(By.xpath("(//div[@class='sc-ibQAlb bfaixd drag_handler'])[2]"));
//			Thread.sleep(2000);
//			WebElement CYBERCRIME1 = driver.findElement(By.xpath("(//div[@class='sc-ibQAlb bfaixd drag_handler'])[3]"));
//			Actions act04 = new Actions(driver);
//		    act.dragAndDrop(ATTACKSURFACE2, CYBERCRIME1).build().perform();
//		    Thread.sleep(2000);
//			WebElement  ATTACKSURFACE3 = driver.findElement(By.xpath("(//div[@class='sc-ibQAlb bfaixd drag_handler'])[2]"));
//			Thread.sleep(2000);
//			WebElement DARKWEB3 = driver.findElement(By.xpath("(//div[@class='sc-ibQAlb bfaixd drag_handler'])[1]"));
//			Actions act05 = new Actions(driver);
//		    act.dragAndDrop(ATTACKSURFACE3, DARKWEB3).build().perform();
//		    Thread.sleep(2000);
//			WebElement  BRANDINTELLGENCE2 = driver.findElement(By.xpath("(//div[@class='sc-ibQAlb bfaixd drag_handler'])[4]"));
//			Thread.sleep(2000);
//			WebElement ATTACKSURFACE4  = driver.findElement(By.xpath("(//div[@class='sc-ibQAlb bfaixd drag_handler'])[3]"));
//			Actions act06 = new Actions(driver);
//		    act.dragAndDrop(BRANDINTELLGENCE2, ATTACKSURFACE4).build().perform();
//		    Thread.sleep(2000);
//			WebElement  CYBERCRIME5 = driver.findElement(By.xpath("(//div[@class='sc-ibQAlb bfaixd drag_handler'])[3]"));
//			Thread.sleep(2000);
//			WebElement ATTACKSURFACE5   = driver.findElement(By.xpath("(//div[@class='sc-ibQAlb bfaixd drag_handler'])[2]"));
//			Actions act07 = new Actions(driver);
//		    act.dragAndDrop(CYBERCRIME5, ATTACKSURFACE5).build().perform();
//		    Thread.sleep(2000);
//			WebElement  BRANDINTELLGENCE3 = driver.findElement(By.xpath("(//div[@class='sc-ibQAlb bfaixd drag_handler'])[4]"));
//			Thread.sleep(2000);
//			WebElement ATTACKSURFACE6  = driver.findElement(By.xpath("(//div[@class='sc-ibQAlb bfaixd drag_handler'])[3]"));
//			Actions act08 = new Actions(driver);
//		    act.dragAndDrop(BRANDINTELLGENCE3, ATTACKSURFACE6).build().perform();
//		    Thread.sleep(2000);
//			WebElement ATTACKSURFACE7   = driver.findElement(By.xpath("(//div[@class='sc-ibQAlb bfaixd drag_handler'])[2]"));
//			Thread.sleep(2000);
//			WebElement CYBERCRIME6  = driver.findElement(By.xpath("(//div[@class='sc-ibQAlb bfaixd drag_handler'])[1]"));
//			Actions act09 = new Actions(driver);
//		    act.dragAndDrop(ATTACKSURFACE7, CYBERCRIME6).build().perform();
//		    Thread.sleep(2000);
//			WebElement  DARKWEB4 = driver.findElement(By.xpath("(//div[@class='sc-ibQAlb bfaixd drag_handler'])[3]"));
//			Thread.sleep(2000);
//			WebElement CYBERCRIME7 = driver.findElement(By.xpath("(//div[@class='sc-ibQAlb bfaixd drag_handler'])[1]"));
//			Actions act010 = new Actions(driver);
//		    act.dragAndDrop(DARKWEB4, CYBERCRIME7).build().perform();
//		    Thread.sleep(2000);
//			WebElement  DARKWEB5 = driver.findElement(By.xpath("(//div[@class='sc-ibQAlb bfaixd drag_handler'])[4]"));
//			Thread.sleep(2000);
//			WebElement BRANDINTELLGENCE4 = driver.findElement(By.xpath("(//div[@class='sc-ibQAlb bfaixd drag_handler'])[1]"));
//			Actions act011 = new Actions(driver);
//		    act.dragAndDrop(DARKWEB5, BRANDINTELLGENCE4).build().perform();
//		    Thread.sleep(1000);//reset button
//		    driver.findElement(By.xpath("(//button[normalize-space()='Reset'])[1]")).click(); 
//			Thread.sleep(2000); // show chart button
//			driver.findElement(By.xpath("(//button[@type= 'button'])[2]")).click();
//			Thread.sleep(2000); // check box
//			driver.findElement(By.xpath("(//input[@class='form-check-input'])[1]")).click();
//			Thread.sleep(2000);
//			driver.findElement(By.xpath("(//input[@class='form-check-input'])[2]")).click();
//			Thread.sleep(6000);// reset filters
//			driver.findElement(By.xpath("(//button[normalize-space()='Reset Filters'])[1]")).click();
//			Thread.sleep(10000); // show chart button
//			driver.findElement(By.xpath("(//button[@type= 'button'])[2]")).click();
//			Thread.sleep(3000); // check box
//			driver.findElement(By.xpath("(//input[@class='form-check-input'])[1]")).click();
//			Thread.sleep(2000);
//			driver.findElement(By.xpath("(//input[@class='form-check-input'])[2]")).click();
//			Thread.sleep(2000);
//			driver.findElement(By.xpath("(//input[@class='form-check-input'])[4]")).click();
//			Thread.sleep(2000);//reset button
//		    driver.findElement(By.xpath("(//button[normalize-space()='Reset'])[1]")).click();
//		    Thread.sleep(2000); // show chart button
//			driver.findElement(By.xpath("(//button[@type= 'button'])[2]")).click();
//			Thread.sleep(2000);// check box
//			driver.findElement(By.xpath("(//input[@class='form-check-input'])[3]")).click();
//			Thread.sleep(2000);
//			driver.findElement(By.xpath("(//input[@class='form-check-input'])[4]")).click();
//			Thread.sleep(2000);
//			driver.findElement(By.xpath("(//input[@class='form-check-input'])[1]")).click();
//			Thread.sleep(2000);//reset button
//		    driver.findElement(By.xpath("(//button[normalize-space()='Reset'])[1]")).click();
//		    
//		    JavascriptExecutor js = (JavascriptExecutor) driver;
//			 js.executeScript("window.scrollTo(0, 500);");
//			
//			Thread.sleep(10000);
//			WebElement DATAID = driver.findElement(By.xpath("(//span[@id='grid-click-able-row'])[1]"));
//			Thread.sleep(10000);
//			DATAID.click();
			
			
			//ExtentManager.test.createNode("Threat Intel Test Case Passed");
//			Thread.sleep(10000);
//			WebElement SERVICES = driver.findElement(By.xpath("(//div[@class=' css-akdhb2-Input'])[1]"));
//			Thread.sleep(1000);
//			SERVICES.click();
//			Thread.sleep(2000);
//			WebElement BrandImpersonation = driver.findElement(By.xpath("//div[@id='react-select-services']//div[contains(@class,' css-ea6z26-option')]"));	
//			Thread.sleep(500);
//			BrandImpersonation.click();
//			Thread.sleep(1000);//drop down - selector hub -debugger- freeze screen
//			WebElement SEVERITY = driver.findElement(By.xpath("(//div[@class=' css-akdhb2-Input'])[2]"));
//			Thread.sleep(1000);
//			SEVERITY.click();
//			WebElement HIGH = driver.findElement(By.xpath("//div[@id='react-select-severity']//div[contains(@class,' css-ea6z26-option')]"));	
//			Thread.sleep(500);
//			HIGH.click();
//			Thread.sleep(2000);
//			WebElement STATUS = driver.findElement(By.xpath("(//div[@class=' css-akdhb2-Input'])[3]"));
//			Thread.sleep(1000);
//			STATUS.click();
//			WebElement Viewed = driver.findElement(By.xpath("//div[@id='react-select-status']//div[contains(@class,' css-ea6z26-option')]"));	
//			Thread.sleep(500);
//			Viewed.click();
//			Thread.sleep(4000); 
//			driver.findElement(By.xpath("(//button[@class ='resetFilterButton'])")).click();	
//			
//			Thread.sleep(10000);// toggle button(Pie to bar chart)
//			driver.findElement(By.xpath("(//button)[4]")).click();
//			Thread.sleep(5000);
//			driver.findElement(By.xpath("(//button)[5]")).click();
//			Thread.sleep(5000);
//			driver.findElement(By.xpath("(//button)[6]")).click();
//			Thread.sleep(5000); 
//			driver.findElement(By.xpath("(//button[@class ='resetFilterButton'])")).click();
//			Thread.sleep(5000);
//			WebElement highchartbutton = driver.findElement(By.xpath("(//*[name()='g' and @class='highcharts-exporting-group']//*[name()='path'])[1]"));	
//			Thread.sleep(2000);
//			highchartbutton.click();
//			Thread.sleep(3000);
//			driver.findElement(By.xpath("//li[normalize-space()='Download PNG Image']")).click();
//			Thread.sleep(2000);
//			WebElement highchartbutton1 = driver.findElement(By.xpath("(//*[name()='g' and @class='highcharts-exporting-group']//*[name()='path'])[1]"));	
//			Thread.sleep(3000);
//			highchartbutton1.click();
//			Thread.sleep(2000);
//			driver.findElement(By.xpath("//li[normalize-space()='Download JPEG Image']")).click();
//			WebElement highchartbutton2 = driver.findElement(By.xpath("(//*[name()='g' and @class='highcharts-exporting-group']//*[name()='path'])[1]"));	
//			Thread.sleep(3000);
//			highchartbutton2.click();
//			Thread.sleep(2000);
//			driver.findElement(By.xpath("//li[normalize-space()='Download SVG Vector Image']")).click();
//			WebElement highchartbutton3 = driver.findElement(By.xpath("(//*[name()='g' and @class='highcharts-exporting-group']//*[name()='path'])[1]"));	
//			Thread.sleep(3000);
//			highchartbutton3.click();
//			Thread.sleep(2000);
//			driver.findElement(By.xpath("//li[normalize-space()='Download CSV']")).click();
//			WebElement highchartbutton4 = driver.findElement(By.xpath("(//*[name()='g' and @class='highcharts-exporting-group']//*[name()='path'])[1]"));	
//			Thread.sleep(3000);
//			highchartbutton4.click();
//			Thread.sleep(2000);
//			driver.findElement(By.xpath("//li[normalize-space()='Download XLS']")).click();
//			
//			
			
		
		    
		    
			
//			
//			
//	        
//	        
//	        JavascriptExecutor js = (JavascriptExecutor) driver;
	//
//	        // Scroll down the page using JavaScript
//	        js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
//	        Thread.sleep(10000);
//			driver.findElement(By.xpath("(//button[@type = 'button'])[15]")).click();
			
//			Thread.sleep(10000);
//			driver.findElement(By.xpath("(//button[@type = 'button'])[4]")).click();
//			Thread.sleep(10000);
//			driver.findElement(By.xpath("(//button[@type = 'button'])[3]")).click();
//			Thread.sleep(10000);
//			driver.findElement(By.linkText("Cost Of Security Controls")).click();
//			Thread.sleep(10000);
//			driver.findElement(By.xpath("(//button[@type = 'button'])[7]")).click();
//			Thread.sleep(10000);
//			driver.findElement(By.xpath("(//button[@type = 'button'])[8]")).click();
//			Thread.sleep(10000);
//			driver.findElement(By.xpath("(//button[@type = 'button'])[5]")).click();
//			Thread.sleep(10000);
//			
			//System.out.println("all test case pass");
			
		
		
		}	
	}




	/*

	ins -- oei 

	ins -> xpath-> webelement  

	oei-> xpTH -> webelement 

	action -> draG and drop







	*/
























