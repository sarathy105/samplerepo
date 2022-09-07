package org.frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesSwitch {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\eclipse-workspace Selinium\\Selenium Test 10\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://netbanking.hdfcbank.com/netbanking/");
		WebElement txtid = driver.findElement(By.name("login_page"));
		driver.switchTo().frame(txtid);
		WebElement custid = driver.findElement(By.name("fldLoginUserId"));
		custid.sendKeys("535635135");
		Thread.sleep(4000);
		WebElement btnclick = driver.findElement(By.xpath("//a[text()='CONTINUE']"));
		btnclick.click();
		
		
	}

}
