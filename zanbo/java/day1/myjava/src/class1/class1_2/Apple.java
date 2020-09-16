package class1.class1_2;

import java.util.Scanner;

public class Apple {
	public static void main(String[] args) {
		Scanner apple = new Scanner(System.in);
		int sum = 0;
		System.out.println("输入小红摘的苹果数");
		int a1 = apple.nextInt();
		System.out.println("总数="+(sum = sum + a1));
		System.out.println("输入小刚摘的苹果数");
		int a2 = apple.nextInt();
		System.out.println("总数="+(sum = sum + a2));
		System.out.println("输入小丽摘的苹果数");
		int a3 = apple.nextInt();
		System.out.println("总数="+(sum = sum + a3));
		System.out.println("输入小玉摘的苹果数");
		int a4 = apple.nextInt();
		System.out.println("总数="+(sum = sum + a4));
	}
}
