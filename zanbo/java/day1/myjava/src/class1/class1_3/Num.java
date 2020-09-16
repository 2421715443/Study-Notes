package class1.class1_3;

import java.util.Scanner;

public class Num {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入五位数");
		int num = scanner.nextInt();
		int len = (int) Math.pow(10, (num + "").length() - 1);
		do {
			System.out.println(num / len);
			num %= len;
			len /= 10;
		} while (len > 0);
	}
}
