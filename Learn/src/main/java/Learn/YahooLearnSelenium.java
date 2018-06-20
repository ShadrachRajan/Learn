package Learn;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class YahooLearnSelenium extends BaseLearnSelenium 
{
	WebDriver driver;
	
	@FindBy(how=How.ID, using = "uh-search-box" )
	WebElement searchBox;
	
	//@FindBy(how=How.ID, using = "uh-search-button") 
	//WebElement searchButton;

	@FindBy(how=How.XPATH, using = "//td[@class='Pos(r) P(0) W(100%) D(tb) Tbl(f) ua-safari_D(tbc) H(46px)']/following-sibling::td/button[@id='uh-search-button']") 
	WebElement searchButton;
	
	public YahooLearnSelenium(WebDriver driver) throws Exception
	{
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	public boolean yahooSearch(String searchString)
	{
		boolean isRecordSearched = false;
		int i=0;
		boolean boolSearchBox = visibilityOfElement(searchBox);
		if(boolSearchBox)
		{
			searchBox.sendKeys(searchString);
			i = i + 1;
			boolean boolSearchButton = isElementClickable(searchButton);
			if(boolSearchButton)
			{
				searchButton.click();
				i = i + 1;
			}
			else
			{
				System.out.println("Search button not present");
			}
		}
		else
		{
			System.out.println("Search box not present");
		}
		
		if (i == 2)
		{
			isRecordSearched = true;
		}
		return isRecordSearched;
	}
}
