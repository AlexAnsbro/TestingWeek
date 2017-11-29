package DaysTask;
import static org.junit.Assert.*;

import java.io.File;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.junit.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import DaysTask.Pages.DraggablePage;
import alex.consulting.com.testing.Pages.AddUserPage;



public class DraggingTests {

		private String url = "http://demoqa.com/draggable/";

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
		
		@Ignore
		@Test
		public void test1() {
			DraggablePage page = PageFactory.initElements(webDriver, DraggablePage.class);
			ExtentTest test = report.createTest("MyFirstTest");
			test.log(Status.INFO, "My First Test is Starting ");
			webDriver.manage().window().maximize();
			test.log(Status.DEBUG, "Box's Position");
			test.log(Status.DEBUG, "X:" + page.getBoxX() + " Y:" + page.getBoxY());
			page.moveBox(webDriver);
			test.log(Status.DEBUG, "X:" + page.getBoxX() + " Y:" + page.getBoxY());
			Assert.assertTrue("Box is not in expected place", page.checkBoxPosition(1250 , 678) );// box is already offset
		}
		
		
		@Ignore
		@Test
		public void test2() throws InterruptedException {
			DraggablePage page = PageFactory.initElements(webDriver, DraggablePage.class);
			ExtentTest test = report.createTest("MyFirstTest");
			test.log(Status.INFO, "My Second Test is Starting ");
			webDriver.manage().window().maximize();
			page.clickOnConstrainTab();
			test.log(Status.DEBUG, "Box's Position");
			test.log(Status.DEBUG, "X:" + page.getBoxX() + " Y:" + page.getBoxY());
			page.moveBoxesArround(webDriver);
			Assert.assertTrue("Boxes in wrong place", page.boxesInCorrectPos(584, 818, 1378, 404, 1083, 588, 677, 477));
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
