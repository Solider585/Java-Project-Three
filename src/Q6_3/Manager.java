package Q6_3;

public class Manager  extends Employee {
	private double bonus;

	public Manager(String managerName) {
		// TODO Auto-generated constructor stub
		super(managerName);
	}
	
		
	public void setBonus(double managerBonus) {
		this.bonus = managerBonus;
	}
	
	public double getSalary() {
		return super.getSalary() + bonus;
	}
	
	StringBuilder toJson() {
		StringBuilder employee = new StringBuilder("class Manager, name : ");
		employee.append(this.getName() + ", Total Salary : ");
		employee.append(this.getSalary() + ", Bonus : ");
		employee.append(this.bonus);
		return employee;		
	}

}
