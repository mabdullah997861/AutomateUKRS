package modules;

import static org.testng.AssertJUnit.assertEquals;

import java.util.Iterator;
import java.util.List;

import org.apache.poi.ss.formula.functions.T;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import pageobjects.HomePage;
import pageobjects.SearchPage;

public class SearchItemFiltersAction {
	public static void ExecuteSearch(WebDriver driver, String searchByItem) throws Exception {
		HomePage.searchBox.sendKeys(searchByItem);
		HomePage.btnSearch.click();
		
		WebElement categoryLink = driver.findElement(By.xpath("//*[@id='galleryPopularCategory']/li[2]/a[contains(.,'" + searchByItem + "')]"));
		
		categoryLink.click();
	}
	
	public static void VerifyPageHeader(WebDriver driver, String header) {
		assertEquals(header, SearchPage.mainHeader.getText());
	}
	
	public static void SortResults(WebDriver driver, String columnName, String order) throws Exception {
		Thread.sleep(3000);
		if(columnName.equalsIgnoreCase("Price") && order.equalsIgnoreCase("Ascending"))
			SearchPage.btnPriceAscending.click();
		else if(columnName.equalsIgnoreCase("Price") && order.equalsIgnoreCase("Descending"))
			SearchPage.btnPriceDescending.click();
		
		Thread.sleep(5000);
	}
	
	public static void VerifyResultsOrder(WebDriver driver, String order) {
		boolean isSorted = false;
		List<WebElement> listOfElements =  driver.findElements(By.xpath("//*[@id='results-table']//tr/td[3]/div[1]/span"));
		
		Iterator<WebElement> iter = listOfElements.iterator();
	    if (!iter.hasNext()) {
	        return;
	    }
	    WebElement td1 = iter.next();
	    while (iter.hasNext()) {
	    	WebElement td2 = iter.next();
	    	
	    	float td1Price = Float.parseFloat(td1.getText().substring(1));
	    	float td2Price = Float.parseFloat(td2.getText().substring(1));
	    	System.out.println(td1Price + ", " + td2Price + " : " + (td1Price>td2Price));
	    	
	    	if(order.equalsIgnoreCase("Ascending")) {
		        if (td1Price > td2Price) {
		        	assertEquals(false, td1Price > td2Price);
		        	isSorted = false;
		        	return;
		        }
	    	} else if(order.equalsIgnoreCase("Descending")) {
	    		if (td1Price < td2Price) {
		        	assertEquals(false, td1Price < td2Price);
		        	isSorted = false;
		        	return;
		        }
	    	}
	        td1 = td2;
	        isSorted = true;
	    }
	    assertEquals(true, isSorted);
	}
}
