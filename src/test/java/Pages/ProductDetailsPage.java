package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ProductDetailsPage {

    private WebDriver driver;

    @FindBy(xpath = "//*[@id=\"main\"]/div[1]/div[2]/div[1]/div[2]/div/span[2]")
    WebElement discountInfo;

    @FindBy(id = "group_1")
    WebElement sizeBox;

    @FindBy(id = "quantity_wanted")
    WebElement quantityBox;

    @FindBy(xpath = "//*[@id=\"add-to-cart-or-refresh\"]/div[2]/div/div[2]/button")
    WebElement addCart;


    public ProductDetailsPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public String getDiscountInfo() {
        return discountInfo.getText();
    }

    public void chooseSize(String size) {
        Select selectSize = new Select(sizeBox);
        selectSize.selectByValue(size);

    }

    public void chooseQuantity(String quantity) {
        quantityBox.clear();
        quantityBox.sendKeys(quantity);

    }

    public void addToCart() {
        addCart.click();

    }

}
