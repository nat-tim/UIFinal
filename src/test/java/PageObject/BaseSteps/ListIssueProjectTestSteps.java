package PageObject.BaseSteps;

import PageObject.BaseElements.ListIssueProjectTestPageElements;
import io.qameta.allure.Step;
import org.junit.Assert;

import java.time.Duration;

import static com.codeborne.selenide.Condition.visible;
import static utils.Configuration.getConfVal;

public class ListIssueProjectTestSteps extends ListIssueProjectTestPageElements {
    @Step("переходим в задачу TestSelenium и проверяем статус задачи и привязку версии")
    public static void StatusVersionTestSelenium() {
        //find and print status and version task 'TestSelenium'
        toListTasks.shouldBe(visible).click();
        findAllTest.click();
        toTestSelenium.shouldBe(visible, Duration.ofSeconds(60)).click();
        String status = testSeleniumStatus.getOwnText();
        Assert.assertNotNull(status);
        Assert.assertEquals("Version not found", testSeleniumVersions.getOwnText(), getConfVal("taskVersion"));
    }
}
