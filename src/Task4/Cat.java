package Task4;

public class Cat extends Animal{

    public Cat(String food, String location) {
        setFood(food);
        setLocation(location);
    }

    @Override
    public void makeNoise() {
        System.out.println("Cat is sleeping");
    }
}
