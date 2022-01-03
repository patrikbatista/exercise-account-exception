package application;

import java.util.Scanner;

import model.entites.Account;
import model.exceptions.DomainException;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("Enter account data");
			System.out.print("Number: ");
			Integer number = sc.nextInt();
			
			System.out.print("Holder: ");
			String holder = sc.next();
			
			System.out.print("Initial Balance: ");
			Double initBalance = sc.nextDouble();
			
			System.out.print("Withdraw limit: ");
			Double limit = sc.nextDouble();
			
			Account account = new Account(number, holder, initBalance, limit);
			
			System.out.print("Enter amount for deposit: ");
			Double amountDeposit = sc.nextDouble();
			account.deposit(amountDeposit);
			
			System.out.print("Enter amount for withdraw: ");
			Double amount = sc.nextDouble();
			account.withdraw(amount);
			
			System.out.println();
			
			System.out.println(account);
		} 
		catch (DomainException e) {
			System.out.println("Withdraw error: " + e.getMessage());
		}
//		catch (RuntimeException e) {
//			System.out.println("Unexpected error");
//		}
		
		
		
		sc.close();
		
	}

}
