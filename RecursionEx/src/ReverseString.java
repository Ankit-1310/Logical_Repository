
public class ReverseString {
	
//	public static String reverse(String source){
//        if(source == null || source.isEmpty()){
//            return source;
//        }      
//        String reverse = "";
//        for(int i = source.length() -1; i>=0; i--){
//            reverse = reverse + source.charAt(i);
//        }
//     
//        return reverse;
//    }
	
	public static String reverseRecursively(String source) {

        //base case to handle one char string and empty string
        if (source.length() <= 1) {
            return source;
        }

        return reverseRecursively(source.substring(1)) + source.charAt(0);

    }
	
	


	public static void main(String[] args) {
		String source="Ankit";
		String rev = reverseRecursively(source);
		System.out.println(rev);
		if(source.equalsIgnoreCase(rev)) {
			System.out.println("palindrom");
			
		}else {
			System.out.println("Not palindrom");
		}
	}
   
}


