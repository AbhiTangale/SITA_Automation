package TestCase;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import PageObjectModel.LoginPageObject;
import Resources.BaseClass;
import Resources.TestCaseData;
import extentManager.ExtentManager;

public class VerifyBrokenLinks extends BaseClass{
	
	
	@Test
	
public void  BrokenLinks() throws IOException, InterruptedException {
		
	Thread.sleep(5000);
	LoginPageObject lpo = new LoginPageObject(driver);
	Thread.sleep(5000);
	lpo.EnterUsername().sendKeys(TestCaseData.username);
	Thread.sleep(5000);
	lpo.EnterPassword().sendKeys(TestCaseData.password);
	lpo.ClickSubmit().click();

	Thread.sleep(30000);

	List<WebElement> links = driver.findElements(By.tagName("a"));
	Thread.sleep(2000);

//	System.out.print("No of links :-" + links.size());

	List<String> urlList = new ArrayList<String>();

	for (WebElement e : links) {
		String url = e.getAttribute("href");

		// urlList.add(url);
		checkbrokenlinks(url);
	}
	
	ExtentManager.test.createNode("Broken Links Test Case Passed Successfully!");

	driver.quit();
}

public static void checkbrokenlinks(String linkurl) {

	try {

		URL url = new URL(linkurl);
		HttpURLConnection httpUrlConnection = (HttpURLConnection) url.openConnection();
		httpUrlConnection.setConnectTimeout(5000);
		httpUrlConnection.connect();

		if (httpUrlConnection.getResponseCode() > 400) {
			
			ExtentManager.test.createNode(linkurl + "--->" + httpUrlConnection.getResponseMessage() + "is broken link");


			//System.out.println(linkurl + "--->" + httpUrlConnection.getResponseMessage() + "is broken link");
		}

		else {

			ExtentManager.test.createNode(linkurl + "--->" + httpUrlConnection.getResponseMessage());

		//	System.out.println(linkurl + "--->" + httpUrlConnection.getResponseMessage());

		}

	}

	catch (Exception e) {

	}

}

}
