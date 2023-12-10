package com.prof.homework.HashMap;

import com.github.javafaker.Faker;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class UserApp {

    private static final Faker FAKER = new Faker();

    public static void main(String[] args) {

        Map<User, String> ageSort = new TreeMap<>();
        ageSort.put(new User(FAKER.name().firstName(), 15), "Info");
        ageSort.put(new User(FAKER.name().firstName(), 20), "I");
        ageSort.put(new User(FAKER.name().firstName(), 30), "o");

        for (Map.Entry<User, String> e : ageSort.entrySet()) {
            System.out.println(e.getKey().getName() + " " + e.getKey().getAge() + " " + e.getValue());

        }


        Map<User, String> sort = new TreeMap<>(new UserComparator());
        sort.put(new User(FAKER.name().firstName(), 15), "Info");
        sort.put(new User(FAKER.name().firstName(), 20), "Info");
        sort.put(new User(FAKER.name().firstName(), 30), "Info");
        sort.put(new User(FAKER.name().firstName(), 20), "Info");
        sort.put(new User(FAKER.name().firstName(), 30), "Info");
        for (Map.Entry<User, String> e : sort.entrySet()) {
            System.out.println(e.getKey().getName());
        }
        Map<String,User> userStringMap = new HashMap<>();
        userStringMap.put("Student", new User("Alex", 20));
        userStringMap.put("Employee", new User("Slava", 25));
        userStringMap.put("Fixer", new User("Vova", 30));
        userStringMap.put("Driver", new User("Viktor", 35));


        Map<String, User> userStringMapTwo = new HashMap<>();
        userStringMapTwo.put("Student", new User("Alex", 20));
        userStringMapTwo.put("Self - Employed", new User("Valentin", 30));
        userStringMapTwo.put("Fixer", new User("Vova", 30));
        userStringMapTwo.put("Junior", new User("Vlad", 14));

        System.out.println(checkDuplicate(userStringMap, userStringMapTwo));
    }

    public static Map<String, User> checkDuplicate(Map<String,User>  listOne, Map<String,User> listTwo){
        Map<String,User> users = new HashMap<>(listOne);
        for (Map.Entry<String,User> e : listTwo.entrySet()){
            if(!users.containsValue(e.getValue())){
                users.put(e.getKey(), e.getValue());
            }
        }
        return users;
    }
}
