package app.javapandit.java1.reflection;

public class Employee extends Person {

	int empId;
	String email, department;
	public float salary;

	public Employee() {
		super();
	}

	protected Employee(int empId) {
		super();
		this.empId = empId;
	}

	Employee(int empId, String email, String department, float salary) {
		super();
		this.empId = empId;
		this.email = email;
		this.department = department;
		this.salary = salary;
	}

	public int getEmpId() {
		return empId;
	}

	public String getEmail() {
		return email;
	}

	public String getDepartment() {
		return department;
	}

	public float getSalary() {
		return salary;
	}
}