package Zoo1;

public class Gorilla extends Mammals {
	public int throwSomething() {
		System.out.println("The Gorilla Throws somthing");
		energy=energy-5;
		System.out.println(energy);
		return energy;
		
		
	}
	
	public int eatBananas() {
		System.out.println("i am Stisfaed");
		energy=energy+10;
		System.out.println(energy);
		return energy;
		
	}
	public int climb() {
		System.out.println("gorilla has climbed a tree");
		energy=energy-10;
		System.out.println(energy);
		return energy;
	}
	

}
