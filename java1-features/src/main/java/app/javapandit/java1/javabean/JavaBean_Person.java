package app.javapandit.java1.javabean;

import java.io.Serializable;

public class JavaBean_Person implements Serializable {

	// Simple Java Bean 'Person' Example

	/**
	 * Java Bean Class Must Implements {@link Serializable}<br>
	 * Having Serial Version long UID
	 */
	private static final long serialVersionUID = 8895004119008103010L;

	// All properties in Java Bean Must be Private
	private String firstName;
	private String lastName;
	private int age;
	private boolean active = true;

	// Java Bean should have Public No-Arguments Constructor
	JavaBean_Person() {
	}

	// All properties in Java Bean Must have Public Getters and Setter Methods

	// Setter Methods Return-Type should be Void
	// Prefixed with 'set' and should take Some Argument

	// Getter Methods Return-Type should NOT be Void
	// Prefixed with 'get' or 'is' (if boolean) and should NOT take any Argument

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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	@Override
	public String toString() {
		return "JavaBean_Person [getFirstName()=" + getFirstName() + ", getLastName()=" + getLastName() + ", getAge()="
				+ getAge() + ", isActive()=" + isActive() + "]";
	}
}