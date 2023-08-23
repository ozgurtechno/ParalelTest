package poi;

import Pages.DialogContent;
import Utilities.ExcelReader;
import Utilities.ParameterDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.Assert;

import java.io.IOException;
import java.util.List;
import java.util.Map;

public class LoginSteps {
    DialogContent dc = new DialogContent();
    String message;

    @Given("Navigate to Campus with {string}")
    public void navigate_to_campus_with_chrome(String browserName) {
        ParameterDriver.setThreadDriverName(browserName);
        ParameterDriver.getDriver().get("https://test.mersys.io/");
    }


    @When("Enter {string} and {int}")
    public void enter_sheetname_and_row(String sheetname, int row) throws IOException, InvalidFormatException {
        ExcelReader reader = new ExcelReader();
        List<Map<String, String>> testdata = reader.getData("src/test/resources/ExcelData/LoginData.xlsx", sheetname);

        var username = testdata.get(row).get("username");
        var password = testdata.get(row).get("password");
        message = testdata.get(row).get("expectedmessage");

        dc.sendKeysMethod(dc.username,username);
        dc.sendKeysMethod(dc.password,password);
    }

    @When("Click on Login Button")
    public void click_on_login_button() {
        dc.loginButton.click();
    }

    @Then("User should login successfully")
    public void user_should_login_successfully() {
        System.out.println("works");
        dc.assertText(dc.dashBoard,"Dashboard");
        System.out.println("Thread ID "+ Thread.currentThread().threadId());
        Assert.assertEquals("success",message);
        ParameterDriver.quitDriver();
    }
}
