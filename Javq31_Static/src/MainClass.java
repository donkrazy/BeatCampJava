public class MainClass {
	public static void main(String[] args) {
//		System.out.println(TestClass.data1);
		System.out.println(TestClass.data2);
//		TestClass.method1();
		TestClass.method2();
	}
}

class TestClass{
	int data1;
	static int data2 = 200;
	void method1() {
		System.out.println("method1");
		System.out.println(data1);
		System.out.println(data2);
	}
	static void method2() {
//		data1 = 1;
//		System.out.println(data1);
		System.out.println("method2");
	}
}