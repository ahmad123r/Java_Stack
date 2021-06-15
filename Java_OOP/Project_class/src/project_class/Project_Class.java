package project_class;
public class Project_Class {
	String name;
	String desc;
	double intialCost;
	
	public double getIntialCost() {
		return intialCost;
	}
	public void setIntialCost(double intialCost) {
		this.intialCost = intialCost;
	}
	public Project_Class() {
		this.name="hola";
		this.desc="ya hala";
		this.intialCost=100;
		
	}
public Project_Class(String name) {
	this.name="ahmad";
	
		
	}

public Project_Class(String name,String desc) {
	this.name=name;
	this.desc=desc;
	
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getDesc() {
	return desc;
}
public void setDesc(String desc) {
	this.desc = desc;
}

public String elevatorPitch() {
	String k= Double.toString(intialCost);
	String s =name+"("+k+")"+":"+desc;
	return s;
}



}
