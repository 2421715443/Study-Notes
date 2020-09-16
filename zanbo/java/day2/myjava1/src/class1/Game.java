package class1;

import java.util.Scanner;

public class Game {
	static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("现有游戏如下");
		System.out.println("--------------------");
		System.out.println("1、	wow");
		System.out.println("2、	传奇");
		System.out.println("3、	梦幻西游");
		System.out.println("4、	永恒之塔");
		System.out.println("5、	七龙珠ol");
		while (true) {
			System.out.println("请输入您选择的游戏：");
			int gumNo = scanner.nextInt();
			if (gumNo < 1 || gumNo > 5) {
				System.out.println(">>>>>您输入的游戏编号无效，请继续输入！！");
			} else if (gumNo == 1) {
				System.out.println("您选择了*wow*");
				lv();
				break;
			} else if (gumNo == 2) {
				System.out.println("您选择了*传奇*");
				lv();
				break;
			} else if (gumNo == 3) {
				System.out.println("您选择了*梦幻西游*");
				lv();
				break;
			} else if (gumNo == 4) {
				System.out.println("您选择了*永恒之塔*");
				lv();
				break;
			} else if (gumNo == 5) {
				System.out.println("您选择了*七龙珠ol*");
				lv();
				break;
			}
		}
	}
	public static void lv(){
		System.out.println("请输入您现在已经玩到的级别：");
		int lv = scanner.nextInt();
		if (lv <= 20 && lv > 0) {
			System.out.println("您还是新出茅庐的小菜鸟，加快步伐向前冲吧！！");
		} else if (lv <= 40 && lv > 20) {
			System.out.println("您已经开始行走江湖，算是小有成就了，加油！！");
		} else if (lv <= 40 && lv > 20) {
			System.out.println("您已经横扫天下了，离天下无敌还有差距，继续努力吧！！");
		} else if (lv > 60) {
			System.out.println("您已经天下无敌了，太牛了！！");
		}
	}
}
