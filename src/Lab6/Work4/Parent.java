package Lab6.Work4;

import java.util.Scanner;

public class Parent {
    public int integer;
    public Integer getNum(){
        System.out.println("Введите целое число");
        Scanner scanner = new Scanner(System.in) ;
        integer = scanner.nextInt();
        return integer;
    }
}
