
public class MergingTwoArray {
public static void main(String[] args) {
	int a[]= {1,2,3,4,5,6,7};
	int b[]= {10,5,78};
	int x[]= new int[a.length+b.length];
	
	for (int i = 0; i < a.length; i++) {
		x[i]=a[i];
	}
	
	for (int i = 0; i < b.length; i++) {
		x[a.length+i]=b[i];
	}
	for (int i = 0; i < x.length; i++) {
		System.out.print(x[i]+"\t");
	}
}
}
