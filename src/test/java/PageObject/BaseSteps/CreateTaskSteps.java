package PageObject.BaseSteps;

import PageObject.BaseElements.CreateTaskProjectElements;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.junit.Assert;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.switchTo;
import static java.time.Duration.ofSeconds;
import static utils.Configuration.getConfVal;
import static utils.Configuration.getLogVal;

public class CreateTaskSteps extends CreateTaskProjectElements {
    @Step("создаем автотестом новый баг с описанием")
    public static void CreateBug() {
        //creating task and filling in parameters
        createTask.click();
        typeTask.click();
        typeTask.sendKeys(getConfVal("typeTask"));
        selectTheme.setValue(getConfVal("themeTask"));
        SwitchToConstruction(selectDescription, textDescription, getConfVal("descriptionTask"));
        selectVersion.click();
        SwitchToConstruction(selectEnvironment, textEnvironment, getConfVal("environmentTask"));
        selectPriority.click();
        selectPriority.sendKeys(getConfVal("priorityTask"));
        selectLabel.setValue(getConfVal("labelTask"));
        selectTouchVersion.click();
        selectAssignee.click();
        createBug.shouldBe(visible,ofSeconds(180));
        createBug.click();
        toTasks.shouldBe(visible);
        passingToTask.click();
        Assert.assertEquals("Task not found", assertAuthor.getAttribute("rel"), getLogVal("login"));

    }
    static void SwitchToConstruction(SelenideElement nameFrame, SelenideElement boxFrame, String valFrame) {
        //method to insert text to iframe
        switchTo().frame(nameFrame);
        boxFrame.shouldBe(visible);
        boxFrame.setValue(valFrame);
        switchTo().parentFrame();

    }
}
