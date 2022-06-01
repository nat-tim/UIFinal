package PageObject.BaseElements;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class LoginPageElements {
    public static SelenideElement inputLogin = $x("//label[@for='login-form-username']/following-sibling::input");
    public static SelenideElement inputPass = $x("//input[@type='password']");
    public static SelenideElement inpitButton = $x("//input[@value='Войти']");
    public static SelenideElement profile = $x("//span[contains(@class,'avatar-small')]/parent::a");

}
