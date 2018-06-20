package Learn;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Learn.GoogleLearnSelenium;
import Learn.YahooLearnSelenium;

public class LearnSeleniumTest //extends pageobjects.BaseLearnSelenium 
{
	WebDriver driver;
	@BeforeSuite(alwaysRun=true)
	public void setUp() {
		String driverPath = "C:/Users/Shadrach Rajan/Desktop/selenium/";
		System.setProperty("webdriver.chrome.driver", driverPath + "chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	@Test(priority=1)
	public void googleSearch() throws Exception {
		driver.get("http://google.com");
	  	SoftAssert softAssert = new SoftAssert();
	  	Thread.sleep(100);
	  	GoogleLearnSelenium testGoogle = new GoogleLearnSelenium(driver);
		boolean boolTestGoogle = testGoogle.googleSearch("Learn Selenium");
		if(boolTestGoogle)
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("fail");
			softAssert.fail("Field are modified with valid configurations");
		}
		softAssert.assertAll();
  }
	
	@Test(priority=2)
	public void yahooSearch() throws Exception {
		driver.get("http://yahoo.com");
	  	SoftAssert softAssert = new SoftAssert();
	  	Thread.sleep(100);
	  	YahooLearnSelenium testYahoo = new YahooLearnSelenium(driver);
		boolean boolTestYahoo = testYahoo.yahooSearch("Learn Selenium");
		if(boolTestYahoo)
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("fail");
			softAssert.fail("Field are modified with valid configurations");
		}
		softAssert.assertAll();
  }
}
