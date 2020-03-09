package javaProgramme;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchWindow_1 {

	public static void main(String[] args) {
		

		System.setProperty("webdriver.chrome.driver","C:\\R\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		
		
		driver.get("https://chandanachaitanya.github.io/selenium-practice-site/?languages=Java&enterText=");
		driver.findElementByXPath("//*[@id=\"win1\"]").click();
				
		System.out.println(driver.getTitle());
		Set <String> allwindows = driver.getWindowHandles();
		
		// first method through iterator
		Iterator<String> iterate = allwindows.iterator();
		
		String first_window = iterate.next();
		System.out.println(first_window);
		String second_window = iterate.next();
		System.out.println(second_window);
		
		driver.switchTo().window(second_window);
		System.out.println(driver.getCurrentUrl());
		
		driver.switchTo().window(first_window);
		System.out.println(driver.getCurrentUrl());
		
		
		//second method through for loop
		/*for(String w:allwindows) {
			
			//System.out.println(w);
			String s =driver.switchTo().window(w).getCurrentUrl();
			System.out.println(s);
			
			if(s.equals("https://www.google.co.in/")) {
			driver.close();
			}
		}*/
		

	}

}
