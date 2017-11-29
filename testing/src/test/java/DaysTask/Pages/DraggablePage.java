package DaysTask.Pages;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import com.aventstack.extentreports.*;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;


public class DraggablePage {
	private ExtentReports report;

	
	@FindBy(css="#draggable")
	WebElement draggableBox;
	
	@FindBy(css="#ui-id-2")
	WebElement constrainTab;
	
	@FindBy(css="#draggabl > p")
	WebElement draggableBox1;
	@FindBy(css="#draggabl2 > p")
	WebElement draggableBox2;
	@FindBy(css="#draggabl3 > p")
	WebElement draggableBox3;
	@FindBy(css="#draggabl5")
	WebElement draggableBox4;
	

	
	public void moveBox (WebDriver webDriver) {
		Actions builder = new Actions(webDriver);

		builder.moveByOffset(draggableBox.getLocation().getX()+1, draggableBox.getLocation().getY()+1).clickAndHold().perform();
		builder.moveByOffset(draggableBox.getLocation().getX()+100, draggableBox.getLocation().getY()).perform();

	}
	
	
	
	
	public boolean checkBoxPosition(int x, int y) {

		if (draggableBox.getLocation().getX() == x && draggableBox.getLocation().getY() == y) {return true;}
		else {return false;}

	}
	
	public int getBoxX() {
		return draggableBox.getLocation().getX();
	}

	public int getBoxY() {
		return draggableBox.getLocation().getY();
	}
	
	public void clickOnConstrainTab() {
		constrainTab.click();
	}
	
	public void moveBoxesArround(WebDriver webDriver) throws InterruptedException {
		report = new ExtentReports();
	    String fileName = "MovingReport" + ".html";
	    String filePath = System.getProperty("user.dir")
	            + File.separatorChar + fileName;
	    report.attachReporter(new ExtentHtmlReporter(filePath));
	    
		Actions builder = new Actions(webDriver);
		ExtentTest test = report.createTest("Moving Boxes");
		
		test.log(Status.DEBUG, "Before 1");
		test.log(Status.DEBUG, "X:" + draggableBox1.getLocation().getX() + " Y:"+ draggableBox1.getLocation().getY());
		builder.moveToElement(draggableBox1).clickAndHold().perform();
		builder.moveByOffset(draggableBox1.getLocation().getX(), draggableBox1.getLocation().getY()+10).perform();
		test.log(Status.DEBUG, "After");
		test.log(Status.DEBUG, "X:" + draggableBox1.getLocation().getX() + " Y:"+ draggableBox1.getLocation().getY());
		builder.release();

		test.log(Status.DEBUG, "Before 2");
		test.log(Status.DEBUG, "X:" + draggableBox2.getLocation().getX() + " Y:"+ draggableBox2.getLocation().getY());
		builder.moveToElement(draggableBox2).clickAndHold().perform();
		builder.moveByOffset(draggableBox2.getLocation().getX()+10, draggableBox2.getLocation().getY()).perform();
		test.log(Status.DEBUG, "After");
		test.log(Status.DEBUG, "X:" + draggableBox2.getLocation().getX() + " Y:"+ draggableBox2.getLocation().getY());
		builder.release();

		test.log(Status.DEBUG, "Before 3");
		test.log(Status.DEBUG, "X:" + draggableBox3.getLocation().getX() + " Y:"+ draggableBox3.getLocation().getY());
		builder.moveToElement(draggableBox3).clickAndHold().perform();
		builder.moveByOffset(draggableBox3.getLocation().getX(), draggableBox3.getLocation().getY()+10).perform();
		test.log(Status.DEBUG, "After");
		test.log(Status.DEBUG, "X:" + draggableBox3.getLocation().getX() + " Y:"+ draggableBox3.getLocation().getY());
		builder.release();
		
		test.log(Status.DEBUG, "Before 4");
		test.log(Status.DEBUG, "X:" + draggableBox4.getLocation().getX() + " Y:"+ draggableBox4.getLocation().getY());
		builder.moveToElement(draggableBox4).clickAndHold().perform();
		builder.moveByOffset(draggableBox4.getLocation().getX()+10, draggableBox4.getLocation().getY()).perform();
		test.log(Status.DEBUG, "After");
		test.log(Status.DEBUG, "X:" + draggableBox4.getLocation().getX() + " Y:"+ draggableBox4.getLocation().getY());
		builder.release();
		
		report.flush();
	}
	
	public boolean boxesInCorrectPos (int x1, int y1, int x2, int y2,
									  int x3, int y3, int x4, int y4 ) {
	if (draggableBox1.getLocation().getX() == x1 && draggableBox1.getLocation().getY() == y1 &&
		draggableBox2.getLocation().getX() == x2 && draggableBox2.getLocation().getY() == y2 &&
		draggableBox3.getLocation().getX() == x3 && draggableBox3.getLocation().getY() == y3 &&
		draggableBox4.getLocation().getX() == x4 && draggableBox4.getLocation().getY() == y4)
	{
		return true;
	}else {
		return false;
		}
	}
	
	
	private void moveBoxUpOrDown(WebDriver webDriver, WebElement box, boolean up){
		Actions builder = new Actions(webDriver);

		builder.moveToElement(box).clickAndHold().perform();
		if (up)
		builder.moveByOffset(box.getLocation().getX(), box.getLocation().getY()+10).perform();
		else
		builder.moveByOffset(box.getLocation().getX(), box.getLocation().getY()-10).perform();
		builder.release();
	}
	
	private void moveBoxLeftOrRight(WebDriver webDriver, WebElement box, boolean right) {
		Actions builder = new Actions(webDriver);

		builder.moveToElement(box).clickAndHold().perform();
		if (right)
		builder.moveByOffset(box.getLocation().getX()+10, box.getLocation().getY()).perform();
		else
		builder.moveByOffset(box.getLocation().getX()-10, box.getLocation().getY()).perform();
		builder.release();
	}
}
