//package appiumtest;
//
//public class method {
//    //1.����������������
//	//File screen = driver.getScreenshotAs(OutputType.FILE);
//	//File screenFile = new File("d:\\screen.png");
//	//try {
//	//FileUtils.copyFile(screen, screenFile); //commons-io-2.0.1.jar�е�api
//	//} catch (IOException e) {
//	//e.printStackTrace();
//
//	//��ȡ��ǰ�����activity,�����ڶ����Ƿ���ת��Ԥ�ڵ�activity
//	driver.currentActivity();
//
//	//��֪ͨ������
//	driver.openNotifications();
//	
//	//��������Ӧ�ã���APP
//	driver.startActivity("com.android.camera", ".CameraLauncher");
//	
//	//�Զ������б�
//	driver.scrollTo("text");
//	//����
//	driver.scrollToExact("text");
//	
//    //��װAPP
//driver.installApp(appPath);
//
////�ж�Ӧ���Ƿ��Ѱ�װ
//driver.isAppInstalled("package name");
//
////�϶����ͼ��������ͼ��λ��
//new TouchAction(driver).longPress(driver.findElementByName("���"))
//.moveTo(driver.findElementByName("����")).release().perform();
//
////����
//driver.lockScreen(2);
//
////�ж��Ƿ�����
//driver.isLocked();
//
//
////���Ͱ����¼�
//driver.sendKeyEvent(AndroidKeyCode.HOME);
//
//<span style="color:#ff0000;"> </span>
////ͨ��uiautomator��λclickable����Ϊtrue��Ԫ�ز����
//driver.findElementByAndroidUIAutomator("new UiSelector().clickable(true)").click();
//
////��ͬ���Ե�Ԫ��ʹ��List���
//List<webelement> elements = driver.findElementsByClassName("class name");
//elements.get(0).click(); //���List�еĵ�һ��Ԫ��
////tap,���Ԫ��λ��
//driver.tap(1, driver.findElementByName("���ں�ʱ��"), 0);</webelement>
//}
