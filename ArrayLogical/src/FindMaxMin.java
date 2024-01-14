
public class FindMaxMin {
	
	public static void main(String[] args) {
		int a[] = {4,8,6,3,7};
		int max = a[0];
		int min = a[0];
		for (int i = 0; i < a.length-1; i++) {
			if(a[i]> max) {
				max = a[i];
			}else if(min>a[i] ) {
				min = a[i];
			}
		}
		
		System.out.println(max);
		System.out.println(min);
	}

}
