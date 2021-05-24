package lesson1.oop;

import java.util.*;

public class Main_ListSetIterator {
    public static void main(String[] args) {

        Human human = new Human();

        ArrayList arrayList = new ArrayList(); // - НЕправильная запись. без дженериков будет принимать люой object;
        arrayList.add("hello");
        arrayList.add(50);

        HashSet hashSet = new HashSet(); // - имеет очень быстрый доступ, но выводит произвольно. Внутри себя имеет линкедЛист
        hashSet.add(human);

        LinkedList linkedList = new LinkedList();
        arrayList.add(human);

//        iterator:
        List<String> list = new ArrayList<>();

        list.add("5");
        list.add("hello");

        Iterator<String> iterator = list.iterator(); // <- list.iterator.var (быстрая запись)
        while (iterator.hasNext()) {
            String next = iterator.next(); // <- iterator.next().var
        }


        ListIterator<String> stringListIterator = list.listIterator(); // <- list.listIterator().var (быстрая запись)
        while (stringListIterator.hasNext()) {
            String var = stringListIterator.next();
            System.out.println(var);
        }
    }
}

class Human { // так не пишут(создание класса внутри другого класса)
}