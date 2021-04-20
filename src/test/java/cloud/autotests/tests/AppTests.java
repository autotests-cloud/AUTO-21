package cloud.autotests.tests;

import io.qameta.allure.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static io.qameta.allure.Allure.step;

@Epic("any")
@Feature("your")
@Story("metadata")
public class AppTests extends TestBase {

    @Test
    @Description("Soon to be implemented by QA.GURU engineers")
    @DisplayName("Check issue in repository")
    void test() {

        step("Open browser", () -> {
            // todo
        });

        step("Go to github.com", () -> {
            // todo
        });

        step("Open repository eroshenkoam/alure-example", () -> {
            // todo
        });

        step("Open Issue page", () -> {
            // todo
        });

        step("Check that issue with #62 exists", () -> {
            // todo
        });

        step("Close browser", () -> {
            // todo
        });

    }
}