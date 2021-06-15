package Object_Master1;

public class Samurai extends Object_Master1 {
	int health=200;
	private static int count=0;
	public Samurai() {
		count++;
		
	}
	
	public  int  deathBlow(Object_Master1 x) {
		x.health=0;
	return this.health=	(int)(this.health- ((this.health)*0.5));
	
		
	}
	
	public int meditate() {
	return	this.health=	(int)(this.health+ ((this.health)*0.5));
		
		
		
		
	}
	public int HowMnay() {
		return count;
		
	}

}
