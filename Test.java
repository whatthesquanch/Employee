
public class Test {

	public static void main(String[] args) {
		Employee employee = new Employee();
		employee.setFirstName("Nick");
		employee.setLastName("Doe");
		employee.setEmployeeID(96789);
		employee.setSalary(65000.0);
		employee.employeeSummary();
		
		Manager manager = new Manager();
		manager.setFirstName("Mary");
		manager.setLastName("Lyn");
		manager.setEmployeeID(96819);
		manager.setSalary(85000.0);
		manager.setDepartment("A-Operations");
		manager.employeeSummary();
				

	}

}
