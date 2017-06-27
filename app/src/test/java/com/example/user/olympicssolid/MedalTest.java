package com.example.user.olympicssolid;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by user on 27/06/2017.
 */

public class MedalTest {

    private Medal medal;

    @Before
    public void before(){
        medal = new Medal();
    }

    @Test
    public void canAwardGold(){
       assertEquals("Gold!", Medal.medalAward(16));
    }

    @Test
    public void canAwardSilver(){
        assertEquals("Silver!", Medal.medalAward(12));
    }

    @Test
    public void canAwardBronze(){
        assertEquals("Bronze!", Medal.medalAward(7));
    }

    @Test
    public void canSetNoAward(){
        assertEquals("Nada!", Medal.medalAward(3));
    }

    @Test
    public void canAwardNegScore(){
        assertEquals("Nada!", Medal.medalAward(-1));
    }

//    @Test
//    public void canAwardNullScore(){
//        assertEquals("No Award", Medal.medalAward(null));
//    }
//
//    @Test
//    public void canAwardBananaScore(){
//        assertEquals("No Award", Medal.medalAward("Banana"));
//    }

}



