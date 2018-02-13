
public class MainClass {

	public static void main(String[] args) {
		TestClass tc = new TestClass();
		Inter1 i = new Inter1() {
			@Override
			public void method1() {
			}
		};
		System.out.println(tc);
		System.out.println(i);
		tc.method1();
		Inter1 i1 = tc;
		i1.method1();
	}
}

class TestClass implements Inter1, Inter2, Inter3{

	@Override
	public void method3() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void method2() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void method1() {
		// TODO Auto-generated method stub
		
	}
	
}

class TestClass2 implements Inter4{

	@Override
	public void method1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void method2() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void method3() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void method4() {
		// TODO Auto-generated method stub
		
	}
	
}

interface Inter1 {
	int a = 1;
	void method1();
}

interface Inter2 {
	void method2();
}

interface Inter4 extends Inter1, Inter2, Inter3{
	void method4();
}
