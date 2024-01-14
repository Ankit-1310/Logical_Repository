import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class FindDuplicateUsiingHasTable {
public static void main(String[] args) {
	int a[]= {45,44,78,45,48,48,56,44};
	Map<Integer, Integer> hm = new HashMap<>();
	for (int i : a) {
		Integer count =hm.get(i);
		
		if(count==null) {
			hm.put(i, 1);
			
		}else {
			count=count+1;
			hm.put(i, count);
		}
	}
	Set<Map.Entry<Integer, Integer>> s=hm.entrySet();
	for(Map.Entry<Integer, Integer> m:s) {
		//System.out.println(m.getKey());
		if(m.getValue()>1) {
			System.out.println(m.getKey());
		}
	}
}
}
