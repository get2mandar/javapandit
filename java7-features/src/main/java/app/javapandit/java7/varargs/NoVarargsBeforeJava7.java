package app.javapandit.java7.varargs;

public class NoVarargsBeforeJava7 {

	public int sumNumber(int a, int b) {
		System.out.println("argument length: 2");
		return a + b;
	}

	public int sumNumber(int a, int b, int c) {
		System.out.println("argument length: 3");
		return a + b + c;
	}

	public static void main(String[] args) {
		NoVarargsBeforeJava7 obj = new NoVarargsBeforeJava7();
		System.out.println("sum2 = " + obj.sumNumber(2, 4));
		System.out.println("sum3 = " + obj.sumNumber(1, 3, 5));
	}
}
