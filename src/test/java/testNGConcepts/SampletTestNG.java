package testNGConcepts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import webDriverConcepts.InvokeApplicationTest;

public class SampletTestNG {
	
	@Test
	public void invokeApplication() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.ca");
		System.out.println("Url and title is: "+ driver.getCurrentUrl() + " ---- " +driver.getTitle());
		driver.close();	
		
	}
	
  
}
