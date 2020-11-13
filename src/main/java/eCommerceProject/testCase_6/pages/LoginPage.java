package eCommerceProject.testCase_6.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    private static WebDriver driver;

    @FindBy(name = "login[username]")
    WebElement userEmailInput;
    @FindBy(name = "login[password]")
    WebElement passwordInput;
    @FindBy(id = "send2")
    WebElement signInButton;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void loginAs(String userId, String password) {
        userEmailInput.clear();
        userEmailInput.sendKeys(userId);

        passwordInput.clear();
        passwordInput.sendKeys(password);

        signInButton.click();
    }

}
