package snippet;

import java.util.List;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectFromDropdown {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\R\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.wikipedia.org/");
		
		
		WebElement dropdown = driver.findElementByXPath("//*[@id='searchLanguage']");
		Select select = new Select(dropdown);
		
		select.selectByVisibleText("Italiano");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.findElementById("searchInput").sendKeys("now change language");
		select.selectByValue("hi");
		
		List<WebElement> dropdownlist = driver.findElementsByTagName("option");
		
		//size starts from 0 . actual size is  = size - 1
		System.out.println("this dropdown has " +dropdownlist.size() + " items");
		System.out.println(dropdownlist.get(7).getAttribute("value"));
		
		for(WebElement list:dropdownlist) {
			
			System.out.println(list.getAttribute("value"));
		}
		
		/*for(int i=0; i< dropdownlist.size() ; i++)
		{
			
			System.out.println(dropdownlist.get(i).getAttribute("value"));
		}*/
		
	
	}

}
