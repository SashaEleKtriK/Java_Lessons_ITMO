package Lab9.Task3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.Random;

public class Lists {

    public static Collection fillGeneration(Collection collection) {
        Random random = new Random();
        for (int i = 0; i < 1000000; i++) {
            collection.add(random.nextInt());
        }
        return collection;

    }

    public static Collection randomChoice(Collection collection) {
        Random random = new Random();
        Collection newCollection1 = new ArrayList();
        Collection newCollection2 = new LinkedList();
        WatchTimer timer = new WatchTimer();
        timer.start();
        for (int i = 0; i < 10000; i++) {
            if (collection.getClass() == ArrayList.class) {

                newCollection1.add(((ArrayList<?>) collection).get(random.nextInt(collection.size() - 1)));

            }
            if (collection.getClass() == LinkedList.class) {
                newCollection2.add(((LinkedList<?>) collection).get(random.nextInt(collection.size() - 1)));
            }

        }
        timer.end();
        System.out.println("Время выполнения " + (double) timer.result() / 100 + ", сек.");
        if (newCollection1.size() > 0) {
            return newCollection1;
        }
        if (newCollection2.size() > 0) {
            return newCollection2;
        }
        return collection;
    }

}
