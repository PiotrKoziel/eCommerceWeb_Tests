package eCommerceProject.testCase_6.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrderSuccessPage {

    private static WebDriver driver;

    @FindBy(xpath = "//div[@class='col-main']//p[1]//a")
    WebElement orderNumber;


    public OrderSuccessPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public String orderNumber() throws InterruptedException {
        Thread.sleep(5000);
        return orderNumber.getText();
    }

}
