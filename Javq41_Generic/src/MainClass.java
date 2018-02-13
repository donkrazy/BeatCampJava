
public class MainClass {

	public static void main(String[] args) {
		TestClass<String, String> t1 = new TestClass<String, String>();
		System.out.println(t1.method1());

	}

}

class TestClass<A, B>{
	A a;
	B b;
	
	public A method1() {
		return a;
	}
	
	public B method2() {
		return b;
	}
}


class SubClass extends TestClass<Long, Double>{

	@Override
	public Long method1() {
		return super.method1();
	}

	@Override
	public Double method2() {
		return super.method2();
	}
	
}


class SubClass2 extends TestClass{

	@Override
	public Object method1() {
		return super.method1();
	}

	@Override
	public Object method2() {
		return super.method2();
	}
	
}