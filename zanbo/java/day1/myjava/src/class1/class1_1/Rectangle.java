package class1.class1_1;

import java.util.Scanner;

public class Rectangle {
	public static void main(String[] args) {
		Scanner rect = new Scanner(System.in);
		System.out.println("���볤���εĳ�");
		float chang = rect.nextFloat();
		System.out.println("���볤���εĿ�");
		float kuan = rect.nextFloat();
		System.out.println("�����ε��ܳ�Ϊ" + ((chang + kuan) * 2));
		System.out.println("�����ε����Ϊ" + (chang * kuan));
	}
}
