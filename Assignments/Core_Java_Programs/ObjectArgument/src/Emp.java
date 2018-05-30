
public class Emp {
 int empId;
 String name;
 
 public Emp(int i, String n){
	 empId =i;
	 name =n;
 }
 
public int getEmpId() {
	return empId;
}

public String getName() {
	return name;
}



public void doTask(){
	 System.out.println("Emp doing some Task.." +empId+" "+name);
 }
}
