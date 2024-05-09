package steps;

import enums.WebDriverEnum;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import org.openqa.selenium.WebDriver;
import pages.BasePage;
import pages.LoginPage;

public class loginSteps {
    LoginPage login;

    @Before
    public void setUp(){
        login = new LoginPage(WebDriverEnum.CHROME);
    }

    @Given("enter the login form")
    public void enter_the_login_form() throws InterruptedException {
        login.visit("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        login.loinSuccessful();

    }
}
