package snippet;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectCheckboxes {

	public static void main(String[] args) {
		

		System.setProperty("webdriver.chrome.driver","C:\\R\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("http://www.tizag.com/htmlT/htmlcheckboxes.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		/* not reccomended 
		
		for(int i=0; i<=4 ; i++) {
		driver.findElementByXPath("//div[4]/input[+i+]").click();
		
		}*/
		
		
		WebElement display = driver.findElementByXPath("//div[4]");
		
		List<WebElement> checkboxes = display.findElements(By.name("sports"));
				
						
		System.out.println("total checkboxed are" + checkboxes.size());
		
		for(WebElement checkbox : checkboxes) {
			
			checkbox.click();			
			System.out.println(checkbox.getText());
		}
		
		
		
		}
		
		
		
		
		
	}


