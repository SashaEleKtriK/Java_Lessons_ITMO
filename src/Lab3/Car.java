package Lab3;

public class Car {


    private String color;
    private String name;
    private Integer weight;

    public Car(String color, String name, Integer weight) {
        this.color = color;
        this.name = name;
        this.weight = weight;
    }

    public Car(String color) {
        this.color = color;
    }

    public Car() {

    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }


    @Override
    public String toString() {
        return "Car{" +
                "Цвет='" + color + '\'' +
                ", Название='" + name + '\'' +
                ", Вес=" + weight +
                " кг }";
    }

}

class Java {
    public static void main(String[] args) {
        Car car1 = new Car("Красный", "BMW", 1200);
        Car car2 = new Car("Черный", "Alfa-Romeo", 900);
        System.out.println(car1);
        System.out.println(car2);
    }
}
