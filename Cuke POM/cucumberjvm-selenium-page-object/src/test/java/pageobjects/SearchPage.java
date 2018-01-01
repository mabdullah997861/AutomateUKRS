package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SearchPage extends BaseClass{

	public SearchPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(how = How.XPATH, using ="//*[@id='pagecell']/section/div[1]/div/h1")
	public static WebElement mainHeader;
	
	@FindBy(how = How.XPATH, using = "//*[@id='P_breakPrice1']/button[1]")
	public static WebElement btnPriceAscending;
	
	@FindBy(how = How.XPATH, using = "//*[@id='P_breakPrice1']/button[2]")
	public static WebElement btnPriceDescending;
}