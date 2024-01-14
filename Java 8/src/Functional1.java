
public interface Functional1 {
	void one();
	default void name() {
		System.out.println("My name Is Ankit");
	}
	static void inter() {
		System.out.println("This is a Functional Interface");
	}
}
