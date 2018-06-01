package in.infotech;
/**
 * The class is used as database/repository and its a Singleton
 * @author Amol Patole
 */
import java.util.List;

public class Repository {
	
	public List<Expense> expList;
	public List<List> catLisy;
	private static Repository repository;
	private Repository(){
		
	}
	
	public static Repository getRepository(){
		if( repository==null ){
			repository = new Repository();
			}
		return repository;
	}
}
