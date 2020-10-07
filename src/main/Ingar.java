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
public class Ingar {
	List<Integer> l = new ArrayList();

	public static void main(String[] args) {
		List<Integer> a = new ArrayList();
		Scanner s = new Scanner(System.in);
		System.out.println("请选择默认成绩还是手动录入：1为默认，其余手动输入");
		String type = "";
		if (s.hasNext()) {
			type = s.next();
		}

		if (type.equals("1")) {
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
			// Scanner scan = new Scanner(System.in);
			System.out.println("成绩用英文逗号分隔");
			// 判断是否还有输入
			String str1 = "";
			if (s.hasNext()) {
				str1 = s.next();
				System.out.println("输入的成绩为：" + str1);
			}
			s.close();
			a = StringSplit.Integer(str1);
		}

	}
}
