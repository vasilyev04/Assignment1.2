package Task3.com.company.professions;

import Task3.com.company.Person;

public class Driver extends Person {
    private int drivingExperience;

    public Driver(String fullName, int age, int drivingExperience) {
        super(fullName, age);
        this.drivingExperience = drivingExperience;
    }

    public int getDrivingExperience() {
        return drivingExperience;
    }

    public void setDrivingExperience(int drivingExperience) {
        this.drivingExperience = drivingExperience;
    }

    @Override
    public String toString() {
        return  super.toString() +
                "Experience: " + drivingExperience + " years";
    }
}
