package lesson1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class SimpleCollection {
    public static void main(String[] args) {

        Collection<Integer> list = new ArrayList<>();
        Set<Integer> list_1 = new HashSet<>();

        System.out.println(list.size());

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(1);
        System.out.println(list.add(1));
        System.out.println(list.size());

        Collection<Integer> list2 = new ArrayList<>();
        System.out.println(list2.size());
        list2.addAll(list);
        System.out.println(list2 + " " + list2.size());

        System.out.println(list2.remove(1));
        System.out.println(list2);

        list2.clear();
        System.out.println(list2 + " " + list2.size() + " !!!!!!!!");
//        System.out.println(list2.isEmpty());
        Object[] arr = list2.toArray();

        for (int i = 0; i < arr.length; i++){ // - не будет выполнен, так как метод clear почистил
            System.out.println(arr[i]);
        }


    }
}
