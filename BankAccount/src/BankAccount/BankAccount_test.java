package BankAccount;

public class BankAccount_test {

	public static void main(String[] args) {
		BankAccount cs=new BankAccount();
		cs.deposit(cs,100);
		System.out.println(cs.deposit(cs,100));
		System.out.println(cs.withdraw(cs, 50));
		System.out.println(cs.getCheckbalance(100));
		System.out.println(cs.getSavebalance(500));
		System.out.println(cs.);
	}

}
