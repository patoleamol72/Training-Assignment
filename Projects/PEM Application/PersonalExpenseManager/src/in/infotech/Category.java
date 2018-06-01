package in.infotech;
/**
 * This is a domain class represent a Category.
 * @author Amol Patole
 */

public class Category {
	/**
	 * It refers to a unique category id.It is generated Time as Id.
	 */
	private Long categoryId=System.currentTimeMillis();
	/**
	 * Name of expense.
	 */
	private String name;

	/**
	 * @param name
	 */
	public Category(String name) {
		this.name = name;
	}
	public Category(Long categoryId,String name) {
		this.categoryId = categoryId;
		this.name = name;
	}
	
	public Category(){
		
	}
	/**
	 * @return the categoryId
	 */
	public Long getCategoryId() {
		return categoryId;
	}
	/**
	 * @param categoryId the categoryId to set
	 */
	public void setCategoryId(Long categoryId) {
		this.categoryId = categoryId;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	
}
