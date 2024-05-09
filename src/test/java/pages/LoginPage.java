package pages;

import enums.WebDriverEnum;
import locator.loginSelector;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {

    public LoginPage(WebDriverEnum driverType) {
        super(driverType);
    }

    public void loinSuccessful(){
        waitForElementToAppear(loginSelector.txtUserName);
        type("Admin",loginSelector.txtUserName);
        type("admin123",loginSelector.txtUserPass);
        click(loginSelector.btnIngresar);
    }

}
