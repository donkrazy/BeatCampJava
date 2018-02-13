
public class MainClass {

	public static void main(String[] args) {
		TestClass1 t1 = new TestClass1();
		System.out.println(t1.data1);
		System.out.println(t1.data2);

	}

}


class TestClass1{
	int data1;
	final int data2 = 100;
	void method() {
		data1 = 1000;
//		data2 = 2000;
		
	}
}

class SuperClass1{
	void method1() {
		System.out.println("method1");
	}
	final void method2() {
		System.out.println("method2");
	}
}

class SubClass extends SuperClass1{
//	void method2() {
	void method1() {
		System.out.println("DFDFDF");
	}
}

final class SuperClass2{
}


//class TestClass3 extends SuperClass2{}