package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/features/mobile/mobileTest.feature",
        glue = {"stepDefinitions.mobile"},
        tags = "@Mobile"
)

public class MobileRunner extends AbstractTestNGCucumberTests{
}
