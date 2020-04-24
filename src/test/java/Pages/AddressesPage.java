package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class AddressesPage {

    private WebDriver driver;

    @FindBy(partialLinkText = "Create new address")
    private WebElement addAddress;

    @FindBy(css = ".col-lg-4.col-md-6.col-sm-6")
    private List<WebElement> addresses;

    @FindBy(css = ".alert.alert-success")
    private WebElement successMessage;

    public AddressesPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void createNewAddress() {
        addAddress.click();
    }

    public WebElement getMessage() {
        return successMessage;
    }

    private WebElement validateLastAddress() {
        return addresses.get(addresses.size() - 1);
    }

    public boolean verifyAddress(String address) {
        WebElement addressElement = validateLastAddress().findElement(By.tagName("address"));
        return addressElement.getText().contains(address);
    }

}
