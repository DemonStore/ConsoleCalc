package by.bsu.mmf.web.losdy;

import bsu.by.mmf.web.losdy.Main;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by ִלטענטי on 08.11.2015.
 */
public class MainTest {

    @Test
    public void add() {
        int expected = 4;
        int actual = Main.add(1,3);
        assertEquals(expected, actual);
    }

    @Test
    public void subtract() {
        int expected = 2;
        int actual = Main.subtract(4,2);
        assertEquals(expected, actual);
    }

    @Test
    public void multiply() {
        int expected = 9;
        int actual = Main.multiply(3,3);
        assertEquals(expected, actual);
    }

    @Test
    public void divide() {
        int expected = 3;
        int actual = Main.divide(12,4);
        assertEquals(expected, actual);
    }
}
