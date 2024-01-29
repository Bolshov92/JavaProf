package com.prof.homework._2024_01_17;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class App {

    public static void main(String[] args) {
        List<List<Integer>> lists = Arrays.asList(
                Arrays.asList(2, 3),
                Arrays.asList(4, 5),
                Arrays.asList(6, 7)
        );
        System.out.println(flattenListOfLists(lists));

        User user = new User("Alex", new ArrayList<>(Arrays.asList("Sing", "Dance")));
        User user2 = new User("Jake", new ArrayList<>(Arrays.asList("Sing", "Dance", "Boot")));
        List<User> users = new ArrayList<>(Arrays.asList(user, user2));
        System.out.println(getAllSkills(users));

        List<List<Integer>> list2 = Arrays.asList(
                Arrays.asList(2, 3),
                Arrays.asList(4, 5),
                Arrays.asList(6, 7)
        );
        System.out.println(processAndFilter(list2));
    }

    // Задача 1: Напишите метод, который принимает список списков целых чисел
    //и преобразует его в один список
    public static List<Integer> flattenListOfLists(List<List<Integer>> listOfLists) {
        return listOfLists.stream()
                .flatMap(List::stream)
                .toList();
    }


    // Задача 2: Напишите метод, который преобразует список объектов с вложенными списками
    // в один список всех вложенных элементов.

    public static List<String> getAllSkills(List<User> users) {
        List<String> list = users.stream()
                .flatMap(user -> user.getSkills().stream())
                .toList();
        return list;
    }

    public List<String> getAuthorsTitles(List<Book> books) {
        return books.stream()
                .flatMap(book -> book.getAuthors().stream())
                .toList();
    }

    // Задача 4: Напишите метод, который преобразует Map в список значений.
    public List<String> flattenMap(Map<String, List<String>> map) {
        return map.values().stream()
                .flatMap(Collection::stream)
                .toList();
    }

    // Задача 5: Напишите метод, который принимает список списков и фильтрует все четные числа, а затем умножает их на 2.
    public static List<Integer> processAndFilter(List<List<Integer>> listOfLists) {
        return listOfLists.stream()
                .flatMap(List::stream)
                .filter(el -> el % 2 == 0)
                .map(el -> el * 2)
                .toList();
    }

    public List<String> getLanguagesFromDepartment(List<Employee> employees, String department) {
        return employees.stream()
                .filter(el -> el.getDepartment().equals(department))
                .flatMap(el -> el.getLanguages().stream())
                .toList();
    }

    // Задача 7: Напишите метод, который принимает список списков списков чисел и преобразует его в один список чисел.
    public List<Integer> flattenDeepListOfLists(List<List<List<Integer>>> deepList) {
        return deepList.stream()
                .flatMap(List::stream)
                .flatMap(List::stream)
                .toList();
    }

    //  Задача 8: Напишите метод, который принимает список объектов с вложенными коллекциями,
    // сортирует вложенные элементы и возвращает отсортированный список всех элементов.
    public List<String> getSortedTasks(List<Project> projects) {
        return projects.stream()
                .flatMap(project -> project.getTasks().stream())
                .sorted()
                .toList();
    }

    // Задача 9: Напишите метод, который преобразует карту, где ключи - это строки, а значения -
    //  списки объектов, в один список уникальных строк, извлечённых из атрибутов объектов.
    public List<String> getUniqueProductNames(Map<String, List<Product>> categoryMap) {

        return categoryMap.values().stream()
                .flatMap(List::stream)
                .map(e -> e.getName())
                .distinct()
                .toList();
    }

    // Задача 10: Напишите метод, который объединяет данные из нескольких списков и
    // преобразует их в один список, применяя к каждому элементу определённую функцию.
    public List<String> combineAndTransform(List<Integer> list1, List<Double> list2, Function<Number, String> transformer) {
        return Stream.concat(list1.stream(), list2.stream())
                .map(transformer)
                .toList();

    }
}