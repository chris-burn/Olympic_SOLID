package com.example.user.olympicssolid;

import static android.os.Looper.prepare;

/**
 * Created by user on 27/06/2017.
 */

public abstract class Athlete {

    protected int pointsA;
    protected int pointsB;
    protected String medalColour;
//    protected AthleteLog logger;


    abstract int calculatePoints();
//    this method will change (be overriden) in sub-classes hence abstract nature (moved up with protected variables)

    public Athlete(int pointsA, int pointsB){
        this.pointsA = pointsA;
        this.pointsB = pointsB;
    }

// below methods will not change in sub-classes hence public nature.
    public void prepare(){
        System.out.println("I'm getting ready...");
    }

    public void compete(){
        System.out.println("Going for Gold!");
    }

    public void awardMedal(int total){
        this.medalColour = Medal.medalAward(total);
        System.out.println("I only went and won " + this.medalColour);
    }

    public void enterEvent(){
        prepare();
        compete();
        int total = calculatePoints();
        awardMedal(total);
        System.out.println();
    }

    public String getMedalColour() {
        return medalColour;
    }


}





