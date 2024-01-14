public class FindMaxAndMin {
public static void main(String[] args) {
	int a[]= {46,23,58,94,99};
	int max=0;
	int min=a[0];
	for (int i = 0; i < a.length; i++) {
		if(a[i]>max) {
			max=a[i];
		}else if(min>a[i]) {
		min=a[i];
		}
	}
	System.out.println(max+" "+min);
}
}
