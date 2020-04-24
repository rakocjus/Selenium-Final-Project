package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserPage {

    private static WebDriver driver;

    @FindBy(id = "category-3")
    private WebElement clothesCategory;

    @FindBy(id = "category-6")
    private WebElement accessoriesCategory;

    @FindBy(id = "category-9")
    private WebElement artCategory;

    @FindBy(name = "s")
    private WebElement searchButton;

    @FindBy(id = "addresses-link")
    private WebElement addresses;

    public UserPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void goToAddresses() {
        addresses.click();
    }

    public void goToClothes() {
        clothesCategory.click();
    }

    public void goToAccessories() {
        accessoriesCategory.click();
    }

    public void goToArt() {
        artCategory.click();
    }

    public void searchProduct(String product) {
        searchButton.sendKeys(product);
    }
}
