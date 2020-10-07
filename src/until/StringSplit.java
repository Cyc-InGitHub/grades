package until;

import java.util.ArrayList;
import java.util.List;

public class StringSplit {

	public static List<Integer> Integer(String s) {
		String[] s1 = s.split(",");
		List<Integer>  list = new  ArrayList<>();
 		s1 = s.split(",");
		for (int i = 0; i < s1.length; i++) {
			list.add(Integer.parseInt( s1[i] ));
		}
		return list;
	}
}
