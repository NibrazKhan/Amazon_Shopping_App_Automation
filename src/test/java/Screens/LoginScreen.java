package Screens;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class LoginScreen {
    public static final String PACKAGE_ID = "com.amazon.mShop.android.shopping";
    @FindBy(id = "com.amazon.mShop.android.shopping:id/sign_in_button")
    public AndroidElement btnSignin;
    @FindBy(className = "android.widget.EditText")
    public AndroidElement emailInput;
    //0
    @FindBy(className = "android.widget.Button")
    public List<AndroidElement> btnContinue;
    @FindBy(className = "android.widget.EditText")
    public AndroidElement passwordInput;
    @FindBy(className = "android.widget.CheckBox")
    public AndroidElement showPassCheckbox;
    @FindBy(className = "android.widget.Button")
    public AndroidElement signInSubmit;
    @FindBy(className = "android.widget.EditText")
    public AndroidElement searchTextInput;
    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Enter your email or mobile phone number\")")
    public AndroidElement invalidBlankErrorMsg;
    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"No account found with email address\")")
    public AndroidElement invalidEmailErrorMsg;
    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Your password is incorrect\")")
    public AndroidElement invalidPassMsg;
    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Done\")")
    public AndroidElement btnDone;
    AndroidDriver driver;

    public LoginScreen(AndroidDriver driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    public String doLoginWithBlankEmail() throws InterruptedException {
//        btnDone.click();
        emailInput.sendKeys("");
        Thread.sleep(1000);
        btnContinue.get(0).click();
        Thread.sleep(2500);
        return invalidBlankErrorMsg.getText();
    }

    public String doLoginWithIncorrectEmail() throws InterruptedException {
        Thread.sleep(1000);
        emailInput.sendKeys("nibirmubssir@gmail.com");
        Thread.sleep(1000);
        btnContinue.get(0).click();
        Thread.sleep(1000);
        System.out.println("error msg:"+invalidEmailErrorMsg.getText());
        return invalidEmailErrorMsg.getText();
    }

    public String doLoginWithIncorrectPass() throws InterruptedException {
        Thread.sleep(1500);
        emailInput.clear();
        Thread.sleep(1000);
        emailInput.sendKeys("nibirmubassir@gmail.com");
        Thread.sleep(1000);
        btnContinue.get(0).click();
        Thread.sleep(1200);
        showPassCheckbox.click();
        Thread.sleep(1000);
        passwordInput.sendKeys("skdjfhskdjhf");
        Thread.sleep(1000);
        btnContinue.get(0).click();
        Thread.sleep(1000);
        System.out.println("Error Message" + invalidPassMsg.getText());
        return invalidPassMsg.getText();
    }

    public boolean doLogin() throws InterruptedException {
//          Thread.sleep(1000);
        Thread.sleep(1500);
        Thread.sleep(1200);
        showPassCheckbox.click();
        Thread.sleep(1000);
        passwordInput.sendKeys("amazon123#");
        Thread.sleep(1000);
        signInSubmit.click();
        Thread.sleep(1200);
        return searchTextInput.isDisplayed();

    }
}
