package GenercLib;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Screenshot {
	
	Date d=new Date();
	String currentdate=d.toString().replaceAll(":","-");

	public void getscreenshot(WebDriver driver,String name) throws IOException {
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest=new File(AutoConstant.photo+currentdate+name+".png");
		FileUtils.copyFile(src, dest);
        				
	}
}
