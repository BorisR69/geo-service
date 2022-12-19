package ru.netology.geo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import ru.netology.entity.Location;

class GeoServiceImplTest {

    @ParameterizedTest
    @ValueSource (strings = {"127.0.0.1", "172.0.32.11", "96.44.183.149"})
     void byIp(String ip) {
        GeoServiceImpl geoS = new GeoServiceImpl();

//        Assertions.assertSame(new Location(null, null, null, 0), geoS.byIp("127.0.0.1"));
        Assertions.assertEquals("172.0.32.11", GeoServiceImpl.MOSCOW_IP);
        Assertions.assertEquals("96.44.183.149", GeoServiceImpl.NEW_YORK_IP);
    }
}
