package Learn;

import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;

public class BaseLearnSelenium {
	
	public Actions builder;
	protected int timeOut = 10;
    WebDriver driver;
	public WebDriverWait wait;
	static Logger logger = Logger.getLogger("TechConsoleLog");
	
	public BaseLearnSelenium(WebDriver driver) {
		this.driver = driver;
	    wait = new WebDriverWait(driver, timeOut);
	}
	
	 protected boolean presenceOfElement(By locator){
		 setImplicitWait(300, TimeUnit.MILLISECONDS);
		 boolean presenceOfElement = true;
		 try {
			 wait.until(
					 ExpectedConditions.presenceOfElementLocated(locator));
		 }catch (Exception ex) {
			 presenceOfElement = false;
		 } 
		 return presenceOfElement;
	 }
	
	 protected boolean visibilityOfElement(WebElement element){
		 setImplicitWait(200, TimeUnit.MILLISECONDS);
		 boolean visibilityOfElement = true;
		 try {
			 wait.until(
					 ExpectedConditions.visibilityOf(element));
		 }catch (Exception ex) {
			 visibilityOfElement = false;
		 } 
		 return visibilityOfElement;
	 }
	 
	 protected boolean isElementClickable(By locator){
		 setImplicitWait(200, TimeUnit.MILLISECONDS);
		 boolean isElementClickable = true;
		 try {
			 wait.until(
					 ExpectedConditions.elementToBeClickable(locator)); 
		 }catch (Exception ex) {
			 isElementClickable = false;
		 } 
		 return isElementClickable;
	 }
		 
	 protected boolean isElementClickable(WebElement element){
		 setImplicitWait(200, TimeUnit.MILLISECONDS);
		 boolean isElementClickable = true;
		 try {
			 wait.until(
					 ExpectedConditions.elementToBeClickable(element)); 
		 }catch (Exception ex) {
			 isElementClickable = false;
		 } 
		 return isElementClickable;
	 }
	 
	 protected void setImplicitWait(int value, TimeUnit timeUnit) {
	    driver.manage().timeouts().implicitlyWait(value, timeUnit);
	}
}
