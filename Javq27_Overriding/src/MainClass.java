public class MainClass {
	public static void main(String[] args) {
		SubClass sc1 = new SubClass();
		sc1.method1();
		sc1.method2();
		SuperClass sc2 = new SubClass();
		sc2.method1();
		// sc2.method2(); // not work
		sc2.method3(); // �ȵ���̵忡�� �۰����ڵ� �����ְ�
		// sc2.super.method3(); // �Ұ��ϴ�
	}
}

class SuperClass {
	void method1() {
		System.out.println("sup method1");
	}
	void method3() {
		System.out.println("sup method3");
	}
}

class SubClass extends SuperClass {
	void method2() {
		System.out.println("sub method2");
	}
	@Override
	void method3() {
		super.method3();
		System.out.println("sub method3(overrided)");
	}
}