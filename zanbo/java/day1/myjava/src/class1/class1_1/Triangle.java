package class1.class1_1;

import java.util.Scanner;

public class Triangle {
	public static void main(String[] args) {
		Scanner rect = new Scanner(System.in);
		System.out.println("���������εı߳�");
		float a = rect.nextFloat();
		float b = rect.nextFloat();
		float c = rect.nextFloat();
		float d = (a + b + c) / 2;
		System.out.println("�����ε��ܳ�Ϊ" + (a + b + c));
		System.out.println("�����ε����Ϊ" + Math.sqrt(d * (d - a) * (d - b) * (d - c)));
	}
}
