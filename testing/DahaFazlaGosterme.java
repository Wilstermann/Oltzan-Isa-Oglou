package testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DahaFazlaGosterme {

    By searchBoxLocator = By.id("twotabsearchtestbox");
    By submitButtonLocator = By.id("nav-search-submit-button");
    By moreContentButton = By.id("moreContentButton");
    
    public SearchBox (WebDriver driver) {super(driver);
    }
    
    public void search(String text) {
    	
    	type (searchBoxLocator, text);
    	click(submitButtonLocator);
    	JavascriptExecutor js = ((JavascriptExecutor) driver);
    	js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
    	click(moreContentButton);
    }
}
    
    
    
