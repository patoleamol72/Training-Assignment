package in.infotech;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

/**
 * 
 * 
 * @author Amol Patole
 */

public class PEMService {
	Repository repo = Repository.getRepository();
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
		sc.nextLine();//new line char is read here which is already present
		System.out.print("Enter Category Name:");
		String catName = sc.nextLine();
		Category cat = new Category(catName);
		repo.catList.add(cat);
		System.out.println("Success: Category added");
	}

	private void onCategoryList() {
		System.out.println("Category List");
		List<Category> clist=repo.catList;
		for(int i =0;i<repo.catList.size();i++){
			Category c = clist.get(i);
			System.out.println((i+1)+". "+c.getName()+", "+c.getCategoryId());
		}
	}

	private void onExpenseEntry() {
		System.out.println("Enter Details for Expense Entry.....");
		onCategoryList();
		System.out.print("Choose category:");
		int catChoice=sc.nextInt();
		Category selectedCat= repo.catList.get(catChoice-1);
		
		System.out.print("Enter Amount : ");
		float amount = sc.nextFloat();
		
		System.out.print("Enter remark : ");
		sc.nextLine();
		String remark =sc.nextLine();
		
		System.out.print("Enter Date (DD/MM/YYYY): ");
		String dateAsString = sc.nextLine();
		
		Date date = DateUtil.stringToDate(dateAsString);
		

		
		Expense exp = new Expense();
		exp.setCategoryId(selectedCat.getCategoryId());
		exp.setAmount(amount);
		exp.setRemark(remark);
		exp.setDate(date);

		repo.expList.add(exp);
		System.out.println("Success : Expense Added...");
	}

	private void onExpenseList() {
		System.out.println("Expense list.......");
		List<Expense> expList= repo.expList;
		for(int i=0;i<expList.size();i++){
			Expense exp = expList.get(i);
			String catName = getCategoryNameById(exp.getCategoryId());
			String dateString = DateUtil.dateToString(exp.getDate());
			System.out.println((i+1)+". "+catName+", "+exp.getAmount()+", "+exp.getRemark()+", "+dateString);
		}
		
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

	String getCategoryNameById(Long categoryId){
		for(Category c: repo.catList){
			if(c.getCategoryId().equals(categoryId)){
				return c.getName();
			}
		}
		return null;//category id  not found
	}
	
}
