
public class FindSecondLargest {
public static void main(String[] args) {
	int input[]= {4,5,6,9,21,33,65,7,21,23};
	int temp;
	for(int i=0;i<input.length;i++) {
		for (int j = i+1; j < input.length; j++) {
			if(input[i]<input[j]) {
				temp=input[i];
				input[i]=input[j];
				input[j]=temp;
			}
		}
	}
	for (int j = 0; j < input.length; j++) {
		
		System.out.print(input[j]+",");
	}
	System.out.println();
	System.out.println("Second Largest Number is: "+input[1]);
	
}
}
