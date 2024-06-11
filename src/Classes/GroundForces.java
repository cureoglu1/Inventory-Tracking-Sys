package Classes;

import java.util.HashSet;
import java.util.Scanner;

public class GroundForces extends Military{
    public HashSet<Tanks> tankHashSet= new HashSet();

    public GroundForces(){
        super();
    }


    public String toString(){
        String tankStr="\n\tTanks: ";
        for(Tanks cp: tankHashSet){
            tankStr+= cp.toString()+"\n";
        }
        return "\nGround Forces Personnel"
                +super.toString()+
                tankStr;
    }

    public void calcPoints(){
    	pointsByWork=100;
     
        totalPoints=pointsByWork*jobsDone;
    }

    public void calcMonthlyBonus(){
        if(jobsDone>100){
            totalPoints+=(jobsDone-100)*50;

        }
    }
}
