package alex.consulting.com.testing;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverExample {
	private String url = "http://www.google.com";
	private String testSiteUrl = "http://thedemosite.co.uk";
	private WebDriver webDriver;
	
	@Before
	public void setUp () {
		webDriver = new ChromeDriver();
	}
	
//	@Test
//	public void qaTest() {
//		webDriver.navigate().to(url);
//		WebElement searchBar = webDriver.findElement(By.cssSelector("#lst-ib"));
//		searchBar.sendKeys("qa \n");
//		WebElement qaLink = webDriver.findElement(By.cssSelector("#rso > div:nth-child(1) > div > div:nth-child(1) > div > div > h3 > a"));
//		qaLink.click();
//		String currentUrl = webDriver.getCurrentUrl();
//		String expectedUrl = "https://www.qa.com/";
//		Assert.assertEquals("Not expected URL", expectedUrl, currentUrl);
//	
//	}
//	@Test
//	public void gitHubTest() {
//		webDriver.navigate().to(url);
//		WebElement searchBar = webDriver.findElement(By.cssSelector("#lst-ib"));
//		searchBar.sendKeys("GitHub \n");
//		WebElement gitLink = webDriver.findElement(By.cssSelector("#rso > div:nth-child(1) > div > div > div > div > h3 > a"));
//		gitLink.click();
//		WebElement jsBox = webDriver.findElement(By.cssSelector("body > div.position-relative.js-header-wrapper > header > div > div.d-flex.flex-justify-between.flex-items-center > button > svg"));
//		jsBox.click();
//		WebElement signInLink = webDriver.findElement(By.cssSelector("body > div.position-relative.js-header-wrapper > header > div > div.HeaderMenu.HeaderMenu--bright.d-lg-flex.flex-justify-between.flex-auto > div > span > div > a:nth-child(1)"));
//		signInLink.click();
//		WebElement usernameBox = webDriver.findElement(By.cssSelector("#login_field"));
//		usernameBox.sendKeys("AlexAnsbro");
//		WebElement passwordBox = webDriver.findElement(By.cssSelector("#password"));
//		passwordBox.sendKeys("t0020118@");
//		WebElement signInBttn = webDriver.findElement(By.cssSelector("#login > form > div.auth-form-body.mt-3 > input.btn.btn-primary.btn-block"));
//		signInBttn.click();
//		
//		WebElement profileDropDown = webDriver.findElement(By.cssSelector("#user-links > li:nth-child(3) > details > summary"));
//		profileDropDown.click();
//		WebElement profileLink = webDriver.findElement(By.cssSelector("#user-links > li:nth-child(3) > details > ul > li:nth-child(3) > a"));
//		profileLink.click();
//		
//		String currentUrl = webDriver.getCurrentUrl();
//		String expectedUrl = "https://github.com/AlexAnsbro";
//		
//		Assert.assertEquals("Not expected URL", expectedUrl, currentUrl );
//	}
	
	
	
	@Test
	public void testSiteTest() {
		String name = "StopChanging";
		String pass = "My Sh!t";
		String passCase = "**Successful Login**";
		
		webDriver.navigate().to(testSiteUrl);
		WebElement searchBar = webDriver.findElement(By.cssSelector("body > div > center > table > tbody > tr:nth-child(2) > td > div > center > table > tbody > tr > td:nth-child(2) > p > small > a:nth-child(6)"));
		searchBar.click();
		WebElement userNameField = webDriver.findElement(By.cssSelector("body > table > tbody > tr > td.auto-style1 > form > div > center > table > tbody > tr > td:nth-child(1) > div > center > table > tbody > tr:nth-child(1) > td:nth-child(2) > p > input"));
		userNameField.sendKeys(name);
		WebElement PasswordField = webDriver.findElement(By.cssSelector("body > table > tbody > tr > td.auto-style1 > form > div > center > table > tbody > tr > td:nth-child(1) > div > center > table > tbody > tr:nth-child(2) > td:nth-child(2) > p > input[type=\"password\"]"));
		PasswordField.sendKeys(pass);
		
		WebElement SaveBttn = webDriver.findElement(By.cssSelector("body > table > tbody > tr > td.auto-style1 > form > div > center > table > tbody > tr > td:nth-child(1) > div > center > table > tbody > tr:nth-child(3) > td:nth-child(2) > p > input[type=\"button\"]"));
		SaveBttn.click();
		
		WebElement LoginBttn = webDriver.findElement(By.cssSelector("body > div > center > table > tbody > tr:nth-child(2) > td > div > center > table > tbody > tr > td:nth-child(2) > p > small > a:nth-child(7)"));
		LoginBttn.click();
		WebElement userNameLO = webDriver.findElement(By.cssSelector("body > table > tbody > tr > td.auto-style1 > form > div > center > table > tbody > tr > td:nth-child(1) > table > tbody > tr:nth-child(1) > td:nth-child(2) > p > input"));
		userNameLO.sendKeys(name);
		WebElement passwordLO = webDriver.findElement(By.cssSelector("body > table > tbody > tr > td.auto-style1 > form > div > center > table > tbody > tr > td:nth-child(1) > table > tbody > tr:nth-child(2) > td:nth-child(2) > p > input[type=\"password\"]"));
		passwordLO.sendKeys(pass);
		WebElement logInLO = webDriver.findElement(By.cssSelector("body > table > tbody > tr > td.auto-style1 > form > div > center > table > tbody > tr > td:nth-child(1) > table > tbody > tr:nth-child(3) > td:nth-child(2) > p > input[type=\"button\"]"));
		logInLO.click();
		
		WebElement successorFail = webDriver.findElement(By.xpath("/html/body/table/tbody/tr/td[1]/big/blockquote/blockquote/font/center/b"));
		Assert.assertEquals("Login Failed", passCase, successorFail.getText());
		
	}
	

	
	@After
	public void tearDown() {
		webDriver.quit();
	}
}
