package Lab7;

public class Main {
    public static void main(String[] args) {

        Plane.Wing lWing = new Plane.Wing(130);
        Plane.Wing rWing = new Plane.Wing(144);
        Plane DC130 = new Plane(lWing, rWing, "DC130");
        System.out.println(DC130);
        System.out.println(DC130.getLeftW().getWeight());
    }
}
