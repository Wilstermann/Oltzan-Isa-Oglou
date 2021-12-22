package testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BeymenSiteAcilma {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://beymen.com/");
		driver.quit();
		

	}

}
