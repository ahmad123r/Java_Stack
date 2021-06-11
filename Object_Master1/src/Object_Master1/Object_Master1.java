package Object_Master1;
public class Object_Master1 {
	public int strength=3;
	public int stealth=3;
	public int intelligence=3;
	public int health=100;
	
	public void Object_Master1() {
		this.stealth=3;
		this.strength=3;
		this.intelligence=3;
		this.health=100;
	}
	public int attack(int health,int strength) {
	
	health=health-strength;
	if(health<=0) {
		System.out.println("You Are Done");
	}
		
		return health;
	}

	public int getStrength() {
		return strength;
	}

	public void setStrength(int strength) {
		this.strength = strength;
	}

	public int getStealth() {
		return stealth;
	}

	public void setStealth(int stealth) {
		this.stealth = stealth;
	}

	public int getIntelligence() {
		return intelligence;
	}

	public void setIntelligence(int intelligence) {
		this.intelligence = intelligence;
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}
	
	
	
}
