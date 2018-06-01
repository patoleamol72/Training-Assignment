package in.infotech;
/**
 * @author Amol Patole
 */

public class Category {
	private Long categoryId=System.currentTimeMillis();
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
