package model;

public class Electric extends Car implements BatteryConsume{
	//-------------------------------------------------------
	//Constants
	//-------------------------------------------------------
	public final static String FAST = "fast";
	public final static String NORMAL = "normal";
	
	//-------------------------------------------------------
	//Atributes
	//-------------------------------------------------------
	private double batteryLife;
	private String typeCharger;
	private double batteryConsume;
	
	//-------------------------------------------------------
	//Methods
	//-------------------------------------------------------
	public Electric(double basePrice, String brand, String model, double displacement, int mileage, int new_use, String plate, int doorsNum, int type, int polarized, double batteryLife, int typeCharger){
		super(basePrice, brand, model, displacement, mileage, new_use, plate, doorsNum, type, polarized);
		this.batteryLife = batteryLife;
		this.typeCharger = assingTypeCharger(typeCharger);
		this.batteryConsume = assingBatteryConsume(displacement, batteryLife, this.typeCharger);
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
		if(typeCharger.equals(FAST)){ batteryConsume = (batteryLife+10)*(displacement/100);}
		else if(typeCharger.equals(NORMAL)){ batteryConsume = (batteryLife+15)*(displacement/100);}
		return batteryConsume;
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