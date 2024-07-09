package com.niaz.testing_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class LocatorExample extends BaseDriver {

	
	@Test
	public void locatorExample() throws InterruptedException {
		
		driver.manage().window().maximize();
		
		driver.get("https://www.shohoz.com/contact-us/en");
		
		Thread.sleep(5000);
		
		//byid
		
		WebElement bus = driver.findElement(By.id("purpose"));
		
		bus.click();
		Thread.sleep(5000);
		
		//byname
		//by.name
		//bylink
		
		//WebElement launch = driver.findElement(By.linkText(""))
		// by tagname
		
		//custom
		//tagname[contains(text(),"value")]
		
		WebElement email = driver.findElement(By.xpath("//input[@type=\"email\"]"));
				email.sendKeys("niaz.ju");
		Thread.sleep(5000);
		
	}
}
