package com.example.user.olympicssolid;

import org.junit.Before;
import org.junit.Test;

import static android.support.v7.widget.AppCompatDrawableManager.get;
import static org.junit.Assert.assertEquals;

/**
 * Created by user on 27/06/2017.
 */

public class BoxerTest {

    private Boxer boxer;
    private Boxer boxer1;
    private Boxer boxer2;
    private Boxer boxer3;
    private Boxer boxer4;

    @Before
    public void before(){
        boxer = new Boxer(20, 5);
        boxer1 = new Boxer(10, 3);
        boxer2 = new Boxer(20, 9);
        boxer3 = new Boxer(13, 10);
        boxer4 = new Boxer(15, 20);
    }

    @Test
    public void canCalculatePoints(){
        assertEquals(15, boxer.calculatePoints());
    }

    @Test
    public void canAwardGold(){
        boxer.enterEvent();
        assertEquals("Gold!", boxer.getMedalColour());
    }

    @Test
    public void canAwardBronze(){
        boxer1.enterEvent();
        assertEquals("Bronze!", boxer1.getMedalColour());
    }

    @Test
    public void canAwardSilver(){
        boxer2.enterEvent();
        assertEquals("Silver!", boxer2.getMedalColour());
    }

    @Test
    public void canAwardNothing(){
        boxer3.enterEvent();
        assertEquals("Nada!", boxer3.getMedalColour());
    }

    @Test
    public void canAwardNegativeScore(){
        boxer4.enterEvent();
        assertEquals("Nada!", boxer4.getMedalColour());
    }



}
