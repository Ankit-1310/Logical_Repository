package langpackage;

import java.io.FileOutputStream;
import java.io.PrintStream;

public class Demo {
	
	public static void main(String[] args)  {
		System.out.println("Clasess under Lang package");
		
		System.out.println("___Copy Array______");
		int a[] = {11,22,33,44,55,66,77,88,99};
		int b[] = new int[15];
		for(int i = 0;i<a.length;i++) {
			System.out.println("A array:"+a[i]+"\t\t"+i);
		}
		for(int i = 0;i<b.length;i++) {
			System.out.println("B array:"+b[i]+"\t\t"+i);
	}
		System.arraycopy(a, 0, b, 0, 9);
		System.out.println("After Copy");
		for(int i = 0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		for(int i = 0;i<b.length;i++) {
			System.out.println("B array:"+b[i]+"\t\t"+i);
		}
		System.out.println("System class");
		System.out.println("for error massage");
		System.out.println("system.in");
		System.out.println("system.out");
		System.out.println("system.err");
		System.out.println("system.out==system.err");
		try {
		System.setOut(new PrintStream(new FileOutputStream("ABC.txt")));
		}catch(Exception e){
			e.printStackTrace();
		}
		System.out.println(" i am going to file ");
		System.out.println("i am err msg");
}
}
