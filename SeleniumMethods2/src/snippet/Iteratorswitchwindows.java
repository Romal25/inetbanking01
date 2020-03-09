package snippet;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

public class Iteratorswitchwindows {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\R\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		
		System.out.println("----Generating first window id----");
		Set<String> winids=driver.getWindowHandles();
		//String first_window = winids.iterator().next(); instead of it write below 
		
		/*Iterator<String> iterate = winids.iterator();
		String first_window = iterate.next();
		System.out.println(first_window);*/
		
		
		driver.get("https://www.hdfcbank.com/");
		driver.manage().window().maximize();
		
		Iterator<String> iterate = winids.iterator();
		String first_window = iterate.next();
		System.out.println(first_window);
		
		
		//driver.findElementById("custom-button").click();
		driver.findElementByXPath("//*[@id='custom-button']/button").click();
		
		// 2nd window
		
		winids = driver.getWindowHandles();
		iterate = winids.iterator();
		
		iterate.next(); // first window
		String second_window=iterate.next();
		System.out.println(second_window);
		
		
		driver.switchTo().window("second_window");
		
		driver.findElementByXPath("//*[@id='main']/div/div[12]/div[3]/div/div/div/div/div[2]/div[2]/div[2]/div[3]/a[1]");
		
		
		// 3rd window
		driver.getTitle();

	}

}
