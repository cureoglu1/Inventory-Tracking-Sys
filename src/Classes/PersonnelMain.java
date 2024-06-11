package Classes;
import GUI.*;
import java.util.Scanner;

public class PersonnelMain {
    public static void main(String[] args) {
        /*Scanner sc = new Scanner(System.in);
        String name;
        int id;
        PersonnelSys.addPersonnel();
        PersonnelSys.calculatePersonnelOffDays();
        PersonnelSys.addSuperiorTotalPoints();
       
        String out=null;
        System.out.println("Content of the array list");
        out=PersonnelSys.display();
        System.out.println(out);
        System.out.println("All Personnels are added.");
        System.out.print("\nEnter the personnel id you want to search: ");
        id= sc.nextInt();
        Military per=PersonnelSys.searchPersonnel(id);
        if(per!=null){
        System.out.println(per.toString());
        }
        else{
        System.out.println("Personnel you search has not found.");
        }
         boolean isRemoved;
        System.out.print("\nEnter personnel id to delete: ");
        id=sc.nextInt();
        isRemoved=PersonnelSys.removePersonnel(id);
        if(isRemoved){
        System.out.println("Personnel is deleted.");
        }

        else{
        System.out.println("Personnel is not deleted");
        }

         out=null;
        System.out.println("Content of the array list");
        out=PersonnelSys.display();
        System.out.println(out);

        PersonnelSys.calculatePersonnelRankRatio();
        PersonnelSys.calculatePersonnelRankRatio();
		*/
    	
    	PersonnelSystemGUI pf = new PersonnelSystemGUI();
    	pf.setVisible(true);



    }
}
