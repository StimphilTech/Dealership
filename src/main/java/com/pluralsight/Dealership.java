package com.pluralsight;

import java.util.ArrayList;

public class Dealership {
    private String name;
    private String address;
    private String phone;
    private ArrayList<Vehicle> inventory;

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

    public ArrayList<Vehicle> getInventory() {
        return inventory;
    }

    public void setInventory(ArrayList<Vehicle> inventory) {
        this.inventory = inventory;
    }

    //    public Dealership(ArrayList<Vehicle> inventory) {
//        this.inventory = inventory;
//
//
//    }
//
//    public Dealership(String name, String address, String phone) {
//        this.name = name;
//        this.address = address;
//        this.phone = phone;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//
//    public String getAddress() {
//        return address;
//    }
//
//    public String getPhone() {
//        return phone;
//    }
//
//    public ArrayList<Vehicle> getInventory() {
//        return inventory;
//    }
//
//       void getVehiclesByPrice() {
//
//
//    }


}
