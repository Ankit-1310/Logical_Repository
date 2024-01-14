package langpackage;

public class FindSecLargest {
	
	public static void main(String[] args) {
		
	
	
	int a[] = {4,2,8,5,3,7,9};
	
	int larg = Integer.MIN_VALUE;
	
	int sec_larg = Integer.MIN_VALUE;
	
	for( int i = 0; i < a.length ; i++) {
		if(a[i] > larg) {
			sec_larg = larg;
			larg =a[i];
		}
		else if (a[i]>sec_larg && a[i]!=larg) {
			sec_larg = a[i];
		}
	}
	 
	System.out.println(sec_larg);
	//System.out.println(Integer.MIN_VALUE);

}
}