package Classes;
import java.util.ArrayList;
import java.util.Scanner;

public class PersonnelSys {

  public static  ArrayList<Military> perList = new ArrayList<>();

    public static void addPersonnel() {
        NavyForces navy;
        GroundForces ground;
        AirForces air;
        Military per;

        Scanner sc = new Scanner(System.in);
        
            System.out.print("\nEnter the force (Navy/Air/Ground): ");
            String type = sc.next().trim(); 

            if (type.equalsIgnoreCase("Navy")) {
                navy = new NavyForces();
                navy.calcPoints();
                navy.calcMonthlyBonus();
                perList.add(navy);
            } else if (type.equalsIgnoreCase("Air")) {
                air = new AirForces();
                air.calcPoints();
                air.calcMonthlyBonus();
                perList.add(air);
            } else if (type.equalsIgnoreCase("Ground")) {
                ground = new GroundForces();
                ground.calcPoints();
                ground.calcMonthlyBonus();
                perList.add(ground);
            }
        }
    
    public static boolean removePersonnel(int id) {
        boolean removed = false;
        for (int i = 0; i <perList.size(); i++) {
            if (perList.get(i).findPersonnel(id)) {
                perList.remove(i);
                removed = true;
                break;
            }
        }
        return removed;
    }



    public static Military searchPersonnel(int id) {
        Military personnel = null;
        for (Military l : perList) {
            if (l.findPersonnel(id)) {
                personnel = l;
                break;
            }
        }
        return personnel;
    }

    public static String display() {
        Military temp;
        String out = "";

        for (int i = 0; i < perList.size(); i++) {
            out += perList.get(i).toString() + "\n\n";
        }

        return out;
    }


    public static void calculatePersonnelOffDays(){
        int legallyRequiredOffDuty = 30; 
        for (int i = 0; i < perList.size(); i++){
            if(perList.get(i).getJobsDone()<2178){
                perList.get(i).setOffDuty(legallyRequiredOffDuty - 5);
            } else if (perList.get(i).getJobsDone()>2178) {
                perList.get(i).setOffDuty(legallyRequiredOffDuty + 5);
            }
            else
                perList.get(i).setOffDuty(30);
        }

    }

    public static void calculatePersonnelRankRatio(){
        int li = 0, cap = 0, maj = 0, col = 0, all = 0;

        for(int i = 0; i < perList.size(); i++){
            if(perList.get(i).getRank().equalsIgnoreCase("Lieutenant")){
                li+=1;
            } else if (perList.get(i).getRank().equalsIgnoreCase("Captain")) {
                cap+=1;
            } else if (perList.get(i).getRank() .equalsIgnoreCase("Major")) {
                maj+=1;
            } else if (perList.get(i).getRank().equalsIgnoreCase("Colonel")) {
                col+=1;
            }
        }
        all = li + cap + maj + col;
        System.out.println("\nRanks Ratio: \nLieutenants: " +li +"/" +all +"\nCaptains: " +cap +"/" +all +"\nMajors " +maj +"/" +all +"\nColonels: " +col +"/" +all);
    }

    public static void calculatePersonnelGenderRatio(){
        int fem = 0, masc = 0,  all = 0;

        for (int i = 0; i < perList.size(); i++){
            if(perList.get(i).getGender().equalsIgnoreCase("F")){
                fem+=1;

            } else if (perList.get(i).getGender().equalsIgnoreCase("M")) {
                masc+=1;
           
        }
        all = fem + masc;
        System.out.println("\nGender Avg: \nFemale Avg: " +fem +"/" +all +"\nMale Avg: " +masc +"/" +all);
    }
    }

    public static void addSuperiorTotalPoints(){
        for (int i = 0; i < perList.size(); i++){
            if (perList.get(i).getIsSuperior()==true){
                perList.get(i).setTotalPoints( perList.get(i).getTotalPoints()+1500);
            }
        }
    }

}
