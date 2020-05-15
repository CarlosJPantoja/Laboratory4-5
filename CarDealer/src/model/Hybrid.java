package model;

public class Hybrid extends Car implements GasolineConsume, BatteryConsume{
	//-------------------------------------------------------
	//Constants
	//-------------------------------------------------------
	public final static String FAST = "fast";
	public final static String NORMAL = "normal";
	
	//-------------------------------------------------------
	//Atributes
	//-------------------------------------------------------
	private double tankCapacity;
	private double gasolineComsume;
	private String gasolineType;
	private double batteryLife;
	private String typeCharger;
	private double batteryConsume;
	
	//-------------------------------------------------------
	//Methods
	//-------------------------------------------------------
	public Hybrid(double basePrice, String brand, String model, double displacement, int mileage, int new_use, String plate, int doorsNum, int type, int polarized, double tankCapacity, int gasolineType, double batteryLife, int typeCharger){
		super(basePrice, brand, model, displacement, mileage, new_use, plate, doorsNum, type, polarized);
		this.tankCapacity = tankCapacity;
		this.gasolineComsume = assingGasolineComsume(displacement, tankCapacity);
		this.gasolineType = assingGasolineType(gasolineType);
		this.batteryLife = batteryLife;
		this.typeCharger = assingTypeCharger(typeCharger);
		this.batteryConsume = assingBatteryConsume(displacement, batteryLife, this.typeCharger);
	}
	
	public double assingGasolineComsume(double displacement, double tankCapacity){
		double gasolineComsume = tankCapacity*(displacement/110);
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
	
	public String assingTypeCharger(int typeCharger){
		String typeChargerCar = "";
		if(typeCharger==1){ typeChargerCar = FAST;}
		else if(typeCharger==2){ typeChargerCar = NORMAL;}
		else{ typeChargerCar = "Not especified";}
		return typeChargerCar;
	}
	
	public double assingBatteryConsume(double displacement, double batteryLife, String typeCharger){
		double batteryConsume = -1;
		if(typeCharger.equals(FAST)){ batteryConsume = batteryLife*(displacement/100);}
		else if(typeCharger.equals(NORMAL)){ batteryConsume = (batteryLife+5)*(displacement/100);}
		return batteryConsume;
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
	
	public void setBatteryLife(double batteryLife){
		this.batteryLife = batteryLife;
	}
	
	public double getBatteryLife(){
		return batteryLife;
	}
	
	public void setTypeCharger(String typeCharger){
		this.typeCharger = typeCharger;
	}
	
	public String getTypeCharger(){
		return typeCharger;
	}
	
	public void setBatteryConsume(double batteryConsume){
		this.batteryConsume = batteryConsume;
	}
	
	public double getBatteryConsume(){
		return batteryConsume;
	}
}