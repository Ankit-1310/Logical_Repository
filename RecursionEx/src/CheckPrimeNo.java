public class CheckPrimeNo {

	public static int isPrime(int num,int i) {
		if(i <= 1) 
			return 1;
		
		if(num%i == 0) 
			return 0;
		    return isPrime(num,i-1);
	
	} 
	public static void main(String[] args) {
		int num =23;
		
		int p = isPrime(num, num/2);
		if(p == 1) {
		System.out.println("no is prime");	
		}else {
			System.out.println("Not Prime");
		}
	}
}
