package class2.class2_1;

import java.util.Scanner;

public class Pingfang {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("输入一个数：");
		int sum = 0;
		int nextInt = scanner.nextInt();
		for (int i = 2; i < nextInt; i += 2) {
			int pow = (int)Math.pow(i, 2);
			sum+=pow;
		}
		System.out.println(sum);
	}
}
