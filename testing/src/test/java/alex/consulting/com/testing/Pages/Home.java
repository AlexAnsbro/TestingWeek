package alex.consulting.com.testing.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Home {
	@FindBy(css= "body > div > center > table > tbody > tr:nth-child(2) > td > div > center > table > tbody > tr > td:nth-child(2) > p > small > a:nth-child(6)")
	WebElement searchBar;
	
	
	public void clickSearchBar() {
		searchBar.click();
	}
}
