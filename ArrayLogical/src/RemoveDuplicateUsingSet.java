import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateUsingSet {
	
	public static void main(String[] args) {
		int a[]= {11,22,54,87,8796,22,11,11};
		
		Set<Integer> set = new HashSet<>();
		
		for(int n:a) {
			if(!set.add(n)) {
				System.out.println(n);
			}
		}
	}

}
