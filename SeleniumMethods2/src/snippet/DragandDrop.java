package snippet;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","C:\\R\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		
		
		driver.get("http://demo.automationtesting.in/Static.html");
		WebElement draggable  = driver.findElementByXPath("//*[@id='mongo']");
		//WebElement draggable  = driver.findElementById("mongo");
		WebElement droppable = driver.findElementByXPath("//*[@id='droparea']");
		
		
		Actions action = new Actions(driver);
		action.dragAndDrop(draggable, droppable).perform();
		

	}

}
