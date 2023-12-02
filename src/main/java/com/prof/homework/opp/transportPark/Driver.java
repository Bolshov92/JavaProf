package com.prof.homework.opp.transportPark;

public class Driver {
    private String name;
    private int drivingExperience;
    private Car currentCar;

    public Driver(String name, int drivingExperience) {
        this.name = name;
        this.drivingExperience = drivingExperience;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDrivingExperience() {
        return drivingExperience;
    }

    public void setDrivingExperience(int drivingExperience) {
        this.drivingExperience = drivingExperience;
    }

    public Car getCurrentCar() {
        return currentCar;
    }

    public void setCurrentCar(Car currentCar) {
        this.currentCar = currentCar;
    }

    public void assignCar(Car car) {
        currentCar = car;
        System.out.println(name + " assigned car: " + car);
    }

    public void releaseCar() {
        System.out.println(name + " freed car");
        currentCar = null;
    }
}
