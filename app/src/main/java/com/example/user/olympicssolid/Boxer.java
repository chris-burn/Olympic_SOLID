package com.example.user.olympicssolid;

/**
 * Created by user on 27/06/2017.
 */

public class Boxer extends Athlete {

    public Boxer(int pointsA, int pointsB){
//        , AthleteLog logger
        super (pointsA, pointsB);
//        this.logger = logger;
    }

    public int calculatePoints(){
        int totalPoints = pointsA - pointsB;
        return totalPoints;
    }

//    public int calculatePoints() throws NullPointerException {
//        if (int totalPoints == null) {
//            throw NullPointerException("Can't Award for a null value");
//        }
//        {int totalPoints = pointsA - pointsB;
//            return totalPoints;
//        }
//    }


}
