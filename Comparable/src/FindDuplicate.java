
public class FindDuplicate {
	public static void findDuplicateElement(int[] inputArray) {
		for(int i=0;i<inputArray.length;i++) {
			for(int j=i+1;j<inputArray.length;j++) {
				if(inputArray[i]==inputArray[j]) {
					System.out.println("Duplicate Elements Are:-"+inputArray[i]);
				}
			}
		}
	}
	public static void main(String[] args) {
		int inputArray[] = {1,2,1,2,3,4,5,5,6,8,9,9,11};
		findDuplicateElement(inputArray);
		System.out.println("Using For loop");
	}
}
