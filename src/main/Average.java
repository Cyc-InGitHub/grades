package main;

import java.util.List;

public class Average {

	public static List Integer(List<java.lang.Integer> a) {
		int sum = 0;
		for (int i = 0; i < a.size(); i++) {
			sum += a.get(i);
		}
		int ave = sum / a.size();
		System.out.println("平均分为" + ave);
		return a;

	}
}
