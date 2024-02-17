
public class Manager extends Employee {
	private String departmentA;
	
	public String getDepartment() {
		return departmentA;
	}
	public void setDepartment(String departmentA) {
		this.departmentA = departmentA;
	}
	
	@Override
	public void employeeSummary() {
		super.employeeSummary();
		System.out.println("Department: " + departmentA);

	}

}
