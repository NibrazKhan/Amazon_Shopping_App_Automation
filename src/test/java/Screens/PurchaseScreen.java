package Screens;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;


public class PurchaseScreen {
    @FindBy(id = "com.amazon.mShop.android.shopping:id/rs_search_src_text")
    public AndroidElement searchInputField;
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[2]/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.ViewAnimator/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[3]/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout")
    public AndroidElement productSelect;
    //    @FindBy(xpath = "//android.view.View[@content-desc=\"VIZIO 40-inch D-Series Full HD 1080p Smart TV with Apple AirPlay and Chromecast Built-in, Alexa Compatibility, D40f-J09,... Price: $196.88, List Price: $229.99\"]/android.widget.TextView")
    @AndroidFindBy(uiAutomator = "new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"VIZIO\").instance(0))")
    public AndroidElement productName;

    //$198.00
    @AndroidFindBy(uiAutomator = "new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"$19\").instance(0))")
    public AndroidElement productPrice;
    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"$198.00 $229.99\")")
    public AndroidElement selectProduct;
    @AndroidFindBy(uiAutomator = "new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"40 in\").instance(0))")
    public AndroidElement defaultSize;
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[2]/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.ViewAnimator/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[3]/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View[2]")
    public AndroidElement sizeDropDown;
    @AndroidFindBy(uiAutomator = "new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"24 in\").instance(0))")
    public AndroidElement availableSize;
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[2]/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.ViewAnimator/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[3]/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View[1]/android.view.View[2]")
    public AndroidElement dropUpbtn;
    @FindBy(id = "com.amazon.mShop.android.shopping:id/skip_sign_in_button")
    public AndroidElement btnSkipSignIn;
    @AndroidFindBy(uiAutomator = "new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().resourceId(\"add-to-cart-button\"))")
    public AndroidElement btnAddToCart;
    @FindBy(id = "com.amazon.mShop.android.shopping:id/action_bar_cart_image")
    public AndroidElement cartBasket;
    //    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Delete\")")
    @FindBy(className = "android.widget.Button")
    public List<AndroidElement> deleteBtn;
    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"+\")")
    public AndroidElement plusBtn;
    @FindBy(xpath = "//android.view.View[@content-desc=\"2\"]/android.widget.TextView")
    public AndroidElement productIncrease;
    @FindBy(id = "com.amazon.mShop.android.shopping:id/action_bar_cart_count")
    public AndroidElement barCount;
    @AndroidFindBy(uiAutomator = "new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"removed\").instance(0))")
    public AndroidElement emptyShoppingCartMsg;
    @FindBy(xpath = "//android.view.View[@content-desc=\"Shop laptops\"]/android.view.View")
    public AndroidElement showLaptopsAndTablets;
    @FindBy(id = "com.amazon.mShop.android.shopping:id/action_bar_burger_icon")
    public AndroidElement btnActionBurgerIcon;
    @FindBy(className = "android.widget.Button")
    public List<AndroidElement> btnProceedToCheckout;
    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"apx-add-credit-card-action-test-id\")")
    public AndroidElement cardPayment;
    @FindBy(className = "android.widget.TextView")
    public List<AndroidElement> creditCardInfoHeader;
    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"apx-add-bank-account-content-trigger-declarative-action-test-id\")")
    public AndroidElement chequePayment;
    @FindBy(className = "android.widget.Button")
    public AndroidElement btnAddingChequeAccount;
    @FindBy(id = "com.amazon.mShop.android.shopping:id/action_bar_search_icon")
    public AndroidElement searchBarbtn;
    AndroidDriver driver;
    PurchaseScreen searchScreen;
    LoginScreen loginScreen;

    public PurchaseScreen(AndroidDriver driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    public String searchTv() throws InterruptedException {
        loginScreen = new LoginScreen(driver);
        loginScreen.btnSignin.click();
        Thread.sleep(1500);
//        loginScreen.emailInput.clear();
//        Thread.sleep(1000);
        loginScreen.emailInput.sendKeys("nibirmubassir@gmail.com");
        Thread.sleep(1000);
        loginScreen.btnContinue.get(0).click();
        Thread.sleep(1700);
        loginScreen.showPassCheckbox.click();
        Thread.sleep(1000);
        loginScreen.passwordInput.sendKeys("amazon123#");
        Thread.sleep(1000);
        loginScreen.btnContinue.get(0).click();
//        WebDriverWait waiting = new WebDriverWait(driver,120);
//        waiting.until(ExpectedConditions.visibilityOfElementLocated(new MobileBy.ByAndroidUIAutomator("new UiSelector().text(\"Done\")")));
//        loginScreen=new LoginScreen(driver);
//        loginScreen.btnDone.click();
//        Thread.sleep(1000);
//        btnSkipSignIn.click();
        Thread.sleep(2000);
        btnActionBurgerIcon.click();
        Thread.sleep(2500);
        searchInputField.click();
        Thread.sleep(1400);
        searchInputField.sendKeys("TV");
        Thread.sleep(1000);
//        searchInputField.sendKeys(Keys.ENTER);
        driver.pressKey(new KeyEvent(AndroidKey.ENTER));
//        Thread.sleep(800);
//        WebDriverWait wait = new WebDriverWait(driver,60);
//        wait.until(ExpectedConditions.visibilityOfElementLocated(new MobileBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"VIZIO\").instance(0))")));
//        driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"WebView\").instance(0))").click(); //scroll down to the element and click
//                WebDriverWait wait = new WebDriverWait(driver,120);
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.view.View[@content-desc=\"Save 25% or more on a home refresh\"]/android.widget.Image")));
//        System.out.println("Name"+productName.getText());
//        Thread.sleep(1500);
        searchInputField.click();
        Thread.sleep(1000);
        searchInputField.sendKeys("TV");
