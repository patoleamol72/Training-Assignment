import javax.swing.JOptionPane;

public class TestJoption {
	

	public static void main(String[] args) {
		
		String name=JOptionPane.showInputDialog("Your name::");
		
		
		String salary=JOptionPane.showInputDialog("Your Salary::");
		Float sal=new Float(salary);
		
		
		
		String age=JOptionPane.showInputDialog("Your age::");
		Integer age1=new Integer(age);
		
		System.out.println("Name::"+name);
		System.out.println("salary::"+sal);
		System.out.println("Age::"+age1);
	}

}
