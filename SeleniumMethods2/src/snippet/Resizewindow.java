package snippet;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Resizewindow {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\R\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		
		
		driver.get("http://demo.automationtesting.in/Resizable.html");
		WebElement resizable =driver.findElementByXPath("//*[@id='resizable']/div[3]");
		
		Actions action = new Actions(driver);
		action.dragAndDropBy(resizable, 50,50).perform();

	}

}
