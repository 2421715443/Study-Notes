package class1;

import java.util.Scanner;

public class Game {
	static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("������Ϸ����");
		System.out.println("--------------------");
		System.out.println("1��	wow");
		System.out.println("2��	����");
		System.out.println("3��	�λ�����");
		System.out.println("4��	����֮��");
		System.out.println("5��	������ol");
		while (true) {
			System.out.println("��������ѡ�����Ϸ��");
			int gumNo = scanner.nextInt();
			if (gumNo < 1 || gumNo > 5) {
				System.out.println(">>>>>���������Ϸ�����Ч����������룡��");
			} else if (gumNo == 1) {
				System.out.println("��ѡ����*wow*");
				lv();
				break;
			} else if (gumNo == 2) {
				System.out.println("��ѡ����*����*");
				lv();
				break;
			} else if (gumNo == 3) {
				System.out.println("��ѡ����*�λ�����*");
				lv();
				break;
			} else if (gumNo == 4) {
				System.out.println("��ѡ����*����֮��*");
				lv();
				break;
			} else if (gumNo == 5) {
				System.out.println("��ѡ����*������ol*");
				lv();
				break;
			}
		}
	}
	public static void lv(){
		System.out.println("�������������Ѿ��浽�ļ���");
		int lv = scanner.nextInt();
		if (lv <= 20 && lv > 0) {
			System.out.println("�������³�é®��С���񣬼ӿ첽����ǰ��ɣ���");
		} else if (lv <= 40 && lv > 20) {
			System.out.println("���Ѿ���ʼ���߽���������С�гɾ��ˣ����ͣ���");
		} else if (lv <= 40 && lv > 20) {
			System.out.println("���Ѿ���ɨ�����ˣ��������޵л��в�࣬����Ŭ���ɣ���");
		} else if (lv > 60) {
			System.out.println("���Ѿ������޵��ˣ�̫ţ�ˣ���");
		}
	}
}
