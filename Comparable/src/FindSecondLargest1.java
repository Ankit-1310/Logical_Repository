
public class FindSecondLargest1 {
	public static void main(String[] args) {
		int a[] = { 54, 66, 56, 32, 85, 95, 36 };
		int largest = Integer.MIN_VALUE;
		int secondLargest = Integer.MIN_VALUE;

		for (int i = 0; i < a.length; i++) {
			if (a[i] > largest) {
				secondLargest = largest;
				largest = a[i];
			}else if(a[i]>secondLargest&&a[i]!=largest) {
				secondLargest=a[i];
			}
		}if(secondLargest==Integer.MIN_VALUE) {
			System.out.println("There Is no second Lagest Value");
		}else {
			System.out.println("Second Largest Value : "+secondLargest);
		}
	}
}
