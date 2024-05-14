package com.pluralsight;

import java.util.ArrayList;
import java.util.Scanner;

public class UserInterface {
    Dealership dealership;


    private void init(){
        DealershipFileManager loader = new DealershipFileManager();
        this.dealership = loader.getDealership();
    }

    private void displayVehicles(ArrayList<Vehicle> vehiclesToDisplay){
        if(vehiclesToDisplay.isEmpty()){
            System.out.println("No vehicles found");
            return;
        }
        System.out.printf("%-15s %-15s %-20s %-20s %-15s %-17s %-13s %-15s %s\n",
                "VIN", "Year", "Make", "Model", "Type", "Color", "Mileage", "Price", "Dealership");
            for (Vehicle vehicle : vehiclesToDisplay){
                System.out.printf("%-15d %-15d %-20s %-15s %-17s %-13s %-15d %-15d %s\n", vehicle.getVin(),vehicle.getYear(),
                        vehicle.getMake(), vehicle.getModel(),vehicle.getVehicleType(), vehicle.getColor(), vehicle.getOdometer(),
                        vehicle.getPrice(), dealership.getName());
            }
    }
    public void display(){
        Scanner scanner  = new Scanner(System.in);
        init();
        boolean running = true;
        int choice = -1;
        while(running){
            System.out.println("Welcome to the dealership");
            System.out.println("1. Search by Price");
            System.out.println("2. Search by Model");
            System.out.println("3. Search by year of vehicle");
            System.out.println("4. Search by Color");
            System.out.println("5. Search by Mileage");
            System.out.println("6. Search by Vehicle Type");
            System.out.println("7. Get all Vehicles");
            System.out.println("8. Add vehicles");
            System.out.println("9. Remove vehicle");
            System.out.println("10. View Cart/Checkout");
            System.out.println("11. Quit");

            choice = scanner.nextInt();

            switch(choice){
                case 1:
                    processGetByPriceRequest();
                    break;
                case 2:
                    processGetByMakeModelRequest();
                    break;
                case 3:
                    processGetByYearRequest();
                    break;
                case 4:
                    processGetByColorRequest();
                    break;
                case 5:
                    processGetByMileageRequest();
                    break;
                case 6:
                    processGetByVehicleTypeRequest();
                    break;
                case 7:
                    processGetAllVehiclesRequest();
                    break;
                case 8:
                    processAddVehicleRequest();
                    break;
                case 9:
                    processRemoveVehicleRequest();
                    break;
                case 10:
                    //to be finished
                    break;
                case 11:
                    running = false;
                    break;
            }
        }
    }
    public void processGetByPriceRequest(){

    }
    public void processGetByMakeModelRequest(){

    }
    public void processGetByYearRequest(){

    }
    public void processGetByColorRequest(){

    }
    public void processGetByMileageRequest(){

    }
    public void processGetByVehicleTypeRequest(){

    }
    public void processGetAllVehiclesRequest(){

    }
    public void processAddVehicleRequest(){

    }
    public void processRemoveVehicleRequest(){

    }
    public void processAllVehiclesRequest(){
        ArrayList<Vehicle> allVehicles = dealership.getAllVehicles();
        displayVehicles(allVehicles);
    }
}
