package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogInPage {
    private static WebDriver driver;

    @FindBy(name = "email")
    WebElement loginInput;

    @FindBy(name = "password")
    WebElement passwordInput;

    @FindBy(id = "submit-login")
    WebElement signInButton;

    public LogInPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void loginAs(String email, String password) {

        loginInput.click();
        loginInput.clear();
        loginInput.sendKeys(email);

        passwordInput.click();
        passwordInput.clear();
        passwordInput.sendKeys(password);

        signInButton.click();
    }

    public String getLoggedUsername() {
        WebElement userName = driver.findElement(By.xpath("//a[@class='account']"));
        return userName.getText();
    }

    public void clickUsername() {
        driver.findElement(By.xpath("//a[@class='account']")).click();
    }
}

