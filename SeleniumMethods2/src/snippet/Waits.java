package snippet;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Waits {
	
	public static void main(String[] args) {
		
				
		
		System.setProperty("webdriver.chrome.driver","C:\\R\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		
		// Implicitlywait 
		
		driver.get("https://www.google.com/");
		driver.findElementByXPath("//*[@type='text']").sendKeys("Tmobile" + Keys.ENTER);
		
	    WebElement elm =	driver.findElementByPartialLinkText("T-Mobile");
		
	    if (elm != null)
		{
	    	System.out.println("element found");
	    	//ExpectedConditions.visibilityOf(elm);
	    	//wait.until(ExpectedConditions.visibilityOf(elm));
	    	elm.click();
		}
	    else 
	    {
	    	System.out.println("element not found");
	    
	    }
	    
		
		
		
			
		//driver.findElementByCssSelector("*[class='LC201b']").click();
		
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.MINUTES);
		
		
		//driver.get("https://my.t-mobile.com");
		//driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//driver.findElement("//*[@id='usernameTextBox']").sendKeys("9735805981");
		

	}

}
