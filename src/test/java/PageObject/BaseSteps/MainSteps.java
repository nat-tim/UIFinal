package PageObject.BaseSteps;

import PageObject.BaseElements.MainPageElements;
import io.qameta.allure.Step;
import org.junit.Assert;

import static com.codeborne.selenide.Condition.visible;
import static utils.Configuration.getConfVal;

public class MainSteps extends MainPageElements {
    @Step("переходим к пректу")
    public static void PassingToProject() {
        //pass to Test project
        selectProgects.click();
        selectProgectTest.shouldBe(visible);
        selectProgectTest.click();
        AssertProject();
    }
    public static void AssertProject(){
        //checking the correctness of the transition to the Test project
        nameProject.shouldBe(visible);
        Assert.assertEquals("Project not found", nameProject.getAttribute("title"), getConfVal("nameOfProject"));
    }
}
