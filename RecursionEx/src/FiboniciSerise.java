
public class FiboniciSerise {
	static int a=0,b=1,c=0;
	static void fab(int count) {
		if(count>0) {
		  c=a+b;
		  a=b;
		  b=c;
		  System.out.println(""+c);
		  fab(count-1);
		}
		
	}
	public static void main(String[] args) {
		int count=5;
		System.out.println(a);
		System.out.println(b);
		fab(count-2);
	}
}
