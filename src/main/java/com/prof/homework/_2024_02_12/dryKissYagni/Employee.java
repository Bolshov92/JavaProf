package com.prof.homework._2024_02_12.dryKissYagni;

public class Employee {

    public static final String SPACE = "";
    public static final String POINT = ".";
    private String firstName;
    private String lastName;
    
    public String getFullName() {
        return firstName + " " + lastName;
    }
    
    public String getInitials() {
        return firstName.charAt(0) + "." + lastName.charAt(0) + ".";
    }
    
    // Дублирование кода формирования email
    public String getEmail() {
//        return (firstName + POINT + lastName + "@company.com").toLowerCase();
        return (getFullName().replace(SPACE,POINT) + "@company.com").toLowerCase();
    }
}

