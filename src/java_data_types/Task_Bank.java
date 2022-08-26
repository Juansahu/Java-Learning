package java_data_types;

abstract class Bank {
	
	abstract int getBalance();
	
}
class BankA extends Bank{
	int depositA = 100;
	int getBalance() {
		return this.depositA;
	}
		
	}
	class BankB extends Bank{
		int depositB = 150;
		int getBalance() {
			return this.depositB;
		}
			
		}
		class BankC extends Bank{
			int depositC = 200;
			int getBalance() {
				return this.depositC;
				
			}
}

public class Task_Bank {
	public static void main(String[] args) {
		BankA a = new BankA();
		System.out.println("deposited in BankA: " +a.getBalance());
		BankB b = new BankB();
		System.out.println("deposited in BankB: "+b.getBalance());
		BankC c = new BankC();
		System.out.println("deposited in BankC: "+c.getBalance());
	}

}
