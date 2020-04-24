package task2;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/cucumber/features/Buy New Product/buy-new-product.feature",
        plugin = {"pretty", "html:out"})

public class BuyNewProductTest {

}
