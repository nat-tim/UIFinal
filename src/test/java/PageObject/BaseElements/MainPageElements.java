package PageObject.BaseElements;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class MainPageElements {
    public static SelenideElement selectProgects = $x("//a[contains(@title,'недавних проектов')]");
    public static SelenideElement selectProgectTest = $x("//strong[text()='Текущие проекты']/parent::div/descendant::a[contains(@href,'TEST')]");
    public static SelenideElement nameProject = $x("//a[@class='jira-project-avatar']");
}
