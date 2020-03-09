package snippet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsElementPresent {		
	
	public static WebDriver driver;
	
		
		public static boolean isElementPresent(String locator) {
						
			/*try {
			
			driver.findElement(By.xpath(locator));
			return true;
			} catch(Throwable t)
			
			{
				return false;
			}*/
			
			
			int size = driver.findElements(By.xpath(locator)).size();
			if(size==0) {
				return false;
			}else
			{
				return true;
			}
			
			
		}
			
		public static void main(String[] args) {
				
			System.setProperty("webdriver.chrome.driver","C:\\R\\chromedriver.exe");
			ChromeDriver driver=new ChromeDriver();		
				
				
				driver.get("https://www.wikipedia.org/");
				
				System.out.println(isElementPresent("//*[@id='searchLanguage']"));
				
			
			
		}
		
		
		
		
	}


