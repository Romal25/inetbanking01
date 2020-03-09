package Javapractiveprogrammes;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTotalLinksOnPage {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\R\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.t-mobile.com/");
	    driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	    driver.manage().window().maximize();
	    List<WebElement> totallinks = driver.findElements(By.tagName("a"));
	    System.out.println( totallinks.size());
	    //List<WebElement> tmobilelink = driver.findElements(By.partialLinkText("it"));
	    // System.out.println(tmobilelink.size());
	    
	    for(WebElement link:totallinks)
	    	
	    {

	    	String href = link.getAttribute("href");
	    	if(href!=null && href.contains("t-mobile"))
	    	{
	    		
	    	}
	    	else
	    		
	    	{
	    	System.out.println(link.getText() + " ----URL----" + link.getAttribute("href"));
	        }
	    	
	    }
	    
        driver.close();
	}

}
