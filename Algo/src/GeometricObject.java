//import java.util.*;
public class GeometricObject {
private String color;
private boolean filled;
private  java.util.Date dateCreated=new java.util.Date();
public GeometricObject() {
	color= "White";
	filled=false;
	
}

public GeometricObject(String color , boolean filled) {
	this.color=color;
	this.filled=filled;
	
}

public String getColor() {
	return color;
}

public void setColor(String color) {
	this.color = color;
}

public boolean isFilled() {
	return filled;
}

public void setFilled(boolean filled) {
	this.filled = filled;
}

public java.util.Date getDateCreated() {
	return dateCreated;
}

public void setDateCreated(java.util.Date dateCreated) {
	this.dateCreated = dateCreated;
}
public String toString() {
	String s= String.format("The color is %s ,"+"is the Geo filled: %b "+"This created _at: %s", color,filled,dateCreated);
	return s;
	
}


}
