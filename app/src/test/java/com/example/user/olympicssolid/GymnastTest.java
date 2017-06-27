package com.example.user.olympicssolid;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by user on 27/06/2017.
 */

public class GymnastTest {

    private Gymnast gymnast;
    private Gymnast gymnast1;
    private Gymnast gymnast2;
    private Gymnast gymnast3;
    private Gymnast gymnast4;

    @Before
    public void before(){
        gymnast = new Gymnast(10, 7);
        gymnast1 = new Gymnast(7, 4);
        gymnast2 = new Gymnast(4, 3);
        gymnast3 = new Gymnast(1, 2);
        gymnast4 = new Gymnast(5, -6);
    }

    @Test
    public void canCalculatePoints(){
        assertEquals(17, gymnast.calculatePoints());
    }

    @Test
    public void canAwardGold(){
        gymnast.enterEvent();
        assertEquals("Gold!", gymnast.getMedalColour());
    }

    @Test
    public void canAwardBronze(){
        gymnast1.enterEvent();
        assertEquals("Silver!", gymnast1.getMedalColour());
    }

    @Test
    public void canAwardSilver(){
        gymnast2.enterEvent();
        assertEquals("Bronze!", gymnast2.getMedalColour());
    }

    @Test
    public void canAwardNothing(){
        gymnast3.enterEvent();
        assertEquals("Nada!", gymnast3.getMedalColour());
    }

    @Test
    public void canAwardNegativeScore(){
        gymnast4.enterEvent();
        assertEquals("Nada!", gymnast4.getMedalColour());
    }



}
