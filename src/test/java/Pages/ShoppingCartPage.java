package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShoppingCartPage {

    private WebDriver driver;

    @FindBy(name = "product-quantity-spin")
    WebElement chooseProductQuantity;

    @FindBy(xpath = "//*[@id=\"main\"]/div/div[1]/div/div[2]/ul/li/div/div[3]/div/div[3]/div/a/i")
    WebElement deleteProduct;

    @FindBy(xpath = "//*[@id=\"main\"]/div/div[2]/div[1]/div[2]/div/a")
    WebElement proceedCheckout;

    public ShoppingCartPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void setChooseProductQuantity(String productQuantity) {
        chooseProductQuantity.click();
        chooseProductQuantity.clear();
        chooseProductQuantity.sendKeys(productQuantity);

    }

    public void deleteProduct() {
        deleteProduct.click();

    }

    public void chooseContinue() {
        proceedCheckout.click();
    }

}
