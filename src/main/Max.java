package main;

import java.util.List;

public class Max {

	public static List Integer(List<java.lang.Integer> a) {
		int max = a.get(0);
		for (int i = 0; i < a.size(); i++) {
			if (a.get(i) > max)
				max = a.get(i);
		}
		System.out.println("第一名为" + max);
		return a;
	}

}