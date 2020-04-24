package Pages;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.File;

public class ConfirmationPage {

    private WebDriver driver;

    @FindBy(css = "#content-hook_order_confirmation > div > div > div > h3")
    WebElement successMessage;

    public ConfirmationPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public WebElement getMessage() {
        return successMessage;
    }

    public void takePrtScr() throws Exception {

        File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileHandler.copy(scrFile, new File("src/PrtScr/screentest.png"));
    }
}
