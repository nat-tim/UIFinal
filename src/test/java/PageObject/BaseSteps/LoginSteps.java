package PageObject.BaseSteps;


import PageObject.BaseElements.LoginPageElements;
import io.qameta.allure.Step;
import org.junit.Assert;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.open;
import static utils.Configuration.getConfVal;
import static utils.Configuration.getLogVal;

public class LoginSteps extends LoginPageElements {

    @Step("входим в профиль ")
    public static void Authorization() {

        open(getConfVal("jiraUrl"));
        //login user
        inputLogin.shouldBe(visible);
        inputLogin.setValue(getLogVal("login"));
        inputPass.shouldBe(visible);
        inputPass.setValue(getLogVal("pass"));
        inpitButton.shouldBe(visible).click();
        profile.shouldBe(visible);
        Assert.assertEquals("User not found", profile.getAttribute("data-username"), getLogVal("login"));

    }

}

