package snippet;

import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//id,name,csslocator,xpath,classname,tagname,linktext,partiallinkText
		
		System.setProperty("webdriver.chrome.driver","C:\\R\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		
		
		/*driver.get("https://www.facebook.com");
		driver.findElementById("email").sendKeys("abcd");
		driver.findElementByName("pass").sendKeys("i dont know");
		driver.close();
		*/
		
		//driver.get("https://my.t-mobile.com");
		//driver.findElementByXPath("//*[@id='usernameTextBox']").sendKeys("9735805981");
		
		driver.get("https://www.facebook.com");
		driver.findElementByXPath("//*[@id='email']").sendKeys("abcd");
		driver.findElementByCssSelector("*[Name='pass']").sendKeys("I dont know");
		
				
		
		

	}

}
