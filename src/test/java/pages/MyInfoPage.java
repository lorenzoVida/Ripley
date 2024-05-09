package pages;

import enums.WebDriverEnum;
import locator.myInfoSelector;

public class MyInfoPage extends BasePage {


    public MyInfoPage(WebDriverEnum driverType) {
        super(driverType);
    }

    public void enterMyInfo() throws InterruptedException {
     //   visit("https://duckduckgo.com/");
        waitForElementToAppear(myInfoSelector.btnMyInfo);
        type("Admin", myInfoSelector.btnMyInfo);
        System.out.println("exit method");
    }

}
