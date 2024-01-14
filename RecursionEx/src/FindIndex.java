import java.util.ArrayList;

public class FindIndex {
	
	public static boolean find(int[] arr1,int targer,int index) {
		if(index== arr1.length) {
			return false;
		}
		return arr1[index]== targer || find(arr1, targer, index+1);
	}
	
	public static int findIndex(int arr1[],int target,int index) {
		if (index == arr1.length) {
			return -1;
		}
		if(arr1[index] == target) {
			return index;
		}
		else {
			return findIndex(arr1, target, index+1);
		}
	}
	
	
	public static int reverseFindIndex(int arr1[],int target,int index) {
		if (index == -1) {
			return -1;
		}
		else if(arr1[index] == target) {
			return index;
		}
		else {
			return reverseFindIndex(arr1, target, index-1);
		}
	}
	
	
	static ArrayList<Integer> list = new ArrayList<>();
	
	public static void  reverseFindAllIndex(int arr1[],int target,int index) {
		if (index == -1) {
			return ;
		}
		if(arr1[index] == target) {
			list.add(index);
		}
		reverseFindAllIndex(arr1, target, index-1);
	}
	
	public static void main(String[] args) {
		int arr1[]= {1,5,8,9,5,4,7,68};
			System.out.println(find(arr1, 5 , 0));
			
//			System.out.println(findIndex(arr1, 5 , 0));
//			System.out.println(reverseFindIndex(arr1 , 5 , arr1.length-1));
//			reverseFindAllIndex(arr1, 5, arr1.length-1);
//			System.out.println(list);
	}
}
