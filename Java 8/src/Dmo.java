public class Dmo {
public static void main(String[] args) {
	String str = "ankit";
	 int j=str.length();
	 int count=1;
	 for(int i=0;i<j;i++) {
		 for (int k = i+1; k <j; k++) {
			
		
		 if(str.charAt(i)==str.charAt(j)) {
			 count++;
		 }
	 }
		 System.out.println(count);
	 }
}
}
