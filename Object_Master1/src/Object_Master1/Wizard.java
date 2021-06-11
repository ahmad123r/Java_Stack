package Object_Master1;

public class Wizard extends Object_Master1 {
	int strength=3;
    int stealth=3;
	 int intelligence=8;
	 int health=50;
	 
	 public int heal(Object_Master1 x) {
			
			x.health=x.health+this.intelligence;
			return x.health;
		}
	 public int fireball(Object_Master1 x) {
		 x.health=x.health-(this.intelligence*3);
			return x.health;
		 
	 }


}
