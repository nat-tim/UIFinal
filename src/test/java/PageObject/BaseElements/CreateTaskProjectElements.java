package PageObject.BaseElements;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class CreateTaskProjectElements {
    public static SelenideElement createTask = $x("//a[@title='Создать новую задачу']");
    public static SelenideElement typeTask = $x("//div[contains(@class,'issuetype-ss')]/input");

    public static SelenideElement selectTheme = $x("//label[@for='summary']/following-sibling::input");
    public static SelenideElement selectDescription = $x("//label[@for='description']/following-sibling::div[@class='jira-wikifield']/descendant::iframe");
    public static SelenideElement textDescription = $x("//body[@data-projectkey='TEST']/child::p");
    public static SelenideElement selectVersion = $x("//select[@data-clone-to='fixVersions-textarea']/descendant::option[@value='10001']");
    public static SelenideElement selectEnvironment = $x("//label[@for='environment']/following-sibling::div[@class='jira-wikifield']/descendant::iframe");
    public static SelenideElement textEnvironment = $x("//body[@class='mce-content-body ']/child::p");
    public static SelenideElement selectPriority = $x("//label[@for='priority-field']/following-sibling::div/input");
    public static SelenideElement selectLabel = $x("//label[@for='labels-textarea']/following-sibling::div/textarea");
    public static SelenideElement selectTouchVersion = $x("//label[@for='versions']/following-sibling::select/descendant::option[@value='10001']");
    public static SelenideElement selectAssignee = $x("//select[@data-user-type='assignee']/following-sibling::button");
    public static SelenideElement createBug = $x("//section[contains(@role,'dialog')]/descendant::input[@accesskey='S']");
    public static SelenideElement toTasks = $x("//span[.='Задачи']/parent::a");
    public static SelenideElement passingToTask = $x("//div[@title='Theme']/preceding-sibling::div[@class='ghx-key']/child::a");
    public static SelenideElement assertAuthor = $x("//dt[@title='Автор']//following-sibling::dd/descendant::span[@class='user-hover']");

}
