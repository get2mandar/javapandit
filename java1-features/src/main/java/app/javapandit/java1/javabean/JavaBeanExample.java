package app.javapandit.java1.javabean;

public class JavaBeanExample {

	public static void main(String[] args) {

		JavaBean_Person person = new JavaBean_Person();

		person.setFirstName("Mandar");
		person.setLastName("Pandit");
		person.setAge(37);

		System.out.println(person);
	}

}