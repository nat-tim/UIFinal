package PageObject.BaseSteps;

import PageObject.BaseElements.IssueProjectTestPageElements;
import io.qameta.allure.Step;
import org.junit.Assert;

import static com.codeborne.selenide.Condition.visible;

public class IssueProjectTestSteps extends IssueProjectTestPageElements {
    @Step("проверяем количество задач")
    public static void AmountTasks() {
        //counting the number of tasks
        toTasks.shouldBe(visible).click();
        amountTasks.shouldBe(visible);
        String[] t = amountTasks.getOwnText().split(" ");
        Assert.assertNotNull(t);
        Assert.assertFalse("Tasks not found", Integer.parseInt(t[2]) <= 0);
    }
}
