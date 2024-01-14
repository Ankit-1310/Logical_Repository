
public class Demo {
	static int num;
	public static  int sumOfOddNum(int i,int n,int sum) {
		if(i>n) {
			return sum;
		}
		sum = sum+i;
		System.out.println(i);
		return sumOfOddNum(i+2,n,sum);
	}
	public static void main(String[] args) {
		int i=1;
		int n=8;
		int sum=0;
		System.out.println(sumOfOddNum(i, n, sum));
	}
}
