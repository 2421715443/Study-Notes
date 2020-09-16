package class1.class1_4;

import java.util.Scanner;

public class Shop {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("请输入您的消费金额：");
		float num = scanner.nextFloat();
		if (num < 2000) {
			System.out.print("您的消费金额不足2000，只能使用现金支付，不能享受任何打折的优惠，您的实际支付金额为" + num + "元");
		} else if (num >= 2000) {
			System.out.print("请输入您是否为会员（y - 会员，其它 - 非会员）：");
			String isVip = scanner.next();
			if (isVip.equals("y")) {
				System.out.print("请输入您的支付方式（1-现金支付 2-信用卡支付 其它-借记卡支付）：");
				int nextInt = scanner.nextInt();
				if (nextInt == 1) {
					System.out.print("您消费" + num + "元，并且为会员，选择了现金支付，可以享受8折优惠，您的实际支付金额为" + (num * 0.8) + "元");
				} else if (nextInt == 2) {
					System.out.print("您消费" + num + "元，并且为会员，选择了信用卡支付，可以享受8.5折优惠，您的实际支付金额为" + (num * 0.85) + "元");
				} else {
					System.out.print("您消费" + num + "元，并且为会员，选择了借记卡支付，可以享受9折优惠，您的实际支付金额为" + (num * 0.9) + "元");
				}
			} else {
				System.out.print("您消费" + num + "元，但不是会员，只能使用现金支付方式，可以享受9.5折优惠，您的实际支付金额为" + (num * 0.95) + "元");
			}
		}
	}
}
