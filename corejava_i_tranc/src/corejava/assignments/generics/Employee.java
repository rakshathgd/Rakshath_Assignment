package corejava.assignments.generics;

import java.util.HashSet;
import java.util.Set;

public class Employee {
	int id;
	String name;
	long salary;
	String Department;

	public Employee(int id, String name, long salary, String department) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		Department = department;
	}

	static void displayAll(Set<Employee> hs) {

		for (Employee el : hs)
			System.out.println(el);

	}

	public static void main(String[] args) {
		Set<Employee> hs = new HashSet<Employee>();
		Employee e3 = new Employee(3, "raks", 98765421, "M.E");
		Employee e1 = new Employee(1, "ksha", 98765421, "M.E");
		Employee e2 = new Employee(2, "shaa", 98765421, "CIV");
		Employee e4 = new Employee(4, "tata", 98765421, "M.E");

		hs.add(e1);
		hs.add(e2);
		hs.add(e3);
		hs.add(e4);

		displayAll(hs);

	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", Department=" + Department + "]";
	}

}




