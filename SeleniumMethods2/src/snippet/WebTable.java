package snippet;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\R\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();		
			
			
			driver.get("https://money.rediff.com/indices/nse?src=moneyhome_nseIndices_more");
			
			List<WebElement> rownum = driver.findElementsByXPath("//*[@id='dataTable']/tbody/tr");
			
			System.out.println(rownum.size());
			
			
		

	}

}
