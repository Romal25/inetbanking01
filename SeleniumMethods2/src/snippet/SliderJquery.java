package snippet;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SliderJquery {

	

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\R\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		
		
		driver.get("http://demo.automationtesting.in/Slider.html");
		WebElement slider =driver.findElementByXPath("//*[@id='slider']");
		System.out.println( slider.getSize());
		Actions action = new Actions(driver);
		action.dragAndDropBy(slider, 50,0).perform();
		
		
		
		/*driver.get("https://www.t-mobile.com/");
		driver.manage().window().maximize();
		//WebDriverWait wait = new WebDriverWait(driver,10);
		//wait.until(ExpectedConditions.visibilityOfElementLocated((By) driver.findElementById("digital-header-nav-link-1")).click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		WebElement phonelink =driver.findElementById("digital-header-nav-link-1");
		Actions action = new Actions(driver);
		action.moveToElement(phonelink).click();
		
		driver.findElementByXPath("//*[@id='digital-header-nav-link-category-link-1-0']").click();
		System.out.println(driver.getTitle());
		*/
		
		
	

	}

	

}
