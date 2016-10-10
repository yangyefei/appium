

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import com.gargoylesoftware.htmlunit.javascript.host.dom.Document;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.apache.xerces.impl.xs.identity.Selector;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.HasTouchScreen;
import org.openqa.selenium.interactions.TouchScreen;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteTouchScreen;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;

import java.io.File;
import java.net.URL;
import java.util.List;
import java.util.Scanner;

@Test
public class AppDemo {
	private AndroidDriver driver;

	@BeforeMethod(alwaysRun = true)
	public void setUp() throws Exception {
		// set up appium
		File classpathRoot = new File(System.getProperty("user.dir"));
		File appDir = new File(classpathRoot, "apps");
		File app = new File(appDir, "easyrongchuangye-qa-160908084804-V2.3.1.apk");
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability(CapabilityType.BROWSER_NAME, "");
		//capabilities.setCapability("noReset", true); 
		capabilities.setCapability("device", "Android");
		capabilities.setCapability("deviceName", "Android Emulator");
		capabilities.setCapability("platformVersion", "5.1.1");
		capabilities.setCapability("app", app.getAbsolutePath());
		capabilities.setCapability("appPackage", "com.easyrongchuangye");
		capabilities.setCapability("appActivity", ".activities.EasyrongChuangyeActivity");
		driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
	}

	@AfterMethod(alwaysRun = true)
	public void tearDown() throws Exception {
		driver.quit();
	}

	@Test
	public void press() {
		WebElement el = driver.findElement(By.name("我的"));
		if (el.isDisplayed()) {
			Assert.assertTrue(true);
			el.click();

		} else {
			Assert.assertTrue(false);
		}
		;
		String act= driver.currentActivity();
		//WebElement el = driver.findElementByAndroidUIAutomator(new Selector(paramXPath, paramIdentityConstraint))
		System.out.println("执行了press"+act);
		
		// List<WebElement> textFieldsList =
		// driver.findElementsByClassName("android.widget.EditText");
		// textFieldsList.get(0).sendKeys("Some Name");
		// textFieldsList.get(1).sendKeys("10086");
		// textFieldsList.get(2).sendKeys("Some@example.com");
		// driver.swipe(100, 500, 100, 100, 2);
		// driver.findElementByName("Save").click();
	}

	@Test
	public void press2() {
		WebElement el = driver.findElement(By.name("助理"));
		el.click();
		//driver.pressKeyCode(4);
		driver.findElement(By.name("一融")).click();
		driver.findElement(By.name("企业服务")).click();
		
		System.out.println("执行了presse2");
		driver.openNotifications();
		Scanner scan = new Scanner(System.in);
		String app = scan.nextLine();
		// List<WebElement> textFieldsList =
		// driver.findElementsByClassName("android.widget.EditText");
		// textFieldsList.get(0).sendKeys("Some Name");
		// textFieldsList.get(1).sendKeys("10086");
		// textFieldsList.get(2).sendKeys("Some@example.com");
		// driver.swipe(100, 500, 100, 100, 2);
		// driver.findElementByName("Save").click();
	}

}
