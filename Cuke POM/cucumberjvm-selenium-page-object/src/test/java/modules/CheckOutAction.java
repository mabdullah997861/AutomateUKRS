package modules;

import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.WebDriver;

import pageobjects.BasketSummaryPage;
import pageobjects.HomePage;

public class CheckOutAction {
	public static void Execute(WebDriver driver, List<HashMap<String,String>> map) throws Exception{
		HomePage.cart.click();
		Thread.sleep(5000);
		BasketSummaryPage.checkOutSecurelyBtn.click();
	}
}
