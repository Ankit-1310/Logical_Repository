public class SortArray {
	
	public static boolean sort(int[] arr, int index) {
		if(index == arr.length-1) {
			return true;
		} 
		return arr[index]<arr[index+1] && sort(arr ,index+1);
		
	}
	
	public static void main(String[] args) {
		int arr[] = {5,25,9,11,23};
		System.out.println(sort(arr,0));
	}
}
