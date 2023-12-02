package com.prof.homework.opp.transportPark;

public class Fleet {
    private String name;
    private String address;
    private FleetManager[] fleetManagers;

    public Fleet(String name, String address) {
        this.name = name;
        this.address = address;
        this.fleetManagers = new FleetManager[0];
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public FleetManager[] getFleetManagers() {
        return fleetManagers;
    }

    public void setFleetManagers(FleetManager[] fleetManagers) {
        this.fleetManagers = fleetManagers;
    }

    public void addFleetManager(FleetManager fleetManager) {
        FleetManager[] newFleetManagers = new FleetManager[fleetManagers.length + 1];
        for (int i = 0; i < fleetManagers.length; i++) {
            newFleetManagers[i] = fleetManagers[i];
        }
        newFleetManagers[fleetManagers.length] = fleetManager;
        fleetManagers = newFleetManagers;
    }

    public FleetManager findManagerByName(String name) {
        for (FleetManager manager : fleetManagers) {
            if (manager.getName().equals(name)) {
                return manager;
            }
        }
        return null;
    }
}
