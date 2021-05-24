package lesson1.oop.polymorpfism;

public interface Animal {
    void scream();
}

class Cat implements Animal{
    @Override
    public void scream() {
        System.out.println("Meu-Meu");
    }
}

class Dog implements Animal{
    @Override
    public void scream() {
        System.out.println("Burk");
    }
}

class Main {
    public static void main(String[] args) {
        Animal cat = new Cat();
        Animal dog = new Dog();
        voice(dog);
        voice(cat);
    }

    public static void voice(Animal animal){
        animal.scream();
    }
}