package lesson2.homework;

public class Car implements Comparable<Car> {
    private int power;
    private String gearbox;
    private String tyres;
    private String color;
    private int price;

    public Car(int power, String gearbox, String tyres, String color, int price) {
        this.power = power;
        this.gearbox = gearbox;
        this.tyres = tyres;
        this.color = color;
        this.price = price;
    }

    @Override
    public int compareTo(Car o) {
/*      // МУДРЕНАЯ запись для Int-ового значения:
        if (this.power == o.power){
            return 0;
        } else if (this.power > o.power){
            return -1;
        } else {
            return 1;
        }*/

        // УЛУЧШЕННАЯ запись для Int-ового значения
//        return power - o.power; // - меняя местами сравниваемые значчения можно изменять порядок сортировки (по возрастанию или по убыванию)

        // запись для String-ов:
        return gearbox.compareTo(o.gearbox); // - compareTo работает только со String-овыми значениями и возвращает интовое;
    }

    // Get-еры нужны для использования с Comparator (для Comparable (3-я и 18-я строка этого класса) не нужны;
    // * Set-еры добавил просто за компанию

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public String getGearbox() {
        return gearbox;
    }

    public void setGearbox(String gearbox) {
        this.gearbox = gearbox;
    }

    public String getTyres() {
        return tyres;
    }

    public void setTyres(String tyres) {
        this.tyres = tyres;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "power=" + power +
                ", gearbox='" + gearbox + '\'' +
                ", tyres='" + tyres + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                '}';
    }

}
