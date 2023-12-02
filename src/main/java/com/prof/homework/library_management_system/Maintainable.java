package com.prof.homework.library_management_system;

public interface Maintainable {

    void repairItem();
    void updateItemCondition(ItemCondition condition);
    ItemCondition checkCondition();
}
