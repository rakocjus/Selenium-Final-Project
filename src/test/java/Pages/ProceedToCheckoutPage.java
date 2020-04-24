package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProceedToCheckoutPage {

    private WebDriver driver;

    @FindBy(xpath = "//*[@id=\"blockcart-modal\"]/div/div/div[2]/div/div[2]/div/div/a")
    WebElement proceedToCheckout;

    public ProceedToCheckoutPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void chooseCheckout() {
        proceedToCheckout.click();
    }

}
