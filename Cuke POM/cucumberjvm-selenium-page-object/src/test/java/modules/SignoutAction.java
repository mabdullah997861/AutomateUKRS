package modules;
import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.WebDriver;

import pageobjects.HomePage;
public class SignoutAction {
	public static void Execute(WebDriver driver,List<HashMap<String,String>> map) throws Exception{
		Thread.sleep(5000);
		HomePage.log_out.click();
		Thread.sleep(5000);
	}
}
