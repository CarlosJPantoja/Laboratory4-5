package model;

public class Document{
	//-------------------------------------------------------
	//Attributes
	//-------------------------------------------------------
	private double price;
	private int year;
	private int[][] imageCode;
	private String code;
	
	//-------------------------------------------------------
	//Methods
	//-------------------------------------------------------
	public Document(double price, int year, int[][] imageCode){
		this.price = price;
		this.year = year;
		this.imageCode = imageCode;
	}
	
	public void setPrice(double price){
		this.price = price;
	}
	
	public double getPrice(){
		return price;
	}
	
	public void setYear(int year){
		this.year = year;
	}
	
	public int getYear(){
		return year;
	}
	
	public void setImageCode(int[][] imageCode){
		this.imageCode = imageCode;
	}
	
	public int[][] getImageCode(){
		return imageCode;
	}
	
	public void setCode(String code){
		this.code = code;
	}
	
	public String getCode(){
		return code;
	}
}