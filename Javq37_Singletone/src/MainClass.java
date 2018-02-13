
public class MainClass {

	public static void main(String[] args) {
		// TestClass t1 = new TestClass();
		TestClass t2 = TestClass.getInstance();
		TestClass t22 = TestClass.getInstance();
		TestClass t222 = TestClass.getInstance();
		System.out.println(t2);
		System.out.println(t22);
		System.out.println(t222);
	}

}

final class TestClass {
	private static TestClass t1 = null;

	private TestClass() {

	}

	public static TestClass getInstance() {
		if (t1 == null) t1 = new TestClass();
		return t1;
	}
}