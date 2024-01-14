
public class RemoveDuplicateBrutForce {
	public static void main(String[] args) {
		
	
	int a[]= {11,22,54,87,8796,22,11,11};
	
	
		for (int i = 0; i < a.length; i++) {
			int temp = 0;
			for (int j = i+1; j < a.length; j++) {
				if(a[i]==a[j] && i!=j) {
					System.out.println("First Duplicate Element :-"+a[i]);
					temp = temp+1;
					break;
				}
				
			}
			if(temp>0) {
				break;
			}
		}
	
	}
}
