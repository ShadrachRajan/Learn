package Learn;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class simple {
	public static WebDriver driver = null;
	
	public static void main(String[] args)
	{
	System.out.println("Inside Chrome");
	
	ChromeOptions options = new ChromeOptions();
	//options.addArguments("--headless");
	
	
	
	String driverPath = "C:/Users/Shadrach Rajan/Desktop/selenium/";
	System.setProperty("webdriver.chrome.driver", driverPath + "chromedriver.exe");
	
	ChromeDriver chromeDriver = new ChromeDriver(options);
	//driver = new ChromeDriver();

	chromeDriver.get("http://google.com");
	}
}
