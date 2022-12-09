package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/features/web/webTest.feature",
        glue = {"stepDefinitions.web"}
)

public class WebRunner extends AbstractTestNGCucumberTests {

}