//        Thread.sleep(1000);
        driver.pressKey(new KeyEvent(AndroidKey.ENTER));
//        Thread.sleep(1000);
        return productName.getText();

    }

    public String checkProductPrice() throws InterruptedException {
        String price = productPrice.getText();
        System.out.println("Price:" + price);
        Thread.sleep(2000);
        productPrice.click();
        return price;
    }

    public String checkDefaultSize() throws InterruptedException {
//        Thread.sleep(1000);
//        productName.click();
        Thread.sleep(1500);
        String size = defaultSize.getText();
        System.out.println("Size:" + size);
        return size;
    }

    public String checkAvailableSize() throws InterruptedException {
        Thread.sleep(1000);
        defaultSize.click();
        Thread.sleep(1000);
        String sizeAvailable = availableSize.getText();
        System.out.println("Available Size:" + sizeAvailable);
        defaultSize.click();
        return sizeAvailable;
    }

    public boolean displayAddToCartButton() throws InterruptedException {
        Thread.sleep(1200);
//        searchScreen=new SearchScreen(driver);
//        String productName=searchScreen.searchTv();
//        String price=searchScreen.checkProductPrice();

        return btnAddToCart.isDisplayed();
    }

    public String verifyingBarCount() throws InterruptedException {
        Thread.sleep(1000);
        btnAddToCart.click();
        WebDriverWait wait = new WebDriverWait(driver, 60);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.amazon.mShop.android.shopping:id/action_bar_cart_count")));
        System.out.println("Bar count" + barCount.getText());
        return barCount.getText();
    }

    public String verifyingCorrectProductAddedToCart() throws InterruptedException {
        Thread.sleep(1000);
        cartBasket.click();
        Thread.sleep(2000);
        System.out.println("Product Name:" + productName.getText());
        return productName.getText();
    }

    public String verifyingProductIncrement() throws InterruptedException {
        Thread.sleep(1000);
        plusBtn.click();
        WebDriverWait wait = new WebDriverWait(driver, 60);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.view.View[@content-desc=\"2\"]/android.widget.TextView")));
        System.out.println("Product Increased:" + productIncrease.getText());
        return productIncrease.getText();
    }

    public String emptyShoppingCart() throws InterruptedException {
        Thread.sleep(1500);
        deleteBtn.get(1).click();
        WebDriverWait waiter = new WebDriverWait(driver, 70);
        waiter.until(ExpectedConditions.visibilityOfElementLocated(new MobileBy.ByAndroidUIAutomator("new UiSelector().textContains(\"removed\")")));
        return emptyShoppingCartMsg.getText();
    }

    public boolean checkingProceedToCheckOutButton() throws InterruptedException {
        Thread.sleep(1000);
        searchScreen = new PurchaseScreen(driver);
//        addToCart=new AddToCart(driver);
        searchBarbtn.click();
        Thread.sleep(1000);
        searchScreen.searchInputField.clear();
        Thread.sleep(1000);
        //calling search and adding to cart methods
        searchScreen.searchInputField.sendKeys("TV");
        Thread.sleep(1000);
//        searchInputField.sendKeys(Keys.ENTER);
        driver.pressKey(new KeyEvent(AndroidKey.ENTER));
        Thread.sleep(2000);
        String productName = searchScreen.productName.getText();
        searchScreen.checkProductPrice();
        searchScreen.verifyingBarCount();
        searchScreen.verifyingCorrectProductAddedToCart();
        Thread.sleep(1000);
        boolean btnCheckout = btnProceedToCheckout.get(0).isDisplayed();
        Thread.sleep(1000);
        btnProceedToCheckout.get(0).click();
        Thread.sleep(3000);
        return btnCheckout;
    }

    public String VerifyingCardPayment() throws InterruptedException {
        Thread.sleep(1000);
        cardPayment.click();
        Thread.sleep(1500);
        String cardPaymentHeader = creditCardInfoHeader.get(0).getText();
        System.out.println("Credit Card Header" + cardPaymentHeader);
        return cardPaymentHeader;
    }

    public boolean VerifyingChequePayment() throws InterruptedException {
        Thread.sleep(1000);
        driver.pressKey(new KeyEvent(AndroidKey.BACK));
        Thread.sleep(2000);
        chequePayment.click();
        Thread.sleep(1500);
        boolean addingChequeButton = btnAddingChequeAccount.isDisplayed();
        System.out.println("Visibility of Adding Check Account" + addingChequeButton);
        return addingChequeButton;
    }


}
