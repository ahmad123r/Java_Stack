package Object_Master1;

public class Object_Master1_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Object_Master1 m=new Object_Master1();
		
		Ninja x= new Ninja();
//		System.out.println("the stealthin ninja : "+x.stealth); For the first assignment
//		System.out.println("the attack in ninja : "+m.attack(100, 10));
		
		Wizard km= new Wizard();
		Ninja kr=new Ninja();
		Samurai ki=new Samurai();
		Samurai kf=new Samurai();
		
		System.out.println("the heal in  wizard : "+km.heal(m));
		System.out.println("the fireball in wizard : "+km.fireball(m));
		System.out.println("the deathblow in samurai : "+ki.deathBlow(m));
		System.out.println("the health of human : "+m.health);
		System.out.println("the stealth in ninja : "+kr.steal(m));
		System.out.println("the runaway ninja : "+kr.runaway());
		System.out.println("the meditate in samurai : "+ki.meditate());
		System.out.println("the meditate in samurai2 : "+kf.meditate());
		System.out.println("how many samurai i have : "+kf.HowMnay());
		
		
		
		

	}

}
