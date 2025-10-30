package com.pluralsight;

import java.util.Scanner;

public class UserInterface {

    private Dealership dealership;
    private DealershipFileManager dealershipFileManager = new DealershipFileManager();

    public UserInterface() {
        dealership = dealershipFileManager.getDealership();
    }
    public void Display() {

        Scanner scanner = new Scanner(System.in);
        int choice = 0;

        while (choice!= 99){
            System.out.println("===== Home Menu =====");
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

            int input = scanner.nextInt();
            switch(input) {
                case 1: processGetByPriceRequest();
                    //do the logic to find the car within a range
                    // write the logic in a separate method

                    break;

                case 2: processGetByMakeModelRequest();
                    break;

                case 3: processGetByYearRequest();
                    break;
                case 4: processGetByColorRequest();
                    break;

                case 5: processGetMileageRequest();
                    break;
                case 6: processGetVehicleTypeRequest();
                    break;

                case 7:
                    //list all vehicles
                    processGetAllVehiclesRequest();
                    break;
                case 8: processAddVehiclesRequest();
                    break;

                case 9: processRemoveVehicleRequest();
                    break;

                case 99: System.out.println("Exit The Application");
                    break;

                default:  System.out.println("Please select options 1-99");
                    break;

            }


        }
        scanner.close();
    }

    private void processGetByPriceRequest() {

        double price = 0;

        for(Vehicle car: dealership.getVehiclesByPrice()) {
            if(car.getPrice()== price){
                System.out.println(car);
            }

        }



    }
    public void processGetByMakeModelRequest() {


    }
    public void processGetByYearRequest() {

        System.out.println("What year are you interested in seeing?");
        //Scanner to capture that value
        //the scanner is going to give you a string
        //but the vehicle year in  int
        //Hint Integer.parse(String)

        int year = 0; //this will be = to the integer version of whatever year the user passes in

       for(Vehicle car: dealership.getAllVehicles()) {
           if (car.getYear() == year){
               System.out.println(car);
           }

       }


    }
    public void processGetByColorRequest() {


    }
    public void processGetMileageRequest() {


    }
    public void processGetVehicleTypeRequest() {


    }
    public void processGetAllVehiclesRequest() {


        System.out.println("Displaying All Vehicles in our Inventory");
        System.out.println("----------------------------------------");
        System.out.println(dealership);
        System.out.println(" ");

        for(Vehicle car: dealership.getAllVehicles()){
            System.out.println(car);
        }

    }
    public void processAddVehiclesRequest() {


    }
    public void processRemoveVehicleRequest() {

    }

}
