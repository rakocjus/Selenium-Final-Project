package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrderProcessPage {

    private WebDriver driver;

    @FindBy(name = "confirm-addresses")
    WebElement continueAddress;

    @FindBy(id = "delivery_option_1")
    WebElement choosePrestaShop;

    @FindBy(id = "delivery_option_2")
    WebElement chooseMyCarrier;

    @FindBy(name = "confirmDeliveryOption")
    WebElement continueShipping;

    @FindBy(id = "payment-option-1")
    WebElement payByCheck;

    @FindBy(id = "payment-option-2")
    WebElement payByWire;

    @FindBy(id = "conditions_to_approve[terms-and-conditions]")
    WebElement conditionsCheck;

    @FindBy(xpath = "//*[@id=\"payment-confirmation\"]/div[1]/button")
    WebElement orderButton;

    public OrderProcessPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void checkAddress() {
        continueAddress.click();
    }

    public void chooseShipping() {
        choosePrestaShop.click();
    }

    public void confirmShipping() {
        continueShipping.click();
    }

    public void chooseCheckPayment() {
        payByCheck.click();
    }

    public void chooseWirePayment() {
        payByWire.click();
    }

    public void confirmConditions() {
        conditionsCheck.click();
    }

    public void confirmOrder() {
        orderButton.click();
    }

}
