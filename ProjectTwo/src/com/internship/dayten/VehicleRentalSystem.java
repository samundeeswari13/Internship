package com.internship.dayten;

import java.util.ArrayList;
import java.util.Scanner;

public class VehicleRentalSystem {
	private ArrayList<Vehicle>vehicles;
	private Scanner scanner;
	
	public VehicleRentalSystem() {
	    this.vehicles =new ArrayList<>();
		this.scanner = new Scanner(System.in);
	}
	
		    public void addVehicle(Vehicle vehicle) {
	        vehicles.add(vehicle);
	    }

	    public void displayVehicles() {
	        for (Vehicle vehicle : vehicles) {
	            System.out.println("Vehicle ID: " + vehicle.getVehicleId());
	            System.out.println("Brand: " + vehicle.getBrand());
	            System.out.println("Model: " + vehicle.getModel());
	            System.out.println("Rental Charge per Hour: " + vehicle.getRentalChargePerHour());
	            if (vehicle instanceof Car) {
	                System.out.println("Type: Car");
	            } else if (vehicle instanceof Bike) {
	                System.out.println("Type: Bike");
	            }
	            System.out.println();
	        }
	    }

	    public void rentVehicle() {
	        System.out.print("Enter vehicle ID: ");
	        String vehicleId = scanner.next();
	        System.out.print("Enter rental hours: ");
	        int hours = scanner.nextInt();

	        for (Vehicle vehicle : vehicles) {
	            if (vehicle.getVehicleId().equals(vehicleId)) {
	                double rentalCharge = vehicle.calculateRentalCharge(hours);
	                System.out.println("Rental Charge: " + rentalCharge);
	                return;
	            }
	        }

	        System.out.println("Vehicle not found.");
	    }

	    public void run() {
	        addVehicle(new Car("C001", "Toyota", "Camry", 50.0));
	        addVehicle(new Bike("B001", "Honda", "CBR500R", 20.0));

	        while (true) {
	            System.out.println("1. Display Vehicles");
	            System.out.println("2. Rent Vehicle");
	            System.out.println("3. Exit");
	            System.out.print("Choose an option: ");
	            int option = scanner.nextInt();

	            switch (option) {
	                case 1:
	                    displayVehicles();
	                    break;
	                case 2:
	                    rentVehicle();
	                    break;
	                case 3:
	                    System.exit(0);
	                    break;
	                default:
	                    System.out.println("Invalid option.");
	            }
	        }
	    }
}

	

