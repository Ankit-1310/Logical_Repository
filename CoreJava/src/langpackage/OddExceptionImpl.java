package langpackage;

class OddException extends Exception {

}

class Cheack {
	 int m1(int a) {
		try {
			if (a % 2 == 0) {
				System.out.println("Values are even");
				return a;
			} else {
				throw new OddException();
			}

		} catch (OddException e) {
			System.out.println("please Provide Even no");
			return a;
		} 
		finally {

			System.out.println("finally block Processed");

			return a;
		}

	}

}

public class OddExceptionImpl {
	public static void main(String[] args) {
		Cheack c = new Cheack();
		int a = c.m1(109);
		System.out.println();
		System.out.println(a);
	}
}