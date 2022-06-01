package PageObject.BaseSteps;

import PageObject.BaseElements.StepTaskProjectElements;
import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.visible;
import static java.time.Duration.ofSeconds;
import static utils.Configuration.getConfVal;


public class StepTaskSteps extends StepTaskProjectElements {
    @Step("переводим статус задачи до закрытого")
    public static void ClosedTask(){
        //step-by-step transition and closed task

        passingToDetailTask.click();
        statusValue.shouldHave(Condition.text(getConfVal("status1")));
        levelInWork.shouldBe(visible,ofSeconds(60));
        levelInWork.click();
        statusValue.shouldHave(Condition.text(getConfVal("status2")));
        selectStepWork.shouldBe(visible, ofSeconds(360));
        selectStepWork.click();
        levelDone.shouldBe(visible, ofSeconds(500));
        levelDone.click();
        statusValue.shouldHave(Condition.text(getConfVal("status3")));

    }

}
