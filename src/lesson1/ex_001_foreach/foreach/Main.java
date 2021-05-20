package lesson1.ex_001_foreach.foreach;

public class Main {
    public static void main(String[] args) {
        Animal cat = new Animal ("Sphynx", 4000);
        Animal dog = new Animal ("Malamute", 3000);
        Animal bird = new Animal ("Crow", 2000);

        Animal[] animals = {cat, dog, bird};

        for (Animal animal : animals) {
            animal.price = animal.price + 1000; // возможно изменение полей объекта
//            animal = new Animal("Lion", 200000); // нельзя поменять объекты в массиве
        }

        for (Animal animal : animals){
            System.out.println(animal.breed + " " + animal.price);
        }

    }

}
