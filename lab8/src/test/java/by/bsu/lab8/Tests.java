package by.bsu.lab8;

import by.bsu.lab8.entity.Bookcase;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Tests {

    String firm;
    String material;
    Bookcase bookcase;

    @Before
    public void initialization() {
        bookcase = new Bookcase("wood", 5, "IKEA");
        firm = "IKEA";
        material = "wood";
    }

    @Test
    public void isWoodTrue() {
         boolean expected = true;
        assertEquals(expected, bookcase.isWooden(material));
    }

    @Test
    public void isThisFirmTrue() {
        boolean expected = true;
        assertEquals(expected, bookcase.isThisFirm(firm));
    }
}
