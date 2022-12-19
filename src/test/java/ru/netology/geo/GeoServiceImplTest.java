package ru.netology.geo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import ru.netology.entity.Country;
import ru.netology.entity.Location;


class GeoServiceImplTest {

//    @ParameterizedTest
//    @ValueSource (strings = {"172.0.32.11"})
//     void byIp(String ip) {
//        GeoServiceImpl geoS = new GeoServiceImpl();
//
//        Assertions.assertEquals(new Location(null, null, null, 0), geoS.byIp(ip));
//        Assertions.assertEquals(new Location("Moscow", Country.RUSSIA, "Lenina", 15), geoS.byIp(ip));
//        Assertions.assertEquals("96.44.183.149", GeoServiceImpl.NEW_YORK_IP);
//    }

    @Test
    void byIp() {
        String ip = "172.0.32.11";
        Location loc = new Location("Moscow", Country.RUSSIA, "Lenina", 15);
        GeoServiceImpl geoS = new GeoServiceImpl();
        Location loc1 = geoS.byIp(ip);

        Assertions.assertEquals(loc, loc1);
    }
}
