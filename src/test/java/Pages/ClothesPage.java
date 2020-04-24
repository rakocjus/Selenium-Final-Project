package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ClothesPage {

    private static WebDriver driver;

    @FindBy(xpath = "//*[@id=\"js-product-list\"]/div[1]/article[2]/div/div[1]/h2/a")
    private WebElement productSweater;

    public ClothesPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void buySweater() {
        productSweater.click();
    }

}
