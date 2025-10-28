package com.pluralsight;

import java.util.Scanner;

public class UserInterface {

    private Dealership dealership;

    public UserInterface() {
    }
    public void Display() {

        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        while (choice!= 99){
            System.out.println("1)Find vehicles within a price range");
            System.out.println("2)Find vehicles by make / model");
            System.out.println("3)Find vehicles by year range");
            System.out.println("4)Find vehicles by color");
            System.out.println("5)Find vehicles by mileage range");
            System.out.println("6)Find vehicles by type (car, truck, SUV, van) ");
            System.out.println("7)List ALL vehicles");
            System.out.println("8)Add a vehicle");
            System.out.println("9)Remove a vehicle ");
            System.out.println("99)Quit");

        }
    }

    public String processGetByPriceRequest() {
        return "";
    }
    public String processGetByMakeModelRequest() {

        return "";
    }
    public String processGetByYearRequest() {

        return "";
    }
    public String processGetByColorRequest() {

        return "";
    }
    public String processGetMileageRequest() {

        return "";
    }
    public String processGetVehicleTypeRequest() {

        return "";
    }
    public String processGetAllVehiclesRequest() {

        return "";
    }
    public String processAddVehiclesRequest() {

        return "";
    }
    public String processRemoveVehicleRequest() {

        return "";
    }

}
