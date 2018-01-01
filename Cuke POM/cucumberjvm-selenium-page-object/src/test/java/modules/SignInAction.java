package modules;

import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import helpers.Log;
import pageobjects.HomePage;
import pageobjects.LoginPage;

public class SignInAction {
	public static void Execute(WebDriver driver, List<HashMap<String, String>> map) throws Exception {
		HomePage.log_in.click();

		LoginPage.username.sendKeys(map.get(0).get("username"));
		Log.info(" is entered in UserName text box");

		LoginPage.password.sendKeys(map.get(0).get("password"));
		Log.info(" is entered in Password text box");

		LoginPage.login_button.click();
		Thread.sleep(5000);
	}
}
