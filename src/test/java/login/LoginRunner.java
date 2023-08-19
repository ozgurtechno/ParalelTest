package login;

import Utilities.ParameterDriver;
import com.aventstack.extentreports.service.ExtentService;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import org.testng.annotations.*;

//@CucumberOptions(
//        features = "src/test/java/features",
//        glue = "stepDefinitions",
//        plugin = "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
//        tags = "@Regression"
//)
public class LoginRunner extends AbstractTestNGCucumberTests {

    @Override
    @DataProvider(parallel = true)
    public Object[][] scenarios() {
        return super.scenarios();
    }
}
