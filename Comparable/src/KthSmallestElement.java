
public class KthSmallestElement {
public static void main(String[] args) {
	int a[]= {32,52,64,98,78,23,12};
	int k= 5;
	
	for (int i = 0; i < a.length; i++) {
		for (int j = i+1; j < a.length; j++) {
			if(a[i]>a[j]) {
				int temp = a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}
		if(i==k-1) {
			System.out.println(k+"th Smalest Element is : "+a[i]);
			break;
		}
	}
	System.out.println("Sorted Arrays Are==");
	for (int i = 0; i < a.length; i++) {
		System.out.print(" "+a[i]);
	}
	
}
}
