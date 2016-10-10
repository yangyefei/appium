package appiumtest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;

public class aaa {
	private AndroidDriver driver;
	

	@Test
	public void press3() {
		WebElement el = driver.findElement(By.name("助理"));
		el.click();
		//driver.pressKeyCode(4);
		driver.findElement(By.name("一融")).click();
		driver.findElement(By.name("企业服务")).click();
		
		System.out.println("执行了presse3");
}}
