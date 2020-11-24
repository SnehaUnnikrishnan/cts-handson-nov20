package ClassSpring;

public class EmployeeService {
	EmployeeDao emp=new EmployeeDao();
	public void storeEmployee() {
		emp.store();
		System.out.println("Hello I am inside store Employee of EmployeeService");
	}

}