package Classes;

import java.util.Scanner;

public class Tanks {
private String firePower;
private int producedYear;

public Tanks(){

}

    public String getFirePower() {
        return firePower;
    }

    public void setFirePower(String firePower) {
        this.firePower = firePower;
    }

    public int getProducedYear() {
        return producedYear;
    }

    public void setProducedYear(int producedYear) {
        this.producedYear = producedYear;
    }

   


public String toString(){
    return "\n\tFire Power: "+firePower
            +"\n\tProduced Year: "+producedYear;
}
}
