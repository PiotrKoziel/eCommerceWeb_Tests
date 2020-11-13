package eCommerceProject.testCase_6.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyWishlistPage {

    public static WebDriver driver;

    @FindBy(linkText = "MY WISHLIST")
    WebElement wishListLink;

    public MyWishlistPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void userGoesToWishList(){
        wishListLink.click();

    }

}
