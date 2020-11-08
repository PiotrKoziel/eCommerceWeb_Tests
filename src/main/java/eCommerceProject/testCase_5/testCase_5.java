package eCommerceProject.testCase_5;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class testCase_5 {

    private static WebDriver driver;


    @Given("user is on the home page")
    public void userIsOnTheHomePage() {
        System.setProperty("webdriver.gecko.driver", "src/main/resources/drivers/geckodriver.exe");
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("http://live.demoguru99.com/index.php/");

        // verify title of home page
        WebElement pageTitle = driver.findElement(By.xpath("//div[@class = 'page-title']/h2"));
        String titlePage = pageTitle.getText();
        System.out.println("Title of home page: " + titlePage);
        String expectedHomePageTitle = "THIS IS DEMO SITE FOR   ";

        try {
            Assert.assertEquals(expectedHomePageTitle, titlePage);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @When("user clicks my account link")
    public void userClicksMyAccountLink() {
        WebElement myAccountButton = driver.findElement(By.linkText("MY ACCOUNT"));
        myAccountButton.click();

    }

    @And("user goes to create an account page")
    public void userGoesToCreateAccountPage() throws InterruptedException {
        for (String windowId : driver.getWindowHandles()) {
            driver.switchTo().window(windowId);
        }

        WebElement createAccountButton = driver.findElement(By.xpath("//span[contains(text(),'Create an Account')]"));
        createAccountButton.click();
        Thread.sleep(2000);
    }

    @And("user enters first name (.*), last name (.*), email (.*) and password (.*)")
    public void userEntersUserInformation(String firstName, String lastName, String email, String password) {

        for (String windowId : driver.getWindowHandles()) {
            driver.switchTo().window(windowId);
        }

        WebElement firstNameInput = driver.findElement(By.id("firstname"));
        if (firstNameInput.isEnabled()) {
            firstNameInput.clear();
            firstNameInput.sendKeys(firstName);
        } else {
            System.out.println("First name box is disabled");
        }

        WebElement lastNameInput = driver.findElement(By.id("lastname"));
        if (lastNameInput.isEnabled()) {
            lastNameInput.clear();
            lastNameInput.sendKeys(lastName);
        } else {
            System.out.println("Last name box is disabled");
        }

        WebElement emailInput = driver.findElement(By.id("email_address"));
        if (emailInput.isEnabled()) {
            emailInput.clear();
            emailInput.sendKeys(System.currentTimeMillis() + email);
        } else {
            System.out.println("Email address box is disabled");
        }
        WebElement passInput = driver.findElement(By.id("password"));
        if (passInput.isEnabled()) {
            passInput.clear();
            passInput.sendKeys(password);
        } else {
            System.out.println("Password box is disabled");
        }
        WebElement passConfirmationInput = driver.findElement(By.id("confirmation"));
        if (passConfirmationInput.isEnabled()) {
            passConfirmationInput.clear();
            passConfirmationInput.sendKeys(password);
        } else {
            System.out.println("Password confirmation box is disabled");
        }

    }

    @And("user clicks to register")
    public void userClicksToRegister() throws InterruptedException {
        WebElement registerButton = driver.findElement(By.xpath("//button[@title='Register']"));
        registerButton.click();
        Thread.sleep(2000);
    }

    @Then("^user sees the following successful registry message (.*) (.*) (.*)(.*)$")
    public void userSees(String regSuccessMsg, String firstName, String lastName, String exclamationMark) {
        for (String windowId : driver.getWindowHandles()) {
            driver.switchTo().window(windowId);
        }
        WebElement registryConf = driver.findElement(By.xpath("//p[contains(text(),'Welcome')]"));
        System.out.println("Registry confirmation title: " + registryConf.getText());

        try {
            Assert.assertEquals(regSuccessMsg.toUpperCase() + " " + firstName.toUpperCase() + " " + lastName.toUpperCase()
                    + exclamationMark, registryConf.getText());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @When("user clicks TV menu link")
    public void uerClicksTVMenuLink() {
        WebElement tvLink = driver.findElement(By.linkText("TV"));
        tvLink.click();
    }

    @And("user goes to product (.*) page")
    public void userAddsProductToWishList(String productLg){
        for (String windowId : driver.getWindowHandles()) {
            driver.switchTo().window(windowId);
        }

        List<WebElement> products = driver.findElements(By.xpath("//li/a[@class='product-image']"));

        for (WebElement product : products) {
            System.out.println(product.getAttribute("title"));

            if (product.getAttribute("title").equals(productLg)) {
                product.click();
            }
        }

    }

    @And("user add product to wish list")
    public void userAddsProductToWishlist() throws InterruptedException {

        for (String windowId : driver.getWindowHandles()) {
            driver.switchTo().window(windowId);
        }

        WebElement addToWishLink = driver.findElement(By.xpath("//a[contains(text(),'Add to Wishlist')]"));
        addToWishLink.click();
        Thread.sleep(3000);

    }


    @And("user sends the wishlist to email address (.*)")
    public void userSharesWishList (String emailAddress) {
        WebElement shareLink = driver.findElement(By.name("save_and_share"));
        shareLink.click();

        for (String windowId : driver.getWindowHandles()) {
            driver.switchTo().window(windowId);
        }

        WebElement emailBox = driver.findElement(By.id("email_address"));
        if(emailBox.isEnabled()){
            emailBox.clear();
            emailBox.sendKeys(emailAddress);
        }else{
            System.out.println("Emailbox is disabled");
        }


    }

    @And("user enters the following message (.*)")
    public void userEntersMessage(String message){

        WebElement messageBox = driver.findElement(By.id("message"));
        if(messageBox.isEnabled()){
            messageBox.clear();
            messageBox.sendKeys(message);
        }else{
            System.out.println("MessageBox is disabled");
        }
    }

    @And("user clicks to share wishlist")
    public void userClicksShareWishlist(){
        WebElement shareButton = driver.findElement(By.xpath(" //span[contains(text(),'Share Wishlist')]"));
        shareButton.click();
    }

    @Then("user sees successfully share message (.*)")
    public void userSeesSuccessfullyShareMessage(String successMessage){
        for(String windowId : driver.getWindowHandles()){
            driver.switchTo().window(windowId);
        }

    WebElement strMsg = driver.findElement(By.cssSelector("li.success-msg"));
        System.out.println(strMsg.getText());
        try{
            Assert.assertEquals(successMessage, strMsg.getText());
        }catch(Exception e){
            e.printStackTrace();
        }

    }

    @And("user closes the browser")
    public void userClosesTheBrowser() {

        driver.quit();
    }

}


