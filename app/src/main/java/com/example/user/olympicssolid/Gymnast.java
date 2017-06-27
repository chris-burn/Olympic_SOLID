package com.example.user.olympicssolid;

/**
 * Created by user on 27/06/2017.
 */

public class Gymnast extends Athlete {


    public Gymnast(int pointsA, int pointsB){
//        , AthleteLog logger
       super (pointsA, pointsB);
//        this.logger = logger;
    }

    public int calculatePoints(){
        int totalPoints = pointsA + pointsB;
        return totalPoints;
    }

}
