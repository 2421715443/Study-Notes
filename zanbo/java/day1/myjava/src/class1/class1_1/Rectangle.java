package class1.class1_1;

import java.util.Scanner;

public class Rectangle {
	public static void main(String[] args) {
		Scanner rect = new Scanner(System.in);
		System.out.println("输入长方形的长");
		float chang = rect.nextFloat();
		System.out.println("输入长方形的宽");
		float kuan = rect.nextFloat();
		System.out.println("长方形的周长为" + ((chang + kuan) * 2));
		System.out.println("长方形的面积为" + (chang * kuan));
	}
}
