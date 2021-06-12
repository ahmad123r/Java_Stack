package Phone;
public class PhoneTest {

	public static void main(String[] args) {
		Galaxy x=new Galaxy("S9",99,"hi","Ring! Ring! Ring!");
		System.out.println( x.ring() );
		System.out.println(x.unlock());
		x.displayInfo();
		Iphone x1=new Iphone("X",99,"FR","tren tren trn trn rnr nr rnn");
		System.out.println( x1.ring() );
		System.out.println(x1.unlock());
		x1.displayInfo();
	}

}
