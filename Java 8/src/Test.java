
public class Test {
public static void main(String[] args) {
	Functional1 functional1 = Functional1impl::one1;
	functional1.one();
}
}
class Functional1impl {

	public static  void one1() {
		System.out.println("it is implimentation of abstract method of functional1 interface");
	}
	
}