package model;

public abstract class Person{
	//-------------------------------------------------------
	//Atributes
	//-------------------------------------------------------
	private String name;
	private String lastName;
	private String id;
	
	//-------------------------------------------------------
	//Methods
	//-------------------------------------------------------
	public Person(String name, String lastName, String id){
		this.name = name;
		this.lastName = lastName;
		this.id = id;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public String getName(){
		return name;
	}
	
	public void setLastName(String lastName){
		this.lastName = lastName;
	}
	
	public String getLastName(){
		return lastName;
	}
	
	public void setId(String id){
		this.id = id;
	}
	
	public String getid(){
		return id;
	}
}