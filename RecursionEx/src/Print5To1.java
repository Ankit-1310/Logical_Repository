
public class Print5To1  {
	public static void printNum(int n) {
		
		if(n==0) {
			return;
		}
		System.out.println(n);
		printNum(n-1);
	
	}
	public static void main(String[] args) {
		int n=10;
		printNum(n);
		
	}
}
