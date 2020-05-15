package model;

public class Gasoline extends Car implements GasolineConsume{
	//-------------------------------------------------------
	//Atributes
	//-------------------------------------------------------
	private double tankCapacity;
	private double gasolineComsume;
	private String gasolineType;
	
	//-------------------------------------------------------
	//Methods
	//-------------------------------------------------------
	public Gasoline(double basePrice, String brand, String model, double displacement, int mileage, int new_use, String plate, int doorsNum, int type, int polarized, double tankCapacity, int gasolineType){
		super(basePrice, brand, model, displacement, mileage, new_use, plate, doorsNum, type, polarized);
		this.tankCapacity = tankCapacity;
		gasolineComsume = assingGasolineComsume(displacement, tankCapacity);
		this.gasolineType = assingGasolineType(gasolineType);
	}
	
	public double assingGasolineComsume(double displacement, double tankCapacity){
		double gasolineComsume = tankCapacity*(displacement/100);
		return gasolineComsume;
	}
	
	public String assingGasolineType(int gasolineType){
		String gasolineTypeCar = "";
		if(gasolineType==1){ gasolineTypeCar = "extra gasoline";}
		else if(gasolineType==2){ gasolineTypeCar = "ordinary gasoline";}
		else if(gasolineType==3){ gasolineTypeCar = "diesel gasoline";}
		else{ gasolineTypeCar = "Not especified";}
		return gasolineTypeCar;
	}
	
	public void setTankCapacity(double tankCapacity){
		this.tankCapacity = tankCapacity;
	}
	
	public double getTankCapacity(){
		return tankCapacity;
	}
	
	public void setGasolineConsume(double gasolineComsume){
		this.gasolineComsume = gasolineComsume;
	}
	
	public double getGasolineConsume(){
		return gasolineComsume;
	}
	
	public void setGasolineType(String gasolineType){
		this.gasolineType = gasolineType;
	}
	
	public String getGasolineType(){
		return gasolineType;
	}
}