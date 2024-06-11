package Classes;

import java.util.Scanner;

public class AirForces extends Military{
    private String typeOfPer;

    public AirForces(){
        super();
    }


    public void calcPoints(){
    	pointsByWork=200;
        totalPoints=pointsByWork*jobsDone;
    }

    public void calcMonthlyBonus(){
        if(jobsDone>100){
            totalPoints+=(jobsDone-100)*50;
        }
    }


    public String toString(){
        return "\nAir Forces Personnel "
                +super.toString()
                +"\nDepartment of Personnel: "+typeOfPer;
    }
}