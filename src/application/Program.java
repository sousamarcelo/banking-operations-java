package application;

import java.util.Locale;
import java.util.Scanner;

import model.entities.Account;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter account data");
		 System.out.print("Number: ");
		 int number = sc.nextInt();			 
		 System.out.print("Name: ");
		 sc.nextLine();
		 String holder = sc.nextLine();
		 System.out.print("Initical balance: ");
		 double balance = sc.nextDouble();
		 System.out.print("Withdraw limit: ");
		 double withdrawLimit = sc.nextDouble();
		 Account account = new Account(number, holder, balance, withdrawLimit);
		 System.out.println();
		 System.out.print("Enter amount for withdraw: ");
		
		 try {			 
			 account.withdraw(sc.nextDouble());			 
			 System.out.println(account);
			
		} catch (Exception e) {
			System.out.println("Withdraw erro: " + e.getMessage());
		}		
		sc.close();
	}

}
