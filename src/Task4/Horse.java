package Task4;

public class Horse extends Animal{
    private int countOfOwners;

    public Horse(String food, String location, int countOfOwners) {
        setFood(food);
        setLocation(location);
        if(countOfOwners < 1){
            this.countOfOwners = 1;
        }else{
            this.countOfOwners = countOfOwners;
        }
    }

    public int getCountOfOwners() {
        return countOfOwners;
    }

    public void setCountOfOwners(int countOfOwners) {
        if(countOfOwners < 1){
            this.countOfOwners = 1;
        }else{
            this.countOfOwners = countOfOwners;
        }
    }

    @Override
    public void makeNoise() {
        System.out.println("Horse is sleeping");
    }
}
