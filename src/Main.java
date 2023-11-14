import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();

        System.out.println(names);

        names.add("Leo");
        names.add("Paul");
        names.add("Alexis");
        System.out.println(names);

        names.add(1, "John");
        System.out.println(names);

        names.remove("Paul");
        System.out.println(names);

        names.set(1, "Antony");
        System.out.println(names);

        if (names.contains("Alexis")){
            System.out.println("Есть " + names.get(2));
        }else {
            System.out.println("Нету");
        }

//        names.clear();
        if (names.isEmpty()){
            System.out.println("Да, пустой. " +
                    "Размер списка " + names.size());
        }else {
            System.out.println("Нет, не пустой. " +
                    "Размер списка " + names.size());
        }

        ArrayList<String> names2 = new ArrayList<>();
        names2.add("Katrin");
        names2.add("Anna");

        System.out.println("Список 1 " + names);
        System.out.println("Список 2 " + names2);

        names.addAll(names2);
        names.add(0, "Katrin");
        System.out.println("------------------");
        System.out.println("Список 1 " + names);
        System.out.println("Список 2 " + names2);

        names.removeAll(names2);
//        names.retainAll(names2);

        System.out.println("------------------");
        System.out.println("Список 1 " + names);
        System.out.println("Список 2 " + names2);

        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i));
        }
        System.out.println("------------");
        for (String name : names) {
            System.out.println(name);
        }
        System.out.println("------------");
        for (int i = names.size() - 1; i >= 0; i--) {
            System.out.println(names.get(i));
        }
        System.out.println("------------");
        names.forEach(name -> {

            System.out.println(name);
        });

        LinkedList<Integer> numbers = new LinkedList<>();

        numbers.add(134);
        numbers.add(-23423);
        numbers.add(0);
        numbers.add(13413);

        System.out.println(numbers);

        ArrayList<Object> objects = new ArrayList<>();
        objects.add("asd");
        objects.add(235);
        objects.add(true);
        System.out.println(objects);

        HashSet<String> hashSetNames = new HashSet<>();

        hashSetNames.add("Leo");
        hashSetNames.add("John");
        hashSetNames.add("Chris");
        hashSetNames.add("John");
        hashSetNames.add("Allan");

        System.out.println(hashSetNames);

        names.add(0, "Юрий");
        names.add("Саша");
        System.out.println("До сортировки " + names);
        Collections.sort(names);
        System.out.println("После сортировки " + names);

        System.out.println("До сортировки " + numbers);
        Collections.sort(numbers);
        System.out.println("После сортировки " + numbers);
        Collections.reverse(numbers);
        System.out.println("После сортировки " + numbers);

        Collections.shuffle(numbers);
        System.out.println("После сортировки " + numbers);


        User user1 = new User("Leo", 38);
        User user2 = new User("John", 60);
        User user3 = new User("Chris", 18);

        ArrayList<User> users = new ArrayList<>();

        users.add(user1);
        users.add(user2);
        users.add(user3);
        users.add(user2);

        System.out.println(users);

        users.sort(Comparator.comparing(User::getAge));
        System.out.println(users);

        Collections.reverse(users);
        System.out.println(users);
        ArrayList<String> colors = new ArrayList<>();

        colors.add("Red");
        colors.add("Green");
        colors.add("Black");
        colors.add("White");
        colors.add("Pink");
        colors.add("Yellow");

        System.out.println(colors);

        Collections.sort(colors);

        System.out.println(colors);

        Collections.shuffle(colors);

        System.out.println(colors);

        for (int i = 0; i < colors.size(); i++) {
            System.out.println(colors.get(i));
        }

        Player player1 = new Player("Leo", 23);
        Player player2 = new Player("Michael", 11);
        Player player3 = new Player("Allan", 7);

        ArrayList<Player> players = new ArrayList<Player>();

        players.add(player1);
        players.add(player2);
        players.add(player3);

        System.out.println(players);

        players.sort(Comparator.comparing(Player::getNumber));

        System.out.println(players);

    }
}