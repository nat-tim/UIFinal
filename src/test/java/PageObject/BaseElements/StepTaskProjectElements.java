package PageObject.BaseElements;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class StepTaskProjectElements {
    public static SelenideElement passingToDetailTask = $x("//a[@title='Просмотреть эту проблему']");
    public static SelenideElement statusValue = $x("//span[contains(@class,'lozenge')]");
    public static SelenideElement levelInWork = $x("//span[text()='В работе']");
    public static SelenideElement selectStepWork = $x("//span[.='Бизнес-процесс']");
    public static SelenideElement levelDone = $x("//span[text()='Выполнено']");
}
