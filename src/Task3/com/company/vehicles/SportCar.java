package Task3.com.company.vehicles;

public class SportCar {
    private int topSpeed;

    public SportCar(int topSpeed) {
        this.topSpeed = topSpeed;
    }

    public int getTopSpeed() {
        return topSpeed;
    }

    public void setTopSpeed(int topSpeed) {
        this.topSpeed = topSpeed;
    }

    @Override
    public String toString() {
        return "Top speed: " + topSpeed + '\n' + super.toString();
    }
}
