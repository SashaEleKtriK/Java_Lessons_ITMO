package Lab6.Work4;

public class Child extends Parent{
    public Integer integer = getNum();

    public Integer getInteger() {
        System.out.println("Целое число");
        System.out.println(integer);
        return integer;
    }
}
