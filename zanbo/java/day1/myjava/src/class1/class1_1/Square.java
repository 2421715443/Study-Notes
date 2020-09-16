package class1.class1_1;

import java.util.Scanner;

public class Square {
	public static void main(String[] args) {
		Scanner rect = new Scanner(System.in);
		System.out.println("输入正方形的边长");
		float bian = rect.nextFloat();
		System.out.println("正方形的周长为" + (bian * 4));
		System.out.println("正方形的面积为" + (bian * bian));
	}
}
