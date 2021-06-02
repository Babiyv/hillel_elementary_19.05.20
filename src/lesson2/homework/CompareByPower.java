package lesson2.homework;

import java.util.Comparator;

public class CompareByPower implements Comparator<Car> {
    @Override
    public int compare(Car o1, Car o2) {
        return o2.getPower() - o1.getPower();
    }
}
