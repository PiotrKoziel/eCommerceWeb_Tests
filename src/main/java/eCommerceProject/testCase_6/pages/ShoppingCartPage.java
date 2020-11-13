package eCommerceProject.testCase_6.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ShoppingCartPage {

    private final WebDriver driver;

    @FindBy(xpath = "//button[@title = 'Add to Cart']")
    WebElement addToCartButton;
    @FindBy(id = "country")
    WebElement countrySel;
    @FindBy(id = "region_id")
    WebElement stateSel;
    @FindBy(id = "postcode")
    WebElement zipBox;
    @FindBy(xpath = "//span[contains(text(),'Estimate')]")
    WebElement estimateButton;
    @FindBy(name = "estimate_method")
    WebElement flatRateButton;
    @FindBy(xpath = "//form[@id='co-shipping-method-form']//label[@for='s_method_flatrate_flatrate']//span")
    WebElement flatRate;
    @FindBy(name = "do")
    WebElement updateButton;
    @FindBy(xpath = "//tbody//tr[2]//td[2]//span")
    WebElement rateFromTotal;
    @FindBy(xpath = "//ul[@class=\"checkout-types bottom\"]//li[1]//button")
    WebElement proceedToCheckBtn;


    public ShoppingCartPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void userGoesToShoppingCart() {
        addToCartButton.click();
    }

    public void userSelectsCountry(String country) {
        Select countryOpt = new Select(countrySel);
        countryOpt.selectByVisibleText(country);
    }

    public void userSelectsState(String state) {
        Select stateOpt = new Select(stateSel);
        stateOpt.selectByVisibleText(state);
    }

    public void userEntersZipCode(String zip) {
        zipBox.clear();
        zipBox.sendKeys(zip);
    }

    public void userGoesToEstimate() {
        estimateButton.click();
    }

    public void userSelectsFixedRate() {
        if (!flatRateButton.isSelected()) {
            flatRateButton.click();
        }
    }

    public String getPriceTheRate() {

        return flatRate.getText();
    }

    public String getRateFromTotal(){

        return rateFromTotal.getText();
    }

    public void updatePrice(){

        updateButton.click();
    }

    public void proceedToCheckout(){
        proceedToCheckBtn.click();

    }

}



