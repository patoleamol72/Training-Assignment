package in.infotech;

import java.util.Scanner;

/**
 * 
 * 
 * @author Amol Patole
 */

public class PEMService {
	private Scanner sc=new Scanner(System.in);
	private int choice;
	
	public void showMenu(){
		while(true){
			printMenu();
			switch(choice){
			case 1:
				//Add category
				System.out.println("Add category");
				break;
			case 0:
				System.exit(0);
				break;
				
			}
		}
	}

	public void printMenu(){
		System.out.println("-----PEM Menu------");
		System.out.println("1. Add category");
		System.out.println("2.Category List");
		System.out.println("3.Expense Entry");
		System.out.println("4.Expense List");
		System.out.println("5.Monthly Expense List");
		System.out.println("6.Yearly Expense List");
		System.out.println("7.Categorized Expense List");
		System.out.println("0.Exit");
		System.out.println("-------------------");
		System.out.print("Enter your choice");
		choice = sc.nextInt();
	}
}
