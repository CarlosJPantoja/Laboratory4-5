package model;

public class Vehicle{
	//-------------------------------------------------------
	//Atributes
	//-------------------------------------------------------
	private double basePrice;
	private double totalPrice;
	private String brand;
	private String model;
	private double displacement;
	private int mileage;
	private String new_use;
	private String plate;
	
	//-------------------------------------------------------
	//Relations
	//-------------------------------------------------------
	private Document[] documents;
	private Client owner;
	
	//-------------------------------------------------------
	//Methods
	//-------------------------------------------------------
	public Vehicle(double basePrice, String brand, String model, double displacement, int mileage, int new_use, String plate){
		this.basePrice = basePrice;
		this.totalPrice = basePrice;
		this.brand = brand;
		this.model = model;
		this.displacement = displacement;
		this.mileage = mileage;
		this.new_use = isNewOrUse(new_use);
		this.plate = plate;
		documents = new Document[2];
	}
	
	public String isNewOrUse(int new_use){
		String isNewOrUseCar = "";
		if(new_use==1){ isNewOrUseCar = "is new";}
		else if(new_use==2){ isNewOrUseCar = "is used";}
		else{ isNewOrUseCar = "Not especified";}
		return isNewOrUseCar;
	}
	
	public void setBasePrice(double basePrice){
		this.basePrice = basePrice;
	}
	
	public double getBasePrice(){
		return basePrice;
	}
	
	public void setTotalPrice(double totalPrice){
		this.totalPrice = totalPrice;
	}
	
	public double getTotalPrice(){
		return totalPrice;
	}
	
	public void setBrand(String brand){
		this.brand = brand;
	}
	
	public String getBrand(){
		return brand;
	}
	
	public void setModel(String model){
		this.model = model;
	}
	
	public String getModel(){
		return model;
	}
	
	public void setDisplacement(double displacement){
		this.displacement = displacement;
	}
	
	public double getDisplacement(){
		return displacement;
	}
	
	public void setMileage(int mileage){
		this.mileage = mileage;
	}
	
	public int getMileage(){
		return mileage;
	}
	
	public void setNew_use(String new_use){
		this.new_use = new_use;
	}
	
	public String getNew_use(){
		return new_use;
	}
	
	public void setPlate(String plate){
		this.plate = plate;
	}
	
	public String getPlace(){
		return plate;
	}
}