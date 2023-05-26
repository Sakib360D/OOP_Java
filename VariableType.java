public class VariableType {

	public static void main(String[] args) {

		System.out.println("Per day transanction limit is: " + Account.perDayTransanctionLimit);

		Account a1 = new Account(1111, 200.0);
		Account a2 = new Account(1112, 250.0);

		a1.show();
		System.out.println(a1.perDayTransanctionLimit);
		a2.show();
		System.out.println(a2.perDayTransanctionLimit);

		Account.perDayTransanctionLimit = 1000.0;

		System.out.println("After changing perDayTransanction Limit: ");

		System.out.println(a1.perDayTransanctionLimit);
		System.out.println(a2.perDayTransanctionLimit);

		Account a3 = a2; // a3 is not going to create new memory

		System.out.println("Current balance of a2: " + a2.balance);

		a3.balance = 5000.0;

		System.out.println("After update a3 current balance of a2: " + a2.balance);
		System.out.println("After update a3 current balance of a3: " + a3.balance);

	}
}

class Account {

	int accountNo;
	double balance;
	static double perDayTransanctionLimit = 500;

	Account() {}

	Account(int aN, double b) {
		accountNo = aN;
		balance = b;
	}

	void addInterest(double rate) {
		balance  = balance + (balance * rate / 100);
	}

	void show() {
		System.out.println("AccountNo: " + accountNo);
		System.out.println("Balance: " + balance);
	}
}