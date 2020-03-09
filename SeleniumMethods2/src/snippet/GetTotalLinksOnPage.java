package snippet;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTotalLinksOnPage {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\R\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.wikipedia.org/");
		
		// Get links from whole page
		
		List<WebElement> links = driver.findElementsByTagName("a");
		
		System.out.println(links.size());
		
		for(WebElement link : links) {
			
			System.out.println(link.getText()+ "---URL---"+ link.getAttribute("href"));
			
		}
		
		driver.close();
		
		
		// get links from certain section
		
		driver.get("https://www.wikipedia.org/");
		
		WebElement block = driver.findElementByXPath("//*[@id='www-wikipedia-org']/div[8]/div[3]");
		
		List<WebElement> linksincertainsection =  block.findElements(By.tagName("a"));
		
		System.out.println(linksincertainsection.size());
		
		System.out.println(linksincertainsection.get(5).getAttribute("href"));
		
		
		
		
		
		
		
		
		
		//System.out.println(Block.size());
		//System.out.println(Block.get(5).getAttribute("href"));
		
		
		
		}
	}


