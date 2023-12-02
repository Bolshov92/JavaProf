package com.prof.homework.opp.transportPark;

public class App {

    public static void main(String[] args) {
        Car carOne = new Car("Honda", "Accord", 2017);
        Car carTwo = new Car("BMW", "X6", 2022);

        Driver driverOne = new Driver("Alex", 10);
        Driver driverTwo = new Driver("Jake", 23);

        FleetManager fleetManager = new FleetManager("FleetPark : ");
        fleetManager.addCar(carOne);
        fleetManager.addCar(carTwo);

        Fleet fleet = new Fleet("GoodPark","London Road 123 : ");

        for(Car car : fleetManager.getCars()){
            car.displayInfo();
        }


    }
}

