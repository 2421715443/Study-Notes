package class1.class1_1;

import java.util.Scanner;

public class Triangle {
	public static void main(String[] args) {
		Scanner rect = new Scanner(System.in);
		System.out.println("输入三角形的边长");
		float a = rect.nextFloat();
		float b = rect.nextFloat();
		float c = rect.nextFloat();
		float d = (a + b + c) / 2;
		System.out.println("三角形的周长为" + (a + b + c));
		System.out.println("三角形的面积为" + Math.sqrt(d * (d - a) * (d - b) * (d - c)));
	}
}
