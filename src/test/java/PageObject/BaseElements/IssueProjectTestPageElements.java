package PageObject.BaseElements;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class IssueProjectTestPageElements {
    public static SelenideElement toTasks = $x("//span[.='Задачи']/parent::a");

    public static SelenideElement amountTasks = $x("//div[contains(@class,'showing')]/child::span");
}
