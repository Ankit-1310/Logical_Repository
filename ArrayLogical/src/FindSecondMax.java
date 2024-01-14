
public class FindSecondMax {
	public static void main(String[] args) {
		int arr[] = new int[6];
		arr [0]= 5;
		arr [1]= 7;
		arr [2]= 6;
		arr [3]= 3;
		arr [4]= 2;
		arr [5]= 4;
		//arr [6]= 9;
		int max=Integer.MIN_VALUE;
		int secMax = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			//System.out.println(arr[i]);
			
			if(max < arr[i]) {
				secMax = max;
				max = arr[i];
			}else if (secMax < arr[i] && arr[i] != max) {
				secMax = arr[i];
			}
		}
		System.out.println(max);
		System.out.println(secMax );
		
	}

}
