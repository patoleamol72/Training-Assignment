
public class Test {

	public static void main(String[] args) {
		Emp e =new Emp(101,"Bhushan");
		EmpService service=new EmpService();
		service.save(e);//obj as Arg
		Emp emp = service.getEmp();//Return A obj
		System.out.println("-----emp------"+emp.getName()+" "+emp.getEmpId());

	}

}
