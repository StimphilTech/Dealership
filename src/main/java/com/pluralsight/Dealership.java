package com.pluralsight;

import java.util.ArrayList;
import java.util.List;


public class Dealership {
    private String name;
    private String address;
    private String phone;
    private ArrayList<Vehicle> inventory;

    public Dealership(){
        this.inventory = new ArrayList<>();
    }

    public Dealership(String name, String address, String phone) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.inventory = new ArrayList<>();
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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public List<Vehicle> getVehiclesByPrice() {
        List<Vehicle> result = new ArrayList<>();

        for (Vehicle car : inventory) {
            double minPrice = 0;
            double maxPrice = 0;
            if (car.getPrice() >= minPrice && car.getPrice() <= maxPrice) {
                result.add(car);
            }
        } 
    
    return result;
    }
    public List<Vehicle> getVehicleByMakeModel(String make,String model) {
        return null;//temp
    }

    public List<Vehicle> getVehiclesByYear(int min, int max) {
        return null;//temporary

    }
    public List<Vehicle> getVehiclesByColor(String color) {
        return null;//temp
    }

    public List<Vehicle> getVehicleByMileage (int min,int max) {

        return null;//null
    }
    public List<Vehicle> getVehicleByType (String vehicleType) {
        return null; //temp

    }

    public List<Vehicle> getAllVehicles() {
        return inventory;//temp
    }

    public void addVehicle(Vehicle vehicle) {
        // code to add vehicle to list
        inventory.add(vehicle);
    }

    public void removeVehicle(ArrayList<Vehicle> inventory) {
        // code to remove vehicle from list
    }

    @Override
    public String toString() {
        return this.name + " " + this.address + " " + this.phone;
    }
}
