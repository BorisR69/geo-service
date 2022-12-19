package ru.netology.i18n;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import ru.netology.entity.Country;

class LocalizationServiceImplTest {

    @ParameterizedTest
    @ValueSource (strings = {"RUSSIA", "USA", "GERMANY", "BRAZIL"})
    void locale(String country) {
        LocalizationServiceImpl location = new LocalizationServiceImpl();
        Assertions.assertEquals("Добро пожаловать", location.locale(Country.RUSSIA));
        Assertions.assertEquals("Welcome", location.locale(Country.USA));
        Assertions.assertEquals("Welcome", location.locale(Country.GERMANY));
        Assertions.assertEquals("Welcome", location.locale(Country.BRAZIL));
    }
}