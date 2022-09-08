package testRunner;

import Base.Setup;
import Screens.LoginScreen;
import io.qameta.allure.Allure;
import org.junit.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginTestRunner extends Setup {
    LoginScreen loginScreen;
    @BeforeTest
    public void signInUserClick() throws InterruptedException {
        loginScreen=new LoginScreen(driver);
//        loginScreen.btnDone.click();
        Thread.sleep(1000);
        loginScreen.btnSignin.click();
        Thread.sleep(1000);
    }
    @Test(priority = 1,description = "login with unauthenticated email")
    public void doLoginWithBlankEmail() throws InterruptedException {
        loginScreen=new LoginScreen(driver);
        String errorMsg=loginScreen.doLoginWithBlankEmail();
        Assert.assertTrue(errorMsg.contains("Enter your email"));
        Allure.description("When user tries to login with Blank email, there will be a warning shown to the user:'Enter your email or mobile phone  number' ");
    }
    @Test(priority = 2,description = "login with unauthenticated email")
    public void doLoginWithInvalidEmail() throws InterruptedException {
        loginScreen=new LoginScreen(driver);
        String errorMsg=loginScreen.doLoginWithIncorrectEmail();
        Assert.assertTrue(errorMsg.contains("No account found"));
        Allure.description("When user tries to login with invalid email, there will be a error message shown to the user:'No email is found' ");
    }
    @Test(priority = 3,description = "login with incorrect password")
    public void doLoginWithInvalidPass() throws InterruptedException {
        loginScreen=new LoginScreen(driver);
        String errorMsg=loginScreen.doLoginWithIncorrectPass();
        System.out.println(errorMsg);
        Assert.assertTrue(errorMsg.contains("Your password is incorrect"));
        Allure.description("When user tries to login with invalid Password, there will be a error message shown to the user:'Your Password is incorrect' ");
    }
   @Test(priority = 4,description = "login with authenticated email and password")
    public void doLogin() throws InterruptedException {
       loginScreen=new LoginScreen(driver);
       boolean successfulLogin= loginScreen.doLogin();
       Assert.assertTrue(successfulLogin);
       Allure.description("After successful login by giving valid credentials, a page will appear containing search input box");
    }

}
