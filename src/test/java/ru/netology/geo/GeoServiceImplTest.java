package ru.netology.geo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import ru.netology.entity.Country;
import ru.netology.entity.Location;

class GeoServiceImplTest {

    @ParameterizedTest
    @ValueSource (strings = {"127.0.0.1", "172.0.32.11", "96.44.183.149"})
     void byIp(String ip) {
        GeoServiceImpl geoS = new GeoServiceImpl();
        Location loc = geoS.byIp(ip);

        switch (ip) {
            case "127.0.0.1":
                Assertions.assertEquals(new Location(null, null, null, 0), loc);
                break;
            case "172.0.32.11":
                Assertions.assertEquals(new Location("Moscow", Country.RUSSIA, "Lenina", 15), loc);
                break;
            case "96.44.183.149":
                Assertions.assertEquals(new Location("New York", Country.USA, " 10th Avenue",32), loc);
                break;
        }
    }
}
