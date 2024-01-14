import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class RemoveDuplicateUsingHashMap {

	public static void main(String[] args) {
		int a[]= {11,22,54,87,87,96,22,11,11};
		
		Map<Integer, Integer> map = new HashMap<>();
		
		for( int no :a) {
			Integer count = map.get(no);
			if(count == null) {
				map.put(no,1);
				
			}else {
				map.put(no, count+1);
			}
		}
		
		Set<Map.Entry<Integer, Integer>> set1 = map.entrySet();
		for(Map.Entry<Integer, Integer> me: set1) {
			if(me.getValue()>1) {
			System.out.println(me.getKey() +" "+me.getValue());
		}
		}
	} 
}
