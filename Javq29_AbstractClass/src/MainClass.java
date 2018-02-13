
public class MainClass {

	public static void main(String[] args) {
		SuperClass sc1 = new SuperClass() {
			@Override
			void method2() {
				// TODO Auto-generated method stub
				
			}
		};
		System.out.println(sc1);
	}
}

abstract class SuperClass{
	void method1() {
		System.out.println("Superclass¿« method1");
	}
	abstract void method2();
}

class SubClass extends SuperClass{
	@Override
	void method2() {
		return;
		// TODO Auto-generated method stub
	}
}