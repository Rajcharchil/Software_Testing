package Project1mobiletesting;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.MutableCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class p1Mobiletesting {
	AppiumDriver driver;
	@Test
	public void TestRunner() throws InterruptedException, MalformedURLException {
		MutableCapabilities caps = new MutableCapabilities();
		caps.setCapability("platformName", "Android");
		caps.setCapability("appium:app", "storage:filename=ApiDemosdebug 1.apk");  // The filename of the mobile app
		caps.setCapability("appium:deviceName", "Android GoogleAPI Emulator");
		caps.setCapability("appium:platformVersion", "15.0");
		caps.setCapability("appium:automationName", "UiAutomator2");
		MutableCapabilities sauceOptions = new MutableCapabilities();
		sauceOptions.setCapability("appiumVersion", "2.11.0");
		sauceOptions.setCapability("username", "oauth-rajcharchil555-8562d");
		sauceOptions.setCapability("accessKey", "1f6396ac-bb34-423c-a9a7-2eebe36798aa");
		sauceOptions.setCapability("build", "<your build id>");
		sauceOptions.setCapability("name", "<your test name>");
		sauceOptions.setCapability("deviceOrientation", "PORTRAIT");
		caps.setCapability("sauce:options", sauceOptions);

		// Start the session
		URL url = new URL("https://ondemand.eu-central-1.saucelabs.com:443/wd/hub");
		AndroidDriver driver = new AndroidDriver(url, caps);

		// replace with commands and assertions
		Thread.sleep(5000);
		String jobStatus = "passed"; // or "failed"

		// end the session
		driver.executeScript("sauce:job-result=" + jobStatus);
		driver.quit();
		
	}

}
