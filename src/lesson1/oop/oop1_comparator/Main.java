package lesson1.oop.oop1_comparator;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Animal sphynx = new Animal("Sphynx", 1000);
        Animal malamute = new Animal("Malamute", 2000);
        Animal maincoon = new Animal("Maincoon", 3000);

        Animal[] animals = {sphynx, malamute, maincoon};

        Arrays.sort(animals); // - не будет работать, пока не будет создан компаратор в классе Animal;Ф
        System.out.println(Arrays.toString(animals));


    }









   /* public final static int ADRESS[] = {30, 40, 50};

    private String name;
    private int weigth;
    private int height;


    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>(); // - можно создать отдельную папку где у нас будут хранится разные листы;

        animals.add(new Animal("Sphynx", 1000));
        animals.add(new Animal("Malamute", 2000));
        animals.add(new Animal("Maincoon", 3000));

        Iterator<Animal> iterator = animals.iterator(); // <- animals.iterator().var (быстрая запись)
        while (iterator.hasNext()){
            Animal animal = iterator.next();
            System.out.println(animal);
        }

        ADRESS[0] = 100;
        System.out.println(Arrays.toString(ADRESS));

    }*/
}
