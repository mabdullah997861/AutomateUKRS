package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class RechargeableBatteriesPage extends BaseClass {

	public RechargeableBatteriesPage(WebDriver driver) {
		super(driver);
	}

	public static class Categories {
		@FindBy(how = How.LINK_TEXT, using = "9 Volt Rechargeable Batteries")
		public static WebElement nineVoltRechargeableBatteries;
	}
}
