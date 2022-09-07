package org.frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SampleTest {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\eclipse-workspace Selinium\\Selenium Test 10\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("   URL   ");
		
	    driver.switchTo().frame("f1");
	    driver.switchTo().frame("f2");
	    WebElement btn = driver.findElement(By.xpath("//btn[text()='List']"));
	    btn.click();
	    WebElement frame3 = driver.findElement(By.xpath("//a[@src='hexa']"));
	    driver.switchTo().frame(frame3);
	    WebElement btn2 = driver.findElement(By.xpath("//btn[text()='One']"));
	    btn2.click();
	    driver.switchTo().frame("Jiya");
	    WebElement btn3 = driver.findElement(By.xpath("//btn[text()='Ni']"));
	    btn3.click();
	    driver.switchTo().frame("f6");
	    
	    WebElement printxt = driver.findElement(By.xpath("//div[contains(text(),'Jack']"));
	    String txt = printxt.getText();
	    WebElement printxt2 = driver.findElement(By.xpath("//div[text()='How are U']"));
	    String txt2 = printxt2.getText();
	    
	    System.out.println(txt +"/n"+ txt2);
	    
	    for(int i=0; i<=4; i++) {
	    driver.switchTo().parentFrame();
	    }
	    WebElement txtdone = driver.findElement(By.xpath("//a[text()='Done']"));
	    String txtd = txtdone.getText();
	    System.out.println(txtd);
	    
	    driver.close();
	    driver.quit();
	}
	

}
