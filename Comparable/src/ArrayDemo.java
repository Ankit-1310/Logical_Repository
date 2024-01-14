import java.util.HashSet;

public class ArrayDemo {
	public static void main(String[] args) {
		String[] s = { "Ankit", "Suman", "Himanshu", "Priyansh" };
		String[] s1 = { "Ankit", "Suman", "Raja", "Monu" };
		HashSet<String> set = new HashSet<>();

		for (int i = 0; i < s.length; i++) {
			for (int j = 0; j < s1.length; j++) {
				if (s[i] == s1[j]) {
					set.add(s[i]);
				}
			}

		}
		System.out.println(set);
	}
}
