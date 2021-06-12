package BankAccount;
public class BankAccount {
	String Accnumber;
	double checkbalance;
	double savebalance;
	public static int numacc;
	public static double TA;
	public BankAccount() {
		print10(Accnumber);
		numacc++;
	}
	
	private String print10(String Accnumber) {
		int min=0;
		int max=10;
		for(int i=0;i<10;i++) {
		Accnumber+=	Math.floor(Math.random()*(max-min+1)+min);
		}
		return Accnumber;
		
	}
	public int numOfacc() {
		return numacc;
	}
	
	
	public double deposit(BankAccount x,int balance) {
		
		return x.TA+=balance;
		
	}
	public double withdraw(BankAccount x,int balance) {
		if(balance < x.TA) {
		return x.TA-=balance;}
		else {
			return 0;
		}
		
	}

	
	

	public String getAccnumber() {
		return Accnumber;
	}

	public void setAccnumber(String accnumber) {
		Accnumber = accnumber;
	}

	

	public double getCheckbalance(int balance ) {
		checkbalance+=balance;
		return checkbalance;
	}

	public double getSavebalance(int balance) {
		savebalance+=balance;
		return savebalance;
	}

	public void setSavebalance(double savebalance) {
		this.savebalance = savebalance;
	}

	public static int getNumacc() {
		return numacc;
	}

	public static void setNumacc(int numacc) {
		BankAccount.numacc = numacc;
	}

	public static double getTA() {
		return TA;
	}

	public static void setTA(double tA) {
		TA = tA;
	}

}
