
public class SumOfDigit {
	public static int sumOfDigit(int n) {
		if(n<10) {
		return n;
		}else {
			return(n%10+sumOfDigit(n/10));
		}
	}
	
	
	public static void main(String[] args) {
	int n=654123;
	int s=sumOfDigit(n);
	System.out.println(s);
}
}
