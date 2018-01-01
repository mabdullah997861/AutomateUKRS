package step_definitions;

import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import helpers.DataHelper;
import modules.AddItemToCartAction;
import modules.CheckOutAction;
import modules.SignInAction;
import modules.SignoutAction;
import pageobjects.AutomativeBatteryPage;
import pageobjects.BasketSummaryPage;
import pageobjects.HomePage;
import pageobjects.LoginPage;
import pageobjects.RechargeableBatteriesPage;

public class AddItemsAndCheckout {
	public WebDriver driver;
	public List<HashMap<String, String>> datamap;

	public AddItemsAndCheckout() {
		driver = Hooks.driver;
		datamap = DataHelper.data();
	}

	@Given("^I open ukrsonline website$")
	public void i_open_automationpractice_website() throws Throwable {
		driver.get("http://uk.rs-online.com");
	}

	@When("^I sign in$")
	public void iSignInWithCredentials() throws Throwable {
		PageFactory.initElements(driver, HomePage.class);
		PageFactory.initElements(driver, LoginPage.class);

		SignInAction.Execute(driver, datamap);
	}

	@When("^I add an 9volt rechargeable battery$")
	public void iAddAn9VoltRechageableBattery() throws Throwable {
		PageFactory.initElements(driver, HomePage.HeaderPage.class);
		PageFactory.initElements(driver, HomePage.HeaderPage.ElectronicsComponents.class);
		PageFactory.initElements(driver, HomePage.HeaderPage.ElectronicsComponents.Batteries.class);
		PageFactory.initElements(driver, RechargeableBatteriesPage.Categories.class);
		
		AddItemToCartAction.executeAddRechargeableBattery(driver, datamap);
	}
	
	@When("^I add an Automative battery$")
	public void iAddAutomativeBattery() throws Throwable {
		PageFactory.initElements(driver, HomePage.HeaderPage.class);
		PageFactory.initElements(driver, HomePage.HeaderPage.ElectronicsComponents.class);
		PageFactory.initElements(driver, HomePage.HeaderPage.ElectronicsComponents.Batteries.class);
		PageFactory.initElements(driver, AutomativeBatteryPage.Categories.class);
		
		AddItemToCartAction.executeAddAutomativeBattery(driver, datamap);
	}
	
	@When("^I checkout$")
	public void iCheckOut() throws Throwable {
		PageFactory.initElements(driver, HomePage.class);
		PageFactory.initElements(driver, BasketSummaryPage.class);
		
		CheckOutAction.Execute(driver, datamap);
	}
	
	@Then("^I sign out$")
	public void i_sign_out() throws Throwable {
		PageFactory.initElements(driver, HomePage.class);
		SignoutAction.Execute(driver, datamap);
	}
}