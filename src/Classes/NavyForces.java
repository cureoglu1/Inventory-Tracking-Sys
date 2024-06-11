package Classes;

import java.util.Scanner;

public class NavyForces extends Military{
    private String department;
    private String area;
    Ships comp= new Ships();

    public NavyForces(){
        super();
    }

   
    public void calcPoints(){
    	pointsByWork=300;
        totalPoints=pointsByWork*jobsDone;
    }

    public void calcMonthlyBonus(){
        if(jobsDone>100){
            totalPoints+=(jobsDone-100)*50;
        }
    }


    public String toString(){
    	
    	

        return "\nNavy Officer "
                +super.toString()
                +"\nDepartment "+department
                +"\nWorking area "+area
                +"\n\tShip Information: "
                +comp.toString();
    }



}
