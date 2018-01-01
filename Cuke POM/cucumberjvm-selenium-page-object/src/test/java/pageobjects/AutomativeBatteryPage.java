package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AutomativeBatteryPage extends BaseClass {

	public AutomativeBatteryPage(WebDriver driver) {
		super(driver);
	}

	public static class Categories {
		@FindBy(how = How.LINK_TEXT, using = "Battery Hydrometers")
		public static WebElement batteryHydrometers;
	}
}
