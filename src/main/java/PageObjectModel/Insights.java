package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Insights {

	public WebDriver driver;
	private By Insights= By.linkText("Insights");
    private By Clickdaterange=By.xpath("//button[@class='btn btn-outline dateSelectorButton']");
	private By request_type1 = By.xpath("(//*[local-name()='svg']//*[name()='g' and @class='highcharts-series-group']//*[name()='path'])[1]");
	private By request_type2 = By.xpath("(//*[local-name()='svg']//*[name()='g' and @class='highcharts-series-group']//*[name()='path'])[2]");
	private By request_type3 = By.xpath("(//*[local-name()='svg']//*[name()='g' and @class='highcharts-series-group']//*[name()='path'])[3]");
	private By request_status1 = By.xpath("(//*[local-name()='svg']//*[name()='g' and @class='highcharts-series-group']//*[name()='path'])[4]");
	private By request_status2 = By.xpath("(//*[local-name()='svg']//*[name()='g' and @class='highcharts-series-group']//*[name()='path'])[2]");
	private By request_status3 = By.xpath("(//*[local-name()='svg']//*[name()='g' and @class='highcharts-series-group']//*[name()='path'])[6]");
	//private By Reset_Filters = By.xpath("//button[normalize-space()='Reset Filters']");
	private By Reset_Filters = By.xpath("//button[@style='padding: 0px 0.25rem; margin: 0px; border: none; border-radius: 4px; cursor: pointer; font-size: 0.7rem; font-weight: bolder;']");
	//private By request_type4 = By.xpath("(//div[@color='#3C486B'])[2]");	
	private By alertsbyconfidence_chart1= By.xpath("(//*[local-name()='svg']//*[name()='g' and @class='highcharts-series-group']//*[name()='rect'])[1]");	     
	private By alertsbyconfidence_chart2= By.xpath("(//*[local-name()='svg']//*[name()='g' and @class='highcharts-series-group']//*[name()='rect'])[2]");	
	private By chartmenu= By.xpath("(//*[local-name()='svg']//*[name()='g' and @class='highcharts-exporting-group']//*[name()='path'])[1]");
	private By pngimage= By.xpath("//li[normalize-space()='Download PNG Image']");	
	private By jpegimage= By.xpath("//li[normalize-space()='Download JPEG Image']");	
	private By svgimage= By.xpath("//li[normalize-space()='Download SVG Vector Image']");	
	private By cvgimage= By.xpath("//li[normalize-space()='Download CSV']");	
	private By xlsimage = By.xpath("//li[normalize-space()='Download XLS']");	
	private By top10assets_a_c_1 = By.xpath("(//div[@color='#19A7CE'])[2]");	
	private By top10assets_a_c_2 = By.xpath("(//div[@color='#0A4D68'])[2]");				
	private By top10assets_a_c_3 = By.xpath("(//div[@color='#3C486B'])[2]");
	private By top10assets_a_c_4 = By.xpath("(//div[@color='#917FB3'])[2]");
	private By top10assets_a_c_5 = By.xpath("(//div[@color='#A9907E'])[2]");
	private By top10assets_a_c_6 = By.xpath("(//div[@color='#00FFCA'])[2]");
	private By top10assets_a_c_7 = By.xpath("(//div[@color='#D14D72'])[2]");
	private By top10assets_a_c_8 = By.xpath("//div[@color='#0081C9']");
	private By top10assets_a_c_9 = By.xpath("//div[@color='#7FBCD2']");
	private By top10assets_a_c_10 = By.xpath("//div[@color='#FB9800']");
	private By alert_type1= By.xpath("(//div[@color='#917FB3'])[1]");
	private By alert_type2 = By.xpath("(//div[@color='#A9907E'])[1]");
	private By alert_type3 = By.xpath("(//div[@color='#0A4D68'])[1]"); 
	private By alert_type4= By.xpath("(//div[@color='#D14D72'])[1]");
	private By alert_type5 = By.xpath("(//div[@color='#19A7CE'])[1]");
	private By alert_type6 = By.xpath("(//div[@color='#3C486B'])[1]");
	private By alert_type7 = By.xpath("(//div[@color='#00FFCA'])[1]");											
	private By details = By.xpath("(//*[local-name()='svg'][@fill='currentColor'])[5]");														
//	private By update_ins = By.xpath("//button[normalize-space()='Submit']");	
	private By comment_ins= By.xpath("(//*[local-name()='svg'][@fill='currentColor'])[8]"); 
	private By assign_to_ins = By.xpath("//input[@id='userName']");
	private By update_ins = By.xpath("(//button[@type='button'])[4]");	
	private By submit_ins = By.xpath("(//button[@type='button'])[3]");	
	private By add_comment = By.xpath("//input[@id='comment']");
	private By resetbutton= By.xpath("(//button[@id='dropdown-basic'])[2]");	

	
	private By typehere = By.xpath("//textarea[@placeholder='Type Update Here...']");								 
	private By share_ins= By.xpath("(//*[local-name()='svg'][@fill='currentColor'])[6]");										  																						

	private By Searchupdate= By.xpath("//input[@placeholder='Search Updates']");		
	private By back_ins= By.xpath("//button[@class='back-link back-link-insight-details ']");										
	private By assign_ins= By.xpath("(//*[local-name()='svg'][@fill='currentColor'])[7]"); 												

	
			
//	private By daterange= By.xpath("//button[@class='btn btn-outline']//img");		
//	private By lastmonth= By.xpath("//span[normalize-space()='Last Month']");
//	private By UseCase= By.linkText("UseCase");//Usecase
//	private By Assets1= By.linkText("Assets");
//	private By Entity1= By.linkText("Entity");//it should be capital			
//	private By checkboxentity= By.xpath("//input[@id='Entity']");	
		








//	private By LogSource= By.xpath("//div[contains(text(),'Log Source')]");	
//	private By AssetType= By.xpath("(//div[@class='rs__value-container rs__value-container--has-value css-1d8n9bt'])[1]");//imp	
//    private By INDIA= By.xpath("//div[contains(text(),'INDIA')]");
//	private By Geo= By.xpath("(//div[@class='rs__value-container rs__value-container--has-value css-1d8n9bt'])[2]");
//    private By NETRUM= By.xpath("//div[contains(text(),'NETRUM')]");
//	private By Entity= By.xpath("(//div[@class='rs__value-container rs__value-container--has-value css-1d8n9bt'])[3]");
//	private By searchbar= By.xpath("//input[@id='search-bar-0']");		
//	private By incident= By.xpath("//span[normalize-space()='23266']");	
//	private By Searchupdate= By.xpath("//input[@placeholder='Search update']");
//	private By typehere = By.xpath("//textarea[@placeholder='Type update here...']");
//	private By Update = By.xpath("//button[@class='btn btn-outline-primary mt-2 btn-sm']");		
//	private By back = By.xpath("//a[@class='back-link']");
	//tbody/tr[1]/td[9]/div[1]/button[1]//*[name()='svg']
//	private By Assignbutton  = By.xpath("//tbody/tr[1]/td[9]/div[1]/button[1]//*[name()='svg']");
//	private By Assign = By.xpath("//input[@id='userName']");
//	private By submit1 = By.xpath("//button[normalize-space()='Submit']");	
//	private By share = By.xpath("//tbody/tr[1]/td[9]/div[1]/button[2]//*[name()='svg']");


	//tbody/tr[1]/td[9]/div[1]/button[3]//*[name()='svg']//*[name()='path' and contains(@fill-rule,'evenodd')]
//	private By details = By.xpath("//tbody/tr[1]/td[9]/div[1]/button[3]//*[name()='svg']");

	//tbody/tr[1]/td[9]/div[1]/button[4]//*[name()='svg']
//	private By comment = By.xpath("//tbody/tr[1]/td[9]/div[1]/button[4]//*[name()='svg']");

//	private By commenttype = By.xpath("//input[@id='comment']");

//	private By commentsubmit = By.xpath("//button[normalize-space()='Submit']");	
		
		
//	private By next = By.xpath("//a[normalize-space()='>']");

//	private By previous  = By.xpath("//li[@title='previous page']");	
//		
//	private By customSwitch  = By.xpath("//label[@for='customSwitch1']");	
//
//	private By refresh  = By.xpath("//div[@class='col-lg-3']//span[1]//*[name()='svg']");
//
//	private By download  = By.xpath("//span[@class='mx-2 cursor-pointer']//*[name()='svg']");
//
//
//	private By share1  = By.xpath("//span[3]//*[name()='svg']");
//
//
//	private By checkboxgeo= By.xpath("//input[@id='Geo']");
//
//	private By function  = By.xpath("//input[@id='Function']");
//
//	private By Assets  = By.xpath("//input[@id='Assets']");
//
//	private By Process  = By.xpath("//input[@id='Process']");

		
	public Insights(WebDriver driver2) {
		// TODO Auto-generated constructor stub
		this.driver=driver2;
	}

	public WebElement clickoninsights() {
		return driver.findElement(Insights);
	}
	public WebElement Clickdaterange() {
		return driver.findElement(Clickdaterange);
	}
	public WebElement request_type1() {
		return driver.findElement(request_type1);
	}
	public WebElement request_type2() {
		return driver.findElement(request_type2);
	}
	public WebElement request_type3() {
		return driver.findElement(request_type3);
	}
	public WebElement request_status1() {
		return driver.findElement(request_status1);
	}
	public WebElement request_status2() {
		return driver.findElement(request_status2);
	}
	public WebElement request_status3() {
		return driver.findElement(request_status3);
	}
	
	public WebElement alertsbyconfidence_chart1() {
		return driver.findElement(alertsbyconfidence_chart1);
	}	
	public WebElement alertsbyconfidence_chart2() {
		return driver.findElement(alertsbyconfidence_chart2);
	}		
	public WebElement chartmenu() {
		return driver.findElement(chartmenu);
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
	public WebElement xlsimage() {
		return driver.findElement(xlsimage);
	}
	public WebElement svgimage() {
		return driver.findElement(svgimage);	
	}
	public WebElement top10assets_a_c_1() {
		return driver.findElement(top10assets_a_c_1);
	}
	
	public WebElement top10assets_a_c_2() {
		return driver.findElement(top10assets_a_c_2);
	}
	
	public WebElement top10assets_a_c_3() {
		return driver.findElement(top10assets_a_c_3);
	}
	
	public WebElement top10assets_a_c_4() {
		return driver.findElement(top10assets_a_c_4);
	}
	
	public WebElement top10assets_a_c_5() {
		return driver.findElement(top10assets_a_c_5);
	}
	
	public WebElement top10assets_a_c_6() {
		return driver.findElement(top10assets_a_c_6);
	}
	
	public WebElement top10assets_a_c_7() {
		return driver.findElement(top10assets_a_c_7);
	}
	public WebElement top10assets_a_c_8() {
		return driver.findElement(top10assets_a_c_8);
	}
	
	public WebElement top10assets_a_c_9() {
		return driver.findElement(top10assets_a_c_9);
	}
	public WebElement top10assets_a_c_10() {
		return driver.findElement(top10assets_a_c_10);
	}
	
	public WebElement alert_type1() {
		return driver.findElement(alert_type1);
	}
	public WebElement alert_type2() {
		return driver.findElement(alert_type2);
	}
	public WebElement alert_type3() {
		return driver.findElement(alert_type3);
	}
	public WebElement alert_type4() {
		return driver.findElement(alert_type4);
	}
	public WebElement alert_type5() {
		return driver.findElement(alert_type5);
	}
	public WebElement alert_type6() {
		return driver.findElement(alert_type6);
	}
	public WebElement alert_type7() {
		return driver.findElement(alert_type7);
	}
	public WebElement reset_filters() {
		return driver.findElement(Reset_Filters);
	}
	public WebElement details() {
		return driver.findElement(details);
	}
	public WebElement Searchupdate() {
		return driver.findElement(Searchupdate);
	}
	public WebElement typehere() {
		return driver.findElement(typehere);
	}
//	public WebElement update_ins() {
//		return driver.findElement(update_ins);
//	}
	
	public WebElement back_ins() {
		return driver.findElement(back_ins);
	}
	public WebElement share_ins() {
		return driver.findElement(share_ins);
	}
	
	public WebElement assign_ins() {
		return driver.findElement(assign_ins);
	}
	public WebElement comment_ins() {
		return driver.findElement(comment_ins);
	}
	public WebElement assign_to_ins() {
		return driver.findElement(assign_to_ins);
	}
	
	public WebElement update_ins() {
		return driver.findElement(update_ins);
	}
	public WebElement add_comment() {
		return driver.findElement(add_comment);
	}
	
	public WebElement submit_ins() {
		return driver.findElement(submit_ins);
	}
	public WebElement resetbutton() {
		return driver.findElement(resetbutton);
	}
	
	
	
	
	
		
//		public Insights(WebDriver driver2) {
//			// TODO Auto-generated constructor stub
//			this.driver=driver2;
//		}
//
//		public WebElement clickoninsights() {
//			return driver.findElement(Insights);
//		}	
//			
//		public WebElement daterange() {
//			
//			return driver.findElement(daterange);
//			}	
//		public WebElement lastmonth() {
//			
//			return driver.findElement(lastmonth);
//			}	
//		public WebElement UseCase() {
//			
//			return driver.findElement(UseCase);
//			}
//		public WebElement Assets1() {
//			
//			return driver.findElement(Assets1);
//			}
//		public WebElement Entity1() {
//			
//			return driver.findElement(Entity1);
//			}
//		public WebElement checkboxentity() {
//			
//			return driver.findElement(checkboxentity);
//			}
//	public WebElement LogSource() {
//			
//			return driver.findElement(LogSource);
//			}
//	public WebElement AssetType() {
//		
//		return driver.findElement(AssetType);
//		}
//	public WebElement INDIA() {
//		
//		return driver.findElement(INDIA);
//		}
//	public WebElement Geo() {
//		
//		return driver.findElement(Geo);
//		}
//	public WebElement NETRUM() {
//		
//		return driver.findElement(NETRUM);
//		}
//	public WebElement Entity() {
//		
//		return driver.findElement(Entity);
//		}
//		
//		
//		
//		
//		
//		public WebElement searchbar() {
//			
//			return driver.findElement(searchbar);
//			}
//		public WebElement incident() {
//			
//			return driver.findElement(incident);
//			}
//		//public WebElement incident() {
//			
//		//	return driver.findElement(incident);
//		//	}
//		public WebElement Searchupdate() {
//			
//			return driver.findElement(Searchupdate);
//			}
//		public WebElement typehere() {
//			
//			return driver.findElement(typehere);
//			}
//		public WebElement Update() {
//			
//			return driver.findElement(Update);
//			}
//		public WebElement back() {
//			
//			return driver.findElement(back);
//			}
//
//		public WebElement Assignbutton() {
//			
//			return driver.findElement(Assignbutton);
//			}
//
//
//		public WebElement Assign() {
//			
//			return driver.findElement(Assign);
//			}
//
//		public WebElement submit1() {
//			
//			return driver.findElement(submit1);
//			}
//		
//		public WebElement share() {
//			
//			return driver.findElement(share);
//			}
//		public WebElement details() {
//			
//			return driver.findElement(details);
//			}
//
//		public WebElement comment() {
//			
//			return driver.findElement(comment);
//			}
//		public WebElement commenttype() {
//			
//			return driver.findElement(commenttype);
//			}
//
//		public WebElement commentsubmit() {
//			
//			return driver.findElement(commentsubmit);
//			}
//		
//		public WebElement next() {
//			
//			return driver.findElement(next);
//			}
//
//		public WebElement previous() {
//			
//			return driver.findElement(previous);
//			}
//		
//	public WebElement customSwitch () {
//			
//			return driver.findElement(customSwitch );
//			}
//	public WebElement refresh() {
//		
//		return driver.findElement(refresh);
//		}
//
//	public WebElement download() {
//		
//		return driver.findElement(download);
//		}
//	public WebElement share1() {
//		return driver.findElement(share1);
//	}	
//	public WebElement checkboxgeo() {
//		
//		return driver.findElement(checkboxgeo);
//		}
//
//	public WebElement function() {
//		
//		return driver.findElement(function);
//		}
//	public WebElement Assets() {
//		
//		return driver.findElement(Assets);
//		}
//	public WebElement Process() {
//		
//		return driver.findElement(Process);
//		}
//		
		
		
		
		}
		


	//driver.findElement(By.linkText("Insight")).click();

