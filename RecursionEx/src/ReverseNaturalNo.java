
public class ReverseNaturalNo {
	public static int reverseNaturalNo(int start,int end,int count) {
		if(start<end)
			return count;
		System.out.println(start);
			return reverseNaturalNo(start-1, end,++count);
	}
	public static void main(String[] args) {
		int start=89;
		int end=50;
		int reverseNaturalNo = reverseNaturalNo(start, end,0);
		System.out.println("conting" +reverseNaturalNo);
	}
}
