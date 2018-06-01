package in.infotech;
/**
 * This class is an entry point of execution for PEM Application.
 * @author Amol
 *
 */

public class StartApplication {
	/**
	 * This method is creating <code> PEMService</code> object 
	 * and show app by calling showMenu() method
	 * @param args
	 */
	public static void main(String[] args) {

		PEMService service = new PEMService();
		service.showMenu();
		

	}

}
