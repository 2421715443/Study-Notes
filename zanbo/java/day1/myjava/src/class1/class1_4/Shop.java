package class1.class1_4;

import java.util.Scanner;

public class Shop {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("�������������ѽ�");
		float num = scanner.nextFloat();
		if (num < 2000) {
			System.out.print("�������ѽ���2000��ֻ��ʹ���ֽ�֧�������������κδ��۵��Żݣ�����ʵ��֧�����Ϊ" + num + "Ԫ");
		} else if (num >= 2000) {
			System.out.print("���������Ƿ�Ϊ��Ա��y - ��Ա������ - �ǻ�Ա����");
			String isVip = scanner.next();
			if (isVip.equals("y")) {
				System.out.print("����������֧����ʽ��1-�ֽ�֧�� 2-���ÿ�֧�� ����-��ǿ�֧������");
				int nextInt = scanner.nextInt();
				if (nextInt == 1) {
					System.out.print("������" + num + "Ԫ������Ϊ��Ա��ѡ�����ֽ�֧������������8���Żݣ�����ʵ��֧�����Ϊ" + (num * 0.8) + "Ԫ");
				} else if (nextInt == 2) {
					System.out.print("������" + num + "Ԫ������Ϊ��Ա��ѡ�������ÿ�֧������������8.5���Żݣ�����ʵ��֧�����Ϊ" + (num * 0.85) + "Ԫ");
				} else {
					System.out.print("������" + num + "Ԫ������Ϊ��Ա��ѡ���˽�ǿ�֧������������9���Żݣ�����ʵ��֧�����Ϊ" + (num * 0.9) + "Ԫ");
				}
			} else {
				System.out.print("������" + num + "Ԫ�������ǻ�Ա��ֻ��ʹ���ֽ�֧����ʽ����������9.5���Żݣ�����ʵ��֧�����Ϊ" + (num * 0.95) + "Ԫ");
			}
		}
	}
}
