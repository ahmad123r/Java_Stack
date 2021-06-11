package Object_Master1;

public class Ninja extends Object_Master1{
	int stealth=10;
	
	public int steal(Object_Master1 x) {
		this.stealth+=x.stealth;
		x.stealth-=this.stealth;
		return this.stealth;
		
	}
	public int runaway() {
	return	health-=10;}
	
	
	
}
