
public class FacEx {
	public static int fac(int n) {
		if(n<=1) {
			return 1;
		}
		return n+fac(n-1);
	}
//	public static long fac(int n) {
//		long factorial=1l;
//		for (long i = n; i >0; i--) {
//			factorial = factorial*i;
//		}
//		return factorial;
//	}
	
	public static void main(String[] args) {
		int n=10;
		System.out.println(fac(n));
	}
}
