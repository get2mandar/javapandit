package app.javapandit.java4.assertsupport;

public class JavaAssertFromJava4 {

	public static void main(String[] args) {
		Employee emp = new Employee(1, "Mandar", "Pandit");

		// Passes Successfully
		assert emp.getFirstName().length() < 20 : emp.getFirstName().length();

		// Failed
		assert emp.getLastName().length() < 5 : emp.getLastName().length();

		// Note: TO Run this Program in IDE, you need to pass VM Argument as '-ea'
		// '-ea' is equivalent to '-enableassertions'
	}
}

class Employee {

	private int empId;
	private String firstName;
	private String lastName;

	public Employee(int empId, String firstName, String lastName) {
		super();
		this.empId = empId;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
}
