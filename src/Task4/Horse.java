package Task4;

public class Horse extends Animal{

    public Horse(String food, String location) {
        setFood(food);
        setLocation(location);
    }

    @Override
    public void makeNoise() {
        System.out.println("Horse is sleeping");
    }
}
