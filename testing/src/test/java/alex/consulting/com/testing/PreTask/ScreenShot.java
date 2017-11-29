package alex.consulting.com.testing.PreTask;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreenShot {

	 public String take(WebDriver webDriver, String fileName) throws IOException {
	        File scrFile = ((TakesScreenshot)webDriver).getScreenshotAs(OutputType.FILE);
	        String pathname = System.getProperty("user.dir") + File.separatorChar + fileName +".jpg";
	        FileUtils.copyFile(scrFile, new File(pathname));
	        System.out.println("File Saved at: " + pathname);
	        return pathname;
	    }
}
