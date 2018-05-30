
public class EmpService {

	public void save(Emp e){
		System.out.println("--------Save-----"+e.getName()+" "+e.getEmpId());
	}
	
	public Emp getEmp(){
		Emp e= new Emp(1,"Amol");
		return e;
	}
}
