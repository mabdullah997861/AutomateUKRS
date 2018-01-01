package step_definitions;

import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import helpers.DataHelper;
import modules.SearchItemFiltersAction;
import pageobjects.HomePage;
import pageobjects.SearchPage;

public class SearchItemAndTestFilters {
	public WebDriver driver;
	public List<HashMap<String, String>> datamap;

	public SearchItemAndTestFilters() {
		driver = Hooks.driver;
		datamap = DataHelper.data();
	}
	
	@When("^I search the item$")
	public void iSearchTheItem() throws Throwable {
		PageFactory.initElements(driver, HomePage.class);
		SearchItemFiltersAction.ExecuteSearch(driver, datamap.get(2).get("item_name"));
	}
	
	@Then("^I verify displayed results$")
	public void iVerifyTheDisplayedResults() throws Throwable {
		PageFactory.initElements(driver, SearchPage.class);
		SearchItemFiltersAction.VerifyPageHeader(driver, datamap.get(2).get("item_name"));
	}
	
	@When("^I sort results by price and ascending$")
	public void iSortResultsByPriceAscending() throws Throwable {
		PageFactory.initElements(driver, SearchPage.class);
		
		SearchItemFiltersAction.SortResults(driver, datamap.get(3).get("column_name"), datamap.get(3).get("order"));
	}
	
	@When("^I sort results by price and descending$")
	public void iSortResultsByPriceDescending() throws Throwable {
		PageFactory.initElements(driver, SearchPage.class);
		
		SearchItemFiltersAction.SortResults(driver, datamap.get(4).get("column_name"), datamap.get(4).get("order"));
	}
	
	@Then("^I verify results sorted by price in ascending order$")
	public void iVerifyResultsSortedByPriceAscending() throws Throwable {
		PageFactory.initElements(driver, SearchPage.class);
		
		SearchItemFiltersAction.VerifyResultsOrder(driver, "ascending");
	}
	
	@Then("^I verify results sorted by price in descending order$")
	public void iVerifyResultsSortedByPriceDescending() throws Throwable {
		PageFactory.initElements(driver, SearchPage.class);
		
		SearchItemFiltersAction.VerifyResultsOrder(driver, "descending");
	}
}