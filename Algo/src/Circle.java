import java.lang.*;
import java.util.*;
public class Circle extends GeometricObject {
private double rad=5;
public Circle() {
	
}
public Circle(double rad) {
	super();
	this.rad = rad;
}

public Circle(double rad , String color, boolean filled ) {
	super(color,filled);
	
	
}
public double getRad() {
	return rad;
}
public void setRad(double rad) {
	this.rad = rad;
}
public double getarea() {
	return rad*rad*2*Math.PI;
}
public double getDia() {
	return rad*2;
}
public double getpra() {
	return 0.5*rad*Math.PI;
}
@Override
public String toString() {
	return "Circle [rad=" + rad + ", getRad()=" + getRad() + ", getarea()=" + getarea() + ", getDia()=" + getDia()
			+ ", getpra()=" + getpra() + ", getColor()=" + getColor() + ", isFilled()=" + isFilled()
			+ ", getDateCreated()=" + getDateCreated() + ", toString()=" + super.toString() + ", getClass()="
			+ getClass() + ", hashCode()=" + hashCode() + "]";
}

//public void printc() {
////	String s= String.format("the raduis is %lf "+"the area is %lf "+"The diameterer is %lf "+"The parameter is %lf "+"the color is : %s "+"is the Geo filled: %b "+"This created _at: %s",rad,getarea(),getDia(),getpra(),getColor(),isFilled(),getDateCreated() );
//	String s= String.format(getColor());
//System.out.println(s);
//}



}
