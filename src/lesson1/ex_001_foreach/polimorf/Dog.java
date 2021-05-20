package lesson1.ex_001_foreach.polimorf;

public class Dog implements Animal{
    @Override
    public void voice() {
        System.out.println("Bark");
    }
}
