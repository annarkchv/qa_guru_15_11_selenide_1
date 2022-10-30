package guru.qa.github;

import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.*;

public class GithubSearchTest {

    @Test
    void findJUnit5CodeExample() {
        open("https://github.com/selenide/selenide");
        $("#wiki-tab").click();
        $(".js-wiki-more-pages-link").click();
        $(".wiki-rightbar").$(withText("SoftAssertions")).click();
        $("#user-content-3-using-junit5-extend-test-class").should(Condition.exist);
    }
}
