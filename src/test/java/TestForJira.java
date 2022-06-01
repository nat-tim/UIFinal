
import Hooks.WebHooks;



import org.junit.jupiter.api.Test;

import static PageObject.BaseSteps.CreateTaskSteps.CreateBug;
import static PageObject.BaseSteps.IssueProjectTestSteps.AmountTasks;
import static PageObject.BaseSteps.ListIssueProjectTestSteps.StatusVersionTestSelenium;
import static PageObject.BaseSteps.LoginSteps.Authorization;
import static PageObject.BaseSteps.MainSteps.PassingToProject;
import static PageObject.BaseSteps.StepTaskSteps.ClosedTask;


public class TestForJira extends WebHooks {


    @Test
    public void Test1() {
        Authorization();
    }
    @Test
    public void Test2(){
        Authorization();
        PassingToProject();
    }
    @Test
    public void Test3(){
        Authorization();
        PassingToProject();
        AmountTasks();
    }
    @Test
    public void Test4(){
        Authorization();
        PassingToProject();
        AmountTasks();
        StatusVersionTestSelenium();
    }
    @Test
    public void Test5(){
        Authorization();
        PassingToProject();
        AmountTasks();
        StatusVersionTestSelenium();
        CreateBug();
        ClosedTask();
    }
}
