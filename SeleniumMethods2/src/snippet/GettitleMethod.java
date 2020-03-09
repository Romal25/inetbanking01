package snippet;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GettitleMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\R\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.way2automation.com");
		String title = driver.getTitle();
		System.out.println(title.length());
		System.out.println(title);
		
		
		
		

	}

}
