package com.tnsif.Polymorphism;


class BankAccount {
	void calculateInterest(double amount) {
		System.out.println("Calculating standard bank account");
		System.out.println("Amount:"+amount);
	}
}

class SavingAccount extends BankAccount {
	@Override
	void calculateInterest(double amount) {
		double interest=amount*0.04;
		System.out.println("saving account");
		System.out.println("Interest:"+amount);
		System.out.println("Interest:"+interest);
	}
}
class FixedDeposit extends BankAccount {
	@Override
	void calculateInterest(double amount) {
		double interest=amount*0.07;
		System.out.println("Fixed Deposite");
		System.out.println("principal:"+amount);
		System.out.println("Interest:"+interest);
	}
}

class CurrentAccount extends BankAccount {
	@Override
	void calculateInterest(double amount) {
		System.out.println("Current Account");
		System.out.println("N0 Interest");
	}
}


public class MethodOverriding {
	public static void main(String[] args) {
		BankAccount a;
		a=new SavingAccount();
		a.calculateInterest(100000);
		System.out.println();
		a=new FixedDeposit();
		a.calculateInterest(100000);
		
		System.out.println();
		 
		a=new CurrentAccount();
		a.calculateInterest(1000000);
		
		
	}

}
