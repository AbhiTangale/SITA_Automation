package Resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import extentManager.ExtentManager;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.testng.annotations.AfterSuite;

public class BaseClass {
	public static WebDriver driver;
	public Properties prop;

	public WebDriver BrowserLaunch() throws IOException {

		FileInputStream fis = new FileInputStream(
		System.getProperty("user.dir") + "\\src\\main\\java\\Resources\\data.properties");
		prop = new Properties();
		prop.load(fis);
		prop.getProperty("browser");
		String browsername = prop.getProperty("browser");

		if (browsername.equalsIgnoreCase("chrome")) {

//      WebDriverManager.chromedriver().setup();
//	    WebDriverManager.chromedriver().driverVersion("116.0.5845.111").setup();
//		ChromeOptions options = new ChromeOptions(); 
//		options.addArguments("--remote-allow-origins=*"); 
//		options.addArguments("--start-maximized");
		driver = new ChromeDriver();

		} else if (browsername.equalsIgnoreCase("firefox")) {
		}

		else if (browsername.equalsIgnoreCase("Edge")) {

//			driver = new EdgeDriver();
		}

		else
			System.out.println("please select valid browser");

		return driver;

	}

	@BeforeMethod
	public void LunchBrowser() throws IOException {

		BrowserLaunch();

		driver.get(prop.getProperty("url"));

		driver.manage().window().maximize();

	}

	@AfterMethod

	public void teardown() throws IOException {

	}

	@BeforeSuite
	public void BeforeSuite() {
		ExtentManager.setExtent();

	}

	@AfterSuite

	public void AfterSuite() {
		ExtentManager.endReport();
	}

	public static String screenShot(WebDriver driver, String filename) {
		String dateName = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
		TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
		File source = takesScreenshot.getScreenshotAs(OutputType.FILE);
		String destination = System.getProperty("user.dir") + "\\Screenshot\\" + filename + "_" + dateName + ".png";
		File finalDestination = new File(destination);
		try {
			FileUtils.copyFile(source, finalDestination);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.getMessage();
		}
		return destination;
	}

	public static String getCurrentTime() {
		String currentDate = new SimpleDateFormat("yyyy-MM-dd-hhmmss").format(new Date());
		return currentDate;

	}


		 

}
