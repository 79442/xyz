import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(strict = true,
features = {"C:/Users/User/Downloads/demobddframwork (2)/demobddframwork/src/test/resources/basket.feature"},
plugin = {"json:target/cucumber-parallel/1.json"},
monochrome = false,
 tags = {"~@ignored"}, glue = { "com.mavenit.selenium.training" })
public class Parallel01IT {
}
