package com;

import java.util.Scanner;

public class Main_class {
public static void main(String[] args) {
	atmOperation op=new atmOperation();
	Scanner scn = new Scanner(System.in);
	int atmpin=123;
	
	System.out.println("Wellcome");
	
	System.out.println("Enter ATM pin");
	
	int pin=scn.nextInt();
	
	if(atmpin==pin) {
		while(true) {
			System.out.println("1. View Available Balance \n2. WithDraw Amount \n3. Deposite Amount \n4. To View Ministatement \n5. Exit" );
			
			System.out.println("Enter number ");
			int n=scn.nextInt();
			
			switch (n) {
			case 1: {
				op.viewBalance();
				break;
			}
			
			case 2: {
				System.out.println("Enter WithDrawAmount");
				double withdrawAmount=scn.nextDouble();
				op.withdrawAmount(withdrawAmount);
			
				break;
			}
			case 3: {
				System.out.println("Enter Deposite Amount");
				double depositeAmount=scn.nextDouble();
				op.depositeAmount(depositeAmount);
				break;
			}
			case 4:{
				op.miniStatement();
				break;
			}
			
			case 5:{
				System.out.println("Collect your  ATM card \nThank you for using ATM machin \nVisit again");
				System.exit(0);
			}
			default:{
				System.out.println("Please Enter Correct Choice");
			}
			
			}
			
		}
	}
	else {
		System.out.println("Incorrect pin");
	}
	
}
}
