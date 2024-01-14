import java.util.Arrays;
import java.util.stream.Collectors;

class Anku {
	public static void main(String[] args) {
		String str = "aankit";
		int l = str.length();
		int count = 1;
		for (int i = 0; i < l; i++) {
			for (int j = 0 + 1; j < l; j++) {
				if (str.charAt(i) == str.charAt(j)) {
					count++;
				}
			}
			System.out.println(str.charAt(i) + "=" + count);
		}
//		Arrays.stream(str.split("")).filter(e->Collectors.counting()>1).findFirst().get();
		for (int i = 0; i < l; i++) {
			int count1 = 1;
			for (int j = 0; j < l; j++) {
				if (str.charAt(i) == str.charAt(j)) {
					count1++;
				}
			}
			if(count1==2) {
				System.out.println(str.charAt(i));
				break;
			}
		}

	}
}