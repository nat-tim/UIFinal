package PageObject.BaseElements;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class ListIssueProjectTestPageElements {
    public static SelenideElement toListTasks = $x("//span[.='Список задач']/preceding-sibling::span");
    public static SelenideElement findAllTest = $x("//a[@title='Show All']");
    public static SelenideElement toTestSelenium = $x("//a[@title='TEST-374']");
    public static SelenideElement testSeleniumStatus = $x("//strong[@title='Статус']/following-sibling::span//span");
    public static SelenideElement testSeleniumVersions = $x("//strong[@title='Затронуты версии']/following-sibling::span//span[contains(@title,'Version')]");
}
