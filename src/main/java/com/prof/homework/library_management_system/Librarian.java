package com.prof.homework.library_management_system;

import java.util.ArrayList;
import java.util.List;

public class Librarian implements Maintainable {
    private String name;
    private String employeeId;
    private List<LibraryItem> managedItems;

    public Librarian(String name, String employeeId, List<LibraryItem> managedItems) {
        this.name = name;
        this.employeeId = employeeId;
        this.managedItems = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public List<LibraryItem> getManagedItems() {
        return managedItems;
    }

    public void setManagedItems(List<LibraryItem> managedItems) {
        this.managedItems = managedItems;
    }


    @Override
    public void repairItem() {

    }

    @Override
    public void updateItemCondition(ItemCondition condition) {

    }

    @Override
    public ItemCondition checkCondition() {
        return null;
    }
}
