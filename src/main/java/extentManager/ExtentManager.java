package extentManager;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import Resources.BaseClass;

public class ExtentManager {

	
	public static ExtentHtmlReporter htmlReporter;
	public static ExtentReports extent;
	public static ExtentTest test;
	 	
	
	public static void setExtent() {
		  htmlReporter= new ExtentHtmlReporter(System.getProperty("user.dir")+"/test-output/ExtentReport/"+"MyReport_"+BaseClass.getCurrentTime()+".html");
		  htmlReporter.loadXMLConfig(System.getProperty("user.dir")+"/extent-config.xml");
		  htmlReporter.config().setDocumentTitle("Automation Test Report");
		//  htmlReporter.config().setReportName("Demo Test Automation Report");
		//  htmlReporter.config().setTheme(Theme.STANDARD);
		  
		  extent = new ExtentReports();
		  extent.attachReporter(htmlReporter);
		  extent.setSystemInfo("HostName", "MyHost");
		  extent.setSystemInfo("Project Name", "SITA NETRUM");
		  extent.setSystemInfo("Client", "DEMO(Development)");
		  extent.setSystemInfo("Role", "Client Admin");
		  extent.setSystemInfo("Company", "Samta Infotech Pvt Ltd");
		  extent.setSystemInfo("Tester", "Rushikesh Taware and Komal Khawale");
		  extent.setSystemInfo("OS", "Windows 11");
		  extent.setSystemInfo("Browser", "Chrome");
		 
		  
		  
		 }
	
	  public static void endReport() {
		  extent.flush();
		 
		 }
	
	
	
}
