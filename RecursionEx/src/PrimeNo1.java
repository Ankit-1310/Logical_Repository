
public class PrimeNo1 {
	public int count(int i,int num,int count1) {
		if(i>1) {
			if(num%i==0) {
				return count(i-1, num, count1+1);
			}
			return count(i-1, num, count1);
		}
		return count1;
	}
	public void primeNo(int range) {
 		if(range>=0) {
		int num=range;
		if(count(range, num, 0)==1) {
			System.out.print(range+" ");
		}
		primeNo(range-1);
		}
	}
	public static void main(String[] args) {
		new PrimeNo1().primeNo(20);
	}
}
