package Task3.com.company.vehicles;

public class Lorry {
    private int capacity;

    public Lorry(int capacity) {
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Capacity: " + capacity + '\n' + super.toString();
    }
}
