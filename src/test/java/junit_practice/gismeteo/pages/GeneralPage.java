package junit_practice.gismeteo.pages;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class GeneralPage {

    public CityPage chooseCity(String city) {
        $(".search-form input").setValue(city);
        $(".search-item").$(byText(city)).click();
        return new CityPage();
    }
}
