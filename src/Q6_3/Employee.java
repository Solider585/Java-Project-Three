package Q6_3;

public class Employee {
	private String name;
	private double salary;

	public Employee(String employeeName) {
		// TODO Auto-generated constructor stub
		this.name = employeeName;		
	}
	
	public void setSalary(double employeeBaseSalary) {
		this.salary = employeeBaseSalary;
	}
	
	public String getName() {
		return this.name;
	}
	
	public double getSalary() {
		return this.salary;
	}
	
	StringBuilder toJson() {
		StringBuilder employee = new StringBuilder("class Employee, name : ");
		employee.append(getName() + ", salary : ");
		employee.append(getSalary());
		return employee;		
	}

}
