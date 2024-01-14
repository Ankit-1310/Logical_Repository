
public class FindOdd {
	public static int sumOfOddNumb(int i,int n,int sum) {
		if(i > n) 
			return sum;
		
		sum = sum+i;
		System.out.println(i);
		
		return sumOfOddNumb(i+2, n, sum);
	}
	public static void main(String[] args) {
		int i=1;
		int n=13;
		int sum=0;
		if(i%2!=0) {
			i=i;
		}else {
			i=i+1;
		}
		System.out.println("Sum" +sumOfOddNumb(i, n, sum));
	}
}
