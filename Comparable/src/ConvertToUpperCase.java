
public class ConvertToUpperCase {
public static void main(String[] args) {
	String str="ankit KUMAR yadav";
	StringBuffer strbf = new StringBuffer(str);
	for (int i = 0; i < strbf.length(); i++) {
		if(Character.isLowerCase(str.charAt(i))) {
			strbf.setCharAt(i,Character.toUpperCase(str.charAt(i)));
		}else if(Character.isUpperCase(str.charAt(i))){
			strbf.setCharAt(i,Character.toLowerCase(str.charAt(i)));
		}
	}
	System.out.println(strbf);
}
}
