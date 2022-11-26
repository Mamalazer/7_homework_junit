package junit_practice.gismeteo.pages;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class CityPage {

    public CityPage checkCityName(String city) {
        $(".breadcrumbs-links").shouldHave(text(city));
        return this;
    }
}
