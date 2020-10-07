package main;

import java.util.List;

public class Calculate {

	public static List Integer(List<java.lang.Integer> a) {
		int sum = 0;
		int t0 = 0;
		int t6 = 0;
		int t7 = 0;
		int t8 = 0;
		int t9 = 0;
		for (int i = 0; i < a.size(); i++) {
			if (a.get(i) < 60) {
				++t0;
			}
			if (a.get(i) >= 60 && a.get(i) < 70) {
				++t6;
			}
			if (a.get(i) >= 70 && a.get(i) < 80) {
				++t7;
			}
			if (a.get(i) >= 80 && a.get(i) < 90) {
				++t8;
			}
			if (a.get(i) >= 90) {
				++t9;
			}

		}

		System.out.println("小于60分的人数有" + t0 + "个，60-70分的人数有" + t6 + "个，70-80分的人数有" + t7 + "个，80-90分的人数有" + t8
				+ "个，90分以上的人数有" + t9 + "个");
		return a;

	}
}
