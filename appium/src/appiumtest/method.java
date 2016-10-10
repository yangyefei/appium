//package appiumtest;
//
//public class method {
//    //1.截屏并保存至本地
//	//File screen = driver.getScreenshotAs(OutputType.FILE);
//	//File screenFile = new File("d:\\screen.png");
//	//try {
//	//FileUtils.copyFile(screen, screenFile); //commons-io-2.0.1.jar中的api
//	//} catch (IOException e) {
//	//e.printStackTrace();
//
//	//获取当前界面的activity,可用于断言是否跳转到预期的activity
//	driver.currentActivity();
//
//	//打开通知栏界面
//	driver.openNotifications();
//	
//	//启动其他应用，跨APP
//	driver.startActivity("com.android.camera", ".CameraLauncher");
//	
//	//自动滑动列表
//	driver.scrollTo("text");
//	//或者
//	driver.scrollToExact("text");
//	
//    //安装APP
//driver.installApp(appPath);
//
////判断应用是否已安装
//driver.isAppInstalled("package name");
//
////拖动相机图标至日历图标位置
//new TouchAction(driver).longPress(driver.findElementByName("相机"))
//.moveTo(driver.findElementByName("日历")).release().perform();
//
////锁屏
//driver.lockScreen(2);
//
////判断是否锁屏
//driver.isLocked();
//
//
////发送按键事件
//driver.sendKeyEvent(AndroidKeyCode.HOME);
//
//<span style="color:#ff0000;"> </span>
////通过uiautomator定位clickable属性为true的元素并点击
//driver.findElementByAndroidUIAutomator("new UiSelector().clickable(true)").click();
//
////相同属性的元素使用List存放
//List<webelement> elements = driver.findElementsByClassName("class name");
//elements.get(0).click(); //点击List中的第一个元素
////tap,点击元素位置
//driver.tap(1, driver.findElementByName("日期和时间"), 0);</webelement>
//}
