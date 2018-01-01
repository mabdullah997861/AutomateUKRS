package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class BasketSummaryPage extends BaseClass{

	public BasketSummaryPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(how = How.ID, using = "checkoutSecurelyAndPuchBtn")
	public static WebElement checkOutSecurelyBtn;
}
