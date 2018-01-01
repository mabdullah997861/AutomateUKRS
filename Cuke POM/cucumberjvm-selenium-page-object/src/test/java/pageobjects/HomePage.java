package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePage extends BaseClass {
	public HomePage(WebDriver driver) {
		super(driver);
	}

	@FindBy(how = How.LINK_TEXT, using = "Log In")
	public static WebElement log_in;
	
	@FindBy(how = How.LINK_TEXT, using = "Log Out")
	public static WebElement log_out;
	
	@FindBy(how = How.XPATH, using = "//div[@id='js-basketQty']")
	public static WebElement cart;
	
	@FindBy(how = How.ID, using = "searchTerm")
	public static WebElement searchBox;
	
	@FindBy(how = How.ID, using = "btnSearch")
	public static WebElement btnSearch;

	public static class HeaderPage {
		@FindBy(how = How.XPATH, using = "//a[@title='All Products']")
		public static WebElement allProducts;
		
		
		public static class ElectronicsComponents
		{
			@FindBy(how = How.LINK_TEXT, using = "Batteries")
			public static WebElement batteries;
			
			public static class Batteries
			{
				@FindBy(how = How.XPATH, using = "//li/a[contains(text(),'Batteries')]/../div/ul[2]/li[2]")
				public static WebElement rechargeableBatteries;
				
				@FindBy(how = How.XPATH, using = "//li/a[contains(text(),'Batteries')]/../div/ul[1]/li[1]")
				public static WebElement automotiveBattery;
			}
		}
	}
}
