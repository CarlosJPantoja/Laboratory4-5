package model;

public class Soat extends Document{
	//-------------------------------------------------------
	//Attributes
	//-------------------------------------------------------
	private double accidentCoverage;
	
	//-------------------------------------------------------
	//Methods
	//-------------------------------------------------------
	public Soat(double price, int year, int[][] imageCode, double accidentCoverage){
		super(price, year, imageCode);
		this.accidentCoverage = accidentCoverage;
		assingCode(imageCode);
	}
	
	public void assingCode(int[][] imageCode){
		String code = "";
		for(int i=0; i<imageCode.length; i++){
			code += imageCode[i][0];
		}
		for(int j=1; j<imageCode.length; j++){
			code += imageCode[imageCode.length-1][j];
		}
		super.setCode(code);
	}
	
	public void setAccidentCoverage(double accidentCoverage){
		this.accidentCoverage = accidentCoverage;
	}
	
	public double getAccidentCoverage(){
		return accidentCoverage;
	}
}