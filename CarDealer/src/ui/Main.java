package ui;

import model.*;
import java.util.Scanner;
import java.io.IOException;

public class Main{
	//-------------------------------------------------------
	//Constants
	//-------------------------------------------------------
	public static Scanner lector = new Scanner(System.in);
	
	//-------------------------------------------------------
	//Relations
	//-------------------------------------------------------
	private Company concessionaire;
	
	//-------------------------------------------------------
	//Methods
	//-------------------------------------------------------
	public Main(String name, String nit){
		concessionaire = new Company(name, nit);
	}
	
	public static void main(String args[]){
		System.out.println("Welcome to the program \n\nTo continue, enter the name of the company:");
		String name = lector.nextLine();
		System.out.println("\nTo finish, enter the nit of the company:");
		String nit = lector.nextLine();
		Main controller = new Main(name, nit);
		cls(); controller.showMenu();
	}
	
	public void showMenu(){
		int option = 0; cls();
		do{
			System.out.println("Welcome to the options menu \n1: Add Car");
			option = lector.nextInt(); lector.nextLine();
			switch(option){
				case 1:
					addVehicle();
				break;
				
				default:
					System.out.println("\nThe option entered is not valid");
				break;
			}
			int bucle = 0, add = 0;
			do{
				if(add!=0){System.out.println("\nThe option entered is not valid, please try again");}
				System.out.println("\nChoose an option: \n0: Return to the menu\n1: End program execution");
				option = lector.nextInt(); lector.nextLine();
				if(option == 0){cls(); bucle=0;} else if(option == 1){cls(); bucle=0;} else{bucle=1; add++;}
			}while(bucle==1);
		} while(option == 0);
	}
	
	public void addVehicle(){
		String message = "";
		System.out.println("\nWhat type of vehicle do you want to add? \n1: Car \n2: Motorcycle");
		int vehicleType = lector.nextInt(); lector.nextLine();
		int carType = 0;
		if(vehicleType==1){
			System.out.println("\nWhat type of car do you want to add? \n1: Gasoline car \n2: Electric car \n3: Hybrid car");
			carType = lector.nextInt(); lector.nextLine();
		}
		if(vehicleType==2 | (vehicleType==1 && (carType==1 || (carType==2 || carType==3)))){
			System.out.println("\nEnter the vehicle's base price");
			double basePrice = lector.nextDouble(); lector.nextLine();
			System.out.println("\nEnter the vehicle's brand");
			String brand = lector.nextLine();
			System.out.println("\nEnter the vehicle's model");
			String model = lector.nextLine();
			System.out.println("\nEnter the vehicle's displacement");
			double displacement = lector.nextDouble(); lector.nextLine();
			System.out.println("\nEnter the vehicle's mileage");
			int mileage = lector.nextInt(); lector.nextLine();
			System.out.println("\nIs the vehicle new or used? \n1: New\n2: Used");
			int new_use = lector.nextInt(); lector.nextLine();
			System.out.println("\nEnter the vehicle's plate");
			String plate = lector.nextLine();
			switch(vehicleType){
				case 1:
					System.out.println("\nEnter the vehicle's doors number");
					int doorsNum = lector.nextInt(); lector.nextLine();
					System.out.println("\nEnter the vehicle's type \n1: Sedan \n2: Van");
					int type = lector.nextInt(); lector.nextLine();
					System.out.println("\nAre the windows of the vehicle polarized? \n1: Yes\n2: No");
					int polarized = lector.nextInt(); lector.nextLine();
					switch(carType){
						case 1:
							System.out.println("\nEnter the vehicle's tank capacity");
							double tankCapacity = lector.nextDouble(); lector.nextLine();
							System.out.println("\nWhat type of gasoline does the vehicle use? \n1: Extra gasoline \n2: Ordinary gasoline \n3: Diesel gasoline");
							int gasolineType = lector.nextInt(); lector.nextLine();
							message = concessionaire.addVehicle(basePrice, brand, model, displacement, mileage, new_use, plate, doorsNum, type, polarized, tankCapacity, gasolineType);
							System.out.println(message);
						break;
						
						case 2:
							System.out.println("\nEnter the vehicle's battery life");
							double batteryLife = lector.nextDouble(); lector.nextLine();
							System.out.println("\nWhat type of charger does the vehicle use? \n1: Fast charger \n2: Normal charger");
							int typeCharger = lector.nextInt(); lector.nextLine();
							message = concessionaire.addVehicleE(basePrice, brand, model, displacement, mileage, new_use, plate, doorsNum, type, polarized, batteryLife, typeCharger);
							System.out.println(message);
						break;
						
						case 3:
							System.out.println("\nEnter the vehicle's tank capacity");
							double tankCapacityH = lector.nextDouble(); lector.nextLine();
							System.out.println("\nWhat type of gasoline does the vehicle use? \n1: Extra gasoline \n2: Ordinary gasoline \n3: Diesel gasoline");
							int gasolineTypeH = lector.nextInt(); lector.nextLine();
							System.out.println("\nEnter the vehicle's battery life");
							double batteryLifeH = lector.nextDouble(); lector.nextLine();
							System.out.println("\nWhat type of charger does the vehicle use? \n1: Fast charger \n2: Normal charger");
							int typeChargerH = lector.nextInt(); lector.nextLine();
							message = concessionaire.addVehicle(basePrice, brand, model, displacement, mileage, new_use, plate, doorsNum, type, polarized, tankCapacityH, gasolineTypeH, batteryLifeH, typeChargerH);
							System.out.println(message);
						break;
					}
				break;
				
				case 2:
					System.out.println("\nEnter the vehicle's type \n1: Standar \2: Sport \n3: Scooter \n4: Cross");
					int typeM = lector.nextInt(); lector.nextLine();
					System.out.println("\nEnter the vehicle's tank capacity");
					double tankCapacityM = lector.nextDouble(); lector.nextLine();
					message = concessionaire.addVehicle(basePrice, brand, model, displacement, mileage, new_use, plate, typeM, tankCapacityM);
					System.out.println(message);
				break;
			}
		} else{ System.out.println("\nThe option entered is not valid");}
	}
	
	public void addClient(){
		System.out.println("\nEnter the client's name");
		String name = lector.nextLine();
		System.out.println("\nEnter the client's last name");
		String lastName = lector.nextLine();
		System.out.println("\nEnter the client's ID");
		String id = lector.nextLine();
		System.out.println("\nEnter the client's phone number");
		int phoneNumber = lector.nextInt(); lector.nextLine();
		System.out.println("\nEnter the client's email");
		String email = lector.nextLine();
		String message = concessionaire.addClient(name, lastName, id, phoneNumber, email);
		System.out.println(message);
	}
	
	public void addSeller(){
		System.out.println("\nEnter the client's name");
		String name = lector.nextLine();
		System.out.println("\nEnter the client's last name");
		String lastName = lector.nextLine();
		System.out.println("\nEnter the client's ID");
		String id = lector.nextLine();
		String message = concessionaire.addSeller(name, lastName, id);
		System.out.println(message);
	}
	
	//-------------------------------------------------------
	//Clean CMD
	//-------------------------------------------------------
	public static void cls(){
		try{ new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();}
		catch(Exception E){ System.out.println(E);}
	}
}