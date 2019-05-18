package by.bsu.lab7;

import by.bsu.lab7.entity.BlueRayDisc;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;

public class BlueRayDiscTest {
    BlueRayDisc disc;
    String name;
    String type;
    String info;

    @Before
    public void init() {
        disc = new BlueRayDisc(2000);
        name = "author";
        type = "category";
        info = "Jack";
        disc.addInfoInMenu(name, type, info);
    }

    @Test
    public void getMenu() {
        Map<String, Map<String, String>> expected = new HashMap<>();
        Map<String , String> map = new HashMap<>();
        map.put("type", "category");
        map.put("info", "Jack");
        expected.put("author", map);
        assertEquals(expected, disc.getMenu());
    }

}
