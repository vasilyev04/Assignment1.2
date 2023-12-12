package Task3.com.company.vehicles;

import Task3.com.company.details.Engine;
import Task3.com.company.professions.Driver;

public class Car {
    public Car(String brand, String carClass, int weight, Driver driver, Engine engine) {
        this.brand = brand;
        this.carClass = carClass;
        this.weight = weight;
        this.driver = driver;
        this.engine = engine;
    }

    private String brand;
    private String carClass;
    private int weight;
    private Driver driver;
    private Engine engine;

    public void start(){
        System.out.println("Let's go");
    }

    public void stop(){
        System.out.println("Let's stop");
    }

    public void turnRight(){
        System.out.println("Turn right");
    }

    public void turnLeft(){
        System.out.println("Turn left");
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getCarClass() {
        return carClass;
    }

    public void setCarClass(String carClass) {
        this.carClass = carClass;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Brand: " + brand + '\n' +
                "Class: " + carClass + '\n' +
                "Weight: " + weight + '\n' +
                "Driver's information " + '\n' + driver.toString() + '\n' +
                "Engine's information " + '\n' + engine.toString() + '\n';
    }
}
