package qa.guru.lesson_15;

import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.Test;
import qa.guru.lesson_15.config.WebDriverConfig;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;
import static io.qameta.allure.Allure.step;

public class WebTest {

    @Test
    public void webTest() {


        step("Открываем главную страницу", () -> {
            open("https://github.com");
        });

        step("Вводим поисковый запрос", () -> {
            $("[data-test-selector='nav-search-input']").setValue("vBuravlev").pressEnter();
            $$("ul.repo-list").first().shouldHave(text("vBuravlev"));
        });

    }
}
