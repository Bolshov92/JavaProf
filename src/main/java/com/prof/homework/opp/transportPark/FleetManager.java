package com.prof.homework.opp.transportPark;

public class FleetManager {
    private String name;
    private Car[] cars;
    private Driver[] drivers;

    public FleetManager(String name) {
        this.name = name;
        this.cars = new Car[0];
        this.drivers = new Driver[0];
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Car[] getCars() {
        return cars;
    }

    public void setCars(Car[] cars) {
        this.cars = cars;
    }

    public Driver[] getDrivers() {
        return drivers;
    }

    public void setDrivers(Driver[] drivers) {
        this.drivers = drivers;
    }

    public void addCar(Car car) {
        Car[] newCars = new Car[cars.length + 1];
        for (int i = 0; i < cars.length; i++) {
            newCars[i] = cars[i];
        }
        newCars[cars.length] = car;
        cars = newCars;
        System.out.println("Car added to the park.");
    }
    public void assignCarToDriver(Driver driver, Car car) {
        driver.assignCar(car);
    }
}
