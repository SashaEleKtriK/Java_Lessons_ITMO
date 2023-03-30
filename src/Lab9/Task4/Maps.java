package Lab9.Task4;

import java.util.*;

public class Maps {
    private static String[] fNames = new String[]{"Олег", "Виктор", "Егор", "Андрей", "Александр"};
    private static String[] lNames = new String[]{"Григорьев", "Иванов", "Свирин", "Егоров", "Федоров"};

    public static Map generateMap(int mapSize) {
        Random random = new Random();
        Map<User, Integer> map = new HashMap<>();
        for (int i = 0; i < fNames.length; i++) {
            if (map.size() == mapSize) {
                break;
            }
            for (int j = 0; j < lNames.length; j++) {
                String name = fNames[i] + " " + lNames[j];
                User user = new User(name);
                map.put(user, random.nextInt(100));
            }

        }
        return map;

    }

    public static Integer getPoints(Map<User, Integer> map, User user) {
        Integer points = map.get(user);
        return points;
    }

    public static String inputName() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя");
        String fName = scanner.next();
        System.out.println("Введите фамилию");
        String lName = scanner.next();
        String fullName = fName + " " + lName;
        return fullName;
    }

    private static User getUserByName(Map<User, Integer> map, String name) {
        Set<User> users = map.keySet();
        User resultUser;
        for (User user : users
        ) {
            if (user.getName().equalsIgnoreCase(name)) {
                resultUser = user;
                return resultUser;
            }

        }
        resultUser = new User("Несуществующий игрок");
        return resultUser;


    }

    public static Integer getPointsByNameInput(Map<User, Integer> map) {
        return getPoints(map, getUserByName(map, inputName()));
    }
}
