package Zoo1;
public class Mammals {
	public int energy;
	public Mammals() {
		this.energy=100;
		

	}
	public   int energyLevel() {
		int x=this.energy;
		return x;
	}
	
	public void displayEnergy() {
	
		System.out.println(energyLevel());
		System.out.println(this.energy);
	}
		
		
	

}
