import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class DuplicateUsingJava8 {
public static void main(String[] args) {
	int[] inputArray = new int[] {111, 333, 555, 777, 333, 444, 555};
	HashSet<Integer> set = new HashSet<>();
	Set<Integer> set1 = Arrays.stream(inputArray).filter(i->!set.add(i)).boxed().collect(Collectors.toSet());
	System.out.println(set1);
}
}
