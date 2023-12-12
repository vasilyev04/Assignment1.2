package Task4;

public class Dog extends Animal {

    public Dog(String food, String location) {
        setFood(food);
        setLocation(location);
    }

    @Override
    public void makeNoise() {
        System.out.println("Dog is sleeping");
    }
}
