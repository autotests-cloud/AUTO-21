package cloud.autotests.tests;

import com.codeborne.selenide.Condition;
import io.qameta.allure.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;

@Epic("any")
@Feature("your")
@Story("metadata")
public class AppTests extends TestBase {

    @Test
    @Description("This test was implemented by QA.GURU engineers")
    @DisplayName("Check issue in repository")
    void test() {

        step("Open to github.com", () -> open("https://github.com/"));

        step("Open repository eroshenkoam/alure-example", () -> {
            $(byName("q")).val("eroshenkoam/allure-example").pressEnter();
            $(byLinkText("eroshenkoam/allure-example")).click();
        });

        step("Open Issue page", () -> $(".UnderlineNav").findElement(byText("Issues")).click());

        step("Check that issue with #62 exists", () -> {
            $("#js-issues-search").clear();
            $("#js-issues-search").val(issueNumber).pressEnter();
            $("#issue_" + issueNumber).shouldBe(Condition.visible);
        });

        step("Close browser", () -> {
            // Browser closes automatically after each test
        });

    }
}
