package model;

import java.util.ArrayList;

public class Client extends Person{
	//-------------------------------------------------------
	//Atributes
	//-------------------------------------------------------
	private int phoneNumber;
	private String email;
	
	//-------------------------------------------------------
	//Relations
	//-------------------------------------------------------
	private ArrayList<Vehicle> interests;
	
	//-------------------------------------------------------
	//Methods
	//-------------------------------------------------------
	public Client(String name, String lastName, String id, int phoneNumber, String email){
		super(name, lastName, id);
		this.phoneNumber = phoneNumber;
		this.email = email;
		interests = new ArrayList<Vehicle>();
	}
	
	public void setPhoneNumber(int phoneNumber){
		this.phoneNumber = phoneNumber;
	}
	
	public int gerPhoneNumber(){
		return phoneNumber;
	}
	
	public void setEmail(String email){
		this.email = email;
	}
	
	public String getEmail(){
		return email;
	}
}