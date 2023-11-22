package com.telran.org.lessontwelve;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TestStudentHashMap {

    public static void main(String[] args) {
        Map<String, List<Course>> studentCoursesMap = new HashMap<>();

        Student alex = new Student("Alex", "Alexeev");
        Student maxim = new Student("Maxim", "Maximov");

        Course java = new Course("Java", 105);
        Course sql = new Course("SQL", 30);
        Course algo = new Course("Algo", 30);

        List<Course> alexCourses = List.of(java, algo);
        List<Course> maximCourses = List.of(sql, algo);





        studentCoursesMap.forEach((student, courses)->{
            System.out.println("Courses for student " + student);
        });

        Student oleg = new Student("Oleg", "Olegov");

        List<Course> courses = studentCoursesMap.get(alex);
        System.out.println("Courses for Alex by key = " + courses);


        if(studentCoursesMap.containsKey(oleg)) {

            List<Course> coursesOleg = studentCoursesMap.get(oleg);

            System.out.println("Courses for Leg by key = " + coursesOleg);
        }

    }
}
