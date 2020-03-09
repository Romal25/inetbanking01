package snippet;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouseover {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\R\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		
		
		
		driver.get("https://www.google.com/");
		driver.findElementByXPath("//*[@type='text']").sendKeys("Way2automation" + Keys.ENTER);
		
				
		//WebDriverWait wait = new WebDriverWait(driver,5);
		//wait.until(ExpectedConditions.visibilityOfElementLocated(
				
		driver.findElementByPartialLinkText("www.way2automation.com").click();
		
		WebElement menu = driver.findElementByXPath("//*[@id=\'navbar-collapse-1\']/ul/li[7]/a");
		
		Actions action = new Actions(driver);
		action.moveToElement(menu).perform();
		
		driver.findElement(By.linkText("Practice site 1")).click();
		
		       
		
	}

}
