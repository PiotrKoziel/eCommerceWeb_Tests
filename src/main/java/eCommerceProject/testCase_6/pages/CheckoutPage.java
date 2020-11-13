package eCommerceProject.testCase_6.pages;

import gherkin.lexer.Th;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

public class CheckoutPage {

    private final WebDriver driver;

    @FindBy(id = "billing:street1")
    WebElement addressInput;
    @FindBy(id = "billing:region_id")
    WebElement statesList;
    @FindBy(name = "billing[city]")
    WebElement cityInput;
    @FindBy(id = "billing:postcode")
    WebElement zip;
    @FindBy(name = "billing[country_id]")
    WebElement countryList;
    @FindBy(id = "billing:telephone")
    WebElement phoneInput;

    @FindBy(id = "billing:use_for_shipping_yes")
    WebElement shipToAddressRadioBtn;
    @FindBy(xpath = "//button[@onclick='billing.save()']")
    WebElement continueShipBtn;
    @FindBy(xpath = "//button[@onclick='shippingMethod.save()']")
    WebElement continueFlatRate;
    @FindBy(id = "p_method_checkmo")
    WebElement moneyOrderBtn;

    @FindBy(xpath = "//button[@onclick='payment.save()']")
    WebElement continuePaymentBtn;

    @FindBy(xpath = "//button[@title='Place Order']")
    WebElement placeOrderBtn;


    public CheckoutPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void userEntersShippingInfo(String state, String address, String city, String Zip,
                                       String country, String telephone) {
        //user enters address
        addressInput.clear();
        addressInput.sendKeys(address);

        // user selects state from dropdown menu
        Select list = new Select(statesList);
        List<String> states = new ArrayList<>();

        for (WebElement st : list.getOptions()) {
            states.add(st.getText());
        }
        System.out.println(states);
        list.selectByVisibleText(state);

        // user enters city
        cityInput.clear();
        cityInput.sendKeys(city);

        // user enters zip
        zip.clear();
        zip.sendKeys(Zip);

        // user selects country from dropdown menu
        Select countryOpt = new Select(countryList);
        countryOpt.selectByVisibleText(country);

        // user enters phone number
        phoneInput.clear();
        phoneInput.sendKeys(telephone);
    }

    public void shipToAddress() {
        if (!shipToAddressRadioBtn.isSelected()) {
            shipToAddressRadioBtn.click();
        }
    }

    public void clicksContinueShip() throws InterruptedException {
        Thread.sleep(2000);
        continueShipBtn.click();
    }

    public void clicksContinueRate() throws InterruptedException {
        Thread.sleep(2000);
        continueFlatRate.click();
    }

    public void selectsMoneyOrder() throws InterruptedException {
        Thread.sleep(2000);
        moneyOrderBtn.click();
        continuePaymentBtn.click();
    }

    public void placeTheOrder() throws InterruptedException {
        Thread.sleep(2000);
        placeOrderBtn.click();
    }

}

