package langpackage;


public class RemoveSpecialSymbol {
	public static void main(String[] args) {
		String str="ankit@!#$%^&-";
		int count =0;
		String specialChar="";
		String specialCharRemove="";
		for (int i = 0; i < str.length(); i++) {

			if(!Character.isDigit(str.charAt(i))&& !Character.isLetter(str.charAt(i))&& !Character.isWhitespace(str.charAt(i)) ) {
				specialChar=specialChar+str.charAt(i);
				count++;
				
			}else {
				specialCharRemove = specialCharRemove+str.charAt(i);
			}
		}
			if(count ==0) {
				System.out.println("there is no special character");
			}else {
				System.out.println("special charater found =" +count +"" +specialChar);
			}
		System.out.println("without special character String is ="+specialCharRemove);
	}

}
