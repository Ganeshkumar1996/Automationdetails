package org.san;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ThreadLocalRandom;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;


public class Browser {
	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\santh\\eclipse-workspace\\Sele\\driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
		driver.get("http://www.greenstech.in/selenium-course-content.html");
		driver.manage().window().maximize();
		WebElement BtnClk1 = driver.findElement(By.id("heading303"));
		BtnClk1.click();
		Thread.sleep(2000);
		WebElement BtnClk = driver.findElement(By.xpath("//a[text()=' DAY 10 TASK']"));
		BtnClk.click();
		Thread.sleep(2000);
		String win1 = driver.getWindowHandle();
		Set<String> win2 = driver.getWindowHandles();
		for (String str : win2) {
			if (!win1.equals(win2)) {
				driver.switchTo().window(str);
			}
		}
		WebElement txt = driver.findElement(By.xpath("//pre[contains(text(),'Windows Handling ')]"));
		String txtrtn = txt.getText();
        System.out.println(txtrtn);
        
		
	
		
		
		
		
		
		
		}
	
	
}
	

