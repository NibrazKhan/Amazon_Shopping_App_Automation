package Base;

import Utilities.ScreenshotUtility;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class Setup {
    public AndroidDriver driver;
    public static final String PACKAGE_ID="com.amazon.mShop.android.shopping";
    @BeforeTest
    public AndroidDriver setUp() throws MalformedURLException {
        DesiredCapabilities cap=new DesiredCapabilities();
        cap.setCapability("deviceName","MyDevice");
        cap.setCapability("platformName","Android");
        cap.setCapability("appPackage","com.amazon.mShop.android.shopping");
        cap.setCapability("appActivity","com.amazon.mShop.splashscreen.StartupActivity");
        cap.setCapability("autoGrantPermissions",true);
        URL url=new URL("http://127.0.0.1:4723/wd/hub");
        driver=new AndroidDriver(url,cap);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        return driver;
    }
    @AfterMethod
    public void screenShot(ITestResult result){
        if(ITestResult.FAILURE==result.getStatus()){
            try{
                ScreenshotUtility utils=new ScreenshotUtility();
                utils.takeScreenshotForFailure(driver);
            }
            catch (Exception exception){
                System.out.println(exception.toString());
            }
        }
        else{
            try{
                ScreenshotUtility utils=new ScreenshotUtility();
                utils.takeScreenshotForSuccess(driver);
            }
            catch (Exception exception){
                System.out.println(exception.toString());
            }
        }
    }
    @AfterTest
    public void close(){
        driver.quit();
    }
}
