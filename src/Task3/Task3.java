package Task3;

import Task3.com.company.details.Engine;
import Task3.com.company.professions.Driver;
import Task3.com.company.vehicles.Car;

public class Task3 {
    public static void main(String[] args) {
        Driver driver = new Driver("Roman Vasilyev", 19, 18);
        Engine engine = new Engine(200, "TOO Engine");
        Car car  = new Car("Cadillac Escalade", "SUV", 1000, driver, engine);

        System.out.println(car);
    }
}
