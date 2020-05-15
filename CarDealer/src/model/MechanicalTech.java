package model;

public class MechanicalTech extends Document{
	//-------------------------------------------------------
	//Attributes
	//-------------------------------------------------------
	private double gasLevel;
	
	//-------------------------------------------------------
	//Methods
	//-------------------------------------------------------
	public MechanicalTech(double price, int year, int[][] imageCode, double gasLevel){
		super(price, year, imageCode);
		this.gasLevel = gasLevel;
		assingCode(imageCode);
	}
	
	public void assingCode(int[][] imageCode){
		String code = "";
		for(int j=0; j<imageCode.length; j++){
			code += imageCode[0][j];
		}
		for(int i=1; i<imageCode.length; i++){
			code += imageCode[i][imageCode.length-(i+1)];
		}
		for(int j=1; j<imageCode.length; j++){
			code += imageCode[imageCode.length-1][j];
		}
		super.setCode(code);
	}
	
	public void setGasLevel(double gasLevel){
		this.gasLevel = gasLevel;
	}
	
	public double getGasLevel(){
		return gasLevel;
	}
}