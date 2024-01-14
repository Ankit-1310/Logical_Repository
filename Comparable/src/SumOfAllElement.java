public class SumOfAllElement {
	public static void main(String[] args) {
		int arr1[] = { 1, 2, 3, 4, 6, 7, 8, 9, 10 };
		int n=10;
		int sum=0;
		int sumofNumber=(n*(n+1))/2;
		System.out.println(sumofNumber);
		for (int i = 0; i < arr1.length; i++) {
			sum= sum + arr1[i];
		}
		System.out.println(sum);
		int missing = sumofNumber-sum;
		System.out.println(missing);
	}
}
