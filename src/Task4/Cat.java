package Task4;

public class Cat extends Animal{
    private boolean isStray;

    public Cat(String food, String location, boolean isStray) {
        setFood(food);
        setLocation(location);
        this.isStray = isStray;
    }

    @Override
    public void makeNoise() {
        System.out.println("Cat is sleeping");
    }

    public boolean isStray() {
        return isStray;
    }

    public void setStray(boolean stray) {
        isStray = stray;
    }
}
