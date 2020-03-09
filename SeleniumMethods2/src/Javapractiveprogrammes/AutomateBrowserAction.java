package Javapractiveprogrammes;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomateBrowserAction {

	public static void main(String[] args){
		
		System.setProperty("webdriver.chrome.driver","C:\\R\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get(" https://www.google.com/");
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		// Minimize the browser
		//driver.manage().window().setPosition(new Point(0, -1000));
		// Set Size of browser
		//driver.manage().window().setSize(new Dimension(1920, 1080));
        
        String actual_Title = driver.getTitle();
        String expected_Title = "google";
        
        if(actual_Title.equals(expected_Title))
        {
        	System.out.println("Page title is validated and passed");
        }else
        {
        	System.out.println("validation of pagetitle is failing");
        }
        
        String current_url = driver.getCurrentUrl();
        String expected_url = "www.google.com";
        		
        if(current_url.equals(expected_url))
        {
        	System.out.println("URL is validated and passed");
        }else
        {
        	System.out.println("page url validation failed");
        	System.out.println("current url is " + driver.getCurrentUrl()); 
        }
        
        //get page source and validate page title is present 
        driver.getPageSource();
	}

}
