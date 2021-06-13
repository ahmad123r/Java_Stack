package Zoo1;

public class Bat extends Mammals{
 int energy=300;
public int fly() {
	System.out.println("the sound a bat taking off ");
	energy=energy-50;
	return energy;
	
}

public int eatHumans() {
	System.out.println("so- well, never mind, just");
	energy+=25;
	return energy;
	
}

public int attackTown() {
	System.out.println(" the sound of a town on fire ");
	energy-=100;
	return energy;
	
}
public void print() {
	System.out.println(energy);
}
}
