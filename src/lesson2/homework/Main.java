package lesson2.homework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeSet;

/*2. Написать свою программу с интерфейсами Comparator и Comparable,
почитайте и скажете мне в чем между ними разница, когда нужно применять Comparator а когда Comparable.
Например создайте класс "Сar" с 5-ю полями и напишите свою программу.*/
public class Main {
    public static void main(String[] args) {
        Car firstCar = new Car(250, "manual","sport","red", 27000);
        Car secondCar = new Car(286, "manual","sport", "black", 26000);
        Car thirdCar = new Car (225, "manual","road","green", 25000);
        Car fourthCar = new Car (225, "auto","road","red", 26000);

        ArrayList<Car> carArrayList = new ArrayList<>();

        // сортировка за счет имплементированного интерфейса Comparable в классе Car;
//        TreeSet<Car> carTreeSet = new TreeSet<>(); // * если сортировка будет по категории где одинаковые значения, то они пропадут, так как Set предназначен для уникальных значений (пускай даже все остальные, не проверяемые, значения будут уникальны);
//        carTreeSet.add(firstCar); // * в случае с TreeSet будет выбивать runtime exception пока не имплиментировать интерфес Comparable в классе Car, так как внутрення сортировка TreeSet не понимает как ей сортировать неизвестный тип данных Car (передаваемый при создании TreeSet-а);
        carArrayList.add(firstCar);
        carArrayList.add(secondCar);
        carArrayList.add(thirdCar);
        carArrayList.add(fourthCar);
        Collections.sort(carArrayList); // - сортировка по типу коробки передач (сам принцип сортировки прописан в классе Car); *не нужно писать эту строку для TreeSet, так как о сам автоматически будет сортировать (согласно имплементированному интерфейсу Comparable в классе Car)

        System.out.println(" Compared by gearbox type (implements Comparable in class Car):");
        for (Car car : carArrayList) { // <- аккуратный вывод на консоль в столбик через цикл for each;
            System.out.println(car);
        }

        // сортировка с использованием Comparator:
        System.out.println("\n Compared by price:");
        Collections.sort(carArrayList, new CompareByPrice()); // - сортировка по цене, запись как учили на паре;
        for (Car car : carArrayList) {
            System.out.println(car);
        }

        System.out.println("\n Compared by power and price:");
        Collections.sort(carArrayList, new CompareByPrice().thenComparing(new CompareByPower())); // - сортировка по мощности и затем по цене, сам нашел;
        for (Car car : carArrayList) {
            System.out.println(car);
        }

    }
}
