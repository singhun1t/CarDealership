package com.pluralsight;



import java.io.BufferedReader;

import java.io.FileReader;
import java.io.IOException;

public class DealershipFileManager {
    String file = "dealership.csv";


    public Dealership getDealership() {
        String line;
        Dealership dealership = null;
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            while ((line = bufferedReader.readLine()) != null) {
                String [] parts = line.split("\\|");
                if(parts.length ==3){
                    String businessName = parts[0];
                    String address = parts[1];
                    String phoneNumber = parts[2];
                    Dealership dealershipInfo = new Dealership(businessName,address,phoneNumber);
                } else if (parts.length ==8){
                    int vin = Integer.parseInt(parts[0]);
                    int year = Integer.parseInt(parts[1]);
                    String make = parts[2];
                    String model = parts[3];
                    String vehicleType = parts[4];
                    String color = parts[5];
                    int odometer = Integer.parseInt(parts[6]);
                    double price = Double.parseDouble(parts[7]);
                    Vehicle vehicleInfo = new Vehicle(vin,year,make,model,vehicleType,color,odometer,price);
                    dealership.addVehicle(vehicleInfo);
                }
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return dealership;
    }
    public void saveDealership(){

    }
}

