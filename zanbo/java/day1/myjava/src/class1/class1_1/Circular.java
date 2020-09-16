package class1.class1_1;

import java.util.Scanner;

public class Circular {
	public static void main(String[] args) {
		Scanner rect = new Scanner(System.in);
		System.out.println("输入圆形的半径");
		float ban = rect.nextFloat();
		System.out.println("圆形的周长为" + (ban * 2 * 3.14169));
		System.out.println("圆形的面积为" + (ban * ban * 3.14169));
	}
}
