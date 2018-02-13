public class MainClass {
	public static void main(String[] args) {
		TestClass t1 = new TestClass();
		t1.method1();
		int a = t1.a1;
		System.out.println(a);
		t1.c = 9999;
		TestClass t2 = new TestClass();
		System.out.println(t2.c);
		t2.method2();
		TestClass2 ta = new TestClass2(1, 3);
		ta.method6(3);
	}
}


class TestClass2 {
	static int c = 10000;
	int a1 = 100;
	
	TestClass2(){
		
	}
	
	TestClass2(int a, int b){
		this();
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
	
	public void method6(int a1) {
		this.a1 = a1;
		System.out.println(a1);
	}
	
}
