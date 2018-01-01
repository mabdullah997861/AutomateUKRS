package modules;

import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import pageobjects.AutomativeBatteryPage;
import pageobjects.HomePage;
import pageobjects.RechargeableBatteriesPage;

public class AddItemToCartAction {
	
	public static void goToBatteries(WebDriver driver) throws Exception{
		HomePage.HeaderPage.allProducts.click();

		Actions action = new Actions(driver);
		action.moveToElement(HomePage.HeaderPage.ElectronicsComponents.batteries);
		action.perform();
		
		Thread.sleep(5000);
	}
	
	public static void executeAddRechargeableBattery(WebDriver driver, List<HashMap<String,String>> map) throws Exception{
		goToBatteries(driver);
		
		HomePage.HeaderPage.ElectronicsComponents.Batteries.rechargeableBatteries.click();
		
		Thread.sleep(3000);
		RechargeableBatteriesPage.Categories.nineVoltRechargeableBatteries.click();
		Thread.sleep(2000);
		
		AddItemToCart(driver, map.get(0).get("item_name"));
		Thread.sleep(10000);
	}
	
	public static void executeAddAutomativeBattery(WebDriver driver, List<HashMap<String,String>> map) throws Exception{
		goToBatteries(driver);

		HomePage.HeaderPage.ElectronicsComponents.Batteries.automotiveBattery.click();
		
		Thread.sleep(3000);
		AutomativeBatteryPage.Categories.batteryHydrometers.click();
		Thread.sleep(2000);
		
		AddItemToCart(driver, map.get(1).get("item_name"));
		Thread.sleep(10000);
	}
	
	public static void AddItemToCart(WebDriver driver, String itemName) {
		driver.findElement(By.xpath("//a[contains(.,'"+ itemName + "')]/../../..//button")).click();
	}
}
