package org.frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CanaraBank {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\eclipse-workspace Selinium\\Selenium Test 10\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://netbanking.canarabank.in/entry/ENULogin.jsp");
		
		//driver.switchTo().frame("TuringSession");
		//Thread.sleep(3000);
		//WebElement iframed = driver.findElement(By.id("TuringSession"));
		//driver.switchTo().frame(iframed);
		WebElement username = driver.findElement(By.xpath("//input[@placeholder='User ID']"));
		username.sendKeys("samplename");
		WebElement userpass = driver.findElement(By.xpath("//input[@placeholder='Password']"));
		userpass.sendKeys("sample123456");
		WebElement btn = driver.findElement(By.xpath("//input[@value='SIGN IN']"));
		btn.click();
		
	}

}
