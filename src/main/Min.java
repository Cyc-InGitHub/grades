package main;

import java.util.ArrayList;
import java.util.List;

public class Min {

	public static List Integer(List<java.lang.Integer> a) {
		int min = a.get(0);
		for (int i = 0; i < a.size(); i++) {

			if (a.get(i) < min)
				min = a.get(i);

		}
		System.out.println("最低分为" + min);
		return a;
	}

}