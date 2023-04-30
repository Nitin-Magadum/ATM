package com;

import java.util.HashMap;
import java.util.Map;

public class atmOperation implements atmOperationInterface {

	ATM atm=new ATM();
	HashMap<Double,String> ministate=new HashMap();
	
	@Override
	public void viewBalance() {
		System.out.println("Balance amount is "+atm.getBalance());
	}
	@Override
	public void withdrawAmount(double withdrawAmount) {
		if(withdrawAmount%100==0) {
			if(withdrawAmount<=atm.getBalance()) {
				ministate.put(withdrawAmount, "WithdrawAmount");
				System.out.println("Collect Cash "+withdrawAmount);
				atm.setBalance(atm.getBalance()-withdrawAmount);
				viewBalance();
			}
			else {
				System.out.println("insuficient balance !!!");
			}
		}
	}
	@Override
	public void depositeAmount(double depositeAmount) {
		if(depositeAmount>0) {
		ministate.put(depositeAmount, "DepositeAmount");
		System.out.println("amount is successful deposite "+ depositeAmount);
		atm.setBalance(depositeAmount+atm.getBalance());
		viewBalance();
		}
		else {
			System.out.println("Error");
	}
	}
	
	
	@Override
	public void miniStatement() {
		for(Map.Entry<Double, String> m:ministate.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
		}
	}
}
