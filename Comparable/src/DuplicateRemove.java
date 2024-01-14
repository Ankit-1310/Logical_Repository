import java.util.Arrays;

public class DuplicateRemove {
	public static void main(String[] args) {
		int ar1[] = {5,4,3,9,8,4,5};
		for (int i = 0; i < ar1.length; i++) {
			System.out.print(ar1[i]+"\t");
		}
		int ar2=ar1.length;
		
		for (int i = 0; i < ar2; i++) {
			for (int j = i+1; j < ar2 ; j++) {
				if (ar1[i]==ar1[j]) {
					ar1[j]=ar1[ar2-1];
					ar2--;
					j--;
				}
			}
		}
		int aa[]=Arrays.copyOf(ar1, ar2);
		System.out.println();
		
		for (int i = 0; i < aa.length; i++) {
			System.out.print(aa[i]+"\t");
		}
	
	}
}
