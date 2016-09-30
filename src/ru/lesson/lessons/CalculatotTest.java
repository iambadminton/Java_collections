package ru.lesson.lessons;
/*
https://www.youtube.com/watch?v=rTvOSS99-y8
 */

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by a.shipulin on 30.09.16.
 */
public class CalculatotTest {
    @Test
    public void testAdd() throws Exception {
        Calculatot calc = new Calculatot();
        calc.add(2, 2);
        assertEquals(4, calc.getResult());

    }

}