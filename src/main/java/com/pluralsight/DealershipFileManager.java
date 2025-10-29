package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class DealershipFileManager {


//    public DealershipFileManager(String dealership) {
//        this.dealership = dealership;
//    }

    //we can either create a new instance on the file managers class
    //or assign the dealership int the constructor


//    public DealershipFileManager(){
//        this.dealership = getDealership();
//    }

    public Dealership getDealership() {

        // User fileReader/BufferedReader to read the dealership.csv file to create our Dealership object
        Dealership dealership= new Dealership(); //creating an empty object

        try{
            FileReader fileReader = new FileReader("dealership.csv");
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line;

            while((line = bufferedReader.readLine()) != null){

                String[] parts = line.split("\\|");

                if(parts[0].equals("Car World")) {
                   // dealership = new Dealership(parts[0], parts[1], parts[2]); //adding the name, address and number to the dealership
                    dealership.setName(parts[0]);
                    dealership.setAddress(parts[1]);
                    dealership.setPhone(parts[2]);
                } else {
                    //populate the inventory with the vehicles in memory
                    //build our vehicle
                    Vehicle vehicle = new Vehicle(Integer.parseInt(parts[0]),Integer.parseInt(parts[1]),parts[2],parts[3],parts[4],parts[5],Integer.parseInt(parts[6]),Double.parseDouble(parts[7]));
                    dealership.addVehicle(vehicle);

                }
            }
            return dealership;

        }catch(Exception e){
            System.out.println(e.getLocalizedMessage()); //sqick print out in there is an error that is caught
        }

        return null;

//         (Scanner scanner = new Scanner(System.in)) {
//
//            while () System.out.println("Price must be above $0.00");
//
//            scanner.close();
//        }


    }

    public void setDealership(String dealership) {
       // this.dealership = dealership;

    }
    public void saveDealership(String dealership) {

    }
}
