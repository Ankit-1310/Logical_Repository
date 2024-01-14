import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Duplicates {
	public static void main(String[] args) {
		String an = "aankit";
		Map<String, Long> collect = Arrays.stream(an.split(""))
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println(collect);
		
		
		List<String> duplicateElement = Arrays.stream(an.split(""))
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet().stream()
				.filter(c -> c.getValue() > 1).map(Map.Entry::getKey).collect(Collectors.toList());
		System.out.println(duplicateElement);

		List<String> uniqueElement = Arrays.stream(an.split(""))
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet().stream()
				.filter(k -> k.getValue() == 1).map(Map.Entry::getKey).collect(Collectors.toList());
		System.out.println(uniqueElement);

		String FirstNonRepeatedCharacter = Arrays.stream(an.split(""))
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet().stream()
				.filter(x -> x.getValue() == 1).findFirst().get().getKey();
		System.out.println(FirstNonRepeatedCharacter);
	}
}
