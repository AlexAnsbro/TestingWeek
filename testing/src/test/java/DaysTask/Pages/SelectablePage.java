package DaysTask.Pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class SelectablePage {

	@FindBy(xpath="//*[@id=\"selectable\"]/li[4]")
	WebElement selectableBttn4;
	
	public void clickOnSelectable(WebDriver webDriver) {
		Actions builder = new Actions(webDriver);

		builder.moveToElement(selectableBttn4).click().perform();
		
	}
	
	public Boolean isSelected() {
		if (selectableBttn4.isSelected()) {return true;}
		else {return false;}
	}
	
	
	
}
