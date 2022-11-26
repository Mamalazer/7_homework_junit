package junit_practice.gismeteo.tests;

import junit_practice.GeneralFrontTest;
import junit_practice.gismeteo.pages.GeneralPage;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.ValueSource;

import static com.codeborne.selenide.Selenide.open;

public class GismeteoTest extends GeneralFrontTest {

    @BeforeEach
    public void openGeneralPage() {
        open("https://www.gismeteo.ru/");
    }

    @ValueSource(strings = {"Москва", "Санкт-Петербург", "Сочи"})
    @ParameterizedTest(name = "Проверка открытия страницы с погодой в городе {0}")
    public void test01(String city) {
        new GeneralPage()
                .chooseCity(city)
                .checkCityName(city);
    }

    @CsvFileSource(resources = "cities.csv")
    @ParameterizedTest(name = "Проверка открытия страницы с погодой в городе {0}")
    public void test02(String city) {
        new GeneralPage()
                .chooseCity(city)
                .checkCityName(city);
    }
}
