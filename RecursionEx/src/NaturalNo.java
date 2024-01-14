
public class NaturalNo {
	public static int naturalNo(int a,int b) {
		if(a>b) 
			return 1;
			System.out.print(a+" ");
			return naturalNo(a+1,b);
		
	}
	public static void main(String[] args) {
		int a=2;
		int b=10;
		naturalNo(a, b);
	}
}
