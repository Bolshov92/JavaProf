package com.prof.homework._2024_02_12.dryKissYagni;//package PROF.dryKissYagni;

import java.util.List;
import java.util.function.ToIntFunction;

public class DA {
    // Нарушение DRY: Дублирование кода
    public void processData(List<Integer> data) {
        int sum = 0;
        for (int num : data) {
            sum += num;
        }
        System.out.println("Sum: " + sum);

        double average = (double) sum / data.size();
        System.out.println("Average: " + average);
    }

    public void processUserData(List<User> users) {
        int totalAge = 0;
        for (User user : users) {
            //totalAge += user.getAge();
        }
        System.out.println("Total Age: " + totalAge);

        double averageAge = (double) totalAge / users.size();
        System.out.println("Average Age: " + averageAge);
    }

//    public void processUserData(List<Integer> data){
//        int totalAgE = calculateSum(User, User ::getAge);
//        double average = calculateAverage(data, Integer::intValue);
//    }

    private <T> int calculateSum(List<T> list, ToIntFunction<? extends T> function){
        return list.stream()
                .mapToInt((ToIntFunction<? super T>) function)
                .sum();
    }
//    private <T> double calculateAverage(List<T> list, ToIntFunction<? extends T> function){
//        return list.stream()
//                .mapToInt(ToDoubleFunction<? super T> function)
//                .average()
//                .orElse();
//    }

    class User{
        private String name;
        private int age;

        public User(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }
    }
}

