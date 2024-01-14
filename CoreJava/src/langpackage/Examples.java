package langpackage;

public class Examples {

	public static void main(String[] args) {

		int[] arr = { 21, 14, 16, 15, 18, 17, 19 };

		for (int i = 0; i < arr.length; i++) {
			if (i == 0 && arr[i] > arr[i + 1]) {
				System.out.println(arr[i]);
			} else if (i == arr.length - 1 && arr[i - 1] < arr[i]) {
				System.out.println(arr[i]);
			} else if (arr[i - 1] < arr[i] && arr[i + 1] < arr[i]) {
				System.out.println(arr[i]);
			}
		}
//
//		for (int i = 0; i < arr.length; i++) {
//			for (int j = i + 1; j < arr.length - 1; j++) {
//
//				for (int k = j + 1; k < arr.length - 1; k++) {
//
//					if (arr[i] < arr[j] && arr[j] > arr[k]) {
//
//						System.out.println(arr[j]);
//
//					} else if (arr[i] > arr[j] && i == 0) {
//						System.out.println(arr[i]);
//						break;
//					}
//
//				}
//				break;
//
//			}
//
//		}

	}
}
