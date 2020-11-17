package eCommerceProject.testCase_7;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class testCase_7 {

    WebDriver driver;
    String rate = "%5";
    double rateD = 0.05; // %5

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("http://live.demoguru99.com/");
    }

    @Test
    public void priceDiscount() throws InterruptedException {


        // user goes to mobile page
        driver.findElement(By.xpath("//div[@id='header-nav']//li[1]")).click();

        // switching windows
        for (String windowId : driver.getWindowHandles()) {
            driver.switchTo().window(windowId);
        }
        Thread.sleep(2000);

        // user adds Iphone to cart
        driver.findElement(By.xpath("//div[3]/ul[1]/li[2]/div[1]/div[3]/button[1]/span[1]/span[1]")).click();


        for (String windowId : driver.getWindowHandles()) {
            driver.switchTo().window(windowId);
        }

        // checking if input box is enabled
        WebElement discountInput = driver.findElement(By.id("coupon_code"));
        if (discountInput.isEnabled() == true) {

            System.out.println("Discount input box is enabled");

            // user enters groupon code
            discountInput.clear();
            discountInput.sendKeys("GURU50");
            System.out.println("discount rate equals = " + rate);
        } else {
            System.out.println("Discount input box is disabled");
        }

        // user approves the code
        driver.findElement(By.xpath("//div[@class = 'field-wrapper']//span[1]//span")).click();

        Thread.sleep(2000);

        // discount rate collected from shopping card
        WebElement disRate = driver.findElement(By.xpath("//span[contains(text(),'-$25.00')]"));

        // total price collected from shopping page
        WebElement totalPrice = driver.findElement(By.xpath("//table[@id=\"shopping-cart-totals-table\"]//td[2" +
                "]//strong//span"));


        String totalPriceT = totalPrice.getText().trim();
        /* trim() built-in function that eliminates leading and
        trailing spaces */

        //System.out.println(totalPriceT);

        String totalPriceTRep = totalPriceT.replaceAll("\\$", " ");
        String totalPriceTRepT = totalPriceTRep.trim();

        //System.out.println(totalPriceTRepT);

        String disRateTs = disRate.getText().substring(2);

        // converting Sting to double
        double disRateTsDouble = Double.parseDouble(disRateTs);
        System.out.println("Displayed amount from page as double: " + disRateTsDouble);

        double totalPriceTsDouble = Double.parseDouble(totalPriceTRepT);
        System.out.println(totalPriceTsDouble);

        double discountRate = (totalPriceTsDouble * rateD);
        System.out.println("Derived discount amount as double: " + discountRate);


        if (discountRate == disRateTsDouble) {
            System.out.println("Derived discount amount   = " + discountRate);
            System.out.println("Displayed discount amount = " + disRateTsDouble);
        } else {
            System.out.println("Derived discount amount not equal to displayed discount amount");
        }

        // converting double to String
        String discountRateDerived = Double.toString(discountRate);
        //System.out.println("Derived discount amount as String: " + discountRateDerived);

        String discountRateDisplayed = Double.toString(disRateTsDouble);
        //System.out.println("Displayed discount amount as String: " + discountRateDisplayed);

        try {
            Assert.assertEquals(discountRateDerived, discountRateDisplayed);
        } catch (Exception e) {
            System.out.println("Derived discount amount not equal to displayed discount amount");
            e.printStackTrace();
        }
    }

    @After
    public void tearDown() {
        driver.quit();

    }

}




