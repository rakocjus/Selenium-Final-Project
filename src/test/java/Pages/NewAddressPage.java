package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewAddressPage {

    private WebDriver driver;

    @FindBy(name = "address1")
    private WebElement setAddress;

    @FindBy(name = "city")
    private WebElement setCity;

    @FindBy(name = "postcode")
    private WebElement setPostcode;

    @FindBy(xpath = "//*[@id=\"content\"]//button")
    private WebElement save;

    public NewAddressPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void addAddress(String address) {
        setAddress.sendKeys(address);
    }

    public void addCity(String city) {
        setCity.sendKeys(city);
    }

    public void addPostCode(String postcode) {
        setPostcode.sendKeys(postcode);
    }

    public void saveAddress() {
        save.click();
    }

}

