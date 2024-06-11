package Classes;

import java.util.Scanner;

public class Ships {
    private String name;
    private String type;
    private String capacity;

    public Ships(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCapacity() {
        return capacity;
    }

    public void setCapacity(String capacity) {
        this.capacity = capacity;
    }



    public String toString(){
        return "\n\tShip's name: "+name
                +"\n\tShip's type: "+type
                +"\n\tCrew capacity: "+capacity;
    }
}
