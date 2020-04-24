package task2;

import Pages.*;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class BuyNewProduct {

    private WebDriver driver;
    private LogInPage loginPage;
    private UserPage userPage;
    private ClothesPage clothesPage;
    private ShoppingCartPage shoppingCartPage;
    private ProductDetailsPage productDetailsPage;
    private ProceedToCheckoutPage proceedToCheckoutPage;
    private OrderProcessPage orderProcessPage;
    private ConfirmationPage confirmationPage;


    @Given("^User is logged in to CodersLab myshop$")
    public void userIsLoggedInToCodersLabMyshop() {
        System.setProperty("webdriver.chrome.driver",
                "src/main/resources/drivers/chromedriver.exe");

        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();


        driver.get("https://prod-kurs.coderslab.pl/index.php?controller=authentication");
        loginPage = new LogInPage(driver);
        loginPage.loginAs("testowy@testowy.de", "qwerty");
        loginPage.clickUsername();

    }


    @When("^User goes to ClothesPage$")
    public void userGoesToClothesPage() {
        userPage = new UserPage(driver);
        userPage.goToClothes();
    }

    @And("^User clicks on Hummingbird Printed Sweater$")
    public void userClicksOnHummingbirdPrintedSweater() {
        clothesPage = new ClothesPage(driver);
        clothesPage.buySweater();
    }


    @And("^User chooses size M and (\\d+) items and clicks 'Add to cart'$")
    public void userChoosesSizeMAndItemsAndClicksAddToCart(int arg0) throws InterruptedException {
        productDetailsPage = new ProductDetailsPage(driver);
        //WebDriverWait wait = new WebDriverWait(driver, 5);
        productDetailsPage.chooseSize("2");
        Thread.sleep(2000);

        productDetailsPage.chooseQuantity("5");
        Thread.sleep(2000);
        productDetailsPage.addToCart();
    }

    @And("^User clicks Proceed to Checkout and again Proceed to Checkout$")
    public void userClicksProceedToCheckoutAndAgainProceedToCheckout() throws InterruptedException {
        proceedToCheckoutPage = new ProceedToCheckoutPage(driver);
        shoppingCartPage = new ShoppingCartPage(driver);
        Thread.sleep(2000);
        proceedToCheckoutPage.chooseCheckout();
        shoppingCartPage.chooseContinue();
    }

    @And("^User verifies/confirms the Address$")
    public void userVerifiesConfirmsTheAddress() {
        orderProcessPage = new OrderProcessPage(driver);
        orderProcessPage.checkAddress();
    }

    @And("^User chooses PrestaShop shipping method$")
    public void userChoosesPrestaShopShippingMethod() {
        orderProcessPage = new OrderProcessPage(driver);
        orderProcessPage.confirmShipping();
    }

    @And("^User chooses Pay by Check payment method$")
    public void userChoosesPayByCheckPaymentMethod() {
        orderProcessPage = new OrderProcessPage(driver);
        orderProcessPage.chooseCheckPayment();
    }

    @And("^User checks required agreements and clicks Order with an obligation to pay$")
    public void userChecksRequiredAgreementsAndClicksOrderWithAnObligationToPay() {
        orderProcessPage = new OrderProcessPage(driver);
        orderProcessPage.confirmConditions();
        orderProcessPage.confirmOrder();
    }

    @Then("^User sees order confirmed message and creates PrtScr$")
    public void userSeesOrderConfirmedMessageAndCreatesPrtScr() {
        confirmationPage = new ConfirmationPage(driver);
        Assert.assertTrue(confirmationPage.getMessage().isDisplayed());

        try {
            confirmationPage.takePrtScr();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @And("^User closes browser$")
    public void userClosesBrowser() {
        driver.quit();
    }

}
