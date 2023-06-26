package app.javapandit.java7.varargs;

public class VarargsFromJava7 {

	public int sumNumber(int... args) {
		System.out.println("argument length: " + args.length);
		int sum = 0;
		for (int x : args) {
			sum += x;
		}
		return sum;
	}

	public static void main(String[] args) {
		VarargsFromJava7 varargsExample = new VarargsFromJava7();

		int sum2 = varargsExample.sumNumber(2, 4);
		System.out.println("sum2 = " + sum2);

		int sum3 = varargsExample.sumNumber(1, 3, 5);
		System.out.println("sum3 = " + sum3);

		int sum4 = varargsExample.sumNumber(1, 3, 5, 7);
		System.out.println("sum4 = " + sum4);
	}

}
