package lesson2.сomparator;

import java.util.Comparator;

public class ComparatorByPrice implements Comparator<Animal> {
    @Override
    public int compare(Animal o1, Animal o2) {
        return o1.getPrice() - o2.getPrice();
    }
}
