package model;

public class Seller extends Person{
	//-------------------------------------------------------
	//Constants
	//-------------------------------------------------------
	public final static int NUMCLIENTS = 5;
	
	//-------------------------------------------------------
	//Atributes
	//-------------------------------------------------------
	private int sales;
	
	//-------------------------------------------------------
	//Relations
	//-------------------------------------------------------
	private Client[] clients;
	
	//-------------------------------------------------------
	//Methods
	//-------------------------------------------------------
	public Seller(String name, String lastName, String id){
		super(name, lastName, id);
		sales = 0;
		clients = new Client[NUMCLIENTS];
	}
	
	public void setSales(int sales){
		this.sales = sales;
	}
	
	public int getSales(){
		return sales;
	}
}