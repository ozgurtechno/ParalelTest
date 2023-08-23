package login;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import org.testng.annotations.*;

//@CucumberOptions(
//        features = "src/test/java/features",
//        glue = "stepDefinitions",
//        plugin = "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
//        tags = "@Regression"
//)
public class LoginRunnerTest extends AbstractTestNGCucumberTests {

    @Override
    @DataProvider(parallel = true)
    public Object[][] scenarios() {
        return super.scenarios();
    }
}
