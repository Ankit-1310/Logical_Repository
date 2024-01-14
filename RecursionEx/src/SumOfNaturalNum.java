
public class SumOfNaturalNum {
	public static void sum(int i,int j,int sum) {
		if(i==j) {
			sum+=i;
			System.out.println(sum);
			return;
		}
		sum+=i;
		sum(i+1,j,sum);
	}
	public static void main(String args[]) {
		int i=1;
		int j=8;
		int sum=0;
		sum(i, j, sum); 
	}
}
