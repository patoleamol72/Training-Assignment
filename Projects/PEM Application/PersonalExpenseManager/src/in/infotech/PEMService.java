package in.infotech;

import java.io.IOException;
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
				onAddCategory();
				pressAnyKeyToContine();
				break;
			case 2:
				onCategoryList();
				pressAnyKeyToContine();
				break;
			case 3:
				onExpenseEntry();
				pressAnyKeyToContine();
				break;
			case 4:
				onExpenseList();
				pressAnyKeyToContine();
				break;
			case 5:
				onMonthlyExpenseList();
				pressAnyKeyToContine();
				break;
			case 6:
				onYearlyExpenseList();
				pressAnyKeyToContine();
				break;
			case 7:
				onCategorizedExpenseList();
				pressAnyKeyToContine();
				break;
			case 0:
				onExit();
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
	public void pressAnyKeyToContine(){
		System.out.println("Press any key to continue....");
		try {
			System.in.read();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	private void onAddCategory() {
		System.out.println("Adding category....");
		// TODO Auto-generated method stub
		
	}

	private void onCategoryList() {
		System.out.println("Listing categories...");
		// TODO Auto-generated method stub
		
	}

	private void onExpenseEntry() {
		System.out.println("Expense Entry.....");
		// TODO Auto-generated method stub
		
	}

	private void onExpenseList() {
		System.out.println("Expense list.......");
		// TODO Auto-generated method stub
		
	}

	private void onMonthlyExpenseList() {
		System.out.println("Monthly Expense Listing..");
		// TODO Auto-generated method stub
		
	}

	private void onYearlyExpenseList() {
		System.out.println("Yearly Expense Listing..");
		// TODO Auto-generated method stub
		
	}

	private void onCategorizedExpenseList() {
		System.out.println("Category wise Expense Listing..");
		// TODO Auto-generated method stub
		
	}

	private void onExit() {
		System.exit(0);
		// TODO Auto-generated method stub
		
	}

	
	
}
