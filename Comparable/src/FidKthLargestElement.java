
public class FidKthLargestElement {
public static void main(String[] args) {
	int a[]= {23,52,63,98,78,45,62,12,32,99,523,65,78};
	int k=5;
	
	for (int i = 0; i < a.length; i++) {
		for (int j = i+1; j < a.length; j++) {
			if(a[i]<a[j]) {
				int temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
			
			}
		if(i == k-1) {
			System.out.println(k+" "+a[i]);
			
		
		}
	}
	System.out.println("+++++++++++++++++");
	for (int j = 0; j < a.length; j++) {
		System.out.print(" " +a[j]);
	}
	
	
}
}
