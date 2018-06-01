package in.infotech;

import java.util.Date;
import java.util.Map;
import java.util.TreeMap;
/**
 * The class contains various method to calculate report
 * @author Amol Patole
 *
 */

public class PEMReportService {
	/**
	 * The method calculate month_wise total and return result
	 */
	
	private Repository repo =Repository.getRepository();
	
	public Map<String,Float> calculateMonthlyTotal(){
		Map<String,Float> m=new TreeMap();
		
		for(Expense exp : repo.expList){
			Date expdate = exp.getDate();
			String yearMonth = DateUtil.getYearAndMonth(expdate);
			
			if(m.containsKey(yearMonth)){
				Float total = m.get(yearMonth);
				total=total+exp.getAmount();
				m.put(yearMonth, total);//replace old total
			}
			else{
				//this month is not yet added,so add here
				m.put(yearMonth, exp.getAmount());
			}
		}
		return m;//
	}
	/**
	 * The method calculate year_wise total and return result
	 */
	public Map<Integer,Float> calculateYearlyTotal(){
		Map<Integer,Float> m=new TreeMap();
		
		for(Expense exp : repo.expList){
			Date expdate = exp.getDate();
			Integer year = DateUtil.getYear(expdate);
			
			if(m.containsKey(year)){
				//when Expense is already present for year
			
				Float total = m.get(year);
				total=total+exp.getAmount();
				m.put(year, total);//replace old total
			}
			else{
				//this month is not yet added,so add here
				m.put(year, exp.getAmount());
			}
		}
		return m;
	}
	/**
	 * The method calculate category_wise total and return result
	 */
	public Map<String,Float> calculateCategoriedTotal(){
		Map<String,Float> m=new TreeMap();
		
		for(Expense exp : repo.expList){
			Long categoryId = exp.getCategoryId();
			String catName = this.getCategoryNameById(categoryId);
			if(m.containsKey(catName)){
				//when Expense is already present for Category
			
				Float total = m.get(catName);
				total=total+exp.getAmount();
				m.put(catName, total);//replace old total
			}
			else{
				//this yaer is not yet added,so add here
				m.put(catName, exp.getAmount());
			}
		}
		return m;
	}
	/**
	 * The method  return result category name for particular category id
	 */
	public String getCategoryNameById(Long categoryId){
		for(Category c: repo.catList){
			if(c.getCategoryId().equals(categoryId)){
				return c.getName();
			}
		}
		return null;//category id  not found
	}

}
