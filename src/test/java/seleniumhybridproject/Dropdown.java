package seleniumhybridproject;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/s?k=iphone+13&sprefix=ipho%2Caps%2C281&ref=nb_sb_ss_softlines-tsdoa-joint-contextual-iss_1_4");
        driver.manage().window().maximize();
       WebElement textdd = driver.findElement(By.id("searchDropdownBox"));
     
       //String printtext = textdd.getText();
      // System.out.println(printtext);

       
       Select s=new Select(textdd);
       TreeSet<String> set=new TreeSet<String>(Collections.reverseOrder());
      List<WebElement> print = s.getOptions();
      int si = print.size();
      System.out.println("total text in dropdown--> "+si);
  
       for(WebElement b:print)
       {
    	   String text = b.getText();
    	   set.add(text);
    	   
       }
       for(String altext:set)
       {
    	   System.out.println(altext);
       }
       driver.close();

	}

}
