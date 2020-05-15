package model;

import ui.*;
import java.util.ArrayList;

public class Company{
	//-------------------------------------------------------
	//Constants
	//-------------------------------------------------------
	public final static int NUMSELLERS = 10;
	
	//-------------------------------------------------------
	//Atributes
	//-------------------------------------------------------
	private String name;
	private String nit;
	private double profits;
	private int sales;
	
	//-------------------------------------------------------
	//Relations
	//-------------------------------------------------------
	private Seller[] sellers;
	private ArrayList<Vehicle> catalogue;
	
	//-------------------------------------------------------
	//Methods
	//-------------------------------------------------------
	public Company(String name, String nit){
		this.name = name;
		this.nit = nit;
		profits = 0;
		sales = 0;
		sellers = new Seller[NUMSELLERS];
		catalogue = new ArrayList<Vehicle>();
	}
	
	public String addVehicle(double basePrice, String brand, String model, double displacement, int mileage, int new_use, String plate, int doorsNum, int type, int polarized, double tankCapacity, int gasolineType){
		Gasoline gasolineCar = new Gasoline(basePrice, brand, model, displacement, mileage, new_use, plate, doorsNum, type, polarized, tankCapacity, gasolineType);
		catalogue.add(gasolineCar);
		String message = "\nGasoline car added successfully";
		return message;
	}
	
	public String addVehicleE(double basePrice, String brand, String model, double displacement, int mileage, int new_use, String plate, int doorsNum, int type, int polarized, double batteryLife, int typeCharger){
		Electric electricCar = new Electric(basePrice, brand, model, displacement, mileage, new_use, plate, doorsNum, type, polarized, batteryLife, typeCharger);
		catalogue.add(electricCar);
		String message = "\nElectric car added successfully";
		return message;
	}
	
	public String addVehicle(double basePrice, String brand, String model, double displacement, int mileage, int new_use, String plate, int doorsNum, int type, int polarized, double tankCapacity, int gasolineType, double batteryLife, int typeCharger){
		Hybrid hybridCar = new Hybrid(basePrice, brand, model, displacement, mileage, new_use, plate, doorsNum, type, polarized, tankCapacity, gasolineType, batteryLife, typeCharger);
		catalogue.add(hybridCar);
		String message = "\nHybrid car added successfully";
		return message;
	}
	
	public String addVehicle(double basePrice, String brand, String model, double displacement, int mileage, int new_use, String plate, int type, double tankCapacity){
		Motorcycle motorcycleCar = new Motorcycle(basePrice, brand, model, displacement, mileage, new_use, plate, type, tankCapacity);
		catalogue.add(motorcycleCar);
		String message = "\nMotorcycle car added successfully";
		return message;
	}
	
	public String addClient(String name, String lastName, String id, int phoneNumber, String email){
		String message = "";
		return message;
	}
	
	public String addSeller(String name, String lastName, String id){
		String message = "";
		return message;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public String getName(){
		return name;
	}
	
	public void setNit(String nit){
		this.nit = nit;
	}
	
	public String getNit(){
		return nit;
	}
	
	public void setProfits(double profits){
		this.profits = profits;
	}
	
	public double getProfits(){
		return profits;
	}
	
	public void setSales(int sales){
		this.sales = sales;
	}
	
	public int getSales(){
		return sales;
	}
}