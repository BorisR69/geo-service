package ru.netology.sender;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import ru.netology.entity.Country;
import ru.netology.entity.Location;
import ru.netology.geo.GeoServiceImpl;
import ru.netology.i18n.LocalizationServiceImpl;

import java.util.HashMap;
import java.util.Map;


class MessageSenderImplTest {

    @Test
    void sendRussia () {
        Location locMoc = new Location("Moscow", Country.RUSSIA,
                "Lenina", 15);
        GeoServiceImpl geoServiceMoc = Mockito.mock(GeoServiceImpl.class);
        Mockito.when(geoServiceMoc.byIp("172.123.12.19")).thenReturn(locMoc);

        String hiMoc = "Добро пожаловать";
        LocalizationServiceImpl locationMoc = Mockito.mock(LocalizationServiceImpl.class);
        Mockito.when(locationMoc.locale(Country.RUSSIA)).thenReturn(hiMoc);

        MessageSenderImpl messageSend = new MessageSenderImpl(geoServiceMoc, locationMoc);

        Map<String, String> headers = new HashMap <>();
        headers.put(MessageSenderImpl.IP_ADDRESS_HEADER, "172.123.12.19");

        try {
            Assertions.assertEquals("Добро пожаловать", messageSend.send(headers));
        } catch (NullPointerException np) {
            System.out.println("Что то пошло не так: " + np.getMessage());
        }
    }

    @Test
    void sendUSA () {
        Location locMoc = new Location("New York", Country.USA, " 10th Avenue",32);
        GeoServiceImpl geoServiceMoc = Mockito.mock(GeoServiceImpl.class);
        Mockito.when(geoServiceMoc.byIp("96.44.183.149")).thenReturn(locMoc);

        String hiMoc = "Welcome";
        LocalizationServiceImpl locationMoc = Mockito.mock(LocalizationServiceImpl.class);
        Mockito.when(locationMoc.locale(Country.USA)).thenReturn(hiMoc);

        MessageSenderImpl messageSend = new MessageSenderImpl(geoServiceMoc, locationMoc);

        Map<String, String> headers = new HashMap <>();
        headers.put(MessageSenderImpl.IP_ADDRESS_HEADER, "96.44.183.149");

        try {
            Assertions.assertEquals("Welcome", messageSend.send(headers));
        } catch (NullPointerException np) {
            System.out.println("Что то пошло не так: " + np.getMessage());
        }
    }
}
