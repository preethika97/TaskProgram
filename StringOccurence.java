package Task;

import java.util.*;

public class StringOccurence {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the String : ");
		String s = sc.next();

		for (int i = 0; i < s.length(); i++) {

			int count = 1;

			while (i + 1 < s.length() && s.charAt(i) == s.charAt(i + 1)) {
				i++;
				count++;
			}
			if (count > 1)
				System.out.print(s.charAt(i) + "" + count + "");
			else
				System.out.print(s.charAt(i));
		}
	}
}
