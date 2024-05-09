package steps;

import enums.WebDriverEnum;
import io.cucumber.java.en.Given;
import org.openqa.selenium.WebDriver;
import pages.MyInfoPage;

public class myInfoSteps {
    MyInfoPage info;

    @Given("enter my info form")
    public void enter_my_info_form() throws InterruptedException {
    //    System.out.println("enter my info");
        info = new MyInfoPage(WebDriverEnum.CHROME);
        info.enterMyInfo();
    }
}
