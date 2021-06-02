package lesson1.homework;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;


/*2. Написать свои примеры добавления и удаления обьектов в коллекции */
public class CollectionsOperationsExamples {
    public static void main(String[] args) {

        ArrayList<String> arrayList_1 = new ArrayList<>(); // - создаем новый ArrayList
        ArrayList<String> arrayList_2 = new ArrayList<>();

        arrayList_1.add("a"); // - добавляем в него
        arrayList_1.add("b");
        arrayList_1.add("c");
        arrayList_1.add("d");
        arrayList_1.add("b"); // - можем задублировать значение (с Set-ом так делать нельзя, так как подходит только для уникальных значений)
        arrayList_1.add("b"); // - можем задублировать значение
        arrayList_1.add("b"); // - можем задублировать значение
        System.out.println("arrayList_1 at start: " + arrayList_1);

        arrayList_2.addAll(arrayList_1); // - "копируем" все значения с одного листа в другой, хотя могли бы сразу их передать при создании;
        System.out.println("arrayList_2.addAll(arrayList_1): " + arrayList_2);

        arrayList_1.remove("b"); // - удаляем по зачению, но удалит только одно, а не все идентичные значения;
        System.out.println("arrayList_1.remove(\"b\" but only one): " + arrayList_1);

        while (arrayList_1.contains("b")){ // - проверяем содерит ли коллекция искомое значение...;
            arrayList_1.remove("b"); // - ...и удаляем по зачению все идентичные значения;
        }
        System.out.println("arrayList_1.remove(\"b\") in while cycle: " + arrayList_1);

        arrayList_1.remove(0);  // - удаляем по индексу, НО работает только для ArrayList;
        System.out.println("arrayList_1.remove(0): " + arrayList_1);

        arrayList_1.remove("f"); // - никакой ошибки, если попытаемся удалить значение которого нет в листе;
        System.out.println("No exception after arrayList_1.remove(\"f\"): " + arrayList_1);

        arrayList_2.removeAll(arrayList_1); // - удаляем из второй коллекции все значения совпадающие с первой коллекцией;
        System.out.println("arrayList_2.removeAll(arrayList_1): " + arrayList_2 + "; arrayList_1 is still: " + arrayList_1);

        arrayList_2.removeAll(arrayList_2); // - КРИВОЙ способ очистить коллекцию;
        System.out.println("arrayList_2.removeAll(arrayList_2): " + arrayList_2);

        arrayList_2.addAll(arrayList_1);
        System.out.println("Respawn arrayList_2: " + arrayList_2);
        arrayList_2.clear(); // - ЦИВИЛИЗОВАНЫЙ способ очистить коллекцию;
        System.out.println("arrayList_2.clear(): " + arrayList_2);

        System.out.println(arrayList_2.isEmpty());
        System.out.println(arrayList_2.size());

    }
}
