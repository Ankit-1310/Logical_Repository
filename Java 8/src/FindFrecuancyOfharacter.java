import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindFrecuancyOfharacter {
	public static void main(String[] args) {
		String in = "ANKITKUMARYADAV";
		Map<String, Long> map = Arrays.stream(in.split(""))
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println(map);

		int index[] = new int[in.length()];

		for (int i = 0; i < in.length(); i++) {
			int count = 1;
			for (int j = i + 1; j < in.length(); j++) {
				if (index[i] == -1)
					break;
				if (in.charAt(i) == in.charAt(j)) {
					count++;
					index[j] = -1;
				}
			}
			if (index[i] != -1)
				index[i] = count;
		}
		boolean b = true;
		for (int i = 0; i < index.length; i++) {
			if (index[i] != -1) {
				System.out.print(in.charAt(i) + "===" + index[i] + " || ");
			}
			if (index[i] == 1 && b) {
				System.err.print(in.charAt(i) + " ");
				b = false;
			}

		}
		System.out.println(Arrays.toString(index));

	}
}
