package appiumtest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;

public class aaa {
	private AndroidDriver driver;
	

	@Test
	public void press3() {
		WebElement el = driver.findElement(By.name("����"));
		el.click();
		//driver.pressKeyCode(4);
		driver.findElement(By.name("һ��")).click();
		driver.findElement(By.name("��ҵ����")).click();
		
		System.out.println("ִ����presse3");
}}
