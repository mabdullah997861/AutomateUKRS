package pageobjects;

import helpers.Log;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BaseClass {

	public LoginPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(how = How.NAME, using = "username")
	public static WebElement username;

	@FindBy(how = How.NAME, using = "j_password")
	public static WebElement password;

	@FindBy(how = How.NAME, using = "loginBtn")
	public static WebElement login_button;
}
