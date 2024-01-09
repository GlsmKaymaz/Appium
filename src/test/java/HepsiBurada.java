import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class HepsiBurada {

    public static void main(String[] args) throws MalformedURLException, InterruptedException {

        // Appium sunucusuna baglanmak icin gerekli bilgiler

        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();

        desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        desiredCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Pixel 7");
        desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "13.0");
        desiredCapabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
        desiredCapabilities.setCapability(MobileCapabilityType.APP, "C:\\Users\\glsmk\\IdeaProjects\\Appium\\Apps\\Hepsiburada.apk");

        // Appium sunucusuna baglanma URL'ini olustur

        AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(new URL("http://localhost:4723/wd/hub"), desiredCapabilities);

        Thread.sleep(3000);
        MobileElement button = driver.findElement(By.xpath("//android.widget.Button[1]"));
        button.click();

        MobileElement popup = driver.findElement(By.id("com.pozitron.hepsiburada:id/touch_outside"));
        popup.click();

        MobileElement search = driver.findElement(By.id("com.pozitron.hepsiburada:id/etSearchBox"));
        search.sendKeys("Karaca");


    }
}
