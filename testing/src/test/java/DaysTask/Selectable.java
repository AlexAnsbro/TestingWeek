package DaysTask;

import java.io.File;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import DaysTask.Pages.DraggablePage;
import DaysTask.Pages.SelectablePage;

public class Selectable {
	private String url = "http://demoqa.com/selectable/";

	private WebDriver webDriver;
	
	private static ExtentReports report;


    @BeforeClass
    public static void init() {
        report = new ExtentReports();
        String fileName = "MyReport" + ".html";
        String filePath = System.getProperty("user.dir")
                + File.separatorChar + fileName;
        report.attachReporter(new ExtentHtmlReporter(filePath));
    }
    
	@Before
	public void setUp () {
		webDriver = new ChromeDriver();
		webDriver.navigate().to(url);
		
	}
	
	
	@Test
	public void firstTest() {
		SelectablePage page = PageFactory.initElements(webDriver, SelectablePage.class);
		page.clickOnSelectable(webDriver);
		Assert.assertTrue("Button Not Selected",page.isSelected());
		
	}
	
	
	
	
	@After
	public void tearDown() {
		webDriver.quit();
	}
	
	 @AfterClass
	 public static void cleanUp() {
	        report.flush();
	 }
}
