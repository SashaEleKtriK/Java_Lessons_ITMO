package Lab6.Work3;

import Lab6.Work3.Car;

public class Truck extends Car {
    private Integer wheelCount;
    private Integer maxWeight;

    public Truck(int w, String m, char c, float s, Integer wheelCount, Integer maxWeight) {
        super(w, m, c, s);
        this.wheelCount = wheelCount;
        this.maxWeight = maxWeight;
    }

    @Override
    public String toString() {
        return "Truck{" +
                "wheelCount=" + wheelCount +
                ", maxWeight=" + maxWeight +
                ", weight=" + weight +
                ", model='" + model + '\'' +
                ", color=" + color +
                ", speed=" + speed +
                '}';
    }
}
