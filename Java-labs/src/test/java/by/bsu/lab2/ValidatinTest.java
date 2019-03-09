package by.bsu.lab2;

import by.bsu.lab2.action.Validator;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ValidatinTest {

    @Test
    public void isCorrectSizeOfRowsAndColumns() {
        boolean expected1 = true;
        boolean expected2 = false;
        assertEquals(expected1, Validator.isCorrectValueOfRowsAndColumns(1, 2));
        assertEquals(expected2, Validator.isCorrectValueOfRowsAndColumns(1, 0));
    }

    @Test
    public void isCorrectIndexes() {
        boolean expected1 = true;
        boolean expected2 = false;
        assertEquals(expected1, Validator.isCorrectIndexes(2,2,3,4));
        assertEquals(expected2, Validator.isCorrectIndexes(2,2,2,3));
    }

    @Test
    public void isCorrectIndex() {
        boolean expected1 = true;
        boolean expected2 = false;
        assertEquals(expected1, Validator.isCorrectIndex(2,3));
        assertEquals(expected2, Validator.isCorrectIndex(1,1));
    }

}
