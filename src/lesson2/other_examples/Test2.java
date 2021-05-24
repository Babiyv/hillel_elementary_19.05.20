package lesson2.other_examples;

public class Test2 {
    public static void main(String[] args) {
        byte a = 127;
        a = (byte) (a + 1); // = -128
        System.out.println(a);

        String a1 = "5";
        System.out.println(Integer.bitCount(11111)); // - .bitCount передает ?количество единиц?
    }
}
