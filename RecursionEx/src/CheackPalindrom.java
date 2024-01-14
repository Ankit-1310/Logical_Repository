
public class CheackPalindrom {
	public static int isPalindrom(int a,int sum) {
		if(a==0)
			return sum;
		sum =(sum*10)+(a%10);
		return isPalindrom(a/10, sum);
		
	}
	public static void main(String[] args) {
		int a = 145;
		int sum=0;
		int palindrom = isPalindrom(a, sum);
		if(palindrom==a) {
			System.out.println(a+"Is Palindrom");
		}else {
			System.out.println(a+"Is Not Palindrom");
		}
	}
}
