
public class ReverseString1 {
	public static String reverse(String arr[],int index ,String str) {
		str+= arr[index];
		if(index>0) {
			return reverse(arr, --index, str);
		}else {
			return str;
		}
	}
	public static void main(String[] args) {
		String str ="ankit";
		String arr[] = str.split("");
		System.out.println(reverse(arr, arr.length-1, ""));	
		}
}
