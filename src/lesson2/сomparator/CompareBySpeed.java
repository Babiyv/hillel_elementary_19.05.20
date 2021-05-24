package lesson2.сomparator;

import java.util.Comparator;

public class CompareBySpeed implements Comparator<Animal> {
    @Override
    public int compare(Animal o1, Animal o2) {
        return o1.getSpeed() - o2.getSpeed();
    }
}
