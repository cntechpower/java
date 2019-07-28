package first;

public class VendingMachine {
	int price=80;
	int balance;
	int total;
	public VendingMachine() { //构造函数
		// TODO Auto-generated constructor stub
		System.out.println("Calling Constructor0");
	}
	public VendingMachine(int price) {
		this.price=price;
		System.out.println("Calling Constructor1");
	}

	void showPrompt() {
		System.out.println("Welcome To VendingMachine!");
	}

	void insertMoney(int amount) {
		balance = balance + amount;
	}
	
	void showBalance() {
		System.out.println(balance);
	}
	void getFood() {
		if(balance>=price) {
			System.out.println("Here You Are!");
			balance=balance-price;
		}else {
			System.out.println("No Enough Balance");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VendingMachine v1=new VendingMachine();
		v1.showPrompt();
		v1.showBalance(); //new VendingMachine() set balance=0
		v1.insertMoney(100);
		v1.showBalance();
		v1.getFood();
		v1.showBalance();
		VendingMachine v2=new VendingMachine(20);
		

	}

}
