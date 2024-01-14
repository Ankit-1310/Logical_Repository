package langpackage;


public class Largest {
	public static void main(String[] args) {
		int arr[] = { 1, 55, 87, 65, 986, 542 };
		int max = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		System.out.println("Largest no is:-"+max );
	}
}
