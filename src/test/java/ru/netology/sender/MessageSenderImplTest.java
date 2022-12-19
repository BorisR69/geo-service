package ru.netology.sender;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import ru.netology.entity.Country;
import ru.netology.entity.Location;
import ru.netology.geo.GeoServiceImpl;
import ru.netology.i18n.LocalizationServiceImpl;



class MessageSenderImplTest {

    @Test
    void sendRussia (String locale) {
//        LocalizationServiceImpl location = Mockito.mock(LocalizationServiceImpl.class);
//        Mockito.when(location.locale(Country.RUSSIA)).thenReturn("Добро пожаловать");
//        GeoServiceImpl geoService = Mockito.mock(GeoServiceImpl.class);
//        Mockito.when(geoService.byIp("172.0.32.11")).thenReturn(new Location("Moscow", Country.RUSSIA,
//                "Lenina", 15));
//        MessageSenderImpl messageSend = new MessageSenderImpl(geoService, location);
//
//        Assertions.assertEquals("Добро пожаловать", messageSend.send());
//
//        Mockito.verify(location);
//        Mockito.verify(geoService);

    }


}