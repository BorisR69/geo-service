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
        Location loc1 = new Location(null, null, null, 0);
        Location loc2 = new Location("Moscow", Country.RUSSIA, "Lenina", 15);
        Location loc3 = new Location("New York", Country.USA, " 10th Avenue",32);

        GeoServiceImpl geoS = new GeoServiceImpl();
        Location loc = geoS.byIp(ip);

        switch (ip) {
            case "127.0.0.1":
                Assertions.assertEquals(loc1, loc);
                break;
            case "172.0.32.11":
                Assertions.assertEquals(loc2, loc);
                break;
            case "96.44.183.149":
                Assertions.assertEquals(loc3, loc);
                break;
        }
    }
}
