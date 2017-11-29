package alex.consulting.com.testing.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LogInPage {
	@FindBy(css= "body > table > tbody > tr > td.auto-style1 > form > div > center > table > tbody > tr > td:nth-child(1) > table > tbody > tr:nth-child(1) > td:nth-child(2) > p > input")
	WebElement userNameFeild;
	@FindBy(css = "body > table > tbody > tr > td.auto-style1 > form > div > center > table > tbody > tr > td:nth-child(1) > table > tbody > tr:nth-child(2) > td:nth-child(2) > p > input[type=\"password\"]")
	WebElement passFeild;
	@FindBy(css = "body > table > tbody > tr > td.auto-style1 > form > div > center > table > tbody > tr > td:nth-child(1) > table > tbody > tr:nth-child(3) > td:nth-child(2) > p > input[type=\"button\"]")
	WebElement logInBttn;
	
	@FindBy(xpath = "/html/body/table/tbody/tr/td[1]/big/blockquote/blockquote/font/center/b")
	WebElement successText;
	
	public void inputUsername (String username) {
		userNameFeild.sendKeys(username);
	}
	public void inputPass (String password) {
		passFeild.sendKeys(password);
	}
	public void clickLogIn() {
		logInBttn.click();
	}

	public String getSuccessText() {
		return successText.getText();
	}
}
