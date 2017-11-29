package alex.consulting.com.testing.Pages;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import alex.consulting.com.testing.PreTask.SpreadSheetReader;


public class AddUserPage {
		
		@FindBy(css= "body > table > tbody > tr > td.auto-style1 > form > div > center > table > tbody > tr > td:nth-child(1) > div > center > table > tbody > tr:nth-child(1) > td:nth-child(2) > p > input")
		WebElement userNameField;
		@FindBy(css= "body > table > tbody > tr > td.auto-style1 > form > div > center > table > tbody > tr > td:nth-child(1) > div > center > table > tbody > tr:nth-child(2) > td:nth-child(2) > p > input[type=\"password\"]")
		WebElement passwordField;
		@FindBy(css= "body > table > tbody > tr > td.auto-style1 > form > div > center > table > tbody > tr > td:nth-child(1) > div > center > table > tbody > tr:nth-child(3) > td:nth-child(2) > p > input[type=\"button\"]")
		WebElement saveBttn;
		@FindBy(css= "body > div > center > table > tbody > tr:nth-child(2) > td > div > center > table > tbody > tr > td:nth-child(2) > p > small > a:nth-child(7)")
		WebElement loginBttn;
		
		public void inputUsername(String username) {
			userNameField.sendKeys(username);
		}
		
		public void inputPassword(String password) {
			passwordField.sendKeys(password);
		}
		
		public void clickSave() {
			saveBttn.click();
		}
		
		public void clickLoginPage() {
			loginBttn.click();
		}
	}
		
	
