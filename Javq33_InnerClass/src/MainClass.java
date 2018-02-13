
public class MainClass {

	public static void main(String[] args) {
		// InnerClass in1 = new innerClass();
		// OuterClass1.InnerClass1 in2 = new OuterClass1.InnerClass1(); // static 중첩클래스가
		// 아니라서
		// OuterClass1.InnerClass1 in2 = new OuterClass1().InnerClass1();
		OuterClass1 oc1 = new OuterClass1();
		OuterClass1.InnerClass1 in3 = oc1.new InnerClass1();
		OuterClass1.InnerClass1 myIn = new OuterClass1().new InnerClass1();
		
		OuterClass2.InnerClass2 in4 = new OuterClass2.InnerClass2();
		
		SubClass1 sub1 = new SubClass1();
		method1(sub1);
		
		SubClass2 sub2 = new SubClass2();
		method2(sub2);
		
		method1(new TestClass1() {
			@Override
			void test_method1() {
				
			}
		});
	}
	
	static void method1(TestClass1 t1) {
		t1.test_method1();
	}
	
	static void method2(TestInter1 t2) {
		t2.test_method1();
	}

}

class OuterClass1 {
	int data1 = 100;

	class InnerClass1 {
		int data2 = 200;
		void inner_method() {
			data1 = 10000;
			data2 = 20000;
		}
	}
	
	void outer_method() {
		data1 = 1000;
//		data2 = 2000;
	}
}

class OuterClass2{
	int data1 = 1;
	int data2 = 3;
	static class InnerClass2{
//		data1 = 4;
	}
	void outer_method() {
		data2 = 1;
	}
}

class OuterClass3{
	int data1 = 100;
	final int data4 = 1;
	void outer_method() {
		int data2 = 200;
		class InnerClass3{
			int data3 = 300;
			void inner_method() {
//				data2 = 3;
				System.out.println(data4);
				data1 = 4;
			}
		
		}
		InnerClass3 ic3 = new InnerClass3();
		System.out.println(ic3.data3);
	}
}


abstract class TestClass1{
	abstract void test_method1();
}

interface TestInter1{
	void test_method1();
}

class SubClass1 extends TestClass1{
	@Override
	void test_method1() {
		System.out.println("test_method1");
	}
}

class SubClass2 implements TestInter1{
	@Override
	public void test_method1() {
		System.out.println("test_method1");
	}
	
}