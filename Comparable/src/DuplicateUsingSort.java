import java.util.Arrays;

public class DuplicateUsingSort {
	
	public static void duplicateUsingSort(int []inputArray) {
		Arrays.sort(inputArray);
		for (int i = 0; i < inputArray.length-1; i++) {
			if(inputArray[i]==inputArray[i+1])
				{
				System.out.println("Duplicate Elements:-"+inputArray[i]);
				}
		}
	}
public static void main(String[] args) {
	 int inputArray[]= {12,21,32,32,56,54,86,56,12,21};
	 duplicateUsingSort(inputArray);
}
}
