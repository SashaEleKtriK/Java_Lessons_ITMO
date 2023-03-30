package Lab9;

import Lab9.Task2.Dublicant;
import Lab9.Task3.Lists;
import Lab9.Task4.Maps;
import Lab9.Task4.User;

import java.util.*;

public class Main {
    public static class Test {
        public String testString;

        public Test(String testString) {
            this.testString = testString;
        }

        @Override
        public String toString() {
            return "test{" +
                    "testString='" + testString + '\'' +
                    '}';
        }
    }

    public static void main(String[] args) {
        System.out.println("Задание 2");
        System.out.println(" ");
        Test test1 = new Test("This is test 1");
        Test test2 = new Test("This is test 2");
        Collection<Object> collection = new ArrayList<>();
        collection.add("233");
        collection.add(233);
        collection.add("188");
        collection.add("188");
        collection.add(188);
        collection.add("Пицца");
        collection.add(test1);
        collection.add(test1.toString());
        collection.add(test2);
        collection.add(test2);
        System.out.println(collection);
        Collection newCollection = Dublicant.unique(collection);
        System.out.println(newCollection);
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("Задание 3");
        System.out.println(" ");
        Collection collection1 = new ArrayList<>();
        Collection collection2 = new LinkedList<>();
        Lists.fillGeneration(collection1);
        Lists.fillGeneration(collection2);
        System.out.println("Коллекция 1 размер " + collection1.size() + ". Класс " + collection1.getClass());
        System.out.println("Коллекция 2 размер " + collection2.size() + ". Класс " + collection2.getClass());
        Collection newCollection1 = Lists.randomChoice(collection1);
        System.out.println("Новая коллекция 1 размер " + newCollection1.size() + ". Класс " + newCollection1.getClass());
        Collection newCollection2 = Lists.randomChoice(collection2);
        System.out.println("Новая коллекция 2 размер " + newCollection2.size() + ". Класс " + newCollection2.getClass());
        System.out.println("ArrayList сработал быстрее потому, что операции доступа по индексу в LinkedList производятся перебором с начала или конца (смотря что ближе) до нужного элемента. ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("Задание 4");
        System.out.println(" ");
        Map<User, Integer> map = Maps.generateMap(10);
        System.out.println(map);
        System.out.println(Maps.getPointsByNameInput(map));
    }
}
