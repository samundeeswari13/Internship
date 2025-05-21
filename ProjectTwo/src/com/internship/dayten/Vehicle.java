package com.internship.dayten;

public abstract class Vehicle implements VehicleRental {
	private String vehicleId;
	private String brand;
	private String model;
	private double rentalChargePerHour;
	public Vehicle(String vehicleId, String brand, String model, double rentalChargePerHour) {
		
		this.vehicleId = vehicleId;
		this.brand = brand;
		this.model = model;
		this.rentalChargePerHour = rentalChargePerHour;
	}
	public String getVehicleId() {
		return vehicleId;
	}
	public String getBrand() {
		return brand;
	}
	public String getModel() {
		return model;
	}
	public double getRentalChargePerHour() {
		return rentalChargePerHour;
	}
	public double calculateRentalCharge(int hours) {
		// TODO Auto-generated method stub
		return hours*rentalChargePerHour;
	}
			
}
