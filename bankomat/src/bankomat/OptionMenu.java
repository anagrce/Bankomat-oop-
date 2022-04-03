package bankomat;
/*main class*/

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Map.Entry;

public class OptionMenu extends Account{
	Scanner menuInput = new Scanner(System.in);
	DecimalFormat moneyFormat = new DecimalFormat("'$'###,##0.00");
	
	HashMap<Integer, Integer> data = new HashMap<Integer, Integer>();
	
	
	public void getLogin() throws IOException {
		int x = 1;
		
		do {
			try {
				
				data.put(9876543,9876);
				data.put(1234567, 1234);
				
				System.out.println("Dobrodosli u bankomat aplikaciju!");
				
				System.out.println("Unesite svoj korisnicki broj: ");
				setCustomerNumber(menuInput.nextInt());
				
				System.out.println("Unesite pin: ");
				setPinNumber(menuInput.nextInt());
				
			} catch(Exception e ) {
				System.out.println("\n" + "Invalid character(s). Only numbers. " +"\n");
				x=2;
			}
			for (Entry<Integer, Integer>entry:data.entrySet()) {
				if(entry.getKey()== getCustomerNumber() && entry.getValue()== getPinNumber());
				getAccountType();
			} 
		
		System.out.println("\n" +"Pogresan korisnicki broj ili pin. " + "\n");
		
	}  while (x == 1);
}

	
	public void getAccountType() {
		System.out.println("Izaberite racun kojem zelite da pristupite: ");
		System.out.println("Tip 1- Tekuci racun");
		System.out.println("Tip 2- Saving Account");
		System.out.println("Tip 3- Exit");
		System.out.println("Choice: ");
		
		int selection = menuInput.nextInt();
		
		switch ( selection ) {
		case 1:
			getChecking();
			break;
			
		case 2:
			getSaving();
			break;
		case 3:
			System.out.println("Thank you for using this ATM, bye.");
			break;
		default:
			System.out.println("\n" + "Invalid Choice. " + "\n");
			getAccountType();
	
	
	}

}
	public void getChecking() {
		System.out.println("Checking Account: ");
		System.out.println("Tip 1 - View Balance");
		System.out.println("Tip 2 - Withdraw Funds");
		System.out.println("Tip 3 - Deposit Funds");
		System.out.println("Tip 4 - Exit");
		System.out.println("Choice: ");
		
		int selection = menuInput.nextInt();
		 
		switch (selection) {
		case 1:
			System.out.println("Checking Account Balance: " +moneyFormat.format(getCheckingBalance()));
			getAccountType();
			break;
			
		case 2:
			getCheckingWithdrawInput();
			getAccountType();
			break;
			
		case 3:
			getCheckingDepositInput();
			getAccountType();
			break;
			
		case 4:
			System.out.println("Thank you for using this ATM, bye.");
			break;
			
		default:
			System.out.println("\n" + "Invalid choice. " + "\n");
			getChecking();
		}
	}
	
	public void getSaving() {
		
		System.out.println("Saving Account: ");
		System.out.println("Tip 1 - View Balance");
		System.out.println("Tip 2 - Withdraw Funds");
		System.out.println("Tip 3 - Deposit Funds");
		System.out.println("Tip 4 - Exit");
		System.out.println("Choice: ");
		
		int selection = menuInput.nextInt();
		 
		switch (selection) {
		case 1:
			System.out.println("Saving Account Balance: " +moneyFormat.format(getSavingBalance()));
			getAccountType();
			break;
			
		case 2:
			getSavingWithdrawInput();
			getAccountType();
			break;
			
		case 3:
			getSavingDepositInput();
			getAccountType();
			break;
			
		case 4:
			System.out.println("Thank you for using this ATM, bye.");
			break;
			
		default:
			System.out.println("\n" + "Invalid choice. " + "\n");
			getSaving();
		}
		
	}
	}


