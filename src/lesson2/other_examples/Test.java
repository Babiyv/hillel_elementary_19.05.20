package lesson2.other_examples;

import java.util.Objects;

public class Test {
    public static void main(String[] args) {
        Integer a = 127; // - пулл интеджеров, в которое вносятся значения в пределах байта;
        Integer b = 127;
        Integer c = 200; // - пулл стрингов, в которые попадают значение выходящие за пределы размеры значений байт;
        Integer d = 200;
        System.out.println(a == b); // - true
        System.out.println(c == d); // - false

        System.out.println(c.equals(d)); // - true; ВЫУЧИТЬ все 11 методов класса object;

        A a1 = new A();
        A b1 = new A();
        System.out.println(a1.equals(b1));

    }
}

class A {
    private int field = 200;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        A a = (A) o;
        return field == a.field;
    }

    @Override
    public int hashCode() {
        return Objects.hash(field);
    }
}

class B {

}