package lesson1.oop.oop2_sort;

import java.util.Arrays;

public class Example1 {
    public static void main(String[] args) {
        int[] marks = {10, 8, -10, 1000, 50};
        String[] student = {"Alex", "Sasha", "Olga"};

        Arrays.sort(marks);
        System.out.println(Arrays.toString(marks));
        Arrays.sort(student);
        System.out.println(Arrays.toString(student));

    }
}
