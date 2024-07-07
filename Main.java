package encapsulationLearning;

public class Main {

	public static void main(String[] args) {
		
		Employee emp1 = new Employee();
		
		emp1.setName("vivi");
		emp1.setAge(26);
		emp1.setSalary(35000.00);
		
		System.out.println(emp1.getAge());
		System.out.println(emp1.getName());
		System.out.println(emp1.getSalary());
		
		emp1.raiseSalary(10);
		
		System.out.println("after 10% hike"+emp1.getSalary());
	}

}
