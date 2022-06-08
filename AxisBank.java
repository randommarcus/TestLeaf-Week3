package week3.day1;

public class AxisBank extends BankInfo {

	public static void main(String[] args) {
		
		AxisBank ab = new AxisBank();
		
		ab.saving();
		ab.fixed();
		ab.deposit(); //Overriding
		
		BankInfo bi = new BankInfo();
		
		bi.deposit();

	}
	
	public void deposit() {
		System.out.println("AxisBank Deposit Method");
	}

}
