package lesson2.сomparator;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Animal cat = new Animal("Sphinx", 8, 20, 100);
        Animal bird = new Animal("Ara", 4, 35, 500);
        Animal dog = new Animal("Tuzik", 15, 25, 200);

        Animal[] animals = {cat, bird, dog};
//        Arrays.sort(animals, (o1, o2) -> o1.getPrice() - o2.getPrice(); // - лямбда-выражение нижней строки
//        Arrays.sort(animals, new Comparator<Animal>() {
//        Arrays.sort(animals, new Comparator<Animal>() {
        /*    @Override
            public int compare(Animal o1, Animal o2) {
//                return o1.getPrice() - o2.getPrice(); // - за счет того, что это метод compare, то у него под капотом сама произойдет сортировка;
                return o1.getSpeed() - o2.getSpeed();
            }
        });
        */

           /* @Override
            public int compare(Animal o1, Animal o2) {
                if (o1.getPrice() == o2.getPrice()){
                    return o1.getSpeed() - o2.getSpeed();
                } else {
                    return o1.getPrice() - o2.getPrice();
                }
            }
        });*/

        Arrays.sort(animals, new ComparatorByPrice());
        System.out.println("CompareByPrice \n" + Arrays.toString(animals));

        Arrays.sort(animals, new CompareByBreed());
        System.out.println("CompareByBreed\n" + Arrays.toString(animals));

        Arrays.sort(animals, new CompareBySpeed());
        System.out.println("CompareBySpeed\n" + Arrays.toString(animals));

    }
}
