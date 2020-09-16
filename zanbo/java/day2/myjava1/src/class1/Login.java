package class1;

import java.util.Scanner;

public class Login {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int i = 1;
		for (i = 1; i <= 3;) {
			System.out.println("请输入用户名：");
			String name = scanner.next();
			System.out.println("请输入密码：");
			String password = scanner.next();
			if (name.equals("admin") && password.equals("asjy")) {
				System.out.println("登录成功");
				break;
			}
			System.out.println("登录失败");
			i++;
		}
		if(i==4){			
			System.out.println("连续3次登录失败，不允许再登录");
		}
	}
}
