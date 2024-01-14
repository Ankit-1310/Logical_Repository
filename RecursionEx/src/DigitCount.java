
public class DigitCount {
	public static long count(long num) {
		if(num<32) {
		return 1;	
		}else {
			return 1+count(num/10);
		}
	}
	
	
	public static void main(String[] args) {
	System.out.println(count(7895645879635465254l));
}
}
