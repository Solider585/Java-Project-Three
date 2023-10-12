package Q6_3;

public class testEmployee {

	public testEmployee() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee sarah = new Employee("Sarah");
		sarah.setSalary(50000);
		Manager sandy = new Manager("Sandy");
		sandy.setSalary(100000); 
		sandy.setBonus(1234);
		System.out.println(sarah.toJson());
		// prints {"class":"Employee", "name":"Sarah", "salary": 50000} 
		System.out.println(sandy.toJson());
		// prints {"class":"Manager", "name":"Sandy", "salary": 101234, "bonus":1234}
	}
}
