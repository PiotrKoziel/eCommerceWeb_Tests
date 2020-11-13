package eCommerceProject.testCases_1_to_4;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import java.io.File;
import java.io.IOException;
import java.util.*;
import java.util.concurrent.TimeUnit;

public class testCases_1_to_4 {

    private static WebDriver driver;
    private static String priceFromList;
    private static String priceFromDetail;
    private static String compareWinMobile1;
    private static String compareWinMobile2;
    private static String mainWinMobile1;
    private static String mainWinMobile2;

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

    @When("user clicks mobile menu")
    public void userClicksMobileMenu() throws InterruptedException {
        WebElement mobileButton = driver.findElement(By.linkText("MOBILE"));
        mobileButton.click();
        Thread.sleep(1000);
    }

    @Then("user goes to product list page")
    public void userGoesToProductListPage() {
        // verify the title of the page
        WebElement mobilePage = driver.findElement(By.xpath("//h1[contains(text(),'Mobile')]"));
        String itemPageTitle = mobilePage.getText();
        String expectedItemPageTitle = "Mobile";
        System.out.println("Title of product page: " + itemPageTitle);

        try {
            Assert.assertEquals(expectedItemPageTitle.toUpperCase(), itemPageTitle);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    @And("user selects sort-by dropdown as option (.*)")
    public void userSelectsSortByName(String sortByOption) throws IOException {

        // generate the list of products
        List<WebElement> mobiles = driver.findElements(By.xpath("//h2[@class='product-name']/a"));
        List mobileList = new ArrayList<>();
        for (WebElement list : mobiles) {
            mobileList.add(list.getText());
        }

        System.out.println("Mobile list before sorting: " + mobileList);

        // generate list of options from dropdown menu
        WebElement option = driver.findElement(By.xpath("//body/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/select[1]"));
        Select list = new Select(option);
        List<String> optionList = new ArrayList<>();
        for (WebElement opt : list.getOptions()) {
            optionList.add(opt.getText());
        }
        System.out.println("Sort-by options to choose from: " + optionList);

        // creating controlList as a mobileList copy
        List controlList = new ArrayList<>();
        controlList.addAll(mobileList);

        System.out.println("Control list before sorting: " + controlList);

        // choosing the sort by -name- option
        list.selectByVisibleText(sortByOption);

        // creating list of sorted products
        List<WebElement> mobilesSorted = driver.findElements(By.xpath("//h2[@class='product-name']/a"));
        List mobileListSort = new ArrayList<>();
        for (WebElement listSort : mobilesSorted) {
            mobileListSort.add(listSort.getText());
        }
        System.out.println("Mobile list sorted: " + mobileListSort);

        // sorting the control list
        Collections.sort(controlList);

        System.out.println("Control list sorted: " + controlList);

        // verify sorted-by name option by comparing mobilelist and controllist
        if(controlList.equals(mobileListSort)){
            System.out.println("Product list sorted");
        }else {
            System.out.println("Product list not sorted");
        }


        // verify sorted-by name option by taking a screenshot
        File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(file, new

                File("./screenshot/sortedBy.png"));
    }

    @And("user notes product price from the list")
    public void userNotesThePriceFromTheList() {
        WebElement productPrice = driver.findElement(By.xpath("//span[@id='product-price-1']"));
        priceFromList = productPrice.getText();
        System.out.println("Price from the list: " + priceFromList);
    }


    @When("user clicks product image")
    public void userClicksProductImage() {
        WebElement productImage = driver.findElement(By.xpath("//img[@id='product-collection-image-1']"));
        productImage.click();
    }

    @Then("user notes product price from detail page")
    public void userNotesProductPriceFromDetailPage() {

        WebElement detailPrice = driver.findElement(By.xpath("//span[@class = 'regular-price']/span"));
        priceFromDetail = detailPrice.getText();
        System.out.println("Price from detail page: " + priceFromDetail);
    }

    @And("price from product list and detail page is compared")
    public void comparePrices() {
        try {
            Assert.assertEquals(priceFromDetail, priceFromList);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            e.printStackTrace();
        }
    }

    @When("user adds to cart a product from the list")
    public void userAddsProductToCart() {
        WebElement addToCartButton = driver.findElement(By.xpath("//body/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[3]/ul[1]/li[1]/div[1]/div[3]/button[1]/span[1]/span[1]"));
        addToCartButton.click();
    }

    @Then("user enters quantity of (.*) and updates the cart")
    public void updateTheQuantity(String qty) {
        WebElement qtyInput = driver.findElement(By.xpath("//input[@title = 'Qty']"));
        qtyInput.clear();
        qtyInput.sendKeys(qty);

        WebElement updateButton = driver.findElement(By.xpath("//button[@title = 'Update']"));
        updateButton.click();
    }

    @And("user sees the following message (.*)")
    public void verifyErrorMessage(String expMsg) {
        WebElement errorMsg = driver.findElement(By.xpath("//span[contains(text(),'Some of the products cannot be ordered')]"));
        String errMsg = errorMsg.getText();
        System.out.println(errMsg);
        //   String expMsg = "Some of the products cannot be ordered in requested quantity.";

        try {
            Assert.assertEquals(errMsg, expMsg);
        } catch (Exception e) {
            System.out.println("error: " + e.getMessage());
            e.printStackTrace();
        }
    }

    @When("user empties the cart")
    public void userEmptiesCart() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement emptyCartButton = driver.findElement(By.id("empty_cart_button"));

        js.executeScript("arguments[0].scrollIntoView();", emptyCartButton);
        emptyCartButton.click();
    }

    @Then("user can see the following message (.*)")
    public void userSeesTheFollowingMessage(String expEmptyMsg) {

        WebElement noItemsMsg = driver.findElement(By.xpath("//h1[contains(text(),'Shopping Cart is Empty')]"));
        String cartIsEmpty = noItemsMsg.getText();
        System.out.println("You have no items message:" + noItemsMsg.getText());

        try {
            Assert.assertEquals(cartIsEmpty, expEmptyMsg.toUpperCase());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @When("user adds two products to compare")
    public void userAddsTwoProductsToCompare() {

        WebElement addToCompareMobile1 = driver.findElement(By.xpath("//body/div[1]/div[1]/div[2]/div[1]/div[2]/div[1" +
                "]/div[3]/ul[1]/li[1]/div[1]/div[3]/ul[1]/li[2]/a[1]"));
        addToCompareMobile1.click();

        WebElement addToCompareMobile2 = driver.findElement(By.xpath("//body/div[1]/div[1]/div[2]/div[1]/div[2]/div[1" +
                "]/div[3]/ul[1]/li[2]/div[1]/div[3]/ul[1]/li[2]/a[1]"));
        addToCompareMobile2.click();

        mainWinMobile1 = driver.findElement(By.xpath("//h2/a[@title='Sony Xperia']")).getText();
        mainWinMobile2 = driver.findElement(By.xpath("//h2/a[@title='IPhone']")).getText();
    }

    @Then("user goes to pop-up window (.*)")
    public void userGoesToPopUpWindow(String expWin) throws InterruptedException {
        WebElement compareButton = driver.findElement(By.xpath("//button[@title='Compare']"));
        compareButton.click();

        Thread.sleep(1000);

        for (String windowId : driver.getWindowHandles()) {
            driver.switchTo().window(windowId);
        }

        String windowHeading = driver.findElement(By.xpath("//body/div[1]/div[1]/h1")).getText();
        System.out.println("windowheading: " + windowHeading);

        try {
            Assert.assertEquals(windowHeading, expWin.toUpperCase());
        } catch (Exception e) {
            e.printStackTrace();
        }

        compareWinMobile1 = driver.findElement(By.xpath("//a[contains(text(),'Sony Xperia')]")).getText();
        compareWinMobile2 = driver.findElement(By.xpath("//a[contains(text(),'IPhone')]")).getText();
    }

    @And("user verifies the content of pop-up window")
    public void userVerifiesTheContentOfPopUpWindow() {

        try {
            Assert.assertEquals(mainWinMobile1, compareWinMobile1);
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            Assert.assertEquals(mainWinMobile2, compareWinMobile2);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @And("user closes the browser")
    public void userClosesTheBrowser() {
        driver.quit();
    }

}



