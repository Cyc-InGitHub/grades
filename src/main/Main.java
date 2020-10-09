/**
 * <p>Title: ingar.java</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2018</p>
 * @author Cyc
 * @date 2020年10月7日
 * @version 1.0

 */
package main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import until.StringSplit;

/**
 * <p>
 * Title: ingar
 * </p>
 * <p>
 * Description:
 * </p>
 *
 * @author Cyc
 * @date 2020年10月7日
 */
public class Main {
	List<Integer> l = new ArrayList();
	static Scanner s = new Scanner(System.in);
	static List<Integer> a = new ArrayList();

	public static void main(String[] args) {

		System.out.println("请选择默认成绩还是手动录入：1为默认，其余手动输入");
		String type = "";
		if (s.hasNext()) {
			type = s.next();
		}
		if ("1".equals(type)) {
			a.add(20);
			a.add(50);
			a.add(70);
			a.add(60);
			a.add(50);
			a.add(50);
			a.add(90);
			a.add(80);
			a.add(60);
		} else {
			System.out.println("成绩用英文逗号分隔");
			String str1 = "";
			if (s.hasNext()) {
				str1 = s.next();
				System.out.println("输入的成绩为：" + str1);
			}

			a = StringSplit.Integer(str1);
		}
		menu();
	}

	public static void menu() {

		System.out.println("请选择要查看的项目 1 最高分 2 最低分 3 平均分 4 中值分数 5 成绩分布");

		String p = "";
		if (s.hasNext()) {
			p = s.next();
		}
		int tp = Integer.valueOf(p);
		switch (tp) {
		case 1:
			Max.Integer(a);
			break;
		case 2:
			Min.Integer(a);
			break;
		case 3:
			Average.Integer(a);
			break;
		case 4:
			Middle.Integer(a);
			break;
		case 5:
			Calculate.Integer(a);
			break;
		default:
			System.out.println("输入有误");
			break;
		}
		System.out.println("输入1继续查看，退出请随意按键");
		String n = "";
		if (s.hasNext()) {
			n = s.next();
		}

		if ("1".equals(n)) {
			menu();
		} else {
			System.out.println("系统退出");
			return;
		}

	}

}
