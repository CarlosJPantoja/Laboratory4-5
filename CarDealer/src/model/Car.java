package model;

public class Car extends Vehicle{
	//-------------------------------------------------------
	//Atributes
	//-------------------------------------------------------
	private int doorsNum;
	private String type;
	private String polarized;
	
	//-------------------------------------------------------
	//Methods
	//-------------------------------------------------------
	public Car(double basePrice, String brand, String model, double displacement, int mileage, int new_use, String plate, int doorsNum, int type, int polarized){
		super(basePrice, brand, model, displacement, mileage, new_use, plate);
		this.doorsNum = doorsNum;
		this.type = assingType(type);
		this.polarized = assingPolarized(polarized);
	}
	
	public String assingType(int type){
		String typeCar = "";
		if(type==1){ typeCar = "Sedan";}
		else if(type==2){ typeCar = "Van";}
		else{ typeCar = "Not especified";}
		return typeCar;
	}
	
	public String assingPolarized(int polarized){
		String polarizedCar = "";
		if(polarized==1){ polarizedCar = "is polarized";}
		else if(polarized==2){ polarizedCar = "is not polarized";}
		else{ polarizedCar = "Not especified";}
		return polarizedCar;
	}
	
	public void setDoorsNum(int doorsNum){
		this.doorsNum = doorsNum;
	}
	
	public int getDoorsNum(){
		return doorsNum;
	}
	
	public void setType(String type){
		this.type = type;
	}
	
	public String getType(){
		return type;
	}
	
	public void setPolarized(String polarized){
		this.polarized = polarized;
	}
	
	public String getPolarized(){
		return polarized;
	}
}