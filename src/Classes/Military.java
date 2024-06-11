package Classes;

import java.util.Scanner;

public abstract class Military implements  PersonnelInterface{


	protected int id;
    protected String nameSurname;
    protected String gender;
    protected String rank;
    protected int lineNumber;
    protected double pointsByWork;
    protected int jobsDone;
    protected double totalPoints;
    protected boolean isSuperior;
    protected int offDuty;
    protected static int prevId=100;



    public Military(){
    this.id=prevId++;
    }
    
    
    public int getOffDuty() {
		return offDuty;
	}


	public void setOffDuty(int offDuty) {
		this.offDuty = offDuty;
	}


	public boolean getIsSuperior() {
		return isSuperior;
	}

	public void setIsSuperior(boolean isSuperior) {
		this.isSuperior = isSuperior;
	}
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPointsByWork() {
        return pointsByWork;
    }

    public void setpointsByWork(double pointsByWork) {
        this.pointsByWork = pointsByWork;
    }

    public String getNameSurname() {
        return nameSurname;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public void setNameSurname(String nameSurname) {
        this.nameSurname = nameSurname;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public double getTotalPoints() {
        return totalPoints;
    }

    public void setTotalPoints(double totalPoints) {
        this.totalPoints = totalPoints;
    }

    public int getJobsDone() {
        return jobsDone;
    }

    public void setJobsDone(int jobsDone) {
        this.jobsDone = jobsDone;
    }

    public int getLineNumber() {
        return lineNumber;
    }

    public void setLineNumber(int lineNumber) {
        this.lineNumber = lineNumber;
    }

    public boolean findPersonnel(int id){
        return this.id==id;
    }


    public String toString(){
        return "\nPersonnel id: "+id
                +"\nPersonnel name surname: "+nameSurname
                +"\nPersonnel gender: "+gender
                +"\nPersonnel rank: "+ rank
                +"\nPersonnel fixed line number: "+lineNumber
                +"\nPersonnel collectable points: "+pointsByWork
                +"\nPersonnel jobs done: "+jobsDone
                +"\nPersonnel total points: "+ totalPoints
                +"\nPersonnel superior status: "+isSuperior;
    }

    public abstract void calcPoints();//?

    
}
