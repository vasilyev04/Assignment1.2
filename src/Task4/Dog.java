package Task4;

public class Dog extends Animal {
    private String nick;

    public Dog(String food, String location, String nick) {
        setFood(food);
        setLocation(location);
        this.nick = nick;
    }

    @Override
    public void makeNoise() {
        System.out.println("Dog is sleeping");
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }
}
