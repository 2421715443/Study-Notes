package class1;

import java.util.Scanner;

public class Login {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int i = 1;
		for (i = 1; i <= 3;) {
			System.out.println("�������û�����");
			String name = scanner.next();
			System.out.println("���������룺");
			String password = scanner.next();
			if (name.equals("admin") && password.equals("asjy")) {
				System.out.println("��¼�ɹ�");
				break;
			}
			System.out.println("��¼ʧ��");
			i++;
		}
		if(i==4){			
			System.out.println("����3�ε�¼ʧ�ܣ��������ٵ�¼");
		}
	}
}
