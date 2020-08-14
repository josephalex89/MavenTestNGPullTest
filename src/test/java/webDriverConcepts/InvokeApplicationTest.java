package webDriverConcepts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InvokeApplicationTest {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		System.out.println(driver.getTitle());
		driver.close();
		
		
	}
	private void invokeApplication() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.ca");
		System.out.println("Url and title is: "+ driver.getCurrentUrl() + " ---- " +driver.getTitle());
		driver.close();
	}
	

}
