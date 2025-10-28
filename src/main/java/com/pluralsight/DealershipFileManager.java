package com.pluralsight;

import java.util.Scanner;

public class DealershipFileManager {
    private String dealership;

    public DealershipFileManager(String dealership) {
        this.dealership = dealership;
    }

    private String getDealership() {
        return this.dealership;

        Scanner scanner = new Scanner(System.in);

        while (int i = 0; i < 0;)
        System.out.println("Price must be above $0.00");

        Scanner.close();




    }

    public void setDealership(String dealership) {
        this.dealership = dealership;

    }
    public void saveDealership(String dealership) {

    }
}
