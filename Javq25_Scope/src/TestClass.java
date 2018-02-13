
public class TestClass {
	static int c = 10000;
	int a1 = 100;

	TestClass() {

	}

	void method1() {
		System.out.printf("¸Þ¼­µå%d", a1);
	}

	void method2() {
		int a2 = 300;
		System.out.println(a2);
		for (int i = 0; i < 2; i++) {
			System.out.println(a2 + i);
		}
	}
	
	public void method5() {
		System.out.println(a1);
	}
	
}
