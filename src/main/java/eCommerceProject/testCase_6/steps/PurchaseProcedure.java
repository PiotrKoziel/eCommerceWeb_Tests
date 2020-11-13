package eCommerceProject.testCase_6.steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import eCommerceProject.testCase_6.pages.*;
import gherkin.lexer.Th;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class PurchaseProcedure {
    private static WebDriver driver;
    private static MyWishlistPage myWishlistPage;
    private static ShoppingCartPage shoppingCartPage;
    private static CheckoutPage checkoutPage;
    private static OrderSuccessPage orderSuccessPage;

    @Given("user logs in to application with previously created credentials")
    public void userLogsIn() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        driver.get("http://live.demoguru99.com/index.php/customer/account/login");

        LoginPage loginPage = new LoginPage(driver);
        loginPage.loginAs("peppers@gmail.com", "peppers");
    }

    @When("user goes to wish list page")
    public void userGoesToWishListPage() {
        myWishlistPage = new MyWishlistPage(driver);
        myWishlistPage.userGoesToWishList();
    }

    @And("user goes to shopping cart page")
    public void userGoesToShoppingCart() {
        shoppingCartPage = new ShoppingCartPage(driver);
        shoppingCartPage.userGoesToShoppingCart();
    }

    @And("user selects country (.*), state (.*) and zip code (.*) to estimate the shipping cost")
    public void userEstimatesShippingCost(String newCountry, String newState, String newZip) {
        shoppingCartPage.userSelectsCountry(newCountry);

        shoppingCartPage.userSelectsState(newState);

        shoppingCartPage.userEntersZipCode(newZip);

        shoppingCartPage.userGoesToEstimate();
    }

    @And("user clicks shipping price")
    public void userClicksShippingPrice() {
        shoppingCartPage.userSelectsFixedRate();
    }

    @Then("user verifies the shipping rate (.*)")
    public void userVerifiesShippingRate(String rate) {
        System.out.println("Shipping rate: " + shoppingCartPage.getPriceTheRate());
        //assert shoppingCartPage.getPriceTheRate().equals(newRate);
        Assert.assertEquals(shoppingCartPage.getPriceTheRate(), rate);
    }

    @When("user updates the total price")
    public void userUpdatesTotalPrice() {
        shoppingCartPage.updatePrice();
    }

    @And("user verifies the shipping rate price of (.*) from total price")
    public void userVerifiesShippingRateFromTotalPrice(String rateTotal) {
        System.out.println("Shipping rate from total price: " + shoppingCartPage.getRateFromTotal());
        Assert.assertEquals(shoppingCartPage.getPriceTheRate(), rateTotal);
    }

    @Then("user proceeds to checkout")
    public void userProceedsToCheckout() throws InterruptedException {
        shoppingCartPage.proceedToCheckout();
        Thread.sleep(3000);
    }

    @When("user enters shipping information (.*), (.*), (.*), (.*), (.*), (.*)")
    public void userEntersShippingInformation(String newState, String newAddress, String newCIty, String newZip,
                                              String newCountry, String newTelephone) {
        checkoutPage = new CheckoutPage(driver);
        checkoutPage.userEntersShippingInfo(newState, newAddress, newCIty, newZip, newCountry, newTelephone);

    }

    @And("user continues with ship to this address option")
    public void userSelectsShipToThisAddressOption() throws InterruptedException {
        checkoutPage.shipToAddress();
        checkoutPage.clicksContinueShip();
    }

    @And("user continues with flat shipping rate")
    public void userContinuesWithFlatRate() throws InterruptedException {
        checkoutPage.clicksContinueRate();
    }

    @And("user continues with money order option")
    public void userContinuesWithMoneyOrderOption() throws InterruptedException {

        checkoutPage.selectsMoneyOrder();
    }

    @And("user places the order")
    public void userPlacesTheOrder() throws InterruptedException {
        checkoutPage.placeTheOrder();
    }

    @Then("user sees successfully generated order number")
    public void userSeesSuccessfullyGeneratedOrderNumber() throws InterruptedException {
        orderSuccessPage = new OrderSuccessPage(driver);
        orderSuccessPage.orderNumber();

        System.out.println("Your order number: " + orderSuccessPage.orderNumber());
    }

    @And("user closes the browser")
    public void userClosesTheBrowser() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }

}
