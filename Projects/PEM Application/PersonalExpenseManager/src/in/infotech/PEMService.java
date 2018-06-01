package in.infotech;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/**
 * 
 * 
 * @author Amol Patole
 */

public class PEMService {
	Repository repo = Repository.getRepository();
	PEMReportService reportService = new PEMReportService();
	
	private Scanner sc=new Scanner(System.in);
	private int choice;
	
	public PEMService(){
		prepareSampleData();
	}
	
	

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
		System.out.println("Monthly Expense Total..");
		Map<String,Float> resultMap = reportService.calculateMonthlyTotal();
		Set<String> keys = resultMap.keySet();
		for(String yearMonth : keys){
			String[] arr = yearMonth.split(",");
			String year =arr[0];
			Integer monthNo =new Integer(arr[1]);
			String monthName = DateUtil.getMonthName(monthNo);
			System.out.println(year+" , "+monthName+", "+resultMap.get(yearMonth));
		}
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
	
	private void prepareSampleData() {
		Category catParty = new Category("Party");
		delay();
		Category catShopping = new Category("Shopping");
		delay();
		Category catGift = new Category("Gift");
		delay();
		
		repo.catList.add(catParty);
		repo.catList.add(catShopping);
		repo.catList.add(catGift);
		
		//Mar -18
		Expense e1 = new Expense(catParty.getCategoryId(), 2000.0F,DateUtil.stringToDate("23/03/2018"),"Party with Friends");
		delay();
		Expense e2 = new Expense(catParty.getCategoryId(), 2000.0F,DateUtil.stringToDate("25/03/2018"),"Party");
		delay();
		//Apr - 18
		Expense e3 = new Expense(catShopping.getCategoryId(), 200.0F,DateUtil.stringToDate("22/04/2018"),"Friends");
		delay();
		Expense e4 = new Expense(catParty.getCategoryId(), 6000.0F,DateUtil.stringToDate("28/04/2018"),"Shopping");
		delay();
		//may-18
		Expense e5 = new Expense(catGift.getCategoryId(), 4000.0F,DateUtil.stringToDate("18/05/2018"),"Gift");
		delay();
		Expense e6 = new Expense(catParty.getCategoryId(), 1000.0F,DateUtil.stringToDate("12/05/2018"),"Party");
		delay();
		Expense e7 = new Expense(catGift.getCategoryId(), 4000.0F,DateUtil.stringToDate("18/05/2018"),"Gift");
	
		Expense e8 = new Expense(catParty.getCategoryId(), 1000.0F,DateUtil.stringToDate("12/05/2018"),"Party");
		
		Expense e9 = new Expense(catParty.getCategoryId(), 1000.0F,DateUtil.stringToDate("12/05/2014"),"Party");
		
		repo.expList.add(e1);
		repo.expList.add(e2);
		repo.expList.add(e3);
		repo.expList.add(e4);
		repo.expList.add(e5);
		repo.expList.add(e6);
		repo.expList.add(e7);
		repo.expList.add(e8);
		repo.expList.add(e9);
		
	}



	private void delay() {
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}
	
}
