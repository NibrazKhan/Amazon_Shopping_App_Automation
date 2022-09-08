package testRunner;

import Base.Setup;
import Screens.PurchaseScreen;
import io.qameta.allure.Allure;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PurchaseRunner extends Setup {
    PurchaseScreen searchScreen;
    @Test(priority = 1,description = "Search 'TV' in search input field")
    public void searchTv() throws InterruptedException {
        searchScreen=new PurchaseScreen(driver);
        String productName=searchScreen.searchTv();
        Assert.assertTrue(productName.contains("VIZIO"));
        Allure.description("Authenticated user will search for 'TV' and then will see a TV brand named 'VIZIO' by scrolling down the screen to select desired product");
    }
    @Test(priority = 2,description = "Checking Product Price")
    public void checkProductPrice() throws InterruptedException {
        searchScreen=new PurchaseScreen(driver);
        String price=searchScreen.checkProductPrice();
        Assert.assertTrue(price.contains("$19"));
        Allure.description("Will check the product price being satisfactory or not");
    }
    @Test(priority = 3,description = "Check Product Default Size")
    public void checkDefaultSize() throws InterruptedException {
        searchScreen=new PurchaseScreen(driver);
        String defaultSize=searchScreen.checkDefaultSize();
        Assert.assertTrue(defaultSize.contains("40 in"));
        Allure.description("Click on the product and check its default size");
    }
    @Test(priority = 4,description = "Check Product Available Size")
    public void checkAvailableSize() throws InterruptedException {
        searchScreen=new PurchaseScreen(driver);
        String size=searchScreen.checkAvailableSize();
        Assert.assertTrue(size.contains("24 in"));
        Allure.description("Click on the available size drop down to check the other available size option");
    }
    @Test(priority = 5,description = "Add to Cart button present or not")
    public void displayAddToCart() throws InterruptedException {
        searchScreen=new PurchaseScreen(driver);
        boolean displayCart=searchScreen.displayAddToCartButton();
        Assert.assertTrue(displayCart);
        Allure.description("Ensure whether add to cart button present or not");
    }
    @Test(priority = 6,description = "Bar Count Should be 1 after Adding a single product")
    public void barCountCheck() throws InterruptedException {
        searchScreen=new PurchaseScreen(driver);
        String barCount=searchScreen.verifyingBarCount();
        Assert.assertTrue(barCount.contains("1"));
        Allure.description("After pressing add to cart button, single product will be added to cart");
    }
    @Test(priority = 7,description = "Verifying Correct Product Added to Cart Or not")
    public void verifyingCorrectProductAddedToCart() throws InterruptedException {
        searchScreen=new PurchaseScreen(driver);
        String correctProduct= searchScreen.verifyingCorrectProductAddedToCart();
        Assert.assertTrue(correctProduct.contains("VIZIO"));
        Allure.description("After clicking the add to cart basket verify that correct product being added to cart");
    }
    @Test(priority = 8,description = "Verifying Product Increased Or not by pressing plus button")
    public void verifyingProductIncrement() throws InterruptedException {
        searchScreen=new PurchaseScreen(driver);
        String productIncrease= searchScreen.verifyingProductIncrement();
        Assert.assertTrue(productIncrease.contains("2"));
        Allure.description("Verify product being correctly incremented or not by clicking plus button in quantity");
    }
    @Test(priority = 9,description = "Verifying empty Cart after pressing Delete Button")
    public void verifyingEmptyCart() throws InterruptedException {
        searchScreen=new PurchaseScreen(driver);
        String msgEmptyCart= searchScreen.emptyShoppingCart();
        Assert.assertTrue(msgEmptyCart.contains("removed"));
        Allure.description("Verify Cart being empty or not after clicking delete button.");
    }
    @Test(priority = 10,description = "Checking Whether Proceed To CheckOut button is present or not")
    public void checkingProceedToCheckOutButton() throws InterruptedException {
        searchScreen=new PurchaseScreen(driver);
        boolean btnCheckOut=searchScreen.checkingProceedToCheckOutButton();
        Assert.assertTrue(btnCheckOut);
    }
    @Test(priority = 11,description = "Checking Credit Card Info Header")
    public void checkingCardPayment() throws InterruptedException {
        searchScreen=new PurchaseScreen(driver);
        String cardPaymentHeader=searchScreen.VerifyingCardPayment();
        Assert.assertTrue(cardPaymentHeader.contains("credit card"));
    }
    @Test(priority = 12,description = "Verifying Cheque Payment")
    public void checkingChequePayment() throws InterruptedException {
        searchScreen=new PurchaseScreen(driver);
        boolean btnChequePayment=searchScreen.VerifyingChequePayment();
        Assert.assertTrue(btnChequePayment);
    }


}
