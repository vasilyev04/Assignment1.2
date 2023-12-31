package Task4;

import Task4.Animal;
import java.util.ArrayList;

public class Task4 {
    public static void main(String[] args) {
        Cat cat = new Cat("Fish", "Astana", false);
        Dog dog = new Dog("Bones", "Almaty", "Sharik");
        Horse horse = new Horse("Apples", "Karaganda", 1);

        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(cat);
        animals.add(dog);
        animals.add(horse);

        Veterinarian veterinarian = new Veterinarian();
        for (Animal animal : animals) {
            veterinarian.treatAnimal(animal);
        }
    }
}
